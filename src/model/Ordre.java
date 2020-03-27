package model;
//@author: GRUPPE1-->
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Ordre {
     static int ordreUID;

    LocalDateTime ordreTid;
    String kundeNavn;
    ArrayList<Pizza> pizza;
    boolean ordreStatus;

    public Ordre(int ordreUID, String kundeNavn, ArrayList<Pizza> pizza, boolean ordreStatus) {
        this.ordreUID = ordreUID;
        this.ordreTid = LocalDateTime.now(); //FORMAT
        this.kundeNavn = kundeNavn;
        this.pizza = pizza;
        this.ordreStatus = ordreStatus;

    }

    @Override
    public String toString() {
        return "Ordre{" +
                "OrdreUID=" + ordreUID +
                ", ordreTid=" + ordreTid +
                ", kundeNavn='" + kundeNavn + '\'' +
                ", pizza=" + pizza;
    }
    //*<--
}
