package q1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter side1: ");
        double a=input.nextDouble();
        System.out.print("Enter side2: ");
        double b=input.nextDouble();
        System.out.print("Enter side3: ");
        double c=input.nextDouble();
        input.nextLine();
        System.out.print("Enter color: ");
        String color=input.nextLine();
        System.out.print("Filled (true/false): ");
        boolean filled=input.nextBoolean();
        try {
            Triangle t=new Triangle(a,b,c);
            t.setColor(color);
            t.setFilled(filled);
            System.out.println("Area: "+t.getArea());
            System.out.println("Perimeter: "+t.getPerimeter());
            System.out.println("Color: "+t.getColor());
            System.out.println("Filled: "+t.isFilled());
        }
        catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        input.close();
    }
}
