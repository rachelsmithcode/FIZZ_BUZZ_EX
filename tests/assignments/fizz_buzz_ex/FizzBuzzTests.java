package assignments.fizz_buzz_ex;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by RachelSmith on 14/09/2016.
 */

public class FizzBuzzTests {


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void printsFizzFor3() throws Exception {
        new FizzBuzz().enterNumber(3);
        assertEquals("Fizz\n", outContent.toString());
    }

    @Test
    public void printsBuzzFor5() throws Exception {
        new FizzBuzz().enterNumber(5);
        assertEquals("Buzz\n", outContent.toString());
    }

    @Test
    public void printsNumberFor1() throws Exception {
        new FizzBuzz().enterNumber(1);
        assertEquals("1\n", outContent.toString());
    }

    @Test
    public void printsFizzForMultiplesOf3() throws Exception {
        new FizzBuzz().enterNumber(6);
        assertEquals("Fizz\n", outContent.toString());
    }

    @Test
    public void printsBuzzForMultiplesOf5() throws Exception {
        new FizzBuzz().enterNumber(10);
        assertEquals("Buzz\n", outContent.toString());
    }


}
