public class Goomba extends Minion {

    private boolean hasWings;
    
    /**
     * Default constructor
     */
    public Goomba() {
        super.setSound("squalk");
    }

    /**
     * Full constructor
     */
    public Goomba(int[] position, int life, String sound, boolean hasWings) {
        super.setPosition(position);
        super.setLife(life);
        super.setSound(sound);
        setHasWings(hasWings);
    }

    public boolean getHasWings() {
        return hasWings;
    }

    @Override
    public void makeSound() {
        System.out.println("Goomba says: ");
        super.makeSound();
    }

    public void setHasWings(boolean hasWings) {
        this.hasWings = hasWings;
    }

    @Override
    public String toString() {
        return ("Goomba: " + super.toString() + ". Has wings: " + hasWings);
    }
}