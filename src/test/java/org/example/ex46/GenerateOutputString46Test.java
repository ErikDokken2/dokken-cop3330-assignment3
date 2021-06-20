package org.example.ex46;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;
import java.util.TreeMap;
import static org.junit.jupiter.api.Assertions.*;

public class GenerateOutputString46Test{
    @Test
    void testGenerateOutput() throws FileNotFoundException {
        MakeTreeMap make_tree = new MakeTreeMap();
        GenerateOutputString46 checker = new GenerateOutputString46();

        String myFile = new String("C:\\Users\\15618\\Documents\\Object Programming\\dokken-cop3330-assignment3\\src\\main\\java\\org\\example\\ex46\\TestFile");
        TreeMap<String, Integer> input = new TreeMap<String, Integer>();

        //Makes the tree to print out
        TreeMap<String, Integer> actualInput = make_tree.mapMakeTree(myFile,input);
        String actual = checker.GenerateOutput(actualInput);

        String expected = "badger:   *******\n" +
                "mushroom: **\n" +
                "snake:    *\n";
        assertEquals(actual,expected);
    }
}