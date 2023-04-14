package seven;

import java.util.LinkedList;

public class Team {
    private String club;
    private double ratting;
    private LinkedList<Player> listOfPlayers = new LinkedList<Player>();

    public String getName() {
        return club;
    }

    public void setName(String club) {
            if (!club.isEmpty()) {
                this.club = club;
            } else {
                System.out.println("A club should not be empty");
            }
    }

    public double getRatting() {
        return ratting;
    }

    public void setRatting(double ratting) {
        this.ratting = ratting;
    }

    public Team(String club, double ratting) {
        setName(club);
        setRatting(ratting);
    }
    public void addPlayer(Player player){
        listOfPlayers.add(player);
    }

}
