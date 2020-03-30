package model;

//@author: GRUPPE1*-->
public class Pizza {
    int PizzaNR;
    String Pizza;
    double Pris;

    public Pizza(int PIZZANR, String pizza, double pris) {
        this.PizzaNR = PIZZANR;
        this.Pizza = pizza;
        this.Pris = pris;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "PizzaNR=" + PizzaNR +
                ", Pizza='" + Pizza + '\'' +
                ", Pris=" + Pris +
                '}';
    }
    //*<--

}
