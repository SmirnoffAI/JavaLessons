package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("poka");
        list.add("afsafkafmaf");

        for (Object o : list){
            System.out.println(o + " length " + ((String)o).length());
        }
    }
}

class Car{}

