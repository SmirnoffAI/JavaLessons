package generics;

import java.util.ArrayList;
import java.util.List;

public class Subtyping {
    public static void main(String[] args) {
        X x = new Y();
        List<X> list1 = new ArrayList<>();

    }
}

class X{}

class Y extends X{}


// Чтобы ограничить generic T, я могу использовать наследование и/или имплементацию
class Information <T extends Number & I1 & I2>{

    // Теперь в переменной value может находится класс Number и его наследники.
    private T value; // private T value = "String" - ошибка компиляции

    public Information(T value){
        this.value = value;
    }

    @Override
    public String toString(){
        return "{[ " + value + " ]}";
    }
}

interface I1{}

interface I2{}


