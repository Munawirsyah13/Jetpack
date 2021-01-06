public abstract class Jetpack{
    Controller controlJetpack;

    public abstract void display();
    
    public void analog(){
        this.controlJetpack.control();
    }
}