package pl.sii.designPatterns.bridgePattern;

public abstract class ShapeBridge {
    protected DrawAPIBridge drawAPI;

    protected ShapeBridge(DrawAPIBridge drawAPIBridge) {
        this.drawAPI = drawAPIBridge;
    }

    public abstract void draw();
}
