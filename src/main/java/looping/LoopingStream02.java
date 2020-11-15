package looping;

import java.util.Arrays;
import java.util.List;

public class LoopingStream02 {

    public static void main(String[] args) {
        List<Player> list = Arrays.asList(
                new Player("이승모", 7, "포항스틸러스"), 
                new Player("팔로세비치", 9, "포항스틸러스")
                );
        
        list.forEach(p -> {
            System.out.println(p.getName() + " : " + p.getNumber() + " : " + p.getTeam());
        });

    }

}

class Player {
    private String name;
    private int number;
    private String team;
    
    public Player(String name, int number, String team) {
        this.name = name;
        this.number = number;
        this.team = team;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {
        this.team = team;
    }
    
}