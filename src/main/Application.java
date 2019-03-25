package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
    public static void main(String[] args) {
        final University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko", new Knowledge(2), university));
        university.addStudent(new Student("Julia Veselkina", new Knowledge(5), university));
        university.addStudent(new Student("Maria Perechrest", new Knowledge(3), university));

        final Student highGradeStudent = new Student("Diana Kolisnichenko", new Knowledge(5), university);
        final Student lowGradeStudent = new Student("Petro Petrenko", new Knowledge(1), university);

        university.addStudent(highGradeStudent);
        university.addStudent(lowGradeStudent); //won't be added

        final Internship internship = new Internship("Interlink");
        internship.setStudent(highGradeStudent);
        internship.setStudent(lowGradeStudent);

        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}
