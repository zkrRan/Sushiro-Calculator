import java.util.*;


public class SushiroTHAlg {
    private double red;
    private double silver; 
    private double gold;
    private double black;
    private boolean isRefill;
    public static final double refill = 40.0;


    public void getredPlates(int red){
        this.red = red;
        System.out.println(red);
    }

    public void getsilverPlates(int silver){
        this.silver = silver;
    }
    
    public void getgoldPlates(int gold){
        this.gold = gold;
    }

    public void getblackPlates(int black){
        this.black = black;
    }

    public void isRefill(boolean isRefill){
        this.isRefill = isRefill;
    }
    public double Calculate(){
        if(isRefill == true){
            double finalprice = 0.00;
            finalprice += (red * 40.0) + (silver * 60.0) + (gold * 80.0) + (black * 120.0);
            finalprice += refill;
            return finalprice * 1.1;
        }
        else{
            double finalprice = 0.00;
            finalprice += (red * 40.0) + (silver * 60.0) + (gold * 80.0) + (black * 120.0);
            return finalprice * 1.1;
    }
}
}
