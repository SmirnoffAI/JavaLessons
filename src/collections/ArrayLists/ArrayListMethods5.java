package collections.ArrayLists;

import java.util.ArrayList;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Konstantin");
        arrayList.add("Daria");
        arrayList.add("Oleg");
        arrayList.add("Ivan");
        System.out.println(arrayList);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Ivan");
        arrayList2.add("Oleg");
        arrayList2.add("Konstantin");

        arrayList.removeAll(arrayList2);
        System.out.println(arrayList);

        arrayList.add("Ivan");
        arrayList.retainAll(arrayList2);
        System.out.println(arrayList);
        arrayList.add("Oleg");
        arrayList.add("Konstantin");

        boolean result = arrayList.contains(arrayList2);
        System.out.println(result);
    }
}
