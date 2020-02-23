public class SuperKoopa extends Koopa {

    private int damage;

    /**
     * Default constructor
     */
    public SuperKoopa() {
        setDamage(1);
        super.setSound("HaHa!");
        super.setHasShell(true);
    }

    /**
     * Full constructor
     */
    public SuperKoopa(int[] position, int life, String sound, boolean hasShell, int damage) {
        super.setPosition(position);
        super.setLife(life);
        super.setSound(sound);
        super.setHasShell(hasShell);
        setDamage(damage);
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void makeSound() { //TODO: instructions (4.d) said for makeSound to return a string, unable to do that and make a void, also prints koopa's makeSound()
        System.out.println("SuperKoopa says: ");
        super.makeSound();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void attack() {
        System.out.println("You just took " + damage + " damage!");
        makeSound();
    }

    @Override
    public String toString() {
        return ("SuperKoopa: " + super.toString() + ". Damage: " + damage);
    }
}