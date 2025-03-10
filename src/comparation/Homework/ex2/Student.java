package comparation.Homework.ex2;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student>{

    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student st){
        if (this.age == st.age){
            return Double.compare(this.grade, st.grade);
        }
        return this.age - st.age;
    }

    @Override
    public String toString(){
        return "Student " + name + ", age " + age + ", grade" + grade;
    }

    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();

        arrayList.add(new Student("Ilia", 22, 4.5));
        arrayList.add(new Student("Konstantin", 22, 3.3));
        arrayList.add(new Student("Ivan", 43, 3.4));
        arrayList.add(new Student("Maria", 33, 5.0));

        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
