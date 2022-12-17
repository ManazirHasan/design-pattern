package org.asrs;

import java.util.HashMap;

public class SingletonInstance {
    private static volatile SingletonInstance instance;
    //For clear visibility across all thread if var is at ram level
    private String data;
    private SingletonInstance(String data) {
        this.data = data;
    }

    public static SingletonInstance getInstance(String data) {
        SingletonInstance instanceLocal =instance; //40%
        if (instanceLocal == null) {
            synchronized (SingletonInstance.class) {
                if (instanceLocal == null)
                    instanceLocal= instance = new SingletonInstance(data);
            }
        }
        return instanceLocal;

    }

    String dt = """
            Why 2nd check, we may remove it, right?
            No, it's just to check again if 
            an instance is already created while the current thread was waiting for lock to acquire 
            after the first check,  2nd check will be rarely used as most of times 
            first check will be not null and return from there, 
            double check is just for initialisation 
            if many threads are trying to initialise the instance at the same time
            {
            id="12"
            nam="dfd"
            }
            """;
}
