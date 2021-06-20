package org.example.ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.Scanner;

public class App42 {
    private static ArrayList<String> dataList = new ArrayList<String>();
    public static void main(String[] args) throws FileNotFoundException {
        Parsing_File parsing = new Parsing_File();
        //Read the File into an ArrayList
        readFile();
        //makes the string to be printed in output based on readfile;
        String formattingString = parsing.FormattingString(dataList);
        //Print Output
        output(formattingString);
    }

    private static void output(String formattingString) {
        System.out.print("Last      First     Salary\n" +
                "--------------------------\n" + formattingString);
    }

    private static void readFile() throws FileNotFoundException {
        File myFile = new File("C:\\Users\\15618\\Documents\\Object Programming\\dokken-cop3330-assignment3\\src\\main\\java\\org\\example\\ex42\\exercise42_input.txt");
        Scanner scan = new Scanner(myFile);

        while (scan.hasNextLine()) {
            String data = scan.nextLine();

            dataList.add(data);
        }
    }
}
