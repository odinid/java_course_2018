package com.example.demo;

import org.junit.*;
import static org.junit.Assert.*;

public class FactorizeTest {

    @Test
    public void input_2_return_2() {
        String expected = "2";
        String actual = Factorize.answer(2);
        assertEquals(expected, actual);
    }

    @Test
    public void input_3_return_3() {
        String expected = "3";
        String actual = Factorize.answer(3);
        assertEquals(expected, actual);
    }

    @Test
    public void input_4_return_4() {
        String expected = "2,2";
        String actual = Factorize.answer(4);
        assertEquals(expected, actual);
    }

    @Test
    public void input_5_return_5() {
        String expected = "5";
        String actual = Factorize.answer(5);
        assertEquals(expected, actual);
    }

    @Test
    public void input_6_return_6() {
        String expected = "2,3";
        String actual = Factorize.answer(6);
        assertEquals(expected, actual);
    }

    @Test
    public void input_7_return_7() {
        String expected = "7";
        String actual = Factorize.answer(7);
        assertEquals(expected, actual);
    }

    @Test
    public void input_8_return_8() {
        String expected = "2,2,2";
        String actual = Factorize.answer(8);
        assertEquals(expected, actual);
    }

    @Test
    public void input_9_return_9() {
        String expected = "3,3";
        String actual = Factorize.answer(9);
        assertEquals(expected, actual);
    }

    @Test
    public void input_10_return_10() {
        String expected = "2,5";
        String actual = Factorize.answer(10);
        assertEquals(expected, actual);
    }

    @Test
    public void input_11_return_11() {
        String expected = "11";
        String actual = Factorize.answer(11);
        assertEquals(expected, actual);
    }

    @Test
    public void input_12_return_12() {
        String expected = "2,2,3";
        String actual = Factorize.answer(12);
        assertEquals(expected, actual);
    }

    @Test
    public void input_13_return_13() {
        String expected = "13";
        String actual = Factorize.answer(13);
        assertEquals(expected, actual);
    }

    @Test
    public void input_14_return_14() {
        String expected = "2,7";
        String actual = Factorize.answer(14);
        assertEquals(expected, actual);
    }

    @Test
    public void input_15_return_15() {
        String expected = "3,5";
        String actual = Factorize.answer(15);
        assertEquals(expected, actual);
    }

    @Test
    public void input_16_return_16() {
        String expected = "2,2,2,2";
        String actual = Factorize.answer(16);
        assertEquals(expected, actual);
    }

    @Test
    public void input_17_return_17() {
        String expected = "17";
        String actual = Factorize.answer(17);
        assertEquals(expected, actual);
    }
}