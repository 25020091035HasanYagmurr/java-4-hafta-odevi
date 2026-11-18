package q8;
import java.text.SimpleDateFormat;
public class Main {
    public static void main(String[] args){
        Account a=new Account("George",1122,1000);
        a.setAnnualInterestRate(1.5);
        a.deposit(30);
        a.deposit(40);
        a.deposit(50);
        a.withdraw(5);
        a.withdraw(4);
        a.withdraw(2);
        SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Account summary");
        System.out.println("Account holder: "+a.getName());
        System.out.println("Annual interest rate: "+a.getAnnualInterestRate()+"%");
        System.out.println("Current balance: $"+a.getBalance());
        System.out.println("Transactions:");
        for(Transaction t:a.getTransactions())System.out.printf("%s | %c | amount: $%.2f | balance: $%.2f | %s%n",f.format(t.getDate()),t.getType(),t.getAmount(),t.getBalance(),t.getDescription());
    }
}
