package pl.sii.advanceCourse.enum1;

public class MainEnum {
    public static void main(String[] args) {
        MainEnum enum1 = new MainEnum();

        Color c1 = Color.BLUE;

        System.out.println(c1.name());
        //System.out.println(c1.getVal1());

//        for (Color c : Color.values()) {
//            System.out.println("val=" + c.getVal1());
//            System.out.println("name=" + c.name());
//        }
  c1.setVal1("reddddd");
        System.out.println(c1.getVal1());
        //enum1.printMessage();
    }

    public static void printMessage() {
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
    }
}
