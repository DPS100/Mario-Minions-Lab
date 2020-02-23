import java.util.ArrayList;

public class Level {

    private ArrayList<Minion> enemies;

    /**
     * Default constructor
     */
    public Level() {
        enemies = new ArrayList<Minion>();
    }

    public void addMinion(Minion minion) {
        enemies.add(minion);
    }

    public void makeSound() {
        for(int x = 0; x < enemies.size(); x++) {
            enemies.get(x).makeSound();
        }
    }

    public String toString() {
        String allEnemies = "";
        for(int x = 0; x < enemies.size(); x++) {
            allEnemies += enemies.get(x).toString() + " ";
        }
        return allEnemies;
    }
}