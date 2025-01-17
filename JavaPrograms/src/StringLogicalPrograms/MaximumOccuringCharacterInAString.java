package StringLogicalPrograms;

public class MaximumOccuringCharacterInAString {
	
	// Java implementation to find 
	// the maximum occurring character in 
	// an input string which is lexicographically first 
	  
	// function to find the maximum occurring character in 
	// an input string which is lexicographically first 
	    static char getMaxOccurringChar(char str[]) { 
	        // freq[] used as hash table 
	        int freq[] = new int[256]; 
	  
	        // to store maximum frequency 
	        int max = -1; 
	  
	        // to store the maximum occurring character 
	        char result = 0; 
	  
	        // length of 'str' 
	        int len = str.length; 
	  
	        // get frequency of each character of 'str' 
	        for (int i = 0; i < len; i++) { 
	            if (str[i] != ' ') { 
	                freq[str[i] - 'a']++; 
	            } 
	        } 
	  
	        // for each character, where character is obtained by 
	        // (i + 'a') check whether it is the maximum character 
	        // so far and accodingly update 'result' 
	        for (int i = 0; i < 256; i++) { 
	            if (max < freq[i]) { 
	                max = freq[i]; 
	                result = (char) (i + 'a'); 
	            } 
	        } 
	  
	        // maximum occurring character 
	        return result; 
	    } 
	  
	// Driver Code 
	    public static void main(String[] args) { 
	        char str[] = "sample programm".toCharArray(); 
	        System.out.println("Maximum occurring character = "
	                + getMaxOccurringChar(str)); 
	    } 
	}  


