package generics.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant> {

    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name){
        this.name = name;
    }

    public void addNewParticipant(T participant){
        participants.add(participant);
        System.out.printf("В команду " + this.name + " был добавлен новый участник: " + participant.getName());
        System.out.println();
    }

    public void playWith(Team<T> t){
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);

        if (i == 0){
            winnerName = this.name;
        }
        else {
            winnerName = t.name;
        }
        System.out.printf("Выйграла команда " + winnerName);
    }
}
