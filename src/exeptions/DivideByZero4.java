package exeptions;

import java.util.Scanner;

public class DivideByZero4 {

	public static void main(String[] args)  throws DivideByZeroException{
		// TODO Auto-generated method stub
		int numerator=40;
		int denominator=0;
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {
			System.out.println("Enter numerator: ");
			numerator= scan.nextInt();
			System.out.println("Enter numerator: ");
			denominator = scan.nextInt();
		
			if(denominator==0) {
				throw new DivideByZeroException("Zero Divisor");
			}
				System.out.println("Answer: "+ numerator/denominator);
				break;
				
				
			}
			catch(DivideByZeroException exception){
				System.out.println("Attempted to divide by zero, olease try again ");
				System.out.println("Exeption details:" +exception.getMessage());
			}
			
		}
		

	}

}
