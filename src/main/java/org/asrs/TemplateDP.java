package org.asrs;

public class TemplateDP extends  Template{

    public static void main(String[] args) {
        TemplateDP templateDP = new TemplateDP();
        templateDP.template();
    }
    @Override
    void p() {
        System.out.println("--------p()----------");

    }

    @Override
    void q() {
        System.out.println("--------q()----------");
    }

    @Override
    void r() {
        System.out.println("-------r()----------");
    }
}


abstract class Template {

    final void  template() {
        p();
        q();
        r();
    }

    abstract void p();
    abstract void q();
    abstract void r();

}
