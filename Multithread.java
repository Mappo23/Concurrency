package counters;

public class Multithread extends Thread {
	
	int s = 0; 
	int e = 0;
	
	public Multithread(int s, int e) {
	 this.s = s;
	 this.e = e;
	}
	
	
	//implementing run method
	@Override
	public void run() {
		
		
		for (int i = s; i <= e; i++) {
			
			if (isPrime(i)) {
				
			System.out.println(i);
			
			}
		
		}
		
	}
	
	
	//prime number test function 
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
