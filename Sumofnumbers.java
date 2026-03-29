package javalearning;
import java.util.Scanner;
public class Sumofnumbers {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number");
		int number=scanner.nextInt();
		int originalNumber=number;
		int digitsum=0;
		while(number!=0) {
			int lastdigit=number%10;
			digitsum+=lastdigit;
			number/=10;
		}
		System.out.println("sum of number"+originalNumber+"is="+digitsum);
	}

}
