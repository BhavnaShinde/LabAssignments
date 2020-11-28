package com.cg.training.lab8;
public class FileProgram {

		public static void main(String[] args) {
			System.out.println(Thread.currentThread()); 
			Thread t1= new CopyDataThread("work1");
			t1.start();
			
			

		}

	
	
}