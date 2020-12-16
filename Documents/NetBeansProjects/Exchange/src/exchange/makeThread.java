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
public class makeThread implements Runnable {

    Exchanger<String> ex;
    static String str = new String();

    public makeThread(Exchanger ex) {
        this.ex = ex;

    }

    @Override
    public void run() {
        char i = 'A';

        for (int k = 0; k < 3; k++) {

            for (int j = 0; j < 10; j++) {

                str += i++;
            }
            try {

                str = ex.exchange(str);
                System.out.println(str);
            } catch (InterruptedException ex) {
                Logger.getLogger(makeThread.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
