package exeptions;

public class DivideByZero {
	public static void main(String[] args) {
		int numerator=40;
		int denominator=0;
		try {
			System.out.println("Answer:" +numerator/denominator);
		}
		catch (ArithmeticException e){
			System.out.println("Attempted to divide by zero");
		}
		finally {
			System.out.println("This will  be printed");
			}
		}
			
		
		
		
		
//		method1(numerator, denominator);
//		System.out.println("This will not be printed");
//	}
//		
//	static void method1(int num, int denom) {
//		method2(num, denom);
//		System.out.println("This will not be printed either");
//		
//	}
//	static void method2(int num, int denom) {
//		int div=num/ denom;
//		System.out.println("no chances here as well");
//		
//		}

}
