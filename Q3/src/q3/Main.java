package q3;
public class Main {
    public static void main(String[] args){
        Account a=new Account(1001,500);
        SavingsAccount s=new SavingsAccount(1002,1000);
        CheckingAccount c=new CheckingAccount(1003,700,300);
        System.out.println(a);
        System.out.println(s);
        System.out.println(c);
        s.withdraw(1200);
        c.withdraw(900);
        System.out.println(s);
        System.out.println(c);
    }
}
