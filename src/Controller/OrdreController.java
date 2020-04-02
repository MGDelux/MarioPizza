package Controller;

import model.MenuKort;
import model.Ordre;
import model.OrdreBook;
import model.Pizza;
import View.Main;


import java.util.ArrayList;
import java.util.Scanner;

public class OrdreController {
    ArrayList<Pizza> tempPizza;
    static int ordreUID = 0;
    String tempKundeNavn;
    Scanner userInput = new Scanner(System.in);
    MenuKort menukort = new MenuKort();
    OrdreBook ordrer = new OrdreBook();
    Main main = new Main();

    public void LavOrdre() {
            menukort.PrintAllePizzaer();
            OpretKunde();
            System.out.println("Hvor mange pizzaer er der i denne ordre?");
            String input = userInput.nextLine();
            System.out.println(input + " Antal Pizzaer");
            System.out.println("Pizzza NR:");
            String tempPizza = userInput.nextLine();
            OpretOrdre(tempPizza);

    }

    private void OpretKunde() {
        System.out.println("indtast Kunde Navn:");
        tempKundeNavn = userInput.nextLine();
    }

    private double getodrePris() {
        double totalpris = 0;
        for (Pizza pizza : tempPizza) {
            double pris = pizza.getPris();
            totalpris = +totalpris + pris;
        }
        System.out.println("Total pris af ordre: " + totalpris + " kr. \n");
        return totalpris;
    }

    private void OpretOrdreID() {
        double totalpris = getodrePris();
        Ordre nyPizza = new Ordre(ordreUID, tempKundeNavn, tempPizza, false, totalpris);
        ordrer.tilFoejAktivOrdre(nyPizza);
        System.out.println("Ordre oprettet: " + nyPizza);


    }

    private void OpretOrdre(String pizzaer) {
        tempPizza = new ArrayList<Pizza>();
        Pizza samletPizza;
        ordreUID++;
        String[] splitpizzaer = pizzaer.split(",");
        int pizza = splitpizzaer.length;
        for (int i = 0; i < pizza; i++) {
            samletPizza = menukort.GetPizzaByNR(Integer.parseInt(splitpizzaer[i]));
            tempPizza.add(samletPizza);
        }
        OpretOrdreID();
        main.ShowMenu();
    }

    public void ShowPizza() {
        MenuKort menukort = new MenuKort();
        System.out.println(menukort.pizzas);

    }

}

