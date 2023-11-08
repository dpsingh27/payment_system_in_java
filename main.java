import java.util.Scanner;
class ATM{
    float Balance;
    int pin = 1234;
    String userId = "lnit";
    String password = "er01";

    // Making Method TO Verify Username 
    public void verifyUser(){
        System.out.println("Welcome To Avadh Developers Payment System");

        // Using try and catch to delay the program execution
        try {
        Thread.sleep(2000); // 2000 milliseconds = 2 seconds
    } catch (InterruptedException e) {
    }
        System.out.println("Enter Your User Id");
        Scanner mn = new Scanner(System.in);
        String enteredUserId = mn.next();

        System.out.println("Enter Your Passwords");
        Scanner ml = new Scanner(System.in);
        String enteredPasswords = ml.next();

        // Checking Your User Id is Correct or Not
       if (enteredUserId.equals(userId) && enteredPasswords.equals(password)) {
    System.out.println("We are Checking Your Details");

    // Introduce a 2-second delay
    try {
        Thread.sleep(2000); // 2000 milliseconds = 2 seconds
    } catch (InterruptedException e) {}
    System.out.println("Your details are correct");

    // Introduce a 2-second delay
    try {
        Thread.sleep(2000); // 2000 milliseconds = 2 seconds
    } catch (InterruptedException e) {}

    // After the delay, call the checkpin() method
    checkpin();
}
        else{
            System.out.println("Check Your User Id and Password");
             System.exit(1);
        }
        mn.close();
    }

    // make method to check atm pin
    public void checkpin(){
        System.out.println("Enter Your Pin");
        Scanner mn = new Scanner(System.in);
        int enteredpin = mn.nextInt();
        System.out.println("Checking Your Pin");
            // delay the program execution
              try {
        Thread.sleep(3000); // 1000 milliseconds = 1 seconds
    } catch (InterruptedException e) {}
        
        // Checking your pin is correct or not
        if (enteredpin == pin){
            System.out.println("Pin is Correct");
            
            menu();
        }
        else{
            System.out.println("Pin is Incorrect");
        }
        mn.close();
    }

    // making method to show menu
    public void menu(){
        System.out.println("Enter Your Choice ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

    // making scanner class to enter option
    Scanner mn = new Scanner(System.in);    
    int opt = mn.nextInt();
    switch (opt) {
    case 1:
        checkBalance();
        break;
    case 2:
        withdrawMoney();
        break;
    case 3:
        depositMoney();
        break;
    case 4:
        System.out.println("*Thank You For Using Our ATM*");
        break;
    default:
        System.out.println("Invalid option. Please enter a number between 1 and 4.");
}

       // break;
        
    }

    // making method to check balance
    public void checkBalance(){
        System.out.println("*Your Balance is* " + Balance);
        menu();
    }

    // making method to check balance
   public void withdrawMoney(){
    System.out.println("*Enter Amount to Withdraw*");
    Scanner mn = new Scanner(System.in);
    float Amount = mn.nextFloat();
    if (Amount>Balance) {
        System.out.println("*Insufficient Balance*");
    }
    else {
        Balance = Balance - Amount;
        System.out.println("*Money Withdrawn Successfully*");
    }
    menu();
   }

   // making method to deposite money amount
   public void depositMoney(){
    System.out.println("*Enter Amount to Deposit*");
    Scanner mn = new Scanner(System.in);
    float Amount = mn.nextFloat();
    Balance = Balance + Amount;
    System.out.println("*Money Deposited Successfully*");
    menu();
   }
   }
   class test{
    public static void main(String[] args) {
   ATM user = new ATM();
    user.verifyUser();
    ATM amount = new ATM();
    amount.checkpin();
  }
  }

