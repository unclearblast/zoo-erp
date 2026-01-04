package zoo.animals;

public class Lion implements Animal {

    private final String name;

    public Lion(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return "Lion";
    }
}
