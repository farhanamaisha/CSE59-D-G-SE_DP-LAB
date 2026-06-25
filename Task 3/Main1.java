public interface Shape {
    double CalculateArea();
}
public class Rectangle implements Shape {
    private double length;
    private double width;
    
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    public double CalculateArea(){
        return length*width;
    }
}
public class Circle implements Shape{
    private double r;
    public Circle (double r){
        this.r=r;
    }
    public double CalculateArea(){
        return Math.PI*r*r;
    }
}
public class Triangle implements Shape {
    private double b;
    private double h;
    public Triangle(double b,double h){
        this.b=b;
                this.h=h;}
    public double CalculateArea(){
        return  0.5*b*h;
    }
}
public class AreaCalculator {
    public double CalculateArea(Shape[]shapes){
        double totalarea=0;
        for (Shape shape:shapes){
            totalarea+=shape.CalculateArea();
            
        }
        return totalarea;
    }
            
}

public class Main1 {
    public static void main(String[] args) {
        Shape[]shapes={
            new Rectangle(5,4),
            new Circle (3),
            new Triangle(6,2)
        };
        AreaCalculator  calculator=new AreaCalculator();
        System.out.println("total area"+ calculator.CalculateArea(shapes));
    }
}
