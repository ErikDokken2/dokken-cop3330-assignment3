package org.example.ex46;
import java.io.FileNotFoundException;
import java.util.TreeMap;

public class App46 {

    public static void main(String[] args) throws FileNotFoundException {
        String myFile = new String("C:\\Users\\15618\\Documents\\Object Programming\\dokken-cop3330-assignment3\\src\\main\\java\\org\\example\\ex46\\exercise46_input.txt");
        TreeMap<String, Integer> wordsNum = new TreeMap<String, Integer>();

        //Make a map into a Tree Map (took my an hour to find out they naturally sorted smh)
        MakeTreeMap tr = new MakeTreeMap();
        TreeMap<String, Integer> treeMap = tr.mapMakeTree(myFile, wordsNum);

        //Generate output String
        GenerateOutputString46 ot = new GenerateOutputString46();
        String outputString = ot.GenerateOutput(treeMap);

        printOutput(outputString);

    }

    private static void printOutput(String outputString) {System.out.println(outputString);
    }
}
