package Q3;

public class Child {

    
 public class Child extends Mother {
    static void show() {
        System.out.println("Hello from Child");
    }
}

// Application class:
Mother m1 = new Child();
m1.show(); 

    
}
