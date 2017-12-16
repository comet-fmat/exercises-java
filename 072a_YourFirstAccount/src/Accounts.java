
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // create account with initial balance of $100.0 and deposit $20.00
        //next show balance, use class Account
        //BEGIN SOLUTION       
        Account georgi = new Account("Georgi's Account", 100.00);
        georgi.deposit(20);
        System.out.println(georgi.toString());
        //END SOLUTION
        
    }

}
