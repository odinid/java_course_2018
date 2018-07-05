package com.example.demo;

public class BuzzCodition implements Condition {

    public boolean check(int input) {
        return input % 5 == 0;
    }

    public String say() {
        return "Buzz";
    }
}
