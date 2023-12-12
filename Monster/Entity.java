package Monster;

abstract public class Entity {
    private String name;
    private boolean destroyed = false;
    private int hp =100;




    public Entity(String name) {
        this.name = name;


    }
    public boolean isDestroyed() {
        return destroyed;
    }

    protected boolean damage(int dhp) {
        hp -= dhp;
        if (hp < 0) {
            destroyed = true;
            System.out.println("Monster " + name + " was destroyed");
            return true;
        }
        return false;
    }

}
