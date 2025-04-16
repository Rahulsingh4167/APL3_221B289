
public class ConcreteTest extends AbsTest {


    public void display() {
        System.out.println("Display method in the ConcreteTest class.");
    }
    
    public static void main(String[] args) {
        
        ConcreteTest ct = new ConcreteTest();
        ct.display();  
    }
}
