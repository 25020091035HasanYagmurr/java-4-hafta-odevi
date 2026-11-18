package q7;
import java.util.*;
public class Main {
    public static void shuffle(ArrayList<Integer> list){
        if(list!=null)Collections.shuffle(list);
    }
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=10;i++)list.add(i);
        System.out.println("Before: "+list);
        shuffle(list);
        System.out.println("After: "+list);
    }
}
