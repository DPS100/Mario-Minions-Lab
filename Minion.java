public class Minion {

    private int[] position; 
    private int life;
    private String sound;
    
    /**
     * Default contructor
     */
    public Minion() {
        this.position = new int[2];
        this.life = 0;
        this.sound = "";
    }

    /**
     * Full constructor
     */
    public Minion(int[] position, int life, String sound) {
        this.position = new int[2];
        setPosition(position);
        setLife(life);
        setSound(sound);
    }

    public int[] getPosition() {
        return position;
    }

    public int getLife() {
        return life;
    }

    public String getSound() {
        return sound;
    }

    public Boolean isDead() {
        return life >= 0;
    }

    public void makeSound() {
        System.out.println(sound);
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void decrease() {
        if(!isDead()) {life--;}
    }

    public String toString() {
        return ("Minion: Position: " + position[0] + "," + position[1] + ". Life: " + life + ". Sound: " + sound);
    }
}