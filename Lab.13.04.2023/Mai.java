package Collection;

import java.util.ArrayList;

class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String toString() {
        return name;
    }
}

public class Mai{
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<Person>();

        personList.add(new Person("Nikhil", 25, "123 Main St"));
        personList.add(new Person("Jane", 30, "456 Park Ave"));
        personList.add(new Person("Bob", 40, "789 Broadway"));
        personList.add(new Person("Mary", 22, "111 Elm St"));
        personList.add(new Person("Mike", 35, "222 Oak Ave"));
        personList.add(new Person("Sue", 28, "333 Maple Rd"));
        personList.add(new Person("Tom", 45, "444 Pine St"));
        personList.add(new Person("Kate", 20, "555 Cedar Ave"));
        personList.add(new Person("Bill", 32, "666 Walnut Blvd"));
        personList.add(new Person("Amy", 27, "777 Cherry Ln"));

        for (Person p : personList) {
            System.out.println(p.getName());
        }
    }
}


