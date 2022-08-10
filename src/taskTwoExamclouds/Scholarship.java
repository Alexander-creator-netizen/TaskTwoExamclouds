package taskTwoExamclouds;

/**
 * This class displays information about the scholarship of students.
 *
 * @author Alex Krentik
 * @data 09.08.2022
 */

public class Scholarship {
    public static void main(String[] args) {
        Aspirant firstAspirant = new Aspirant("Винни-пух", "эй, Толстый", 1, 5.0, "Секреты мёдоварения");
        Student secondAspirant = new Student("Пяточок", "и Все Все Все", 2, 3.4);
        Student thridAspirant = new Aspirant("Ослик", "Иа", 2, 3.8, "Секреты вместимости пустых горшочков");

        Student[] classroom = {firstAspirant, secondAspirant, thridAspirant};

        for (Student students : classroom) {
            System.out.println(students.getScholarship());
            System.out.println();
        }
    }
}
