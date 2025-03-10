package collections.LinkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        Student st1 = new Student("Konstantin", 4);
        Student st2 = new Student("Maria", 3);
        Student st3 = new Student("Ivan", 2);
        Student st4 = new Student("Pavel", 1);
        LinkedList<Student> linkedList = new LinkedList<>();
        linkedList.add(st1);
        linkedList.add(st2);
        linkedList.add(st3);
        linkedList.add(st4);

        System.out.println(linkedList);
    }



}

class Student {

    String name;
    int course;

    public Student(String name, int course){
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString(){
        return "Student{ name = " + name + ", course = " + course + " }";
    }

}