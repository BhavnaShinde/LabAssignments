package com.cg.training.lab8;
import java.io.*;
import java.io.BufferedReader;

public class CopyDataThread extends Thread {
	
public CopyDataThread() {
		
	}
	
	public CopyDataThread(String threadName) {
		super(threadName);
	}
	public void run()
	{
		System.out.println(Thread.currentThread()); 
    
    		try {
    			FileReader fileread = new FileReader("C:\\Users\\Bhavna\\Desktop\\java.txt");
    			BufferedReader bufferread = new BufferedReader(fileread );
    			FileWriter filewrite = new FileWriter("C:\\Users\\Bhavna\\Desktop\\empty.txt", true);
    			int y;
     
    			while ((y = bufferread.read()) != -1) { 
    			
                    if(y%10==0)
                	{
                		System.out.println("10 characters are copied");
                		try {
							Thread.sleep(100*50);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
                	}
                    filewrite.write(y); 
    			
    			}
    			bufferread.close();
    			filewrite.close();
                          
    		} catch (IOException e) {
    			
    			e.printStackTrace();
    		}
  
}
}