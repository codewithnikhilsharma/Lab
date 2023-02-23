package com.cognizant.shapes;

class Manager {
    int IncremenSalry() { // method 1
        return 0;
    }
}

class Devloper extends Manager {
    int IncremenSalry() { // method 2
        return 5;
    }
}

public class Employee extends Devloper {
    int IncremenSalry() { // method 3
        return 6;
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        System.out.println("Increment salary of manager is: " + m.IncremenSalry());

        Devloper d = new Devloper();
        System.out.println("Increment salary of developer is: " + d.IncremenSalry());

        Employee e = new Employee();
        System.out.println("Increment salary of employee is: " + e.IncremenSalry());
    }
}

