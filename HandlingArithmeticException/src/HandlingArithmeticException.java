import java.util.Scanner;
public class HandlingArithmeticException {
	public static void main(String[] args) {
		int dividend,divisor,quotient;
		int flag=0;
		Scanner scnr=new Scanner(System.in);
		System.out.println("Enter Dividend: ");
		dividend=scnr.nextInt();
		
		while(flag==0) {
			System.out.println("Enter Divisor: ");
			divisor=scnr.nextInt();
			
			try {
				quotient=dividend/divisor;
				flag=1;
				System.out.println(quotient);
				break;
			}catch(ArithmeticException e) {
			
			}
		}
	}
}
