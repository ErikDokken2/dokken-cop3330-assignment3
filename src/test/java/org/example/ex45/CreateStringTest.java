package org.example.ex45;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileNotFoundException;
import static org.junit.jupiter.api.Assertions.*;


public class CreateStringTest{
    @Test
    void test_Create_String_From_Input_True() throws FileNotFoundException {
        CreateString checker = new CreateString();

        File testFile = new File("C:\\Users\\15618\\Documents\\Object Programming\\dokken-cop3330-assignment3\\src\\main\\java\\org\\example\\ex45\\CreateStringTest.txt");

        String actual = checker.CreateString(testFile);

        String expected ="utilize utilizes ustilze utilizea For some reason I need help with 43 idk my brain not working (this was made Friday)\n";

        assertEquals(actual,expected);
    }
    @Test
    void test_Create_String_From_Input_False() throws FileNotFoundException {
        CreateString checker = new CreateString();

        File testFile = new File("C:\\Users\\15618\\Documents\\Object Programming\\dokken-cop3330-assignment3\\src\\main\\java\\org\\example\\ex45\\CreateStringTest.txt");

        String actual = checker.CreateString(testFile);

        String expected ="False False False False False False False False False )\n";
        boolean isEqual = expected.equals(actual);
        assertFalse(isEqual);
    }

}