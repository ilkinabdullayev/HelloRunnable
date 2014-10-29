/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hellorunnable;

/**
 *
 * @author Admin
 */
class Erupt implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class Yellowstone {

    static Erupt e = new Erupt();

    public Yellowstone() {
        new Thread(e, "const").start();
    }

    public static void main(String[] args) {
        new Yellowstone();
        new Faithfull().go();
    }

    static class Faithfull {
        void go() {
            new Thread(e, "inner").start();
        }
    }
}
