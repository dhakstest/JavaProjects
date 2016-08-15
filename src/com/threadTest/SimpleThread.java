package com.threadTest;

class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;

    RunnableDemo( String name){
        threadName = name;
        System.out.println("Creating " +  threadName );
    }
    public void run() {
        System.out.println("Running " +  threadName );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start ()
    {
        System.out.println("Starting " +  threadName );
        if (t == null)
        {
            t = new Thread (this, threadName);
            t.start ();
        }
    }

}

public class SimpleThread {
    public static void main(String args[]) {

        RunnableDemo Thread1 = new RunnableDemo( "Thread_ONE");
        Thread1.start();

        RunnableDemo Thread2 = new RunnableDemo( "Thread_TWO");
        Thread2.start();

        RunnableDemo Thread3 = new RunnableDemo( "Thread_THREE");
        Thread3.start();

        RunnableDemo Thread4 = new RunnableDemo( "Thread_FOUR");
        Thread4.start();


    }
}