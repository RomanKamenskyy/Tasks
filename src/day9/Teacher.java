package day9;

public class Teacher extends Human{
    private String subject;

    public Teacher(String name, String surname, String subject) {
        super(name, surname);
        this.subject = subject;
    }

    public Teacher(String name, String surname) {
        super(name, surname);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Это преподаватель с имененем" + getName());
    }
}
