import java.util.Scanner;
public class Main{
    public static void main(String a[]){
        GerakKiri kiri = new GerakKiri();
        GerakKanan kanan = new GerakKanan();
        GerakNaik naik = new GerakNaik();
        GerakTurun turun = new GerakTurun();
        GerakMaju maju = new GerakMaju();
        GerakMundur mundur = new GerakMundur();
        Scanner gasObj = new Scanner(System.in);
        
        System.out.print("Enter the amount of gas : ");
        int gas = gasObj.nextInt();
        Terbang terbang = new Terbang(gas);

        terbang.insertGas();
        
        On tombolon = On.getInstance();
        naik.analog();
        terbang.useGas();
        terbang.useGas();
        maju.analog();
        mundur.analog();
        kanan.analog();
        kiri.analog();
        terbang.noGas();
        turun.analog();
        Off tomboloff = Off.getInstance();
    }
}