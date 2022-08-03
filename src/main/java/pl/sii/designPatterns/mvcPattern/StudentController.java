package pl.sii.designPatterns.mvcPattern;

public class StudentController {
    Student model = new Student();
    StudentView view = new StudentView();

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public Student getModel() {
        return model;
    }

    public void setModel(Student model) {
        this.model = model;
    }

    public StudentView getView() {
        return view;
    }

    public void setView(StudentView view) {
        this.view = view;
    }

    void updateView() {
        view.printStudent(model.getRollNo(), model.getName());
    }
}
