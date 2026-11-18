package q1;
public class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    public Triangle() {
    }
    public Triangle(double side1, double side2, double side3) {
        if (!isValid(side1,side2,side3))            throw new IllegalArgumentException("Invalid triangle sides");
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    private boolean isValid(double a,double b,double c) {
        return a>0&&b>0&&c>0&&a+b>c&&a+c>b&&b+c>a;
    }
    public double getSide1(){
        return side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }
    public double getArea(){
        double s=getPerimeter()/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }
    public String toString(){
        return "Triangle: side1 = "+side1+" side2 = "+side2+" side3 = "+side3;
    }
}
