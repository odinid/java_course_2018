package com.example.demo;

public class DemoDIP {

    public static void main(String[] args) {
        /**
         * DI => Dependency Injection
         * 1. Method Injection
         * 2. Constructor Injection
         * 3. Properties Injection
         */
        Caller caller = new Caller();
        Callee callee = new Callee();
        caller.call(callee);
    }

}

class Caller {
    Callee c;
    
    public void call(Callee callee) {
        c = callee;
        System.out.println("Called Caller.call()");
        c.process();
    }
}

class Callee {
    public void process() {
        System.out.println("Called Callee.process()");
    }
}