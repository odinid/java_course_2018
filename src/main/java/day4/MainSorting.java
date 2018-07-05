package day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainSorting {

    public static void main(String[] args) {
        MainSorting p = new MainSorting();
        p.start();
    }

    private void start() {
        // Create Data
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Piyarach", 200));
        employees.add(new Employee(2, "Pui", 100));
        employees.add(new Employee(3, "Abdul", 500));
        employees.add(new Employee(4, "Up1", 150));
        
        // Sorting with Comparator
        Collections.sort(employees, new SortingBySalaryWithDecending());
        
        employees.forEach(System.out::println);

    }
}

class SortingBySalaryWithDecending implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        // -1 = DESC, 0 = Not change, 1 = ASC
        //return e1.getName().compareTo(e2.getName());
        //return (int)(e1.getSalary() - e2.getSalary());
        return (e2.getSalary() - e1.getSalary() > 0 ? -1 : 1 );
    }
}