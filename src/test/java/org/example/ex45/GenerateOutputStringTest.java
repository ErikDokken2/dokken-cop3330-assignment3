package org.example.ex45;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileNotFoundException;
import static org.junit.jupiter.api.Assertions.*;


public class GenerateOutputStringTest{
    @Test
    void testGenerateOutputString_True() {
        GenerateOutputString checker = new GenerateOutputString();

        String inputString = "One should never utilize the word \"utilize\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "utilizes an IDE to write her Java programs\".";
        String actual = checker.GenerateOutput(inputString);

        String expect = "One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "uses an IDE to write her Java programs\".";


        assertEquals(actual,expect);
    }
    @Test
    void testGenerateOutputString_False() {
        GenerateOutputString checker = new GenerateOutputString();

        String inputString = "One should never utilize the word \"utilize\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "utilizes an IDE to write her Java programs\".";
        String actual = checker.GenerateOutput(inputString);

        String expect = "One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "uses an IDE to write her Java programs\". FALSE";
        boolean isEqual = expect.equals(actual);

        assertFalse(isEqual);
    }
}