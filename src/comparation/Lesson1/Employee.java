package comparation.Lesson1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee>{

    Integer id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee AnotherEmp){
        return this.id.compareTo(AnotherEmp.id);
    }

    public static void main(String[] args) {
        List <Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Konstantin", "Smirnov", 5000);
        Employee emp2 = new Employee(1, "Ivan", "Petrov", 32130);
        Employee emp3 = new Employee(222, "Andrey", "Petrov", 12834);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println("Before sorting...");
        System.out.println(list);
        System.out.println();

        Collections.sort(list);
        System.out.println("After sorting...");
        System.out.println(list);


    }
}
