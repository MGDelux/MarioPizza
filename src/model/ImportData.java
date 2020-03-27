package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ImportData {
    public ArrayList<Pizza> ImportMenu(String filepath) throws FileNotFoundException {
        ArrayList<Pizza> pizzas = new ArrayList<Pizza>(); //"TEMP Pizza Array som vi bruger til at sende tilbage til MenuKort
        File fp = new File(filepath);
        String line = "";
        if (fp.exists()) {
            Scanner nl = new Scanner(fp);
            while (nl.hasNextLine()) {
                line = nl.nextLine();
                String[] lineArr = line.split(",");
                Pizza tempPizza = new Pizza(Integer.parseInt(lineArr[0]), lineArr[1], Double.parseDouble(lineArr[2]));
                pizzas.add(tempPizza);
            }
        } else {
            throw new FileNotFoundException();
        }
        return pizzas; //retunere vores pizzaer
    }

}
