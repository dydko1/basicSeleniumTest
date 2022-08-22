package pl.sii.javaBeginers.records;

public record EmployeeRecord(String name, int employeeNumber) {

    public static final String DEFAULT_EMPLOYEE="Miro";

    public String upperCase1() {
        return name.toUpperCase();
    }

}
