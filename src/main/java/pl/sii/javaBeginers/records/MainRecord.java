package pl.sii.javaBeginers.records;

public class MainRecord {

    public static void main(String[] args) {
        EmployeeClass employeeClass = new EmployeeClass("Mirek", 1234);
        EmployeeRecord employeeRecord=new EmployeeRecord("ffgg",23);
        System.out.println(employeeRecord.upperCase1());
        System.out.println(employeeRecord.DEFAULT_EMPLOYEE);
    }
}
