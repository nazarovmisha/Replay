package Zoo;

import java.util.Arrays;
public class Zoo {

    // Override toString here...

    Object[] objects;

    public Zoo() {
        objects = new Object[3];

        objects[0] = new Dog();
        objects[1] = new Cat();
        objects[2] = new PopcornStall();
    }

    public void sound() {
        for (Object a : objects) {
            if (a instanceof Soundable){
                ((Soundable) a).sound();
            };
        }
    }

    public void change(Object a, int i) {
        if (i >= 0 && i < objects.length)
            objects[i] = a;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "objects=" + Arrays.toString(objects) +
                '}';
    }
}