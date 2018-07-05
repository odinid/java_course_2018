package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

    private static final String FIZZ_BUZZ_STR = "FizzBuzz";
    private static final String BUZZ_STR = "Buzz";
    private static final String FIZZ_STR = "Fizz";

    @Test
    public void say_1_when_input_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.say(1);
        assertEquals("1", actualResult);
    }

    @Test
    public void say_2_when_input_2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.say(2);
        assertEquals("2", actualResult);
    }

    @Test
    public void say_3_when_input_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.say(3);
        assertEquals(FIZZ_STR, actualResult);
    }

    @Test
    public void say_4_when_input_4() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.say(4);
        assertEquals("4", actualResult);
    }

    @Test
    public void say_5_when_input_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.say(5);
        assertEquals(BUZZ_STR, actualResult);
    }

    @Test
    public void say_6_when_input_6() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.say(6);
        assertEquals(FIZZ_STR, actualResult);
    }

    @Test
    public void say_KBTG_when_input_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.say(7);
        assertEquals("KBTG", actualResult);
    }

    @Test
    public void say_8_when_input_8() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.say(8);
        assertEquals("8", actualResult);
    }

    @Test
    public void say_9_when_input_9() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.say(9);
        assertEquals(FIZZ_STR, actualResult);
    }

    @Test
    public void say_10_when_input_10() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.say(10);
        assertEquals(BUZZ_STR, actualResult);
    }

    @Test
    public void say_15_when_input_15() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.say(15);
        assertEquals(FIZZ_BUZZ_STR, actualResult);
    }

}
