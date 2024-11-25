# Mathletics: A Multiplication Learning Game

### **Welcome to Mathletics!**
**Sharpen your multiplication skills with this interactive learning game!** 

**Mathletics** is a fun and engaging way to practice and improve your multiplication skills. Whether you're a beginner or looking for a challenge, this game has something for everyone.

## Introduction

**Mathletics** is a console-based educational game designed to help users practice and enhance their multiplication skills. With an interactive approach to learning, this game challenges users with multiplication questions and dynamically adjusts difficulty levels based on their performance. Track your progress, set new high scores, and see how mastering multiplication can be both fun and rewarding!

## Features

- **Adaptive Difficulty:** The game adjusts its difficulty based on your performance, ensuring a steady learning curve and a rewarding experience.
- **Engaging Gameplay:** Answer multiplication questions and receive instant feedback on your answers.
- **Level Up:** Progress through different difficulty levels by answering correctly, unlocking a sense of accomplishment.
- **Track Your Progress:** View your high score and see how well you are improving over time.

## System Overview

The game offers the following functionalities:

1. **Start Game:** Launch the game and enter your name to personalize the experience.
2. **Answer Questions:** You'll be presented with multiplication problems that increase in difficulty as you answer correctly.
3. **Get Feedback:** Receive immediate feedback on your answers, helping you learn from mistakes and solidify your understanding.
4. **Level Up (Optional):** If you answer three questions in a row correctly, the difficulty level will increase, providing a greater challenge.
5. **Game Over or High Score:** The game ends after answering 20 questions or if you answer incorrectly three times in a row. Your final score and high score will be displayed.

**Tips for Success:**

- **Practice regularly:** The more you play, the more comfortable you'll become with multiplication.
- **Focus on understanding:** Don't just memorize, try to understand the concepts behind multiplication.
- **Learn from mistakes:** Pay attention to the incorrect answers and review those concepts for better understanding.

**Behind the Scenes:**

This project is built using Java and utilizes the following libraries:

- `java.util.Random`: Generates random numbers for creating multiplication questions.
- `java.util.Scanner`: Retrieves user input for answers.

The code is well-structured and includes functions for:

- **SeedRandomNumberGenerator:** Ensures varied question sets.
- **displayMenu:** Presents the main menu options.
- **getMenuChoice:** Gets user input for menu selection with error handling.
- **startGame:** Handles the core gameplay loop.
- **getPlayerName:** Prompts the user for their name.
- **displayHelp:** Provides instructions on playing the game.
- **showHighScore:** Displays the current high score.
- **showFinalScore:** Calculates and displays the final score, updating the high score if necessary.
- **generateNumber:** Generates random numbers based on the difficulty level.
- **askQuestion:** Presents a multiplication question and verifies the user's answer.
- **getUserAnswer:** Retrieves the user's answer as a long integer.
- **getHighScore:** Retrieves the current high score.
- **setHighScore:** Updates the high score if necessary.


## How to Play

1. **Initialization**: Seed the random number generator and display the home screen with menu options.
2. **Menu Selection**: Choose an option from the menu.
3. **Start Game**: Enter your name, answer questions, and progress through difficulty levels.
4. **Help**: Access game instructions.
5. **Show High Score**: View the highest score achieved.
6. **Exit**: Close the game and receive a farewell message.

## Contributing

We welcome contributions to this project! If you'd like to help improve Mathletics, feel free to fork the repository and submit a pull request.

## License:

This project is licensed under the [MIT License](License).

## Dive into the world of math and fun with Mathletics

Sharpen your multiplication skills, beat your high score, and enjoy the journey of learning through play! 🧮🚀
