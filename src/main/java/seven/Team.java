package seven;

import java.util.LinkedList;

public class Team {
    private String club;
    private int ratting;
    private LinkedList<Player> listOfPlayers = new LinkedList<Player>();

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        if (!club.isEmpty()) {
            this.club = club;
        } else {
            System.out.println("A club should not be empty");
        }
    }

    public int getRatting() {
        return ratting;
    }

    public void setRatting(int ratting) {
        this.ratting = ratting;
    }

    public Team(String club) {
        setClub(club);
    }

    public void addPlayer(Player player) {
        listOfPlayers.add(player);
        System.out.printf("%s add %s %s,%s,%s,%s,%s\n", this.getClub(), player.getName(), player.getEndurance()
                , player.getSprint(), player.getDribble(), player.getPassing(), player.getShooting());

    }

    public void removePlayer(Player player) {
        if (!listOfPlayers.contains(player.getName())) {
            System.out.printf("Player %s is not in %s team\n", player.getName(), this.club);
        } else {
            listOfPlayers.remove(player);
            System.out.printf("%s remove %s\n", this.getClub(), player.getName());
        }
    }

    public void calculateRatting(){
        if(listOfPlayers.size()==0){
            System.out.printf("%s is 0", this.club);
            return;
        }
        for (Player player:listOfPlayers) {

            this.ratting += ((player.getDribble()+ player.getEndurance()+ player.getPassing()+
                    player.getShooting()+ player.getSprint())/5*this.listOfPlayers.size());

            System.out.printf("%s is %s\n", this.club, this.ratting);
        }

    }
}


