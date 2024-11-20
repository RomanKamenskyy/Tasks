package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void givePoint(Student student){
        Random random = new Random();
        int degree = random.nextInt(4) + 2;
        System.out.println(new StringBuilder().append(this.name).append(" оценил студента ").append(student.getName()).append(" по предмету ").append(this.subject).append(" и поставил оценку ").append(degree).toString());
    }
}
