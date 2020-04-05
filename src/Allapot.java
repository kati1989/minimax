import java.util.*;

public class Allapot {
 
        final int allapot;
        final boolean jatekos;
        final boolean masodik;
 
        public Allapot(int allapot, boolean elso){
            this.allapot = allapot;
            this.jatekos = elso;
            this.masodik = !elso;
        }
 
        Collection<Allapot> getLepesek(){
            List<Allapot> lepesek = new LinkedList<>();
            if(allapot > 4){
                lepesek.add(new Allapot(allapot-5, masodik));
            }
            if(allapot > 3){
                lepesek.add(new Allapot(allapot-4, masodik));
            }
            if(allapot > 2){
                lepesek.add(new Allapot(allapot-3, masodik));
            }
            return lepesek;
        }
 
        boolean isVegso() {
            return allapot < 3;
        }
 
        double getUtility() {
            if(jatekos)
                return -1;
            else
                return 1;
        }
}
