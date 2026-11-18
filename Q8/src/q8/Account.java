package q8;
import java.util.*;
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private final Date dateCreated=new Date();
    private String name;
    private ArrayList<Transaction> transactions=new ArrayList<>();
    public Account(){
    }
    public Account(int id,double balance){
        this.id=id;
        this.balance=balance;
    }
    public Account(String name,int id,double balance){
        this.name=name;
        this.id=id;
        this.balance=balance;
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
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public ArrayList<Transaction> getTransactions(){
        return transactions;
    }
    public void setTransactions(ArrayList<Transaction> t){
        transactions=t;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate/12/100;
    }
    public double getMonthlyInterest(){
        return balance*getMonthlyInterestRate();
    }
    public void withdraw(double amount){
        balance-=amount;
        transactions.add(new Transaction('W',amount,balance,"Cash withdrawal"));
    }
    public void deposit(double amount){
        balance+=amount;
        transactions.add(new Transaction('D',amount,balance,"Cash deposit"));
    }
}
