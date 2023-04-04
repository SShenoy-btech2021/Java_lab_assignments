import java.util.Scanner;

public class Square extends Shape{
    @Override
    public void calculateCircumference(double R) {

    }

    @Override
    public void calculatePerimeter() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the side  of the square");
        double side=Double.parseDouble(sc.nextLine());

        double perimeter=4*side;
        System.out.println("The perimeter of the square is  "+perimeter);
    }


    @Override
    public void calculateArea() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the side  of the square");
        double side=Double.parseDouble(sc.nextLine());

        double area=side*side;
        System.out.println("The area of the square is  "+area);

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
