    package generics.Homework;

import java.util.ArrayList;
import java.util.List;

    public class PrintArray {

        public static <T> void printArray(T[] array){
            for (Object o : array){
                System.out.print(o + " ");
            }
        }

        public static <T> void printArray(List<T> list){
            for (Object o : list){
                System.out.print(o + " ");
            }
        }

        public static void main(String[] args) {
            Integer[] intArray = {1, 2, 3, 4, 5};
            String[] strArray = {"A", "B", "C"};

            List<Integer> intList = new ArrayList<>();
            intList.add(1);
            intList.add(2);

            printArray(intArray);
            System.out.println();
            printArray(strArray);
            System.out.println();
            printArray(intList);
        }
    }
