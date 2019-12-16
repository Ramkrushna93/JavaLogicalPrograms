package ArrayLogicalPrograms;

public class HowToMissingNumberInArray {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,5,6,7,9,10};
		
		int sum=0;
		
		for(int i=0; i<a.length; i++) {
			
			sum=sum+a[i];	
		}
		
		int sum1=0;
		for(int j=1; j<=10; j++) {
			
			 sum1=sum1+j;
		}
		
		System.out.println("Missing Number in Array   "+(sum1-sum));
	}

}
