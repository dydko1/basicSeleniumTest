package pl.sii.advanceCourse.enum1;

public class Test1 {
    public static void test12(int a) {
        if (a==6)
            return;;

        System.out.println("start");
        test12(a++);
        System.out.println("end");

    }
}
