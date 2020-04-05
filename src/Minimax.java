import java.util.*;
 
public final class Minimax {
 
    private Minimax() {}
 
    public static Allapot minimaxDontes(Allapot allapot) {
        return allapot.getLepesek().stream()
                .max(Comparator.comparing(Minimax::minErtek)).get();
    }
 
    private static double maxErtek(Allapot allapot) {
        if(allapot.isVegso()){
            return allapot.getUtility();
        }
        return allapot.getLepesek().stream()
                .map(Minimax::minErtek)
                .max(Comparator.comparing(Double::valueOf)).get();
    }
 
    private static double minErtek(Allapot allapot) {
        if(allapot.isVegso()){
            return allapot.getUtility();
        }
        return allapot.getLepesek().stream()
                .map(Minimax::maxErtek)
                .min(Comparator.comparing(Double::valueOf)).get();
    }
}