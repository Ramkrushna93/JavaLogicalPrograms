package JavaLogicalProgramPractice;

public class HowToFindPlainDroneNumber {
	
	public static void FindPlainDroneNumber(int num) {
		
		System.out.println("PlainDroneNumber " +num);
		
		int r=0;
		int sum=0;
		int t;
		
		t=num;
		
		while(num>0) {
			r=(num%10);
			sum=(sum*10)+r;
			num=num/10;
		}
		
		if(t ==sum) 
			System.out.println(" plaindrone Number");
		else 
			System.out.println("  not plaindrone Number");
		
	}
	
	public static void main(String[] args) {
		FindPlainDroneNumber(151);
		FindPlainDroneNumber(152);
		FindPlainDroneNumber(161);
		FindPlainDroneNumber(1000);
	}

}
