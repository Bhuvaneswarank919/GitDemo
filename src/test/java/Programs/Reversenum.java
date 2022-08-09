package Programs;

public class Reversenum {

	public static void main(String[] args) {
		int n= 12345;
		int rem =0;
		
		while(n>0) {
			
			rem= rem*10+n%10;
			n=n/10;
			
			// rem= (0*10)+12345%10 = 5 
			// n=1234/10 
			
			//rem= (5*10)+1234%10=4
			//
			
			
			
			
		}
System.out.println(rem);
	}

}
