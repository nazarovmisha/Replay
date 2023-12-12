package Monster;

public abstract class Monster extends Entity implements Fighter {
    private int force;



    public Monster(String name, int force) {

        super("Monster " + name + " was created");
        this.force = force;
    }

    protected int getForce() {
        return force;
    }



    public abstract void attack(Monster monster);
}

