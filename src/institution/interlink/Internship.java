package institution.interlink;

import person.Student;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Internship {
    private String name;
    private List<Student> students = new LinkedList<>();

    public Internship(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        if (student.getUniversity() != null && student.getLevel() > student.getUniversity().getAverageLevel()) {
            this.students.add(student);
        }
    }

    public String getStudents() {
        return students.stream().map(Student::getName).collect(Collectors.joining("\n"));
    }
}
