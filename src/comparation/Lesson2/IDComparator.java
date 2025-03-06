package comparation.Lesson2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class IDComparator implements Comparator <Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2){
        return emp1.id - emp2.id;
    }
}

class NameComparator implements Comparator <Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2){
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryComparator implements Comparator <Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2){
        return emp1.salary - emp2.salary;
    }
}

class Employee{

    Integer id;
    String name;
    String surname;
    Integer salary;

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

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Konstantin", "Smirnov", 5000);
        Employee emp2 = new Employee(1, "Ivan", "Petrov", 32130);
        Employee emp3 = new Employee(222, "Andrey", "Petrov", 12834);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);


        System.out.println("Before sorting...");
        System.out.println(list);
        System.out.println();

        System.out.println("Sorting by ID");
        list.sort(new IDComparator());
        System.out.println(list);
        System.out.println();

        System.out.println("Sorting by name");
        list.sort(new NameComparator());
        System.out.println(list);
        System.out.println();

        System.out.println("Sorting by salary");
        list.sort(new SalaryComparator());
        System.out.println(list);

    }

}