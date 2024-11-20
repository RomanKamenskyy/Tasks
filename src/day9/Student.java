package day9;

public class Student extends Human {
    //private String name;
    private String studentGroup;

    public String getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(String studentGroup) {
        this.studentGroup = studentGroup;
    }

    public Student(String name, String surname, String studentGroup) {
        super(name, surname);
        this.studentGroup = studentGroup;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Это студент с именем " + getName());
    }
}
