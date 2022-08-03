package pl.sii.designPatterns.bridgePattern;

public class CircleBridge extends ShapeBridge {
    private int x, y, radius;

    protected CircleBridge(int x, int y, int radius, DrawAPIBridge drawAPIBridge) {
        super(drawAPIBridge);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
