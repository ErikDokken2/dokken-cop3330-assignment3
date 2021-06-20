package org.example.ex44;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class GenerateOutputTest{
    @Test
    void testFindKey_Found() {
        GenerateOutput checker = new GenerateOutput();
        ArrayList<String> inputList = new ArrayList<String>();
        inputList.add("Widget");
        inputList.add("Thing");
        inputList.add("Doodad");

        String nameKey = "Thing";

        boolean keyFound = checker.FindKey(inputList,nameKey);
        assertTrue(keyFound);
    }

    @Test
    void testFindKey_Not_Found() {
        GenerateOutput checker = new GenerateOutput();
        ArrayList<String> inputList = new ArrayList<String>();
        inputList.add("Widget");
        inputList.add("Thing");
        inputList.add("Doodad");

        String nameKey = "Something";

        boolean keyFound = checker.FindKey(inputList,nameKey);
        assertFalse(keyFound);
    }

}