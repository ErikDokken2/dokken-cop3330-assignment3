package org.example.ex42;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class Parsing_FileTest {
    @Test
    void IS_Empty_Test () {
        //Given
        Parsing_File checker = new Parsing_File();
        ArrayList<String> actualInput = new ArrayList<String>();
        String actual = checker.FormattingString(actualInput);
        System.out.println(actual);

        String expected = "Datalist is NULL";
        assertEquals(actual,expected);
    }
    @Test
    void FormatingString_MakeSpace() {
        //Given
        Parsing_File checker = new Parsing_File();
        ArrayList<String> actualInput = new ArrayList<String>();
        actualInput.add("Ling,Mai,55900");
        actualInput.add("Johnson,Jim,56500");
        actualInput.add("Jones,Aaron,46000");
        actualInput.add("Jones,Chris,34500");
        actualInput.add("Swift,Geoffrey,14200");
        actualInput.add("Xiong,Fong,65000");
        actualInput.add("Zarnecki,Sabrina,51500");


        String actual = checker.FormattingString(actualInput);
        System.out.println(actual);

        String expected = "Ling      Mai       55900\n" +
                "Johnson   Jim       56500\n" +
                "Jones     Aaron     46000\n" +
                "Jones     Chris     34500\n" +
                "Swift     Geoffrey  14200\n" +
                "Xiong     Fong      65000\n" +
                "Zarnecki  Sabrina   51500\n";
        assertEquals(actual,expected);
    }


}