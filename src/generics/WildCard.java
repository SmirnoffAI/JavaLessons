package generics;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {
        List<?> list = new ArrayList<Integer>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);

        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Privet");
        list2.add("Poka");
        list2.add("OK");

        showListInfo(list2);

        // bounded wildcard
        List<? extends Number> list3 = new ArrayList<>();


        ArrayList<Double> ald = new ArrayList<>();
        ald.add(3.14);
        ald.add(3.15);
        ald.add(3.16);

        System.out.println(sum(ald));
    }

    static void showListInfo(List<?> list){
        System.out.println("Данный лист содержит следующие элементы: " + list);
    }

    public static double sum(ArrayList<? extends Number> al){
        double sum = 0;
        for(Number n : al){
            sum += n.doubleValue();
        }
        return sum;
    }
}

