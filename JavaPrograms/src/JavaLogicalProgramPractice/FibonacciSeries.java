package JavaLogicalProgramPractice;

public class FibonacciSeries {
	
	//Using for loop
	
	public static void main(String[] args) {
		
		int maximumnumber = 10;
		int previousnumber = 0;
		int nextnumber = 1;
		
		System.out.println("Fibonacci Series of"+maximumnumber+" number:");
		
		for(int i = 1; i<maximumnumber; ++i) {
			
			System.out.println(previousnumber+" ");
			
			/* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */
			
			int sum=previousnumber+nextnumber;
			previousnumber = nextnumber;
			nextnumber = sum;
		}
	}

}
