package generics.Homework;

public interface Pair <K, V>{



     K getFirst();

     V getSecond();

}

class PairImpl<K, V> implements Pair<K, V>{

    K key;
    V value;

    public PairImpl(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getFirst(){
        return key;
    }

    @Override
    public V getSecond() {
        return value;
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = new PairImpl<>(1, "One");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }


}
