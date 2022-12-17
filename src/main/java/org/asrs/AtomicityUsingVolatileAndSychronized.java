package org.asrs;

public class AtomicityUsingVolatileAndSychronized {

    public static void main(String[] args) {
        Customer cc = new Customer();
        System.out.println(cc.id);
    }
}

class Customer {
    private static volatile int idCounter = 0;
    public int id;

    public Customer() {
        this.id = getAndIncrmentId();
    }

    private synchronized int getAndIncrmentId() {
        return idCounter++;
    }

}
