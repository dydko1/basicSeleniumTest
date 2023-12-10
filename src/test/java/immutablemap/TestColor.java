package immutablemap;

import org.junit.jupiter.api.Test;

public class TestColor {
    private final Color color = new Color();

    @Test
    public void checkColorTest() {
        System.out.println("---------------------");
        String s = color.getColor.get(EnumColor.RED);
        System.out.println("kolor=" + s);
        s = color.getColor.get(EnumColor.GREEN);
        System.out.println("kolor=" + s);
        s = color.getColor.get(EnumColor.BLUE);
        System.out.println("kolor=" + s);
    }
}
