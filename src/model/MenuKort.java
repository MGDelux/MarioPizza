package model;

import View.Main;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MenuKort {
   public static ArrayList<Pizza> pizzas;
   static ArrayList<Pizza> tempPizzas = new ArrayList<Pizza>();

    public void GetPizzas() throws FileNotFoundException {
        String filepath = "Data/Pizzas.csv";
        ImportData getPizzas = new ImportData();
        pizzas = new ArrayList<Pizza>();
        tempPizzas = getPizzas.ImportMenu(filepath);
        AddPizzaToArray(tempPizzas);
        PrintAllePizzaer();
        new Main().ShowMenu();
    }

    public void PrintAllePizzaer() {
        for(Pizza pizza:tempPizzas){
            System.out.println(pizza);
        }
    }

    private void AddPizzaToArray(ArrayList<Pizza> temp) {
        for (Pizza piz: temp) {
            pizzas.add(piz);
        }

    }
    public Pizza GetPizzaByNR(int pizzanr){
      Pizza thePizza = pizzas.get(pizzanr-1);
        System.out.println(thePizza);
        return thePizza;
    }
}
