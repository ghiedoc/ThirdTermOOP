package thirdterm;

/**
 * Write a program to print the area and perimeter
 * of a triangle having sides of 3, 4 and 5 units by
 * creating a class named 'Triangle' without any
 * parameter in its constructor.
 * @author Gillian
 */

class Triangle{
    double a,b,c;
    
    
    Triangle(){
        
    }
    
    public double solvePerimeter(){
        double perimeter = a + b + c;
        System.out.println("Perimeter: " + perimeter);
        return perimeter;
        
    }
    
    public double solveArea(){
        double area = (a * b) / 2.0;
        System.out.println("Area: " + area);
        return area;
    }

}

public class Codesdope3 {

    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.a = 2;
        t1.b = 5;
        t1.c = 6;
        t1.solvePerimeter();
        t1.solveArea();
    }
    
}
