package comparation.Lesson1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Konstantin");
        list.add("Ivan");
        list.add("Maria");

        System.out.println("Before sorting...");
        System.out.println(list);
        System.out.println();
        System.out.println("After sorting...");
        Collections.sort(list);
        System.out.println(list);

    }
}
