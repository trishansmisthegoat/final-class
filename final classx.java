import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean infiniteLoop = true;
        double[] accountBalance = new double[1000]; //this array will contain the account balance
        String[] accountName = new String[1000]; //this array will contain the account holder's name
        int option, size = 100;// szie will be the first account you want to begin from.
        //infinite loop to keep our program running untill we wish to end it.
        while (infinteloop) {
            System.out.println("Welcome to codingal banking services");
            System.out.println("Banking menu: ");
            System.out.println("Select any one option from below. ");
            System.out.println("1-> add customer");
            System.out.println("2-> Change customer name");
            System.out.println("3-> check account balance");
            System.out.println("4-> update account balance");
            System.out.println("5-> summary of all accounts");
            System.out.println("6-> quit");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your option to proceed ahead: ");

            option = sc.nextInt();
            if (option == 1) {
                System.out.println("\nAdd customer \nMenu->");

                sc.nextLine();

                System.out.println("\nEnter customer nam: ");
                String name = sc.nextLine();
                accountName[size] = name;
                System.out.println("Enter Opening Balance Amount: ");
                double amt = sc.nextDouble();
                accountBalance[size] = amt;

                System.out.println("Account created successfully. \n");
                System.out.println("Account Details:- \n");
                System.out.println("Account Number: " + (size));
                System.out.println("Account Name:" + accountName[size]);
                System.out.println("Account Balance:" + accountBalance[size] + " Rs \
                n");
                System.out.println("=========================");

                size = size + 1;

            } else if (option == 2) {
                
                System.out.println("\nChange Customer Name Menu");
                System.out.println("\nEnter your Accoun Number: ");

                int accountIndex;
                String temp;

                accountIndex = sc.nextInt();
                sc.nextLine();

                if (accountIndex > size) {
                    System.out.println("Account does not exist...")
                    System.out.println("Terminating...");
                } else {
                    temp = accountname[accountIndex];
                    System.out.println("Enter the new name: ");
                    String name = sc.nextLine();
                    accountName[accountIndex] = name;
                    System.out.println("Name is successfully updated from " + temp + " to " + name + ". \n");
                }
                System.out.println("======================");
            } else if (option == 3) {

                System.out.println("\nCheck account balance menu");
                Ssytem.out.println("\nEnter your account number: ");

                int accountIndex;
                accountIndex = sc.nextInt();

                if (accountIndex > size) {
                    System.out.println("Account does not exist.");
                    System.out.println("Terminating....");
                } else {
                    System.out.println(
                        accountName[accountIndex] + " your balance is " + 
                        accountBalance[accountIndex] + "Rs .");
                }
                System.out.println("======================");
            } else if (option == 4) {

                System.out.println("\nUpdate account balance menu ");
                System.out.println("\nEnter your account number: ");

                int accountIndex;
                accountIndex = sc.nextInt();

                if (accountIndex > size) p {
                    
                }
            }
        }
        }
}