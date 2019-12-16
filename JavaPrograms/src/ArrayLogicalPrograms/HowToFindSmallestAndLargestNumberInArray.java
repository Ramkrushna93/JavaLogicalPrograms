package ArrayLogicalPrograms;


public class HowToFindSmallestAndLargestNumberInArray {
	
	public static void main(String[] args) {
		
		int number[]= {-100,0,50,-199,-198,100,250};
		
		int largest=number[0];
		int smallest=number[0];
		
		for(int i=0; i<number.length; i++) {
			
			if(number[i]>largest) {
				largest=number[i];	
				
			} else if(number[i]<smallest) {
				smallest=number[i];	
			}
		}
         System.out.println("Largest number in Array "+largest);
         System.out.println("Smallest number in Array "+smallest);
	}

}
