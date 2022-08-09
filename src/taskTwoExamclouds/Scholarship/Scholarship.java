package taskTwoExamclouds.Scholarship;

import taskTwoExamclouds.Aspirant.Aspirant;
import taskTwoExamclouds.Student.Student;

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

        System.out.println("У Винии на мёд: " + classroom[0].getScholarship() + "р.");
        System.out.println();

        System.out.println("У Пяточка на новые шарики: " + classroom[1].getScholarship() + "р.");
        System.out.println();

        System.out.println("Сбережения Ослика в горшочке: " + classroom[2].getScholarship() + "р.");
        System.out.println();
    }
}
