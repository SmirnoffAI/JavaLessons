package generics.Homework;

public class Box<T>{
    private final T content;

    public Box(T content){
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    @Override
    public String toString(){
        return "Box{content = " + content + ", type = " + content.getClass().getSimpleName() + "}";
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(40);
        Box<String> strBox = new Box<>("Hello");

        System.out.println(intBox);
        System.out.println(strBox);
    }
}
