package pl.sii.javaBeginers.doublecolon.a;

import com.google.common.base.Supplier;

import java.util.ArrayList;
import java.util.Arrays;

public class Test21 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(12, 123, 34, 56));

        Per per =new Per(30);
        Supplier<Integer> getAge = per::getAge;

        System.out.println(getAge.get());


    }
    public static int count(){
        return 1+2;
    }
}
