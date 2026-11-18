package q5;
public class Main {
    public static void main(String[] args){
        Course c=new Course("Object-Oriented Programming");
        c.addStudent("Ali");
        c.addStudent("Ayse");
        c.addStudent("Mehmet");
        c.dropStudent("Mehmet");
        System.out.println("Course: "+c.getCourseName());
        System.out.println("Number of students: "+c.getNumberOfStudents());
        System.out.println("Students: "+c.getStudents());
    }
}
