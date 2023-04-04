import java.util.Scanner;
import java.util.*;

public class Cylinder extends Shape implements Volume {

    @Override
    public void calculateCircumference(double R) {

    }

    @Override
    public void calculatePerimeter() {

    }



    @Override
    public void calculateArea() {

    }

    @Override
    void calculateArea(double R) {

    }

    @Override
    public void calculateArea(double R,double h) {
        double surface_area=2*h*R*(Math.PI);
        System.out.println("The Surface Area of Cylinder "+surface_area);
    }

    @Override
    public void calculateArea(double l, double w, double h) {

    }

    @Override
    public void calculateVolume() {

    }

    @Override
    public void calculateVolume(double R) {

    }

    @Override
    public void calculateVolume(double R,double h) {
        double volume=(h*(Math.PI*Math.pow(R,2)));
        System.out.println("The Volume  of Sphere "+volume);

    }

    @Override
    public void calculateVolume(double l, double w, double h) {

    }
}
