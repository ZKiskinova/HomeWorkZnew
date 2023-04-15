package seven;

public class Test {
    public static void main(String[] arg){

        Player First = new Player("Lionel_Messi",75,85, 84, 92, 67);
        Player Second = new Player("Gerard_Pique", 95, 82, 82, 89, 68);
        Team teamOne = new Team("Barcelona");
        teamOne.addPlayer(First);
        teamOne.addPlayer(Second);
        teamOne.removePlayer(Second);
        teamOne.calculateRatting();


        Team teamTwo = new Team("Barcelona");
        Player Third = new Player("Lionel_Messi",75,85, 84, 92, 67);
        teamTwo.addPlayer(Third);
        Player Fourth = new Player("Gerard_Pique", 195, 82, 82, 89, 68);
        teamTwo.removePlayer(Fourth);
        teamTwo.calculateRatting();

        Team teamThree = new Team("Barcelona");
        teamThree.calculateRatting();


    }
}
