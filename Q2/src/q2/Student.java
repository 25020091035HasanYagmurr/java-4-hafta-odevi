package q2;
public class Student extends Person {
    public static final String FRESHMAN="Freshman",SOPHOMORE="Sophomore",JUNIOR="Junior",SENIOR="Senior";
    private String classStatus;
    public Student(String n,String a,String p,String e,String s){
        super(n,a,p,e);
        classStatus=s;
    }
    public String getClassStatus(){
        return classStatus;
    }
    public void setClassStatus(String s){
        classStatus=s;
    }
    public String toString(){
        return "Student: "+getName();
    }
}
