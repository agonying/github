/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Hi implements Runnable{

    CyclicBarrier cb;
    String name;
    
    Hi(CyclicBarrier cb,String str){
        this.cb=cb;
        this.name=str;
    }
    @Override
    public void run() {
                    System.out.println(name);
        try {

            cb.await();
        } catch (InterruptedException ex) {
            Logger.getLogger(Hi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BrokenBarrierException ex) {
            Logger.getLogger(Hi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
