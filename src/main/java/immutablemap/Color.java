package immutablemap;

import com.google.common.collect.ImmutableMap;

import static immutablemap.EnumColor.*;

public class Color {
    private String red = "Czerwony!";
    private String green = "Green!";
    private String blue = "Blue!";

    ImmutableMap<EnumColor, String> getColor = ImmutableMap.of(
            RED, getRed(),
            GREEN, getGreen(),
            BLUE, getBlue());

    private String getRed() {
        System.out.println(red);
        return red;
    }

    private String getGreen() {
        System.out.println(green);
        return green;
    }

    private String getBlue() {
        System.out.println(blue);
        return blue;
    }
}