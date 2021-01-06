public class Terbang{
    State noGasState;
    State hasGasState;
    State terbangTinggiState;
    State terbangRendahState;

    State state;

    int gas = 0;

    public Terbang(int remainingFuel){
        noGasState = new NoGasState(this);
        hasGasState = new HasGasState(this);
        terbangTinggiState = new TerbangTinggiState(this);
        terbangRendahState = new TerbangRendahState(this);
        
        this.gas = remainingFuel;
        if (remainingFuel > 0){
            state = noGasState;
        }else{
            System.out.println("Minimum insert gas is 1");
            System.exit(0);
        }
    }

    public void insertGas(){
        state.insertGas();
    }

    public void noGas(){
        state.noGas();
    }

    public void useGas(){
        state.useGas();
    }
    public void releaseGas(){
        System.out.println("Fuel continues to decrease ...");
        if (gas != 0){
            gas = gas - (gas - 1);
        }
    }

    int getGas(){
        return gas;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

    public State getNoGasState(){
        return noGasState;
    }

    public State getHasGasState(){
        return hasGasState;
    }
    public State getTerbangTinggiState(){
        return terbangTinggiState;
    }
    public State getTerbangRendahState(){
        return terbangRendahState;
    }

    public String toString(){
        return "Terbang Siap";
    }
}
