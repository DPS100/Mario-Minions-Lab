public class Koopa extends Minion {

    private boolean hasShell;
    
    /**
     * Default constructor
     */
    public Koopa() {
        super.setSound("bah");
    }

    /**
     * Full constructor
     */
    public Koopa(int[] position, int life, String sound, boolean hasShell) {
        super.setPosition(position);
        super.setLife(life);
        super.setSound(sound);
        setHasShell(hasShell);
    }

    public boolean getHasShell() {
        return hasShell;
    }

    @Override
    public void makeSound() {
        System.out.println("Koopa says: ");
        super.makeSound();
    }

    public void setHasShell(boolean hasShell) {
        this.hasShell = hasShell;
    }

    @Override
    public String toString() {
        return ("Koopa: " + super.toString() + ". Has shell: " + hasShell);
    }
}