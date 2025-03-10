package generics.Homework;

public class NumberBox <V extends Number>{
    V value;

    public NumberBox(V value){
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public double add(NumberBox<V> nb){
        return this.value.doubleValue() + nb.value.doubleValue();
    }

    public static void main(String[] args) {
        NumberBox<Integer> nb1 = new NumberBox<>(10);
        NumberBox<Integer> nb2 = new NumberBox<>(20);

        NumberBox<Double> nb3 = new NumberBox<>(3.14);
        NumberBox<Double> nb4 = new NumberBox<>(3.14);

        System.out.println(nb1.add(nb2));
        System.out.println(nb3.add(nb4));

    }
}
