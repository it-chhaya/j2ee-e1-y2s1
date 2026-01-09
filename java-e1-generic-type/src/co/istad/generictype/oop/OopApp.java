package co.istad.generictype.oop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OopApp {
    public static void main(String[] args) {
        School<Person> school = new School<>();

        List<Person> students = new ArrayList<>();
        students.add(new Student("Dara", "Male", 1.70F, 90.95));
        students.add(new Student("Kanha", "Female", 1.60F, 80.95));
        students.add(new Teacher("Tola", "Male", 1.76F, BigDecimal.valueOf(1500)));

        school.setDataSet(students);

        school.getDataSet().forEach(person -> {
            System.out.println("Name: " + person.getName());
            System.out.println("Gender: " + person.getGender());
            System.out.println("Height: " + person.getHeight());
            // Pattern Matching
            if (person instanceof Student obj) {
                System.out.println("Score: " + obj.getScore());
            } else if (person instanceof Teacher obj) {
                System.out.println("Salary: " + obj.getSalary());
            }
        });
    }
}
