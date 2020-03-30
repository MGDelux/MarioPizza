import model.Ordre;

import java.util.ArrayList;
import java.util.Collection;

public class OrdreBook {
    static ArrayList<Ordre> aktiveOrdrer = new ArrayList<Ordre>();
    public void pizzaPark(Ordre ordre) {
        aktiveOrdrer.add(ordre);
    }
     void VisOrdre(){
         for (Ordre odre: aktiveOrdrer)
             if (odre.isOrdreStatus() == false){
                 System.out.println("false : "+odre);
             }
         new Main().ShowMenu();
    }
    void VisAlleOrdre(){
        for (Ordre odre: aktiveOrdrer)
                System.out.println("Odre : "+odre);
        new Main().ShowMenu();
    }
    void SletOrdre(int uID){
        for(Ordre ordre: aktiveOrdrer)
        if(uID == ordre.getOrdreUID()){
            aktiveOrdrer.remove(ordre);
            new Main().ShowMenu();

        }

    }
    void aandreordre(int uID) {
        for (Ordre ordre : aktiveOrdrer)
            if (uID == ordre.getOrdreUID()) {
                ordre.setOrdreStatus(true);
                new Main().ShowMenu();

            }
    }

}
