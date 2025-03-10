package hangman;


import java.util.Random;

public class Word {

    String [] values = {"ПИРАТ", "КОЛЕСО", "МОТОР", "КОРАБЛЬ", "ДРАКОН", "ДЕРЕВО"};

    Random random = new Random();

    private String value = values[random.nextInt(values.length)];

    public String getValue() {
        return value;
    }

}
