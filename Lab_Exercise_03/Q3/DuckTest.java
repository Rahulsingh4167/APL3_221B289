public class DuckTest {
    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();
        WoodenDuck woodenDuck = new WoodenDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        LakeDuck lakeDuck = new LakeDuck();

        
        System.out.println("Rubber Duck:");
        rubberDuck.squeak();
        rubberDuck.swim();

        System.out.println("\nWooden Duck:");
        woodenDuck.mute();
        woodenDuck.swim();

        System.out.println("\nRedHead Duck:");
        redHeadDuck.fly();
        redHeadDuck.quack();
        redHeadDuck.swim();

        System.out.println("\nLake Duck:");
        lakeDuck.fly();
        lakeDuck.quack();
        lakeDuck.swim();
    }
}
