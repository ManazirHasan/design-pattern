package org.asrs;

import java.util.ArrayList;
import java.util.List;
//Thread state NEW,RUNNABLE,BLOCKED,WAITING,TIME_WAITING,TERMINATED
public class MultiTaskingThreadKlass {
    static Runnable[] runnables = new Runnable[2];
    static SharedObject shareObject = new SharedObject();

    public static void main(String[] args) throws InterruptedException {

/**************************Producer********************************************************/
        runnables[0] = () -> {
            while (true) {
                try {
                    shareObject.setX(Math.random());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1 = new Thread(runnables[0]);
        t1.setName("Producer");
        t1.start();
/****************************Consumer********************************************************/
        runnables[1] = () -> {
            while (true) {
                try {
                    double value = shareObject.getX();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t2 = new Thread(runnables[1]);
        t2.setName("Consumer");
        t2.start();
    }
}
class SharedObject {
    List<Double> dlist = new ArrayList<Double>();
    Object obj = new Object();

    void setX(double x) throws InterruptedException {
        synchronized (this.obj) {
            dlist.add(x);
            System.out.println("[Producing ]" + Thread.currentThread() + x);
            this.obj.notifyAll();
            this.obj.wait();
        }
    }

    double getX() throws InterruptedException {
        double v = 0;
        if (this.dlist.size() > 0) {
            synchronized (this.obj) {
                v = this.dlist.get(this.dlist.size() - 1);
                System.out.println("[" +
                        "Consuming ]" + Thread.currentThread() + v);
                this.obj.notifyAll();
                this.obj.wait();
            }
        }
        return v;
    }
}