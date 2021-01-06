public class Off implements Controller{
    private static Off tomboloff = new Off();
    
    private Off(){
         System.out.println("Jetpack Machine OFF");
    }
    public static Off getInstance(){
        return tomboloff;
    }

    @Override
    public void control(){
        
    }
}