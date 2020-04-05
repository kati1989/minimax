import java.util.*;


public class Jatek {
	public static void main(String[] args){
        System.out.println("Minimax torony bontás");
        boolean gameover = false;
        int val = 21;
        System.out.println("Kezdeti ertek = "+ val );
        Scanner sc = new Scanner(System.in);
        
        while(!gameover) {
            Allapot s = new Allapot(val, true);
            Allapot decision = Minimax.minimaxDontes(s);
            val = decision.allapot;
            if(decision.isVegso()){
                gameover = true;
            	System.out.println("Aktualis ertek = "+ val +",PC jatekos nyert " );
                System.out.println("Game over");
            }
            System.out.println("Aktualis ertek = "+ val +", PC jatekos lepett ");
            System.out.println("Kerem a lepest (3,4,5): ");
            int step = sc.nextInt();
            
            if (val-step==0) {
            	gameover=true;
                System.out.println("Nyertel!");
            } else {
            	val=val-step;
            	System.out.println("Aktualis ertek = "+ val +", jatekos lepett " );
            }
        }
    }
}
