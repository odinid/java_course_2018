package com.example.demo;

public class OtherCondition implements Condition {
    private int intTemp;
    
    @Override
    public boolean check(int input) {
        intTemp = input;
        return true;
    }

    @Override
    public String say() {
        return String.valueOf(intTemp);
    }
}
