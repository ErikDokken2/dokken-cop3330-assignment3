package org.example.ex46;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

public class MakeTreeMapTest{
    @Test
    void testMakeTree() throws FileNotFoundException {
        MakeTreeMap checker = new MakeTreeMap();
        String myFile = new String("C:\\Users\\15618\\Documents\\Object Programming\\dokken-cop3330-assignment3\\src\\main\\java\\org\\example\\ex46\\TestFile");

        TreeMap<String, Integer> input = new TreeMap<String, Integer>();

        TreeMap<String, Integer> actual = checker.mapMakeTree(myFile,input);
        String actualString = String.valueOf(actual);
        String expected = "{badger=7, mushroom=2, snake=1}";

        assertEquals(expected,actualString);
    }
}