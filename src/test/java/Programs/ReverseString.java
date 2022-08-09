package Programs;

public class ReverseString {

	public static void main(String[] args) {
		String s ="Bhuhb";
		String e ="";
		
		for(int i=s.length()-1;i>=0;i--) {
			e=e+s.charAt(i);
			
		}

		System.out.println(e);
		if(s.equalsIgnoreCase(e)&&s.equals(e)) {
			System.out.println("pali");
		}
		else {
			System.out.println("not pali");
		}
			
	}

}
 