package com.example.demo;

public class FizzCodition implements Condition {

    public boolean check(int input) {
        return input % 3 == 0;
    }

    public String say() {
        return "Fizz";
    }

}
