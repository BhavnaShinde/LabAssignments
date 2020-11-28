package Lab9;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise9_2 {

	public static void main(String[] args) {
		ExecutorService service= 
				Executors.newSingleThreadExecutor();
		service.execute(new Runnable() {

			@Override
			public void run() {
			
				System.out.println(Thread.currentThread()); 
			    
	    		try {
	    			FileReader fileread = new FileReader("C:\\Users\\Bhavna\\Desktop\\java.txt");
	    			BufferedReader bufferread = new BufferedReader(fileread );
	    			FileWriter filewrite = new FileWriter("C:\\Users\\Bhavna\\Desktop\\empty.txt\\", true);
	    			int y;
	     
	    			while ((y = bufferread.read()) != -1) { 
	    			
	                    if(y%10==0)
	                	{
	                		System.out.println("10 characters copied");
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
		});
		service.shutdown();
		}
}
