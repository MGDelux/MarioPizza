package model;
//@author: GRUPPE1-->
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Ordre {
    int OrdreUID;
    LocalDateTime ordreTid;
    String kundeNavn;
    ArrayList<Pizza> pizza;

    public Ordre(int ordreUID, int ordreTid, String kundeNavn, ArrayList<Pizza> pizza) {
        this.OrdreUID = ordreUID;
        this.ordreTid = LocalDateTime.now();
        this.kundeNavn = kundeNavn;
        this.pizza = pizza;
    }

    @Override
    public String toString() {
        return "Ordre{" +
                "OrdreUID=" + OrdreUID +
                ", ordreTid=" + ordreTid +
                ", kundeNavn='" + kundeNavn + '\'' +
                ", pizza=" + pizza;
    }
    //*<--
}
