package zoo;

import zoo.animals.*;
import zoo.report.ConsoleReportService;
import zoo.staff.Keeper;
import zoo.staff.Veterinarian;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo(new ConsoleReportService());

        Animal lion = new Lion("Simba");
        Animal parrot = new Parrot("Kesha");
        Animal snake = new Snake("Nagini");

        zoo.addAnimal(lion);
        zoo.addAnimal(parrot);
        zoo.addAnimal(snake);

        Keeper keeper = new Keeper("Alex");
        Veterinarian vet = new Veterinarian("Dr. Ivan");

        keeper.feed(lion);
        keeper.clean(parrot);

        vet.heal(snake);

        zoo.generateReport();
    }
}
