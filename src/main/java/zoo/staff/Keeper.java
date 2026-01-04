package zoo.staff;

import zoo.animals.Animal;
import zoo.care.Cleanable;
import zoo.care.Feedable;

public class Keeper extends ZooWorker implements Feedable, Cleanable {

    public Keeper(String name) {
        super(name);
    }

    public void feed(Animal animal) {
        System.out.println(name + " feeds " + animal.getName());
    }

    public void clean(Animal animal) {
        System.out.println(name + " cleans enclosure of " + animal.getName());
    }
}
