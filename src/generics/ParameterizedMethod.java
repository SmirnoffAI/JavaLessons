package generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(10);
        al.add(15);

        System.out.println(GenMethod.getSecondElement(al));

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Hello");
        al2.add("OK");
        al2.add("Good bye");

        System.out.println(GenMethod.getSecondElement(al2));
    }

}

class GenMethod{

    public static <T> T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }
}
