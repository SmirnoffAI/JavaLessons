package collections.ArrayLists;

import java.util.ArrayList;

public class ArrayMethods2 {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Konstantin", 'm', 22, 4, 8.8));
        studentList.add(new Student("Maria", 'f', 24, 3, 6.5));
        studentList.add(new Student("Vasilii", 'm', 28, 5, 7.2));
        studentList.add(new Student("Petr", 'm', 41, 4, 9.9));
        studentList.add(new Student("Maria", 'f', 19, 2, 9.4));
        System.out.println(studentList);


    }
}

class Student{

    private String name;
    private char sex;
    private int age;
    private int course;
    private double grade;

    public Student(String name, char sex, int age, int course, double grade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }

    @Override
    public String toString(){
        return "Student{ name: " + name + " sex: , " + sex + " age: " + age + ", course: " + course + " , grade: " + grade;
    }

}