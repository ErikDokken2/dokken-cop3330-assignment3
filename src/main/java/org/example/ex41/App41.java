package org.example.ex41;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Erik Dokken
 */
public class App41 {

    private static ArrayList <String> names = new ArrayList<String>();
    private static ArrayList <String> organizedNames = new ArrayList<String>();


    public static void main(String[] args)throws FileNotFoundException{

        OrganizeArrayList organize = new OrganizeArrayList();
        //Read the File into an ArrayList
        readFile();

        //Organizes name ArrayList based on read file
        organizedNames = organize.OrganizeNames(names);

        //Print Output
        String OutputString = output(organizedNames);
        //Make output File
        makeOutputFile(OutputString);
    }

    private static void makeOutputFile(String OutputString) {
        String fileName = "exercise41_output.txt";
        try{
            PrintWriter outputFile = new PrintWriter(fileName);
            outputFile.println(OutputString);
            outputFile.close(); //Closes the file
            System.out.println("done");
        }catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }


    private static String output(ArrayList<String> organizedNames) {
        String output = ("Total of 7 names\n" +
                "-----------------\n");
        for(int x = 0; x < organizedNames.size();x++)
        {
            output += organizedNames.get(x) + "\n";
        }
        return output;
    }

    //reads data adds to an arrayList
    private static void readFile() throws FileNotFoundException {
        File myFile = new File("C:\\Users\\15618\\Documents\\Object Programming\\dokken-cop3330-assignment3\\src\\main\\java\\org\\example\\ex41\\exercise41_input.txt");
        Scanner scan = new Scanner(myFile);
        while (scan.hasNextLine()) {
            String data = scan.nextLine();
            names.add(data);
        }

    }
}
