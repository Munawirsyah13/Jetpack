public class TerbangRendahState implements State{
    Terbang terbang;

    public TerbangRendahState(Terbang terbang){
        this.terbang = terbang;
    }

    @Override
    public void insertGas(){
        System.out.println("Gas already consumtion");
    }

    @Override
    public void useGas(){
        if (terbang.getGas() == 0){
            terbang.setState(terbang.getNoGasState());
        }else{
            System.out.println("You can only fly as high as 10 meters");
            terbang.releaseGas();
            if (terbang.getGas() > 0){
                terbang.setState(terbang.getHasGasState());
            }else{
                System.out.println("Fuel is low ... !");
                terbang.setState(terbang.getNoGasState());
            }
        }
    }
    
    @Override
    public void noGas(){}
}