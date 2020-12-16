/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Latch {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            CountDownLatch cdl = new CountDownLatch(5);
            new Thread(new CountDownThread(cdl)).start();
            System.out.println("Thread wait");
            cdl.await();
            System.out.println("Thread finished");
        } catch (InterruptedException ex) {
            Logger.getLogger(Latch.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
