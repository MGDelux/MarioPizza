import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    OrdreBook aktiveOrdrer = new OrdreBook();

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
        menuKort.GetPizzas(); //Printer Menu Kort
    }

    public void ShowMenu() {
        String menu = "\nMario's Pizzaria \n Menu: \n Tryk: [1] For at Lave en ordre. \n Tryk: [2] For at vise en Liste over aktive Ordre. \n Tryk: [3] For at ændre en ordre. \n Tryk: [4] For at slette en ordre.\n Tryk: [5] For at vise alle ordrer. \n Tryk: [6] For at vise omsætning.\n Tryk: [7] for at lukke programmet.\n Tryk: [8] for at mute Ali.";
        System.out.println(menu);
        String ms = input.nextLine();
        int choice = Integer.parseInt(ms);
        switch (choice) {
            case 1:
                OpretOrdre ordre = new OpretOrdre();
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
                break;
            case 8:
                break;

            default:
                ShowMenu();
                System.out.println("Fejl i input");
                break;
        }


    }
}
