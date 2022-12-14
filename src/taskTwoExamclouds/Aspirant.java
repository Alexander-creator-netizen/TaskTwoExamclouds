package taskTwoExamclouds;

/**
 * This class contains information about Phdstudent'es.
 * Сontains a method that outputs a Phdstudent'es scholarship depending on his average grade.
 *
 * @author Alex Krentik
 * @data 09.08.2022
 */

public class Aspirant extends Student {

    private String scientificWork;

    public Aspirant(String firstName, String lastName, int group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    public double getScholarship() {
        if (getAverageMark() == 5) {
            System.out.println("Заслужил!");
            double money = 200;
            return money;
        } else if (getAverageMark() < 5) {
            System.out.println("Есть к чему стремиться!");
            double money = 130;
            return money;
        } else {
            System.out.println("Таким способным стипендия не нужна.");
            return 0;
        }
    }

    public String getScientificWork() {
        return scientificWork;
    }
}
