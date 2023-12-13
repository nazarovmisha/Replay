package Monster;

public class Player extends Human {

    public class Backpack {
        String packages = "";

        void put(String str) {
            packages += str + ", ";
        }

        public String toString() {
            if (packages.equals("")) {
                return "backpack is empty";
            }
            return packages;
        }
    }
    Backpack backpack;

    public Player(String name) {
        super(name + "player");
        backpack=new Backpack();
    }

    public void take(String str) {
        backpack.put(str);
    }
}


