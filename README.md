# ATM System Readme

This repository contains a simple Java program that simulates an Automated Teller Machine (ATM) system. The program allows users to check their account balance, withdraw money, deposit money, and exit. This README file provides an analysis of the code and explains how to use the program.

## Code Analysis

The Java program consists of a single class `ATM` and a `test` class for demonstration. Here's a breakdown of the key components and methods in the code:

1. **ATM Class**
   - The `ATM` class represents the ATM system. It has fields to store balance, a default PIN, a user ID, and a password.

2. **verifyUser() Method**
   - This method verifies the user's identity by asking for a user ID and password.
   - If the entered user ID and password match the predefined values, the program proceeds to check the PIN.

3. **checkpin() Method**
   - This method verifies the PIN entered by the user.
   - If the entered PIN matches the predefined PIN, the program displays a menu.

4. **menu() Method**
   - This method displays a menu of options for the user: checking the account balance, withdrawing money, depositing money, or exiting.
   - The user's choice is processed using a `switch` statement.

5. **checkBalance() Method**
   - This method displays the account balance and then returns to the menu.

6. **withdrawMoney() Method**
   - This method allows the user to withdraw a specified amount of money from the account.
   - It checks if the balance is sufficient before performing the withdrawal.

7. **depositMoney() Method**
   - This method allows the user to deposit a specified amount of money into the account.

8. **test Class**
   - The `test` class contains the `main` method for testing the `ATM` class.
   - It creates an `ATM` object, calls `verifyUser()` to start the ATM process, and later calls `checkpin()` for testing.

## How to Use the Program

1. Compile the Java code using a Java compiler (e.g., `javac ATM.java`).

2. Run the program using the Java Virtual Machine (e.g., `java test`).

3. The program will prompt you to enter your user ID and password. The predefined values are `userId: "lnit"` and `password: "er01"`.

4. If the user ID and password are correct, the program will prompt you to enter the PIN (default PIN: 1234).

5. If the PIN is correct, you will be presented with a menu of options:
   - Enter `1` to check the account balance.
   - Enter `2` to withdraw money.
   - Enter `3` to deposit money.
   - Enter `4` to exit the program.

6. Follow the on-screen instructions to navigate through the menu and perform transactions.

7. Once you are done, the program will exit.

## Important Notes

- This is a basic and simplified ATM simulation for educational purposes and may not be suitable for production use.

- The program does not store data persistently and resets the balance to zero each time it runs.

- The PIN and password are hardcoded in the program, which is not secure. In a real-world scenario, you should implement more secure authentication mechanisms.

- The program uses `Thread.sleep()` to introduce delays, which is not recommended for a real ATM system.

- Remember to adjust the code and security measures to meet your specific requirements if you plan to use it in a real environment.
