package zoo.animals;

public class Parrot implements Animal {

    private final String name;

    public Parrot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return "Parrot";
    }
}
