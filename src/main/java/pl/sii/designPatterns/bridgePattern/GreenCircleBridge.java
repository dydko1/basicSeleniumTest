package pl.sii.designPatterns.bridgePattern;

public class GreenCircleBridge implements DrawAPIBridge {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
