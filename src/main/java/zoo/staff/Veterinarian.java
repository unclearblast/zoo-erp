package zoo.staff;

import zoo.animals.Animal;
import zoo.care.Healable;

public class Veterinarian extends ZooWorker implements Healable {

    public Veterinarian(String name) {
        super(name);
    }

    public void heal(Animal animal) {
        System.out.println(name + " heals " + animal.getName());
    }
}
