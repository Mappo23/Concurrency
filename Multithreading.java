package counters;

import java.util.Scanner;

//Exercise 1.1
public class Multithreading {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Upper bound:");
	    int n = scanner.nextInt(); 
	    
	    System.out.println("Number of threads:");
	    int t = scanner.nextInt();
	    scanner.close();
	    
	    int slice = (n/t);
		
	    int counter = 0;
	    
	    long time = System.currentTimeMillis();
	    
	    //Threads declaration
	    Multithread[] T = new Multithread[t];
	    
	    //Threads creation + ignition
	    for (int i = 0; i < t; i++) {
	    	
	    counter += slice;
	    
	    T[i] = new Multithread((counter-slice), counter);
	    
		T[i].start();
		
	    }
	    
	    
	    // Wait for threads completion
	 	for (int i = 0; i < t; i++) {
	 	  try {
	 		 T[i].join();
	 		} catch (InterruptedException e) {
	 			}
	 		}
	       
	    
	   
	    time = System.currentTimeMillis() - time;
	    
	    System.out.println("Finished with total of " + t + " active thread(s) in " + time + " ms");
	    
	}

}
