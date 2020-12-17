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
public class PhaserThread implements Runnable{
    
    Phaser phaser;
    String threadName;

    public PhaserThread(Phaser phaser,String name) {
    this.phaser = phaser;
    this.threadName = name;
    phaser.register();
    }


    
    

    @Override
    public void run() {
        //first stage
        System.out.println("Thread " + threadName + " beggining " + phaser.getPhase());
        phaser.arriveAndAwaitAdvance();

        phaser.arriveAndDeregister();
    }
    
}
