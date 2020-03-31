package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExportData {
    public void ExportToFile(String filepath, ArrayList<Ordre> ordre, ArrayList<Pizza> pizzas) {
        try {
            FileWriter fw = new FileWriter(filepath,true);

            try (BufferedWriter br = new BufferedWriter(new FileWriter(filepath, true))) {

                for (Ordre text : ordre) {

                    String str = text.ordreUID + ","+ text.ordreTid + "," + text.kundeNavn+","+ text.pizza+","+text.ordreStatus+","+text.totalOrderPris;
                    br.write(str + "\n");
                    br.close();
                }
                System.out.println("File exported");

            } catch (IOException e) {
                System.out.println("Unable to write file.");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}