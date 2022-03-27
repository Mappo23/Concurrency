package counters;

public class Multi extends Thread {
	
	public Multi() {
		
	}
	

	
	//implementing run method
	@Override
	public void run() {
		
		
		while( Exer_1_1.counter.get() < Exer_1_1.upperBound){
			
			if (isPrime((int)Exer_1_1.counter.getAndIncrement())) {
			
			
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
		System.out.println(n);
		return true;	
	}
	
	
}
