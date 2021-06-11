public class Level_1 extends Level_2 {

    private int points = 100;
    private String levelName = "Level 1";

    public void play() {
        if (LevelManager.isPlayerInLevel_1()) {
            System.out.println("Hi, " + levelName + " here and I have " + points + " points!");
        } else {
            super.play();
        }
    }

}
