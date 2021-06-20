package org.example.ex45;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App45 {
    private static final Scanner sc = new Scanner(System.in);
    private static  String nameOutfile = "";
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("C:\\Users\\15618\\Documents\\Object Programming\\dokken-cop3330-assignment3\\src\\main\\java\\org\\example\\ex45\\exercise45_input.txt");

        //Create String from Input File
        CreateString in = new CreateString();
        String input = in.CreateString(myFile);

        //takes input and replaces utilize with use
        GenerateOutputString ot = new GenerateOutputString();
        String outputString = ot.GenerateOutput(input);

        //Asks User for input FIleName
        readUserInput();

        //Make Output File with String
        makeOutputFile(outputString);

    }

    private static void readUserInput() {
        System.out.print("Input the name of the output file(only name no '.txt'): ");
        nameOutfile = sc.nextLine();
    }

    private static void makeOutputFile(String outputString) {
        String fileName = nameOutfile + ".txt";
        try{
            PrintWriter outputFile = new PrintWriter(fileName);
            outputFile.println(outputString);
            outputFile.close(); //Closes the file
            System.out.println("done");
        }catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }


}
