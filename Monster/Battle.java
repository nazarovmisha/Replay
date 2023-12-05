package Monster;

public class Battle {

    final static private int MAX = 5;
    Monster[] monsters = new Monster[MAX];

    public void add(Monster monster) {
        int i = 0;
        if (i < MAX) {
            monsters[i++] = monster;
        } else {
            System.out.println("No more monsters");
        }
    }

    public void start() {
        run();
    }

    public void run() {
        for (int i = 0; i < MAX; i++) {
            monsters[i].attack();
        }
    }
}

