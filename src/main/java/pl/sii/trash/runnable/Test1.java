package pl.sii.trash.runnable;


import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test1 {
    public static void main(String[] args) {

        test1(() -> {
            System.out.println("dddddddddddddd");
        });
    }

    private static void test1(Runnable run1) {
        System.out.println("ssssssssssss");

        run1.run();
        System.out.println("vvvvvvvvvvvvvvv");
    }


}
