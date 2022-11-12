package ExerciciosSecao9.entities;

public class bankAccount {
    private int accountNumber;
    private String accountName;
    private double balance;

    public bankAccount(int accountNumber, String accountName, double intialDeposit) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        deposit(intialDeposit);
    }
    
    public bankAccount(int accountNumber, String accountName){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = 0;
    }
    
    public int getAccountNumber(){
        return this.accountNumber;
    }
    
    public String getName(){
        return this.accountName;
    }
    
    public void setName(String accountName){
        this.accountName = accountName;
    }
    
    public double getBalence(){
        return this.balance;
    }
    
    public void deposit(double value){
        this.balance += value;
    }
    
    public void withdrawal(double value){
        double tax = 5.00;
        
        this.balance -= value + tax;
    }
}
