package model;
//@author: GRUPPE1*-->
public class Pizza {
    final int PIZZANR;
    String Pizza;
    double Pris;

    public Pizza(int PIZZANR, String pizza, double pris) {
        this.PIZZANR = PIZZANR;
        this.Pizza = pizza;
        this.Pris = pris;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "PIZZANR=" + PIZZANR +
                ", Pizza='" + Pizza + '\'' +
                ", Pris=" + Pris ;
    }
    //*<--

}
