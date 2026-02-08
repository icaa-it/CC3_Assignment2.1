public class Main {
    public static void main(String[] args) {

        Player player = new Player("Knight");
        Enemy enemy = new Enemy("Orc");
        Weapon weapon = new Weapon("Steel Sword");

        GameSystem game = new GameSystem(player, enemy, weapon);

        System.out.println(game.startBattle());
    }
}
