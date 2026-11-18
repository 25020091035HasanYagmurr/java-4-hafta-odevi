package q6;
public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    public Loan(double r,int y,double a){
        annualInterestRate=r;
        numberOfYears=y;
        loanAmount=a;
    }
    public String toString(){
        return "Loan(interest="+annualInterestRate+"%, years="+numberOfYears+", amount="+loanAmount+")";
    }
}
