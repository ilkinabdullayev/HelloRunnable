/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hellorunnable;

/**
 *
 * @author Admin
 */
public class SynchronizedCounter {

    private int c = 0;

    public synchronized void increment() {
        c++;
    }

    public synchronized void decrement() {
        c--;
    }

    public synchronized int value() {
        return c;
    }
}
