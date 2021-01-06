public class TerbangTinggiState implements State{
    Terbang terbang;

    public TerbangTinggiState(Terbang terbang){
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
            System.out.println("You can fly for 20 minutes if you fly as high as 30 meters");
            System.out.println("You can fly for 60 minutes if you fly as high as 10 meters");
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