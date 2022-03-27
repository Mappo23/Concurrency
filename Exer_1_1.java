package counters;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

//100000000 
//Exercise 1.2
public class Exer_1_1 {
	
	static AtomicLong counter = new AtomicLong();
	static int upperBound = 0;

	
	public static void main(String[] args) {
		
	 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Upper bound:");
	    int n = scanner.nextInt();
	    upperBound = n;
	    
	    System.out.println("Number of threads:");
	    int t = scanner.nextInt();
	    
	    scanner.close();
	      
	    
	    long time = System.currentTimeMillis();
	    
	    //Threads declaration
	    Multi[] T2 = new Multi[t];
	    
	    //Threads creation
	    for (int i = 0; i < t; i++) {
	    	
	    	T2[i] = new Multi();
	    	
	    }
	    
		counter.set(2);
	    
	    	
	    
		//Threads ignition	
	    for (int i = 0; i < t; i++) {
	    			    		
	    	T2[i].start();
	   
	    	
	    }
	    
	   
	    // Waiting for threads completion
	 	for (int i = 0; i < t; i++) {
	 	  try {
	 		 T2[i].join();
	 		} catch (InterruptedException e) {
	 			}
	 		}
	       
	    
	   
	    time = System.currentTimeMillis() - time;
	    
	    System.out.println("Finished with total of " + t + " active thread(s) in " + time + " ms");
	    
		}

}
