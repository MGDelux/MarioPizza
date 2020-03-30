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
        return "Pizza(er): " +
                "PizzaNR# " + PizzaNR +
                ", Pizza Navn: '" + Pizza + '\'' +
                ", Pris: " + Pris;
    }
    public String MenuToString() { //ALI's METODE
        return "\nPizza(er): " +
                "PizzaNR# " + PizzaNR +
                ", Pizza Navn: '" + Pizza + '\'' +
                ", Pris: " + Pris+"\n";
    }

    public double getPris() {return Pris;

    }
}
