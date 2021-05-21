package oop.chapter3;

import java.util.Scanner;
// class containing the method main is called the driver class.
public class AccountTest {
    public static void main(String[] args){
        System.out.printf("test main !\n");
        // creation a scanner object;
        Scanner sc = new Scanner(System.in);

        // create an object Account
        Account account1= new Account("Hello World",1000.00);
        Account account2= new Account("James bond", 200.00);

        // display the name of the account which gives as the default value
        // of the instance variable: the default value of strings is 'NULL'
        System.out.printf("account name %s%n", account1.getName());

        // se the name
        System.out.println("Enter the account name\n");
        account1.setName(sc.nextLine());

        // display the name of the account
        System.out.printf("account name is %s and the balance:$ %.2f %n", account1.getName(), account1.getBalance());

        // Display the name of the account
        System.out.printf("The account name %s and balance:$ %.2f %n", account2.getName(), account2.getBalance());
        //
        System.out.println("enter the amount of the balance ");
        account1.deposit(sc.nextDouble());

        // display the name of the account
        System.out.printf("account name is %s and the balance %.2f %n", account1.getName(), account1.getBalance());

    }
}
