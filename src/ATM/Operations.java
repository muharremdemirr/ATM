package ATM;

import java.util.Scanner;

public class Operations {

    Scanner sc = new Scanner(System.in);
    UserInfo info = new UserInfo();
    int balance = 15000, withdraw, deposit;


    public boolean checkPassword() {
        int password = sc.nextInt();
        if (info.getPassword() == password)
            return true;
        else
            return false;
    }

    public int withdraw() {

        System.out.print("Enter money to be withdrawn:");

        //get the withdrawl money from user
        withdraw = sc.nextInt();

        //check whether the balance is greater than or equal to the withdrawal amount
        if (balance >= withdraw) {
            //remove the withdrawl amount from the total balance
            System.out.println("Please collect your money");
            info.setBalance(withdraw, 1);
            return balance;

        } else {
            //show custom error message
            System.out.println("Insufficient Balance");
            System.out.println("");
            return balance;
        }

    }

    public int deposit() {
        System.out.print("Enter money to be deposited:");

        //get deposite amount from te user
        deposit = sc.nextInt();

        //add the deposit amount to the total balanace
        balance = balance + deposit;
        System.out.println("Your Money has been successfully depsited");
        System.out.println("");
        info.setBalance(deposit, 2);
        return balance;
    }

    public void changePassword() {
        int newPassword, newPasswordAu;
        while (true) {
            System.out.println("Please, enter the new password.");
            newPassword = sc.nextInt();
            System.out.println("Please, enter the new password again.");
            newPasswordAu = sc.nextInt();
            if (newPassword == newPasswordAu) {
                info.setPassword(newPassword);
                break;
            } else
                System.out.println("Passwords are not match.");
        }
    }

}
