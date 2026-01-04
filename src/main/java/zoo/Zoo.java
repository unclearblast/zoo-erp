package zoo;

import zoo.animals.Animal;
import zoo.report.ReportService;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private final List<Animal> animals = new ArrayList<>();
    private final ReportService reportService;

    public Zoo(ReportService reportService) {
        this.reportService = reportService;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void generateReport() {
        reportService.generate(animals);
    }
}
