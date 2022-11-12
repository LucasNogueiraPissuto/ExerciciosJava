package ExerciciosSecao9.exerciciosecao9;

import ExerciciosSecao9.entities.bankAccount;
import java.util.Scanner;


public class ExercicioSecao9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double initialDeposit;
        
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accountName = sc.nextLine();
        System.out.print("Is there a initial deposit value? (y/n)");
        char choice = sc.next().charAt(0);
        
        bankAccount bc = new bankAccount(accountNumber, accountName);
        
        if (choice == 'y'){
            System.out.print("Enter a initial deposit value: ");
            initialDeposit = sc.nextDouble();
            bc = new bankAccount(accountNumber, accountName, initialDeposit);
        }
        
        
        System.out.println("Account Data:");
        System.out.println("Account " + bc.getAccountNumber() + ", Holder: " + bc.getName() + ", Balance: $" + String.format("%.2f", bc.getBalence()));
        
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        bc.deposit(depositValue);
        
        System.out.println("Update account data: ");
        System.out.println("Account " + bc.getAccountNumber() + ", Holder: " + bc.getName() + ", Balance: $" + String.format("%.2f", bc.getBalence()));
        
        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        
        bc.withdrawal(withdrawValue);
        
        System.out.println("Update account data: ");
        System.out.println("Account " + bc.getAccountNumber() + ", Holder: " + bc.getName() + ", Balance: $" + String.format("%.2f", bc.getBalence()));
        sc.close();
    }
    
}
