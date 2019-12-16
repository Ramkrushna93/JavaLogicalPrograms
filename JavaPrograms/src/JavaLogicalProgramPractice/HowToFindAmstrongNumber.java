package JavaLogicalProgramPractice;

public class HowToFindAmstrongNumber {
	
	public static void amstrongNumber(int num) {
		
	int	cube=0;
	int r;
	int t;
	
	t=num;
	
	while(num>0) {
		
		r=num%10;
		num=num/10;
		cube=cube+(r*r*r);
	}
	
	if(t==cube) {
		System.out.println("It is Amstrong Number");
	} else {
		System.out.println("It Not A Amstrong Number");
	}	
	}
	
	public static void main(String[] args) {
		amstrongNumber(153);
		amstrongNumber(150);
	}

}
