import java.util.Scanner;
import java.util.*;


public class Circle extends Shape  {


    @Override
    public void calculateCircumference(double R) {
        double circumference=2*Math.PI*R;
        System.out.println("The circumference of the circle is "+circumference);
    }

    @Override
    public void calculatePerimeter() {

    }





    @Override
    public void calculateArea() {

    }

    @Override
    public void calculateArea(double R ) {

        // In assignment get R from the user

        // Formula for Area of Circle
        double area=Math.PI*Math.pow(R,2);
        System.out.println("The Area of Circle "+area);

    }

    @Override
    public void calculateArea(double R, double h) {

    }

    @Override
    public void calculateArea(double l, double w, double h) {

    }
}
