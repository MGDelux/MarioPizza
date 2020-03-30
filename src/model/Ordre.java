package model;
//@author: GRUPPE1-->

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Ordre {
    int ordreUID;
    String ordreTid;
    String kundeNavn;
    ArrayList<Pizza> pizza;
    boolean ordreStatus;
    double totalOrderPris;

    public Ordre(int ordreUID, String kundeNavn, ArrayList<Pizza> pizza, boolean ordreStatus, double totalOrderPris) {
        this.ordreUID = ordreUID;
        this.ordreTid = LocalTimeFormat(); //FORMAT
        this.kundeNavn = kundeNavn;
        this.pizza = pizza;
        this.ordreStatus = ordreStatus;
        this.totalOrderPris = totalOrderPris;
    }
    String LocalTimeFormat(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDateTime = now.format(formatter);
        return formatDateTime;
    }

    @Override
    public String toString() {
        String orderStatusOversat;
        if (ordreStatus == false)
        {
            orderStatusOversat = "Igang";
        }
        else {
            orderStatusOversat = "Færdig";
        }
        return "\n" +
                "Ordre ID #" + ordreUID +
                ", Tidspunkt: " + ordreTid +
                ", kunde Navn: '" + kundeNavn + '\'' +
                ", \npizza: " + pizza +
                ", \nordre Status: " + orderStatusOversat +
                ", \nTotal pris: " + totalOrderPris+" Kr.";
    }

    public boolean isOrdreStatus() {
        return ordreStatus;
    }

    public int getOrdreUID() {
        return ordreUID;
    }

    public void setOrdreStatus(boolean ordreStatus) {
        this.ordreStatus = ordreStatus;
    }

    public double getTotalOrderPris() {
        return totalOrderPris;
    }
    //*<--
}
