package day9;

public class task1 {
    public static void main(String[] args) {
        Student student = new Student("firstName","surname", "Math");
        Teacher teacher = new Teacher("firstNameTeacher","surnameTeacher", "MathTeacher");

        student.getStudentGroup();
        teacher.getSubject();

        student.printInfo();
        teacher.printInfo();
    }

}
