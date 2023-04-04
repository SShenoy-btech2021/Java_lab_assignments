import java.util.Scanner;
import java.util.*;

public class Rectangle extends Shape{


    @Override
    public void calculateCircumference(double R) {

    }




    @Override
    public void calculatePerimeter() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length of the rectangle ");
        double L=Double.parseDouble(sc.nextLine());
        System.out.println("Enter the breadth of the rectangle ");
        double B=Double.parseDouble(sc.nextLine());

        double perimeter=2*(L+B);
        System.out.println("The perimeter of the Rectangle is "+perimeter);
    }

    @Override
    public void calculateArea() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length of the rectangle ");
        double l=Double.parseDouble(sc.nextLine());
        System.out.println("Enter the breadth of the rectangle ");
        double b=Double.parseDouble(sc.nextLine());

        double area=l*b;
        System.out.println("The area of the Rectangle is "+area);

    }

    @Override
    void calculateArea(double R) {

    }

    @Override
    public void calculateArea(double R, double h) {

    }

    @Override
    public void calculateArea(double l, double w, double h) {

    }
}
