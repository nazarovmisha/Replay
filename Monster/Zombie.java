package Monster;

public class Zombie extends Monster {
    public Zombie(String name) {
        super(name + "the Zombie", 5);
    }

    @Override
    public void attack() {
        super.attack();
        growl();
    }

    @Override
    public void growl() {
        System.out.print("Raaaauuughhhh");
        super.growl();
    }
}
