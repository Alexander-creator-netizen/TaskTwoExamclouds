package taskTwoExamclouds.Student;

/**
 * This class contains information about students.
 * Сontains a method that outputs a student's scholarship depending on his average grade.
 *
 * @author Alex Krentik
 * @data 09.08.2022
 */

public class Student {

    String firstName;
    String lastName;
    int group;
    public double averageMark;

    public Student(String firstName, String lastName, int group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getScholarship() {
        if (averageMark == 5) {
            System.out.println("Можно раскошелиться и на сосиски.");
            double money = 100;
            return money;
        } else if (averageMark < 5) {
            System.out.println("На минимальные нужды.");
            double money = 80;
            return money;
        } else {
            System.out.println("Нужно сидеть не за партой.");
            return 0;
        }
    }
}
