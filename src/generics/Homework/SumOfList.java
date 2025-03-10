package generics.Homework;


import java.util.Arrays;
import java.util.List;

public class SumOfList {

    public static double sumOfList(List<? extends Number> list){
        double sum = 0;
        for (Number n : list){
            sum += n.doubleValue();
        }
        return sum;

    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<Double> doubleList = Arrays.asList(3.14, 2.33);

        System.out.println(sumOfList(intList));
        System.out.println(sumOfList(doubleList));
    }

}
