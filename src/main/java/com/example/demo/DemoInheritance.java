package com.example.demo;

abstract class Employee {
    String id;
    String name;

    abstract double calculateSalary();
}

class FulltimeEmployee extends Employee {

    @Override
    double calculateSalary() {
        // TODO Auto-generated method stub
        return 2000;
    }

}

class ContractEmployee extends Employee {

    @Override
    double calculateSalary() {
        // TODO Auto-generated method stub
        return 1000;
    }

}

interface IReport {
    void genHeader();

    void genBody();

    void genFooter();
}

abstract class Report {
    abstract void genHeader();

    abstract void genBody();

    abstract void genFooter();

    public void generate() {
        genHeader();
        genBody();
        genFooter();
    }
}

class Report1 extends Report {

    @Override
    void genHeader() {
        // TODO Auto-generated method stub

    }

    @Override
    void genBody() {
        // TODO Auto-generated method stub

    }

    @Override
    void genFooter() {

    }

}

class Report2 implements IReport {

    @Override
    public void genHeader() {

    }

    @Override
    public void genBody() {

    }

    @Override
    public void genFooter() {

    }

}

class GernerateReport {
    void generate(IReport report) {
        report.genHeader();
        report.genBody();
        report.genFooter();
    }
}

public class DemoInheritance {
    public static void main(String[] args) {

    }
}
