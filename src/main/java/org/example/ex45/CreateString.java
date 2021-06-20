package org.example.ex45;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CreateString {



    public String CreateString(File myFile) throws FileNotFoundException {
            String output = "";
            Scanner scan = new Scanner(myFile);
            while(scan.hasNextLine()){
              output += scan.nextLine();
              output+= "\n";
            }


            return output;
    }
}
