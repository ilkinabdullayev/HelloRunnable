/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hellorunnable;

/**
 *
 * @author Ilkin Abdullayev
 */
public class HelloRunnable2 extends Thread{

    public static void main(String[] args) {
       new Thread(new HelloRunnable2()).start();
    }

    @Override
    public void run() {
        System.out.println("Hello from a thread!");
    }
}
