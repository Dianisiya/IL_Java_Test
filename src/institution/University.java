package institution;

import person.Student;
import person.consciousness.Knowledge;

import java.util.LinkedList;
import java.util.List;

public class University {

    private String name;
    private List<Student> students = new LinkedList<>();
    private double averageLevel;

    public University(String name) {
        this.name = name;
    }

    public double getAverageLevel() {
        return averageLevel;
    }

    private void recalculateAverageLevel() {
        double average = 0;
        if (students.size() > 0) {
            int sum = students.stream().mapToInt(Student::getLevel).sum();
            average = sum * 1.0 / students.size();
        }
        averageLevel = average;
    }

    public void addStudent(Student student) {
        if (student.getKnowledge() == null) {
            student.setKnowledge(new Knowledge(0));
        }
        students.add(student);
        recalculateAverageLevel();
    }
}
