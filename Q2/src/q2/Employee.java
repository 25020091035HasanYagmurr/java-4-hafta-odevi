package q2;
public class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;
    public Employee(String n,String a,String p,String e,String o,double s,MyDate d){
        super(n,a,p,e);
        office=o;
        salary=s;
        dateHired=d;
    }
    public String getOffice(){
        return office;
    }
    public void setOffice(String o){
        office=o;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double s){
        salary=s;
    }
    public MyDate getDateHired(){
        return dateHired;
    }
    public void setDateHired(MyDate d){
        dateHired=d;
    }
    public String toString(){
        return "Employee: "+getName();
    }
}
