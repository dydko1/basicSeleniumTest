package pl.sii.excersise.generic1;

public class Main1 {
    public static void main(String[] args) {
        Gen1<Integer> gen1=new Gen1<Integer>(5);
        System.out.println(gen1.getT());

        Gen1<String> gen2=new Gen1<>("ddddd");
        System.out.println(gen2.getT());
    }
}
