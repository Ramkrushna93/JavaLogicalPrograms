package ArrayLogicalPrograms;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementInArray {
	
	public static void main(String[] args) {
		
		String names[]= {"java"," c#", "python", "ruby", "java"," c++"," c"," purl", "php "};
		
		for(int i=0; i<names.length; i++) {
			
			for(int j=i+1; j<names.length; j++) {
				
				if(names[i].equals(names[j])) {
					
					System.out.println("The Duplicate element "+names[i]);
				}
			}
		}
		
		
	// 2nd approch
		
		int count[]= {1, 2, 3, 4, 5, 6, 7, 5};
		
		for(int i=0; i<count.length; i++) {
			
			for(int j=i+1; j<count.length; j++) {
				
				if(count[i]==count[j]) {
					
					System.out.println("The Duplicate Element are  "+count[j]);
				}
			}
		}
		
	// 3rd is the best approch because it takes less time with Integer
		
		Set<Integer> store=new HashSet<Integer>();
		
		for(int count1: count) {
			
			if(store.add(count1)==false) {
				
			System.out.println("The Duplicate are  "+count1);
		}
		
		}
		
		// 3rd is the best approch because it takes less time with String
		
				Set<String> store1=new HashSet<String>();
				
				for(String name: names) {
					
					if(store1.add(name)==false) {
						
					System.out.println("The Duplicate are  "+name);
				}
				}	
	}
	

}
