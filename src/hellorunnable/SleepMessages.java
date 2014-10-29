/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hellorunnable;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class SleepMessages {

    public static void main(String[] args) throws InterruptedException {

        String importantInfo[] = {
            "Mares eat oats",
            "Does eat oats",
            "Little lambs eat ivy",
            "A kid will eat ivy too"
        };


        for (int i = 0; i < importantInfo.length; i++) {

           

            if (Thread.interrupted()) {
               throw  new InterruptedException();
            }
            System.out.println(importantInfo[i]);

        }


    }
}
