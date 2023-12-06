package Monster;


abstract public class Monster {
    //Fix this class
    private String name;
    private int force;
    private int hp = 15;
    private boolean destroyed = false;

    public Monster(String name, int force) {
        this.name = name;
        this.force = force;
        System.out.println("Monster " + name + " was created");
    }

    abstract public void attack(Monster monster);

    protected int getForce() {
        return force;
    }

    protected boolean damage(int dhp) {
        hp -= dhp;
        if (hp <= 0) {
            return true;
        }
        return false;
    }
}
