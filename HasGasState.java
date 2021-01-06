public class HasGasState implements State{
    Terbang terbang;
    public HasGasState(Terbang terbang){
        this.terbang = terbang;
    }    

    @Override
    public void insertGas(){
        System.out.println("Fuel is full! or cannot insert if the machine ON");
    }

    @Override
    public void useGas(){
        System.out.println("Is using fuel ...");
        if (terbang.getGas() == 60){
            terbang.setState(terbang.getTerbangTinggiState());
        }else{
            terbang.setState(terbang.getTerbangRendahState());
        }
    }

    @Override
    public void noGas(){
        System.out.println("Fuel is running low ...!");
        terbang.setState(terbang.getNoGasState());
    }
}