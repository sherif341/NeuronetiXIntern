import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();
    private static long highScore = 0;
    private static final int MAX_QUESTIONS = 20;
    private static final int MAX_DIFFICULTY = 3; // Difficulty levels (1-3)

    public static void main(String[] args) {
        seedRandomNumberGenerator();
        displayMenu();
        int choice = getMenuChoice();
        while (choice != 4) {
            switch (choice) {
                case 1:
                    startGame();
                    break;
                case 2:
                    displayHelp();
                    break;
                case 3:
                    showHighScore();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            displayMenu();
            choice = getMenuChoice();
        }
        System.out.println("Thanks for playing! Exiting...");
    }

    // Seeds the Random number generator to ensure varied results
    private static void seedRandomNumberGenerator() {
        random.setSeed(System.currentTimeMillis());
    }

    // Displays the main menu
    private static void displayMenu() {
        System.out.println("\nMultiplication Learning Game");
        System.out.println("1. Start Game");
        System.out.println("2. Help");
        System.out.println("3. Show High Score");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    // gets the user's menu choice with error handling
    private static int getMenuChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a number.");
            return 0;
        }
    }

    // Starts the game
    private static void startGame() {
        String playerName = getPlayerName();
        long score = 0;
        int currentDifficulty  = 1;
        int successiveCorrect = 0;
        int successiveWrong = 0;

        for (int i = 0; i < MAX_QUESTIONS; i++) {
            long number1  = generateNumber(currentDifficulty );
            long number2  = generateNumber(currentDifficulty );
            long correctAnswer = number1 * number2;

            if (askQuestion(i + 1, number1, number2, correctAnswer)){
                score++;
                successiveCorrect++;
                successiveWrong = 0;

                if (successiveCorrect == 3 && currentDifficulty  == MAX_DIFFICULTY) {
                    System.out.println("Congratulations, " + playerName + " you mastered all difficulty levels!");
                    break;
                }

            }
            else {
                successiveCorrect = 0;
                successiveWrong++;
                if (successiveWrong == 3) {
                    System.out.println("Game Over!");
                    break;
                }
            }

            // Upgrade difficulty after 3 correct answers
            if (successiveCorrect == 3) {
                currentDifficulty++;
                System.out.println("Difficulty increased to level " + currentDifficulty );
                successiveCorrect = 0;
            }
        }
        showFinalScore(score, playerName);
    }

    // Prompts user for their name
    private static String getPlayerName() {
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }

    // Displays the help information for the game
    private static void displayHelp() {
        System.out.println("---------- Help ----------");
        System.out.println("This is a multiplication learning tool.");
        System.out.println("You will answer multiplication questions.");
        System.out.println("You can advance to higher difficulty levels by answering 3 questions correctly in a row.");
        System.out.println("If you answer 3 questions incorrectly in a row, the game will end.");
        System.out.println("Good luck!");
    }

    // Displays the current high score
    private static void showHighScore() {
        System.out.println("High score: "+highScore);
    }

    // Show the final score and update high score if applicable
    private static void showFinalScore(long score, String name) {
        System.out.println("\nGame Summary:");
        System.out.println("Your score: " + score);
        if (score > getHighScore()) {
            System.out.println("Congratulations, you set a new high score!");
            setHighScore(score);
        }
        System.out.println("High score: " + getHighScore());
    }

    // Generates a random number based on current difficulty level
    private static int generateNumber(int difficulty) {
        int max = (int) Math.pow(10, difficulty);
        return random.nextInt(max) + 1;
    }

    // Asks the multiplication question and returns whether the user's answer is correct
    private static boolean askQuestion(int questionNumber, long num1, long num2, long correctAnswer) {
        System.out.printf("Question %d: %d x %d = ", questionNumber, num1, num2);
        long userAnswer = getUserAnswer(); // Prompt for answer
        boolean isCorrect = userAnswer == correctAnswer;

        if (isCorrect) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The answer is " + correctAnswer);
        }
        return isCorrect;
    }

    // Retrieves the user's answer
    private static long getUserAnswer() {
        return Long.parseLong(scanner.nextLine());
    }

    // Getter to retrieve the current high score
    private static long getHighScore() {
        return highScore;
    }

    // Setter to update the high score
    private static void setHighScore(long currentScore) {
        highScore = currentScore;
    }
}