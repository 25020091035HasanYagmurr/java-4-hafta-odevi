package q9;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int n=in.nextInt();
        int[][] m=new int[n][n];
        Random r=new Random();
        for(int i=0;i<n;i++)for(int j=0;j<n;j++)m[i][j]=r.nextInt(2);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)System.out.print(m[i][j]+" ");
            System.out.println();
        }
        ArrayList<Integer> rows=new ArrayList<>();
        int mr=-1;
        for(int i=0;i<n;i++){
            int c=0;
            for(int v:m[i])c+=v;
            if(c>mr){
                mr=c;
                rows.clear();
                rows.add(i);
            }
            else if(c==mr)rows.add(i);
        }
        ArrayList<Integer> cols=new ArrayList<>();
        int mc=-1;
        for(int j=0;j<n;j++){
            int c=0;
            for(int i=0;i<n;i++)c+=m[i][j];
            if(c>mc){
                mc=c;
                cols.clear();
                cols.add(j);
            }
            else if(c==mc)cols.add(j);
        }
        System.out.print("The largest row index: ");
        print(rows);
        System.out.print("The largest column index: ");
        print(cols);
        in.close();
    }
    private static void print(ArrayList<Integer> x){
        for(int i=0;i<x.size();i++){
            if(i>0)System.out.print(", ");
            System.out.print(x.get(i));
        }
        System.out.println();
    }
}
