import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // making user enter a username and a password
        // if the information is wrong more than three times block the account
        //  1-investment, 2-drawing cash, 3-balance inquiry, 4-log out.
        Scanner scanner = new Scanner(System.in);
        int balance = 2000;
        int chances = 3;
        int select;
        int i = 0;

       while(chances>0){

           System.out.print("Please enter your username : ");
           String userName = scanner.nextLine();
           System.out.println("*****************************");
           System.out.print("Please enter your password : ");
           String password = scanner.nextLine();
           System.out.println("*****************************");

        if (userName.equals("Becka") && password.equals("1234")){
            System.out.println("Welcome to Posh Bank");
            do {
                System.out.println("Please choose the transaction that you are willing to do : 1) Investment, 2) Drawing Cash, 3) Balance Inquiry, 4) Log out");
                select = scanner.nextInt();
                if (select == 1) {
                    System.out.print("How much money would you like to invest ? ");
                    int investment = scanner.nextInt();
                    balance += investment;
                    System.out.println("Your new balance equals to : " + balance);

                } else if (select == 2) {
                    System.out.print("How much money would you like to draw ? ");
                    int drawMoney = scanner.nextInt();
                    if (drawMoney > balance) {
                        System.out.println("Your balance is not enough for you to draw the money that you've wanted.");
                    } else {
                        balance -= drawMoney;
                        System.out.println("Rest of the balance is : " + balance);
                    }

                } else if (select == 3) {
                    System.out.println("Your balance is : " + balance);
                }

            } while (!(select == 4));
            System.out.println("Successfully logged out !");
            break;
        } else {
            chances = 3;
            System.out.println("You have 3 chances to enter your information correct.");
            for ( i = 0; i < chances; i++) {


                System.out.print("Enter your username : ");
                userName = scanner.nextLine();
                System.out.println();
                System.out.print("Enter your password : ");
                password = scanner.nextLine().trim();
                // if the information matches with login data it will stop asking to enter again to the user
                if ((userName.equals("Becka") && password.equals("1234"))) {
                    System.out.println("Your account information is correct. ");
                    break;

                }
            }
             if(i>=chances){
                System.out.println("Your bank account has been blocked, please contact with your bank! ");
            }
             break;

        }


    }
    }
}