package collections.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Konstantin");
        arrayList.add("Daria");
        arrayList.add("Oleg");
        arrayList.add("Ivan");

        Iterator<String> iterator = arrayList.iterator(); // Инициализация итератора
        while (iterator.hasNext()){ // Если у итератора есть следующий элемент
            System.out.println(iterator.next()); // Есть следующий элемент? Если да, то выводи его на экран.
        }

        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }



    }
}
