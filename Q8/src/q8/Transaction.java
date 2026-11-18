package q8;
import java.util.Date;
public class Transaction {
    private Date date;
    private char type;
    private double amount,balance;
    private String description;
    public Transaction(char type,double amount,double balance,String description){
        this.date=new Date();
        this.type=type;
        this.amount=amount;
        this.balance=balance;
        this.description=description;
    }
    public Date getDate(){
        return date;
    }
    public void setDate(Date d){
        date=d;
    }
    public char getType(){
        return type;
    }
    public void setType(char t){
        type=t;
    }
    public double getAmount(){
        return amount;
    }
    public void setAmount(double a){
        amount=a;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double b){
        balance=b;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String d){
        description=d;
    }
}
