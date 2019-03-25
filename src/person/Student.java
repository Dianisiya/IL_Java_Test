package person;

import institution.University;
import person.consciousness.Knowledge;

public class Student {

    private String name;
    private Knowledge knowledge;
    private University university;

    public Student(String name, Knowledge knowledge, University university) {
        this.name = name;
        this.knowledge = knowledge;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public University getUniversity() {
        return university;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    public Knowledge getKnowledge() {
        return knowledge;
    }

    public Integer getLevel () {
        return knowledge != null ? knowledge.getLevel() : null;
    }
}
