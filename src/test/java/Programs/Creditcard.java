package Programs;

import java.util.Scanner;

public class Creditcard {
	public static void main(String[] args) {
		
		System.out.println("Enter credit score :");
		Scanner s = new Scanner(System.in);
		int credit = s.nextInt();
		if(credit< 400||credit>850) {
			System.out.println("invalid");
		}
		else if (credit>= 400 && credit<600) {
			System.out.println("silver");
		}
	}

}
