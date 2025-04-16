
public class Test implements Testable {

    @Override
    public void display() {
        System.out.println("Display method in the Test class.");
    }
    
    public static void main(String[] args) {
       
        Test t = new Test();
        t.display(); 
    }
}
