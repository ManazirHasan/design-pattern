package org.asrs.singleton;

public class SingletonStatic  {

    private static SingletonStatic singleton;
    public static SingletonStatic getSingleton() {

        //str=""
        if (singleton == null) {
            synchronized (SingletonStatic.class) {
                if (singleton == null) {
                    singleton = new SingletonStatic();
                }
            }
        }
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

        return singleton;
       //return null;
    }
}
