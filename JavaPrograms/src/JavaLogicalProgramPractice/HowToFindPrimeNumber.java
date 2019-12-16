package JavaLogicalProgramPractice;

public class HowToFindPrimeNumber {
	
	public static boolean PrimeNumber(int num) {
		
		if(num<=1) { 
		
		return false;
		}
		
		for(int i=2 ; i<num;i++) {
			
			
			if(num%i==0) {
				
				return false;
			}
		}
			return true;

	}
	
	
	public static void main(String[] args) {
		System.out.println("13 is the primenumber-------->"+PrimeNumber(13));
		System.out.println("2 is the primenumber--------->"+PrimeNumber(2));
		System.out.println("0 is the primenumber---------->"+PrimeNumber(0));
		System.out.println("3 is the primenumber----------->"+PrimeNumber(3));
		System.out.println("-1 is the primenumber----------->"+PrimeNumber(-1));
		System.out.println("4 is the primenumber------------>"+PrimeNumber(4));
		
	}

}
