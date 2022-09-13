package pl.sii.streams.c;

public class Employee {
    String name;
    Integer marks;

    public Employee(String name, Integer age) {
        this.name = name;
        this.marks = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public boolean hasOverNinetyMarks() {
        return this.marks > 90;
    }
}
