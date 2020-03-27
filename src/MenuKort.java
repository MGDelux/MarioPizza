import model.ImportData;
import model.Pizza;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MenuKort {
    ArrayList<Pizza> pizzas;

    public void GetPizzas() throws FileNotFoundException {
        String filepath = "C:/Users/mathi/IdeaProjects/MarioPizza/src/Data/Pizzas.cvs"; // PATH TIL cvs fil Data/Pizzas.cvs virker ikke på min pc ?
        ImportData getPizzas = new ImportData();
        pizzas = new ArrayList<Pizza>();
        pizzas = getPizzas.ImportMenu(filepath);
        System.out.println(pizzas);
    }
}
