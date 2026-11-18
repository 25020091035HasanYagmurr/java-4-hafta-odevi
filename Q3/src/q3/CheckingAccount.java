package q3;
public class CheckingAccount extends Account {
    private double overdraftLimit;
    public CheckingAccount(int id,double balance,double limit){
        super(id,balance);
        overdraftLimit=limit;
    }
    public double getOverdraftLimit(){
        return overdraftLimit;
    }
    public void setOverdraftLimit(double limit){
        overdraftLimit=limit;
    }
    public void withdraw(double amount){
        if(getBalance()-amount>=-overdraftLimit)super.withdraw(amount);
    }
    public String toString(){
        return "CheckingAccount[id="+getId()+", balance="+getBalance()+", overdraftLimit="+overdraftLimit+"]";
    }
}
