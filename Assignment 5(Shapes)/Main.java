import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);


       int m=1;




      while(m==1) {
         System.out.println("Choose the shape for which you want the area \n 1.Circle \n 2.Rectangle \n 3.Square\n 4.Sphere\n 5.Cylinder\n 6.Pyramid");
         int n=Integer.parseInt(sc.nextLine());
         switch (n) {
            case 1:

               Circle circle = new Circle();

                System.out.println("Enter the radius of the cylinder ");
                double R=Double.parseDouble(sc.nextLine());
               circle.stateShape("Circle");
               circle.calculateCircumference(R);
               circle.calculateArea(R);

               break;
            case 2:
               Rectangle rectangle = new Rectangle();
               rectangle.stateShape("Rectangle");
               rectangle.calculatePerimeter();
               rectangle.calculateArea();
               break;
            case 3:
                   Square square = new Square();
                   square.stateShape("Square");
                   square.calculatePerimeter();
                   square.calculateArea();
                   break;
            case 4:

                 Sphere sphere=new Sphere();


                System.out.println("Enter the radius of the sphere ");

                double r2=Double.parseDouble(sc.nextLine());
                sphere.stateShape("Sphere");



                 sphere.calculateArea(r2);
                 sphere.calculateVolume(r2);
                 break;
             case 5:

                 Cylinder cylinder=new Cylinder();

                 System.out.println("Enter the radius of the cylinder ");
                 double r=Double.parseDouble(sc.nextLine());
                 System.out.println("Enter the height of the cylinder");
                 double h=Double.parseDouble(sc.nextLine());
                 cylinder.stateShape("cylinder");



                 cylinder.calculateArea(r,h);
                 cylinder.calculateVolume(r,h);
                 break;
             case 6:
                 Pyramid pyramid = new Pyramid();
//                 sc.nextLine();
                 System.out.println("Enter the length of the base of the pyramid ");
                 double l=Double.parseDouble(sc.nextLine());
                 System.out.println("Enter the width of the base of the pyramid ");
                 double w=Double.parseDouble(sc.nextLine());
                 System.out.println("Enter the height of the pyramid");

                 double H=Double.parseDouble(sc.nextLine());
                 pyramid.stateShape("pyramid");
                 pyramid.calculateArea(l,w,H);
                 pyramid.calculateVolume(l,w,H);
                 break;

















         }
        System.out.println("Press 1 to continue \n") ;
         m=Integer.parseInt(sc.nextLine());
         System.out.println("\n");
      }













    }
}