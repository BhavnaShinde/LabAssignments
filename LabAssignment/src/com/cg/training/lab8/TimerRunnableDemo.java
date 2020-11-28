package com.cg.training.lab8;

public class TimerRunnableDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
        //Runnable object
        Runnable runnable= new TimerRunnable();
        
        Thread t1= new Thread(runnable,"work1");
        //main thread spawns thread, worker-1 which executes run() method
        //start() method invokes run() method
        t1.start();
           
	
	}
}

