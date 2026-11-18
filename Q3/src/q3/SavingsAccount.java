package q3;
public class SavingsAccount extends Account {
    public SavingsAccount(int id,double balance){
        super(id,balance);
    }
    public SavingsAccount(int id,double balance,double rate){
        super(id,balance,rate);
    }
    public void withdraw(double amount){
        if(amount<=getBalance())super.withdraw(amount);
    }
    public String toString(){
        return "SavingsAccount[id="+getId()+", balance="+getBalance()+"]";
    }
}
