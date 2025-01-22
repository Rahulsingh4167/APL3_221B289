
 class One {
    public One(int x) {
        System.out.println("Parameterized Constructor of One: " + x);
    }
}


 class Two extends One {
    public Two(int x) {
        super(x); 
        System.out.println("Constructor of Two: " + x);
    }
}


public class Main {
    public static void main(String[] args) {
        Two obj = new Two(10);
    }
}
