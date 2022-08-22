package pl.sii.javaBeginers.doublecolon.d;

public class ComparatorProvider {

    public int compareByAge(Employee e1, Employee e2) {
        return e1.getAge().compareTo(e2.getAge());
    }

    public int compareByName(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }

    public int compareBySalary(Employee e1, Employee e2) {
        return e1.getSalary().compareTo(e2.getSalary());
    }
}
