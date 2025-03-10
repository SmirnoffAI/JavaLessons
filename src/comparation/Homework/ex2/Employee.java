package comparation.Homework.ex2;

import java.util.ArrayList;
import java.util.Comparator;

public class Employee {

    String name;
    int salary;
    String department;

    public Employee(String name, int salary, String department){
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString(){
        return "Emp{ " + name + ", " + salary + ", " + department + " }";
    }

    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee("Konstantin", 1000, "IT"));
        arrayList.add(new Employee("Maria", 800, "HR"));
        arrayList.add(new Employee("Ivan", 300, "Sales"));

        System.out.println(arrayList);

        arrayList.sort(new DepartmentComparator());
        System.out.println(arrayList);

        arrayList.sort(new SalaryComparator());
        System.out.println(arrayList);


    }
}

class SalaryComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee emp1, Employee emp2){
        return Integer.compare(emp1.salary, emp2.salary);
    }
}

class DepartmentComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee emp1, Employee emp2){
        return emp1.department.compareTo(emp2.department);
    }
}
