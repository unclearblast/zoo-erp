package zoo.animals;

public class Snake implements Animal {

    private final String name;

    public Snake(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return "Snake";
    }
}
