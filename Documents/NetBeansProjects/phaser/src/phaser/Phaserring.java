/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phaser;

import java.util.concurrent.Phaser;

/**
 *
 * @author Administrator
 */
public class Phaserring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Register a phaser for the main thread
        Phaser phaser = new Phaser(1);
        int str;
        
        //Create three Threads
        new Thread(new PhaserThread(phaser,"A")).start();
        new Thread(new PhaserThread(phaser,"B")).start();
        new Thread(new PhaserThread(phaser,"C")).start();
        
        
        str = phaser.getPhase();
        System.out.println("Starting stage"  );
        phaser.arriveAndAwaitAdvance();
        System.out.println("stage" + str + "finished" );
        
        System.out.println("main finished");
        phaser.arriveAndDeregister();
        
    }
    
}
