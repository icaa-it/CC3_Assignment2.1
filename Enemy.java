public class Enemy {
    private String enemyType;

    public Enemy(String enemyType) {
        this.enemyType = enemyType;
    }

    public String react() {
        return "The " + enemyType + " takes damage and reacts!";
    }

    public String identify() {
        return "I am the Enemy class. I represent the opponent in the game.";
    }
}
