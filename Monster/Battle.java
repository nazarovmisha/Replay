package Monster;

public class Battle {

    final static private int MAX = 5;
    private Monster[] monsters;
    private int count;

    Battle() {
        monsters = new Monster[MAX];
    }

    public void add(Monster monster) {

        if (count < MAX) {
            monsters[count++] = monster;
        } else {
            System.out.println("No more monsters");
        }
    }

    public void start() {
        run();
    }

    public void run() {
        for (int i = 0; i < count; i++) {
            if (monsters[i] != null) {
                monsters[i].attack(monsters[i+1]);
            }
        }
    }
}