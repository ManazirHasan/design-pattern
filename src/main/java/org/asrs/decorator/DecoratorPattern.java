package org.asrs.decorator;

public class DecoratorPattern {
    //DecB dec = new DecB(new DecA(new D()));
    //dec.m();

    public static void main(String[] args) {

        /* price 3 from base
        D d1 = new D();
        Wapp1InD wapp1InD= new Wapp1InD(d1);
        Wapp2InD wapp2InD = new Wapp2InD(wapp1InD);
        Wapp3InD wapp3InD = new Wapp3InD(wapp2InD);
        int x = wapp3InD.priceAdd();
        System.out.println(x);*/

        //Wrap 1 from base
        D d1 = new D();
        Wapp3InD wapp3InD = new Wapp3InD(d1);
        System.out.println(wapp3InD.priceAdd());
    }

}

//Base or Root class
class D {

    int priceAdd(){
        return 100;
    }
}

abstract class Decorator extends D {
    abstract int priceAdd();
}

class Wapp1InD extends Decorator {

    D d ;
    Wapp1InD(D d){
        this.d=d;
    }

    @Override
    int priceAdd() {
        return this.d.priceAdd() + 25;
    }
}
class Wapp2InD extends  Decorator{
    /*Wapp1InD d ;
    Wapp2InD(Wapp1InD d){
        this.d=d;
    }*/
    D d;
    Wapp2InD(D d){
        this.d=d;
    }
    @Override
    int priceAdd(){
        return this.d.priceAdd() + 15;
    }
}

class Wapp3InD extends  Decorator{
    /*Wapp2InD d ;
    Wapp3InD(Wapp2InD d){
        this.d=d;
    }*/
    D d;
    Wapp3InD(D d){
        this.d=d;
    }
    @Override
    int priceAdd(){
        return this.d.priceAdd() + 10;
    }
}