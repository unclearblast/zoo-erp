package zoo.report;

import zoo.animals.Animal;
import java.util.List;

public interface ReportService {
    void generate(List<Animal> animals);
}
