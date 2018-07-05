package com.example.demo;

public class FizzBuzzCodition implements Condition {

    public boolean check(int input) {
        return input == 15;
    }

    public String say() {
        return "FizzBuzz";
    }
}
