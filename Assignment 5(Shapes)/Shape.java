abstract public class Shape {
    public static void stateShape(String shape) {
        System.out.println("The Shape is : " + shape);
    }
    abstract public void calculateCircumference(double R);

    abstract public void calculatePerimeter();


    abstract public void calculateArea();

    abstract void calculateArea(double R);
    abstract public void calculateArea(double R, double h);
    abstract public void calculateArea(double l,double w,double h);
}

