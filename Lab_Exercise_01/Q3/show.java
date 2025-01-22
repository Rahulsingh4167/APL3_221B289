
public class Mother {
    public static void show() {
        System.out.println("Static show method in Mother");
    }
}


public class Child extends Mother {
    public static void show() {
        System.out.println("Static show method in Child");
    }
}


public class Application {
    public static void main(String[] args) {
        Mother.show(); 
        Child.show();  
        Mother m1 = new Child();
        m1.show();    
    }
}
