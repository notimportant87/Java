public class Level_0 extends Level_1 {

    private int points = 10;
    private String levelName = "Level 0";

    public void play() {
        if (LevelManager.isPlayerInLevel_0()) {
            System.out.println("Hi, " + levelName + " here and I have " + points + " points!");
        } else {
            super.play();
        }
    }

}
