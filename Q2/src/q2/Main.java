package q2;
public class Main {
    public static void main(String[] args){
        MyDate d=new MyDate(2024,9,1);
        Person[] p={
            new Person("Ali","Istanbul","555-1001","ali@example.com"),new Student("Ayse","Ankara","555-1002","ayse@example.com",Student.JUNIOR),new Employee("Mehmet","Izmir","555-1003","mehmet@example.com","A-101",9000,d),new Faculty("Zeynep","Bursa","555-1004","zeynep@example.com","B-201",15000,d,"10-12","Professor"),new Staff("Can","Adana","555-1005","can@example.com","C-301",8000,d,"Coordinator")
        }
        ;
        for(Person x:p)System.out.println(x);
    }
}
