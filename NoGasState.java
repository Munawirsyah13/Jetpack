public class NoGasState implements State{
    Terbang terbang;
    
    public NoGasState(Terbang terbang){
        this.terbang = terbang;
    }

    @Override
    public void insertGas(){
        if (terbang.getGas() <= 60){
            System.out.println("You insert "+terbang.getGas()+" gas");
            terbang.setState(terbang.getHasGasState());
        }else{
            System.out.println("You insert "+terbang.getGas()+" gas");
            System.out.println("Ooh man. What you do ha? Gas Max is 60 !");
            System.exit(0);
        }
    }

    @Override
    public void useGas(){
        System.out.println("Fuel does not exist ...");
        terbang.setState(terbang.getNoGasState());
    }

    @Override
    public void noGas(){
        System.out.println("Fuel is running low");
        terbang.setState(terbang.getNoGasState());
    }
}