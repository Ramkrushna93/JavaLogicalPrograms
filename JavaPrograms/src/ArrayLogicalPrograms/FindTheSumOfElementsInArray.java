package ArrayLogicalPrograms;

public class FindTheSumOfElementsInArray {
	
	public static void main(String[] args) {
		
		int a[]= {1,5,10,400,300};
		
		int sum=0;
		
		for(int i=0; i<=a.length-1; i++) {
			
			sum=sum+a[i];
		}
		
		System.out.println("Sum of all elements in array   "+sum);
	}

}
