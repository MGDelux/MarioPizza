import model.ImportData;
import model.Pizza;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MenuKort {
   public static ArrayList<Pizza> pizzas;
    ArrayList<Pizza> tempPizzas = new ArrayList<Pizza>();

    public void GetPizzas() throws FileNotFoundException {
        String filepath = "C:/Users/mathi/IdeaProjects/MarioPizza/src/Data/Pizzas.csv"; // PATH TIL cvs fil Data/Pizzas.cvs virker ikke på min pc ?
        ImportData getPizzas = new ImportData();
        pizzas = new ArrayList<Pizza>();
        tempPizzas = getPizzas.ImportMenu(filepath);
        AddPizzaToArry(tempPizzas);
        System.out.println(pizzas);
        new Main().ShowMenu();
    }

    private void AddPizzaToArry(ArrayList<Pizza> temp) {
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
