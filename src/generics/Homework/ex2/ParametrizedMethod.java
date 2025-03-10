package generics.Homework.ex2;


public class ParametrizedMethod {

    static <T> void printArray(T[] list){
        for (T element : list){
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        String[] strings = {"1", "2", "3", "4", "5"};

        printArray(integers);
        System.out.println();
        printArray(strings);
    }
}
