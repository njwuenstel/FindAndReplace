package com.enterprise.java.week2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Practice working with JUnit by writing some test cases for the following interface:
 */
public class FindAndReplaceTest {

    String input = "test/testfiles/input.txt";
    String output = "test/testfiles/output.txt";
    String findAndReplace = "test/testfiles/findandreplace.txt";


    /*
     * Demonstrate use of @Before to set up the environment for EACH test case
     */
    @Before
    public void setup() {}

   /*
    *
    */
    @Test
    public void testConstructor() {

        String inText = "xxx.txt";
        FindAndReplace rw = new FindAndReplace(inText, output, findAndReplace);

        System.out.println(rw.getInputFile());
        assertEquals("Nah dog.", inText, rw.inputFile);
    }

    /*
     *
     */
    @Test
    public void testInsertedItem() {

        String inText = "input.txt";

        FindAndReplace rw = new FindAndReplace(input, output, findAndReplace);
        rw.createMapOfFindReplaceValues();

        String val = rw.findReplaceValues.get("<<one>>");
        //System.out.println(rw.findReplaceValues.get("<<one>>"));

        assertEquals("Nah dog.", val, "zzz");
    }

    /*
 *
 */
    @Test
    public void testReader() {

        String inText = "input.txt";

        FindAndReplace rw = new FindAndReplace(input, output, findAndReplace);
        rw.reader();

        assertEquals("Nah dog.","zzz" , "zzz");
    }

}