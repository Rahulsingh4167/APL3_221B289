public interface Swimmable {
    default void swim() {
        System.out.println("I can swim!");
    }
}