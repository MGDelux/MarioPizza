import model.Ordre;
import model.Pizza;

import java.util.ArrayList;
import java.util.Scanner;

public class OpretOrdre {
    ArrayList<Pizza> tempPizza;
    static int ordreUID = 0;
    String tempKundeNavn;
    Scanner userInput = new Scanner(System.in);
    MenuKort menukort = new MenuKort();
    OrdreBook ordrer = new OrdreBook();
    Main main = new Main();

    public void LavOrdre() {
        ShowPizza();
        OpretKunde();
        System.out.println("Hvor mange pizzaer er der i denne ordre?");
        String input = userInput.nextLine();
        switch (Integer.parseInt(input)) {
            case 1:
                System.out.println("Pizzza NR:");
                String tempPizza = userInput.nextLine();
                OpretOrdre(tempPizza);

                break;
            case 2:
                System.out.println("2 pizzaer");
                System.out.println("Pizzza NR:");
                tempPizza = userInput.nextLine();
                OpretOrdre(tempPizza);

                break;
            case 3:
                System.out.println("3 pizza");
                tempPizza = userInput.nextLine();
                OpretOrdre(tempPizza);
                break;
            case 4:
                System.out.println("4 pizza");
                tempPizza = userInput.nextLine();
                OpretOrdre(tempPizza);
                break;
            case 5:
                System.out.println("5 pizza");
                tempPizza = userInput.nextLine();
                OpretOrdre(tempPizza);
                break;
        }

    }

    private void OpretKunde() {
        System.out.println("instast Kunde Navn:"); // FIX
        tempKundeNavn = userInput.nextLine();
    }


    private void OpretOrdreID() {
        Ordre nyPizza = new Ordre(ordreUID, tempKundeNavn, tempPizza, false);
        ordrer.pizzaPark(nyPizza);
        System.out.println("Ordre oprettet: " + nyPizza);
    }

    private void OpretOrdre(String pizzaer) {
        tempPizza = new ArrayList<Pizza>();
        Pizza samletPizza;
        ordreUID++;
        String[] splitPizzer = pizzaer.split(",");
        switch (splitPizzer.length) {
            case 1:
                samletPizza = menukort.GetPizzaByNR(Integer.parseInt(pizzaer));
                tempPizza.add(samletPizza);
                OpretOrdreID();
                main.ShowMenu();
                break;
            case 2:
                for (int i = 0; i < 2; i++) {
                    samletPizza = menukort.GetPizzaByNR(Integer.parseInt(splitPizzer[i]));
                    tempPizza.add(samletPizza);
                }
                OpretOrdreID();
                main.ShowMenu();

                break;
            case 3:
                for (int i = 0; i < 3; i++) {
                    samletPizza = menukort.GetPizzaByNR(Integer.parseInt(splitPizzer[i]));
                    tempPizza.add(samletPizza);
                }
                OpretOrdreID();
                main.ShowMenu();
                break;
            case 4:
                for (int i = 0; i < 4; i++) {
                    samletPizza = menukort.GetPizzaByNR(Integer.parseInt(splitPizzer[i]));
                    tempPizza.add(samletPizza);
                }
                OpretOrdreID();
                main.ShowMenu();
                break;
            case 5:
                for (int i = 0; i < 5; i++) {
                    samletPizza = menukort.GetPizzaByNR(Integer.parseInt(splitPizzer[i]));
                    tempPizza.add(samletPizza);
                }
                OpretOrdreID();
                main.ShowMenu();
                break;
            default:
                System.out.println("ERROR: fejl i pizza antal");
                break;

        }

    }

    public void ShowPizza() {
        MenuKort menukort = new MenuKort();
        System.out.println(menukort.pizzas);

    }

}
