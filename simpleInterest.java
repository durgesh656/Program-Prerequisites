import java.util.Scanner;

public class simpleInterest{
	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		
		double principle=sc.nextDouble();
		
		double rate=sc.nextDouble();
		
		double time=sc.nextDouble();
		
		double interest= principle*time*rate/100;
		
		System.out.println("The interest is"+interest);
		
		
		
			
		}
}
