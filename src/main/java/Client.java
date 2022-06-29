public class Client {

    public static void main(String[] args) {
        Character swordMan = new Character();
        Character shooter = new Character();

        swordMan.setWeapon(new Knife());
        shooter.setWeapon(new Gun());

        swordMan.attack();
        shooter.attack();

        swordMan.setWeapon(new Ax());
        swordMan.attack();

    }
}
