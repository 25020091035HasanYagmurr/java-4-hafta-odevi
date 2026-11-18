package q2;
public class Staff extends Employee {
    private String title;
    public Staff(String n,String a,String p,String e,String o,double s,MyDate d,String t){
        super(n,a,p,e,o,s,d);
        title=t;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String t){
        title=t;
    }
    public String toString(){
        return "Staff: "+getName();
    }
}
