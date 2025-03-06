package comparation.Homework;

import java.util.ArrayList;
import java.util.Comparator;

public class Student1 {

    String name;
    int age;
    double grade;

    public Student1(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString(){
        return "Student: " + this.name + ", age " + this.age + ", grade " + this.grade;
    }

}

class NameComparator implements Comparator<Student1>{

    @Override
    public int compare(Student1 st1, Student1 st2){
        return st1.name.compareTo(st2.name);
    }
}

class GradeAndAgeComparator implements Comparator<Student1>{

    @Override
    public int compare(Student1 st1, Student1 st2){
        int gradeCompare = Double.compare(st1.grade, st2.grade);
        if (gradeCompare != 0){
            return gradeCompare;
        }
        return Integer.compare(st1.age, st2.age);

    }
}


class StudentInfo{
    public static void main(String[] args) {
        ArrayList<Student1> aL = new ArrayList<>();
        aL.add(new Student1("Konstantin", 22, 8.6));
        aL.add(new Student1("Elena", 40, 4.4));
        aL.add(new Student1("Ivan", 33, 6.6));
        aL.add(new Student1("Alex", 19, 9.9));
        aL.add(new Student1("Oleg", 17, 9.9));


        System.out.println("Sorting by name");
        aL.sort(new NameComparator());
        System.out.println(aL);
        System.out.println();

        System.out.println("Sorting by grade and age");
        aL.sort(new GradeAndAgeComparator());
        System.out.println(aL);



    }
}
