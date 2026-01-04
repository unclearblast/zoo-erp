package zoo.report;

import zoo.animals.Animal;
import java.util.List;

public class ConsoleReportService implements ReportService {

    public void generate(List<Animal> animals) {
        System.out.println("Zoo report:");
        System.out.println("Animals count: " + animals.size());

        animals.forEach(animal ->
            System.out.println(
                animal.getName() + " (" + animal.getSpecies() + ")"
            )
        );
    }
}
