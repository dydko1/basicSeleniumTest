package pl.sii.excersise.generic1.a;

public class Generic1 {

    static <E> void printArr(E[] input) {

        for (E ele : input) {
            System.out.println("Wynik=" + ele);
        }
    }

    public static void main(String[] args) {
        Integer[] iArr = {1, 2, 4, 5, 6, 7, 8, 98};
        String[] s = {"aaa", "vv", "cc"};
        Double[] d = {1.0, 5.8, 10., 4.};
        Character[] ch = {'d', 'f', 'g'};
        printArr(iArr);
        printArr(s);
        printArr(d);
        printArr(ch);
    }
}
