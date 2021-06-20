package org.example.ex44;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class App44 {
    private static final Scanner in = new Scanner(System.in);
    private static String nameKey;
    private static boolean FindKey = true;
    private static ArrayList  <String> nameList = new ArrayList<>();
    private static ArrayList <String> priceList = new ArrayList<>();
    private static ArrayList <String> quantityList = new ArrayList<>();

    public static void main(String[] args) {
        GenerateOutput ad = new GenerateOutput();
        //File address
        File input = new File("C:\\Users\\15618\\Documents\\Object Programming\\dokken-cop3330-assignment3\\src\\main\\java\\org\\example\\ex44\\exercise44_input.json");
        // makes inputFile into Arraylist of String
        processInputFile(input);

        do{
            readUserInput();

            FindKey =  ad.FindKey(nameList, nameKey);
        }while(FindKey == false);
        String output = ad.OutputString(nameList,priceList,quantityList);

        System.out.print(output);

    }

    private static void readUserInput() {
        System.out.print("What is the product name? ");
        nameKey = in.nextLine();

    }
    //Takes the input File and makes it into an ArrayList
    private static void processInputFile(File input) {
        JsonElement fileElement = null;
        try {
            fileElement = JsonParser.parseReader(new FileReader(input));
            JsonObject fileObject = fileElement.getAsJsonObject();

            //acceses the array 'products'
            JsonArray jsonArrayOfProducts = fileObject.get("products").getAsJsonArray();
            for(JsonElement productsJsonOdject: jsonArrayOfProducts)
            {
                //get the object
                JsonObject productsObject = productsJsonOdject.getAsJsonObject();

                //extract data
                String name = productsObject.get("name").getAsString();
                //System.out.println(name);
                nameList.add(name);
                String price = productsObject.get("price").getAsString();
                //System.out.println(price);
                priceList.add(price);
                String quantity = productsObject.get("quantity").getAsString();
                //System.out.println(quantity);
                quantityList.add(quantity);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error processing input File (Update File Location!");
            e.printStackTrace();
        }

    }
}
