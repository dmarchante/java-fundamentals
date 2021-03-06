/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testReadJavaScriptFileEmpty() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        App classUnderTest = new App();
        classUnderTest.readJavaScriptFile("src/main/resources/empty.js");
        assertEquals("", outContent.toString());
    }

    @Test
    public void testReadJavaScriptFileNone() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        App classUnderTest = new App();
        classUnderTest.readJavaScriptFile("src/main/resources/none.js");
        assertEquals("", outContent.toString());
    }

    @Test
    public void testReadJavaScriptFileOne() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        App classUnderTest = new App();
        classUnderTest.readJavaScriptFile("src/main/resources/one.js");
        assertEquals("Line 5: Missing semicolon\n", outContent.toString());
    }

    @Test
    public void testReadJavaScriptFileFew() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        App classUnderTest = new App();
        classUnderTest.readJavaScriptFile("src/main/resources/few.js");
        assertEquals("Line 3: Missing semicolon\nLine 5: Missing semicolon\n", outContent.toString());
    }

    @Test
    public void testReadJavaScriptFileMany() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        App classUnderTest = new App();
        classUnderTest.readJavaScriptFile("src/main/resources/many.js");
        assertEquals("Line 3: Missing semicolon\nLine 5: Missing semicolon\nLine 11: Missing semicolon\nLine 13: Missing semicolon\nLine 15: Missing semicolon\n", outContent.toString());
    }
}
