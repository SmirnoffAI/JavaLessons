package comparation.Homework;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student>{

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student AnotherStudent) {
        return AnotherStudent.age - this.age;
    }

    @Override
    public String toString(){
        return "Student: " + this.name + " Age " + this.age;
    }

    public static void main(String[] args) {
        ArrayList<Student> aL = new ArrayList<>();
        aL.add(new Student("Konstantin", 22));
        aL.add(new Student("Ivan", 43));
        aL.add(new Student("Vera", 28));
        aL.add(new Student("Olga", 36));
        aL.add(new Student("Elena", 29));

        System.out.println("Before sorting...");
        System.out.println(aL);
        System.out.println();

        System.out.println("After sorting...");
        Collections.sort(aL);
        System.out.println(aL);
    }
}
