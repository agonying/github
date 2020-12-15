/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Administrator
 */
public class Multithread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Semaphore semaphore = new Semaphore(1);
        
        new Thread(new thread1(semaphore,"thread1")).start();
        new Thread(new thread2(semaphore, "thread")).start();;
        
    }
    
}
