package q2;
public class Faculty extends Employee {
    private String officeHours,rank;
    public Faculty(String n,String a,String p,String e,String o,double s,MyDate d,String h,String r){
        super(n,a,p,e,o,s,d);
        officeHours=h;
        rank=r;
    }
    public String getOfficeHours(){
        return officeHours;
    }
    public void setOfficeHours(String h){
        officeHours=h;
    }
    public String getRank(){
        return rank;
    }
    public void setRank(String r){
        rank=r;
    }
    public String toString(){
        return "Faculty: "+getName();
    }
}
