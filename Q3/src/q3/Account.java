package q3;
import java.util.Date;
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private final Date dateCreated=new Date();
    public Account(){
    }
    public Account(int id,double balance){
        this.id=id;
        this.balance=balance;
    }
    public Account(int id,double balance,double rate){
        this(id,balance);
        annualInterestRate=rate;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double b){
        balance=b;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double r){
        annualInterestRate=r;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate/12/100;
    }
    public double getMonthlyInterest(){
        return balance*getMonthlyInterestRate();
    }
    public void withdraw(double amount){
        balance-=amount;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public String toString(){
        return "Account[id="+id+", balance="+balance+"]";
    }
}
