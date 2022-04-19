import java.util.*;

public class Main {
    public static void main(String[] args) {
            System.out.println("Sushiro Calculator");
            SushiroTHAlg sushi = new SushiroTHAlg();

            // ask user if youve also ordered refill beverage bar
            boolean refillinputcheck = false;
            do {
                try {
                    System.out.println("Refill?");
                    Scanner refillinput = new Scanner(System.in);
                    boolean refill = refillinput.nextBoolean();
                    if (refill == true) {
                        sushi.isRefill(true);
                        System.out.println("With Refill");
                        refillinputcheck = true;
                    } else if (refill == false) {
                        sushi.isRefill(false);
                        System.out.println("No Refill");
                        refillinputcheck = true;
                    }
    
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input!");
                }
            } while (!refillinputcheck);

            // input plates
            Scanner plate = new Scanner(System.in);
            System.out.println("Red plate = ");
            int red = plate.nextInt();
            sushi.getredPlates(red);

            System.out.println("Silver plate = ");
            int silver = plate.nextInt();
            sushi.getsilverPlates(silver);

            System.out.println("Gold plate = ");
            int gold = plate.nextInt();
            sushi.getgoldPlates(gold);

            System.out.println("Black plate = ");
            int black = plate.nextInt();
            sushi.getblackPlates(black);

            plate.close();

            // after received all inputs from user, then calculate and print in one line
            System.out.println("The final price you have to pay Riffy (tax included) is " + sushi.Calculate() + " Baht.");
            System.out.println("KubRiffy");
        } 
            
    
}
