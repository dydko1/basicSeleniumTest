package pl.sii.trash.static1;

public class StudentMain {
    public static void main(String[] args) {
        String s=Student1.nazwaUczelni;
        Student1.nazwaUczelni="ddddd";
        s=Student1.nazwaUczelni;
        System.out.println(s);
    }
}
