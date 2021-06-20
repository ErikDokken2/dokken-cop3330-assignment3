package org.example.ex45;

import java.util.Map;
import java.util.Scanner;

public class GenerateOutputString {


    public String GenerateOutput(String input) {
        String output = "";
        Scanner scan = new Scanner(input);
        while(scan.hasNextLine()){
            output += scan.nextLine();
        }
        output = input.replaceAll("utilize", "use");

        return output;
    }
}
