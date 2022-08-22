package pl.sii.javaBeginers.records;

public class EmployeeClass {
    private final String name;
    private final int employeeName;

    public EmployeeClass(String name, int employeeName) {
        this.name = name;
        this.employeeName = employeeName;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeName() {
        return employeeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeClass that = (EmployeeClass) o;

        if (employeeName != that.employeeName) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + employeeName;
        return result;
    }

    @Override
    public String toString() {
        return "EmployeeClass{" +
                "name='" + name + '\'' +
                ", employeeName=" + employeeName +
                '}';
    }
}
