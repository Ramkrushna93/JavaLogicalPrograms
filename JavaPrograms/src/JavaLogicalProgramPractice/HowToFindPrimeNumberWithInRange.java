		package JavaLogicalProgramPractice;

public class HowToFindPrimeNumberWithInRange {
	
	public static boolean IsPrimeNumber(int num) {
		
		if(num<=1) {
			
			return false;
		}
		
		for(int i=2 ; i<num ; i++ ) {
			
			if(num%i==0) {
				
				return false;
			}
		}
			return true;
	}
	
	public static void getPrimeNumber(int num) {
		
		for(int i=2 ; i<=num ;i++) {
			if(IsPrimeNumber(i)) {
				System.out.println(i+"");
			}
		}
	}



   public static void main(String[] args) {
	   
	   getPrimeNumber(20);
	   getPrimeNumber(50);
	   
   }
}