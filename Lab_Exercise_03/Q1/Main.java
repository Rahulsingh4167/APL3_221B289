abstract class Bharatvanshi {
    
    public abstract void fight();
    public abstract void obey();
    
   
    public void kind() {
        System.out.println("Kindness is subjective, some are kind, some are not.");
    }
}



public class Main {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        arjun.fight();  
        arjun.obey();  
        arjun.kind();   

        Bheem bheem = new Bheem();
        bheem.fight();  
        bheem.obey();   
        bheem.kind();  

        Duryodhan duryodhan = new Duryodhan();
        duryodhan.fight();  
        duryodhan.obey();   
        duryodhan.kind();   

        Vikarn vikarn = new Vikarn();
        vikarn.fight();     
        vikarn.obey();      
        vikarn.kind();      
    }
}

