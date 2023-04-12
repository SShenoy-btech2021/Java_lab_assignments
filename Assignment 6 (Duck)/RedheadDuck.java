public class RedheadDuck extends Duck{
    RedheadDuck(){
        flyBehavior= new FlyWithWings();
        quackBehavior=new Quack();
        swimBehaviour=new Swim();
    }

    @Override
    void display() {
        System.out.println("I am Redhead Duck ....");
    }
}
