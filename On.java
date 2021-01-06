//Singleton pattern

public class On implements Controller{
    private static On tombolon = new On();
    
    private On(){
         System.out.println("Jetpack Machine ON");
    }
    public static On getInstance(){
        return tombolon;
    }

    @Override
    public void control(){
        
    }
}