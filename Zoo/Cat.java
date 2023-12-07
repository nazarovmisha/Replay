package Zoo;

public class Cat extends Animal implements Soundable{


    @Override
    public void sound() {
        System.out.println("Im cat");
    }
}