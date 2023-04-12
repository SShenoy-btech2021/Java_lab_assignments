public class Main {
    public static void main(String[] args) {
        System.out.println("\nMallard Duck:\n");
        MallardDuck mallardDuck=new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        mallardDuck.performSwim();
        System.out.println("\nRubber Duck:\n");
        RubberDuck rubberDuck=new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();
        rubberDuck.performSwim();
        System.out.println("\nRedhead Duck:\n");
        RedheadDuck redheadDuck=new RedheadDuck();
        redheadDuck.display();
        redheadDuck.performQuack();
        redheadDuck.performFly();
        redheadDuck.performSwim();
        System.out.println("\nDecoy Duck:\n");
        DecoyDuck decoyDuck=new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performQuack();
        decoyDuck.performFly();
        decoyDuck.performSwim();

    }
}