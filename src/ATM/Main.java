package ATM;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        int choice, chance;
        boolean password;

        Operations ops = new Operations();
        UserInfo info = new UserInfo();
        Scanner sc = new Scanner(System.in);

        chance = 3;
        while(true) {
            System.out.println("Please enter the password. You have " +  chance + " chance remaining.");

            if (ops.checkPassword()){
                password = true;
                break;
            }else
                chance--;
            if (chance == 0){
                System.out.println("Your card's blocked. Please contact with your bank.");
                System.exit(0);
            }
        }


        while (password) {
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Change Password");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");

            //get choice from user
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                     System.out.println("Balance: " + info.getBalance());
                     ops.withdraw();
                     System.out.println("Balance: " + info.getBalance());
                     break;
                case 2:
                    System.out.println("Balance: " + info.getBalance());
                    ops.deposit();
                    System.out.println("Balance: " + info.getBalance());
                    break;
                case 3:
                    ops.changePassword(); break;
                case 4:
                    System.exit(0); break;
            }
        }
    }
}

