/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
class thread1 implements Runnable {

    Semaphore semaphore;
    String name;
    
    thread1(Semaphore semaphore,String name){
        this.semaphore = semaphore;
        this.name = name;
    }
    
    @Override
    public void run() {
        try {
            System.out.println(name + " try to get the semaphore");
            semaphore.acquire();
            System.out.println("multithread.thread1.run()");
            
            for (int i = 0; i < 10; i++) {
                resource.number++;
                System.out.println(name + ":"+ resource.number);
                
                Thread.sleep(10);
            }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(thread1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("multithread.thread1 release");
        semaphore.release();
        
    }
    
    
}
