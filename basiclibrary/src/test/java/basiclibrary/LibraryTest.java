/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testRollMethod() {
        int array[] = Library.roll(5);
        assertEquals(5, array.length);
    }

    @Test public void testDuplicateFalseMethod() {
        int[] array = {1, 2, 3, 4, 5};
        boolean bool = Library.containsDuplicates(array);
        assertFalse(bool);
    }

    @Test public void testDuplicateTrueMethod() {
        int[] array = {1, 2, 2, 4, 5};
        boolean bool = Library.containsDuplicates(array);
        assertTrue(bool);
    }

    @Test public void testCalculateAverageMethod() {
        int[] array = {1, 1, 1, 1};
        float average = Library.calculateAverages(array);
        assertEquals(1.0f, average, 0.0f);
    }

    @Test public void testCalculateAverageTwoDMethod() {
        int[][] array = {{5, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}};
        float average = Library.calculateTwoDAverages(array);
        assertEquals(2.0f, average, 0.0f);
    }

    @Test public void testanalyzeWeather() {
        int[][] array = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        String output = Library.analyzeWeather(array);
        assertEquals("High: 70\nLow: 53\nNever saw temperature: 53\nNever saw temperature: 58\nNever saw temperature: 64\nNever saw temperature: 65\nNever saw temperature: 70\n", output);
    }

    @Test public void testTally() {
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        String output = Library.tally(votes);
        System.out.println(output);
        assertEquals("Bush", output);
    }
}