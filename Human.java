public class Human {
    private String name;
    private int age;
    private int weight;
    private String address;

    public Human(String name, int age, String address, String work) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.work = work;
    }

    private String work;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Human(String name, int age, String work) {
        this.name = name;
        this.age = age;
        this.work = work;
    }

    public Human(int age, int weight, String name, String work) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.work = work;
    }

    public static void main(String[] args) {
        Human human = new Human(4,5, "A","B");
    }
}
