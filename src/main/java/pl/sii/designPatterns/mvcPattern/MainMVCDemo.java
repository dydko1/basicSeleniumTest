package pl.sii.designPatterns.mvcPattern;

public class MainMVCDemo {
    public static void main(String[] args) {

        Student student = getDBData();
        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(student, studentView);

        studentController.updateView();
    }

    private static Student getDBData() {
        Student student = new Student();
        student.setName("Mirorororo");
        student.setRollNo("1234");
        return student;
    }
}
