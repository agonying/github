/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exchange;

import java.util.concurrent.Exchanger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class UseThread implements Runnable{

    Exchanger<String> ex = new Exchanger<String>();
    String str;

    UseThread(Exchanger<String> ex) {
        this.ex =ex;
    }
    
    @Override
    public void run() {
        for(int i = 0; i<3; i++){
        try {
            str = ex.exchange(new String());
            System.out.println(str);
        } catch (InterruptedException ex) {
            Logger.getLogger(UseThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
    }
    
    
}
