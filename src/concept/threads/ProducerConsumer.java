package concept.threads;

import java.nio.channels.Pipe;
import java.util.Scanner;

/**
 * Created by hemants on 26/09/18.
 *
 * Explaining wait() and notify() methods of thread.
 * wait()-It tells the calling thread to give up the lock and go to sleep until some other thread enters the same monitor and calls notify().
 * notify()-It wakes up one single thread that called wait() on the same object. It should be noted that calling notify() does not actually give up a lock on a resource.
 */


class PC {

    void produce() throws InterruptedException{
        synchronized(this){
            System.out.println("Produce thread is running");
            //Giving up lock on 'this' object and waiting for some other thread for notify me.
            wait();

            System.out.printf("Producer Active again");
        }
    }

    void consume() throws InterruptedException {
        Thread.sleep(1000);
        Scanner s = new Scanner(System.in);
        synchronized (this){
            System.out.println("Waiting for input key");
            s.nextLine();
            System.out.println("Key Pressed");
            // notify other thread waiting for this other, But have not release the object lock yet.
            // Will unlock the object lock after exiting the method.
            notify();

            Thread.sleep(2000);

        }

    }
}


public class ProducerConsumer {

    public static void main(String[] args) {
        PC shareResource = new PC();

        Thread producerThread = new Thread(new Runnable(){

            @Override
            public void run(){
                try {
                    shareResource.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumerThread = new Thread(new Runnable(){

            @Override
            public void run(){
                try {
                    shareResource.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        consumerThread.start();
        producerThread.start();


    }

}
