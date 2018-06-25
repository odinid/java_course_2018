package com.example.demo;

class Main {

    private OnAddListener listener;

    public Main(OnAddListener listener) {
        this.listener = listener;
    }

    public void add(int a, int b) {
        if (a == 0) {
            this.listener.onFailure();
        }
        this.listener.onSuccess(a + b);
    }
}

interface OnAddListener {
    void onSuccess(int result);

    void onFailure();
}

public class Calculator implements OnAddListener {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.start();
    }

    private void start() {
        Main main = new Main(this);
        main.add(1, 2);
    }

    @Override
    public void onSuccess(int result) {
        System.out.println(result);
    }

    @Override
    public void onFailure() {
        System.out.println("Fail");
    }
}
