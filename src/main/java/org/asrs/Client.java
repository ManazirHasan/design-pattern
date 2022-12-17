package org.asrs;

public class Client {

    public static void main(String[] args) {
        System.out.println("---------Hello---------------");
        IP a = new ProxyA();
        a.m();
        a.m();
    }
}
class A implements IP{
    public void m(){
        System.out.println("-----m() creation-------");
    }

}
class ProxyA implements  IP{
    A a ;
    public void m(){

        if(this.a==null ){
            System.out.println("instance creation");
            a = new A();
        }
        a.m();
    }
}

interface IP{
    void m();
}

