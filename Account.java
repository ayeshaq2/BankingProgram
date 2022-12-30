import java.util.*;

public class Account {

    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    //Class Constructor
    Account(String cname, String cid){
        customerName=cname;
        customerID=cid;

    }
            //method to deposit money into the account
    public void deposit(int amount){
        if(amount !=0 ){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

           //method to withdraw amount from balance
    public void withdraw(int amount){
        if (amount != 0){
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    public void getPreviousTransaction(){
        if (previousTransaction > 0 ){
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        }
        else {
            System.out.println("No transaction occured"); }



    }

    public void calculateInterest(int years){
        double interestRate = 0.0185;
        double newBalance= ((balance*interestRate)* years) + balance;
        System.out.println("The current interest rate is " + (100*interestRate));
        System.out.println("After " +  years + " years, your balance will be: " + newBalance );

    }

    public void showMenu(){
        char option= '\0';
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome " +customerName+ "!");
        System.out.println("Your ID is " +customerID);
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("A = Check your balance");
        System.out.println("B = Make a deposit");
        System.out.println("C = Make a withdrawal");
        System.out.println("D = View previous transaction");
        System.out.println("E = Calculate interest");
        System.out.println("F = Exit");

        do{
            System.out.println();
            System.out.println("Enter an option");
            char option1= input.next().charAt(0);
            option= Character.toUpperCase(option1);

            switch(option){

                case 'A':
                    System.out.println("------------------------------");
                    System.out.println("Balance = \n $" +balance);
                    System.out.println("------------------------------");
                    System.out.println();
                    break;

                case 'B':
                    System.out.println("------------------------------");
                    System.out.println("Enter an amount to deposit");
                    System.out.println("------------------------------");
                    int amount= input.nextInt();
                    System.out.println();



                    break;

                case 'C':
                    System.out.println("------------------------------");
                    System.out.println("Enter an amount to withdraw: ");
                    System.out.println("------------------------------");
                    int amount2= input.nextInt();
                    withdraw(amount2);
                    System.out.println();

                    break;

                case 'D':
                    System.out.println("------------------------------");
                    getPreviousTransaction();
                    System.out.println("------------------------------");
                    System.out.println();

                case 'E':
                    System.out.println("How many years of accrued interest");
                    int years = input.nextInt();
                    calculateInterest(years);

                    break;

                case 'F':
                    System.out.println("------------------------------");
                    break;

                default:
                    System.out.println("Error: invalid option. Please enter A,B,C,D,E,or F");
                    break;
            }


        } while(option != 'F'); {
            System.out.println("Thank yoi for banking with us! See you soon :)");

        }
















    }
}


