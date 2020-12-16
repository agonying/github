/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author Administrator
 */
public class CyclicBarrierThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CyclicBarrier cb  = new CyclicBarrier(3, new Hello() );
        
        new Thread(new Hi(cb,"A") ).start();
        new Thread(new Hi(cb,"B") ).start();
        new Thread(new Hi(cb,"C") ).start();
        new Thread(new Hi(cb,"D") ).start();
        new Thread(new Hi(cb,"E") ).start();
        new Thread(new Hi(cb,"F") ).start();
        new Thread(new Hi(cb,"G") ).start();
    
        
        
    }
    
}
