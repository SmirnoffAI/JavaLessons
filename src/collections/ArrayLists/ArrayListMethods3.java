package collections.ArrayLists;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Konstantin", 'm', 22, 4, 8.8));
        studentList.add(new Student("Maria", 'f', 24, 3, 6.5));
        studentList.add(new Student("Vasilii", 'm', 28, 5, 7.2));
        studentList.add(new Student("Petr", 'm', 41, 4, 9.9));
        studentList.add(new Student("Maria", 'f', 19, 2, 9.4));

        ArrayList<Student> studentList2 = new ArrayList<>();
        System.out.println(studentList);
        Student st1 = new Student("Dasha", 'f', 22, 4, 10.0);
        studentList2.add(st1);

        studentList.addAll(studentList2); // копирует один список в другой
        System.out.println(studentList);

        // studentList.clear(); // удаляет все объекты из списка

        System.out.println(studentList.indexOf(st1)); // возвращает индекс искомого или -1, если такой объект не найден.



    }
}
