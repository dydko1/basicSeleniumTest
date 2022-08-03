package pl.sii.designPatterns.bridgePattern;

public class BridgePatternDemo {
    public static void main(String[] args) {
        ShapeBridge redCircle = new CircleBridge(100, 15, 10, new RedCircleBridge());
        ShapeBridge greenBridge=new CircleBridge(150,160,50,new GreenCircleBridge());

        redCircle.draw();
        greenBridge.draw();
    }
}
