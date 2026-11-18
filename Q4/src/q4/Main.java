package q4;
import java.util.*;
public class Main {
    public static Integer max(ArrayList<Integer> list){
        if(list==null||list.isEmpty())return null;
        Integer m=list.get(0);
        for(Integer v:list)if(v>m)m=v;
        return m;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        System.out.print("Enter numbers (0 to end): ");
        while(true){
            int n=in.nextInt();
            if(n==0)break;
            list.add(n);
        }
        System.out.println("The maximum number is "+max(list));
        in.close();
    }
}
