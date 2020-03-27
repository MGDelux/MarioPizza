import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        ShowMenu();
        PrintMenuKort();
        try {
            GetMenuKort();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }
    }

    private static void GetMenuKort() throws FileNotFoundException {
        MenuKort menuKort = new MenuKort();
        menuKort.GetPizzas();
    }

    private static void PrintMenuKort() {

    }

    private static void ShowMenu() {
        String menu = "Mario's Pizzaria \n Menu: \n Tryk: [1] For at Lave en ordre. \n Tryk: [2] For at slette en Ordre. \n Tryk: [3] For at vise en Liste over aktive Ordre. \n";
        System.out.println(menu);


    }
}
