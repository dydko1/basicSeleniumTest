package pl.sii.javaBeginers.multithreating;

public class MultithreadingThing extends Thread {
    private int thread;
    public MultithreadingThing(int thread) {
        this.thread = thread;
    }



    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("test= " + i + " tn="+thread);
//            if(thread==3)
//                throw  new RuntimeException("Thread 3");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
