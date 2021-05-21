package oop.chapter3;

import java.util.Scanner;
// class containing the method main is called the driver class.
public class AccountTest {
    public static void main(String[] args){
        System.out.printf("test main !\n");
        // creation a scanner object;
        Scanner sc = new Scanner(System.in);

        // create an object Account
        Account account1= new Account();

        // display the name of the account which gives as the default value
        // of the instance variable: the default value of strings is 'NULL'
        System.out.printf("account name %s%n", account1.getName());

        // se the name
        System.out.println("Enter the account name\n");
        account1.setName(sc.nextLine());

        // display the name of the account
        System.out.printf("account name is %s%n", account1.getName());
    }
}
