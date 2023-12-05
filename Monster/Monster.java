package Monster;

public class Monster {
    String name;
    int damage;

    public Monster(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
    public void growl(){
    }

    public void attack(){
    }

    public static void main(String[] args) {
        Zombie zombie = new Zombie("Bob");
        zombie.attack();
    }
}
