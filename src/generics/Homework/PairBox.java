package generics.Homework;

public class PairBox<K, V>{

    K first;
    V second;

    public void setFirst(K first) {
        this.first = first;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public static void main(String[] args) {
        PairBox<Integer, String> pb = new PairBox<>();

        pb.setFirst(1);
        pb.setSecond("One");

        System.out.println(pb.getFirst());
        System.out.println(pb.getSecond());

    }
}
