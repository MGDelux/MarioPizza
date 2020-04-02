package View;

import Controller.OrdreController;
import model.ExportData;
import model.MenuKort;
import model.OrdreBook;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    OrdreBook aktiveOrdrer = new OrdreBook();
    ExportData exportdata = new ExportData();

    public static void main(String[] args) {
        ImporterMenuKort();
    }

    static void ImporterMenuKort() {
        try { //Prøver at køre GetMenuKort(); Hvis filen ikke findes for vi fejl.
            GetMenuKort();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.toString());
        }
        new Main().ShowMenu(); // vis main menu
    }

    private static void GetMenuKort() throws FileNotFoundException {
        MenuKort menuKort = new MenuKort();
        System.out.println("Menu Kort:");
        menuKort.GetPizzas(); //Printer Menu Kort
    }

    public void ShowMenu() {
        String menu = "\nMario's Pizzaria \n -Menu: \n Tryk: [1] For at Lave en ordre. \n Tryk: [2] For at vise en Liste over aktive Ordre. \n Tryk: [3] For at ændre en ordre til 'færdig'. \n Tryk: [4] For at slette en ordre.\n Tryk: [5] For at vise alle ordrer. \n Tryk: [6] For at vise omsætning.\n Tryk: [7] for at gemme alle ordrer.";
        System.out.println(menu);
        String ms = input.nextLine();
        int choice = Integer.parseInt(ms);
        switch (choice) {
            case 1:
                OrdreController ordre = new OrdreController();
                ordre.LavOrdre();
                break;
            case 2:
                aktiveOrdrer.VisOrdre();
                break;

            case 3:
                System.out.println("Hvilken ordre skal ændres?");
                ms = input.nextLine();
                aktiveOrdrer.aandreordre(Integer.parseInt(ms));
                break;
            case 4:
                System.out.println("Hvilken ordre skal slettes?");
                ms = input.nextLine();
                aktiveOrdrer.SletOrdre(Integer.parseInt(ms));
                break;
            case 5:
                aktiveOrdrer.VisAlleOrdre();
                break;
            case 6:
                aktiveOrdrer.BeregnOmsaatning();
                break;
            case 7:
                exportdata.ExportToFile("Data/ordre.csv",aktiveOrdrer.faaAlleOrdre(),MenuKort.pizzas);
                break;
            default:
                ShowMenu();
                System.out.println("Fejl i input");
                break;
        }


    }
}
