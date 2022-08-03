package pl.sii.designPatterns.bridgePattern;

public class RedCircleBridge implements DrawAPIBridge {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
