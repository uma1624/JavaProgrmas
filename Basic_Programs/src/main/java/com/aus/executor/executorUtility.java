package com.aus.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class  Service implements  Runnable {
int i;
public Service(int i){
    this.i =i;
}
    @Override
    public void run() {
        System.out.print(i+" ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class executorUtility {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);
        for (int i =0;i<25;i++){
            es.execute(new Service(i));
        }
        es.shutdown();
    }
}
