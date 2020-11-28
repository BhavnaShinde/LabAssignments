package com.cg.training.lab8;
import java.time.LocalDateTime;

public class TimerRunnable implements Runnable{

	
	@Override
    public void run() {
	
	 for(int i=0;i<100;i++) {
		 try {
				Thread.sleep(100*100);
				 System.out.println(Thread.currentThread().getName()+" starts  :"+LocalDateTime.now());
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
                    
        }
	
	
	
	 
 }

}
