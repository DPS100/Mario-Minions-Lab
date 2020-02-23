public class Driver{

    public static Minion minion1 = new Minion();
    public static Goomba goomba1 = new Goomba();
    public static Koopa koopa1 = new Koopa();
    public static SuperKoopa superKoopa1 = new SuperKoopa();

    public static void main(String[] args) {

        /*
        System.out.println(minion1);
        System.out.println(goomba1);
        System.out.println(koopa1);
        System.out.println(superKoopa1);
        superKoopa1.makeSound();
        */

        superKoopa1.attack();
    }
}