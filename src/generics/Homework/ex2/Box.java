package generics.Homework.ex2;


public class Box <T> {

    private T value;

    public void putValue(T value){
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.putValue(50);
        System.out.println(intBox.getValue());

        Box<String> stringBox = new Box<>();
        stringBox.putValue("OK");
        System.out.println(stringBox.getValue());
    }
}

