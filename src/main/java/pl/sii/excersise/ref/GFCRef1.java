package pl.sii.excersise.ref;

public class GFCRef1 {
    public static void main(String[] args) {

        //System.out.println(sum(10, 20));
        Integer a = 10, b = 30;

        System.out.println("a=" + a + "\tb=" + b);
        swap(a,b);
        System.out.println("a=" + a + "\tb=" + b);
    }

    private static void swap(Integer a, Integer b) {

        Integer swap;
        swap = a;
        a = b;
        b = swap;
    }

    private static int sum(int a, int b) {
        return a + b;
    }
}
