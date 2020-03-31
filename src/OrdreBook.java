import model.Ordre;

import java.util.ArrayList;

public class OrdreBook {
    static ArrayList<Ordre> aktiveOrdrer = new ArrayList<Ordre>();

    public void tilFoejAktivOrdre(Ordre ordre) { //#PIZZAPARK FTW
        aktiveOrdrer.add(ordre); //tilføj ordre
    }

     void VisOrdre(){
         System.out.println("Aktive Ordre: ");
         for (Ordre odre: aktiveOrdrer)
             if (odre.isOrdreStatus() == false){
                 System.out.println(odre);
             }
         new Main().ShowMenu();
    }
    void VisAlleOrdre(){
        System.out.println("Alle ordre:");
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
    void aandreordre(int uID) { //ændreOrdre
        for (Ordre ordre : aktiveOrdrer)
            if (uID == ordre.getOrdreUID()) {
                ordre.setOrdreStatus(true);
                new Main().ShowMenu();

            }
        else {
                System.out.println("Denne ordre kan ikke findes.");
            }
    }
    void BeregnOmsaatning(){
        double totalPris = 0;
        for (Ordre ordre : aktiveOrdrer){
           double pris = ordre.getTotalOrderPris();
           totalPris =+ totalPris + pris;
        }
        System.out.println("Omsætningen er: "+totalPris+" kr. ");
        new Main().ShowMenu();
    }
     public ArrayList<Ordre> faaAlleOrdre(){
      return aktiveOrdrer;
     }

}
