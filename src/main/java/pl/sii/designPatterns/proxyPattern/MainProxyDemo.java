package pl.sii.designPatterns.proxyPattern;

public class MainProxyDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");

        image.display();
        System.out.println("File is not loading from hdd.");
        image.display();
    }
}
