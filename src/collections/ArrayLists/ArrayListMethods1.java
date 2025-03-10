package collections.ArrayLists;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Konstantin");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add(1, "Misha");

        for (String s : arrayList1){
            System.out.print(s + " ");
        }
        System.out.println();

        for (int i = 0; i < arrayList1.size(); i++){
            System.out.print(arrayList1.get(i) + " ");
        }
        System.out.println();

        arrayList1.set(1, "Masha"); // метод set(int index, T element) заменяет объект по индексу из параметра.
        System.out.println(arrayList1);

        arrayList1.remove(0); // метод remove(int index) удаляет объект из списка по индексу.
        System.out.println(arrayList1);


    }
}
