package org.example.ex41;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class OrganizeArrayListTest {
    @Test
    void is_Organized_Names_True() {
        ArrayList<String> actual = new ArrayList<String>();
        ArrayList<String> expected = new ArrayList<String>();
        actual.add("ThisClass, IsToFast");
        actual.add("ForMe, ImNotAs");
        actual.add("Mentaly, FastAsThisClass");
        actual.add("Erik, Dokken");

        expected.add("Erik, Dokken");
        expected.add("ForMe, ImNotAs");
        expected.add("Mentaly, FastAsThisClass");
        expected.add("ThisClass, IsToFast");


        OrganizeArrayList checker = new OrganizeArrayList();
        ArrayList<String> actualRes = checker.OrganizeNames(actual);
        assertEquals(actualRes,expected);
    }
    @Test
    void is_Organized_Names_False() {
        ArrayList<String> actual = new ArrayList<String>();
        ArrayList<String> expected = new ArrayList<String>();
        actual.add("ThisClass, IsToFast");
        actual.add("ForMe, ImNotAs");
        actual.add("Mentaly, FastAsThisClass");
        actual.add("Erik, Dokken");

        expected.add("Erik, Dokken");
        expected.add("ForMe, ImNotAs");
        expected.add("Mentaly, FastAsThisClass");
        expected.add("Files, HurtMYSOUL");


        OrganizeArrayList checker = new OrganizeArrayList();
        ArrayList<String> actualRes = checker.OrganizeNames(actual);
        boolean expectFalse = actualRes.equals(expected);
        assertFalse(expectFalse);
    }
}