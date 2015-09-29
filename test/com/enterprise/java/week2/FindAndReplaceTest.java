package com.enterprise.java.week2;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.FileNotFoundException;
import java.io.FileWriter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Practice working with JUnit by writing some test cases for the following interface:
 */
public class FindAndReplaceTest {

    String input = "test/testfiles/input.txt";
    String output = "test/testfiles/output.txt";
    String findAndReplace = "test/testfiles/findandreplace.txt";

    FindAndReplace fnr;

    /*
     * Demonstrate use of @Before to set up the environment for EACH test case
     */
    @Before
    public void setup() {

        fnr = new FindAndReplace(input, output, findAndReplace);

    }

   /*
    * Test if fnr's inputFileProperty matches the 'input' class variable
    */
    @Test
    public void testConstructor() {

        System.out.println(fnr.getInputFile());
        assertEquals("Nah dog.", input, fnr.inputFile);
    }

    /*
     * Get value from map using known key and compare to known value
     * from the 'indandreplace.txt' file.
     */
    @Test
    public void testFindReplaceValues() {

        fnr.createMapOfFindReplaceValues();
        String val = fnr.findReplaceValues.get("<<one>>");

        assertEquals("Nah dog.", val, "zzz");
    }

    /*
     * Compare first line of the readers 'input.txt' to
     * the known value "<<one>>".
     */
    @Test
    public void testReader() {

        String readText = fnr.reader();
        String[] lines = readText.split(System.getProperty("line.separator"));
        System.out.println(lines[0]);

        assertEquals("Nah dog.", lines[0], "<<one>>");
    }

    /*
     *
     */
    @Test
    public void testReaderException() {

        String missingFile = "missingfile.txt";
        fnr = new FindAndReplace(missingFile, output, findAndReplace);
        fnr.reader();

    }
}




