package JavaLogicalProgramPractice;

public class HowToSwippingTwoNos {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		System.out.println("Before swapping two number are "+a+"    "+b);
		
	// 1st logic using 3rd variable
		
//		int t=a;
//		a=b;
//		b=t;
//		
//		System.out.println("After swapping two number are   "+a+"     "+b);
//		
	//	2nd logic using + & - without using 3rd variable
		
		System.out.println("Before swapping two number are "+a+"    "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping two number are   "+a+"     "+b);
		
	}

}
