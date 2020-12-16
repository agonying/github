/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 *
 * @author Administrator
 */
public class CountDownThread implements Runnable{

    CountDownLatch cdl;
    @Override
    public void run() {
        System.out.println("countdownlatch.CountDownThread.run()");
        for (int i = 0; i < 5; i++) {
            System.out.println("countdown" + i);
            cdl.countDown();
        }

        System.out.println("countdown finished");
    }

    public CountDownThread(CountDownLatch cdl) {
        this.cdl = cdl;
    }
    
}
