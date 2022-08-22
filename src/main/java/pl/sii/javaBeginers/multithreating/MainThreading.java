package pl.sii.javaBeginers.multithreating;

public class MainThreading {
    public static void main(String[] args) {
        MultithreadingThing multiT1=new MultithreadingThing(1);
        MultithreadingThing multiT2=new MultithreadingThing(2);
        MultithreadingThing multiT3=new MultithreadingThing(3);
        multiT1.start();
        multiT2.start();
        multiT3.start();
    }
}
