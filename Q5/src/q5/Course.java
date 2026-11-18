package q5;
import java.util.ArrayList;
public class Course {
    private final String courseName;
    private final ArrayList<String> students=new ArrayList<>();
    public Course(String courseName){
        this.courseName=courseName;
    }
    public String getCourseName(){
        return courseName;
    }
    public void addStudent(String s){
        students.add(s);
    }
    public void dropStudent(String s){
        students.remove(s);
    }
    public ArrayList<String> getStudents(){
        return students;
    }
    public int getNumberOfStudents(){
        return students.size();
    }
    public void clear(){
        students.clear();
    }
}
