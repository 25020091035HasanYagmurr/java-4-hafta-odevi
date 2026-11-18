package q6;
import java.util.*;
public class Main {
    public static void main(String[] args){
        ArrayList<Object> list=new ArrayList<>();
        list.add(new Loan(5.0,12,50000));
        list.add(new Date());
        list.add("A String");
        list.add(new Circle(3.5));
        for(Object o:list)System.out.println(o);
    }
}
