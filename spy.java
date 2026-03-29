package javalearning;
import java.util.Scanner;
public class spy {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scanner.nextInt();
		int originalnumber=number;
		int sum=0;
		int product=1;
		while(number!=0) {
			int digit=number%10;
			sum+=digit;
			product*=digit;
			number/=10;
		}
		if(sum==product) {
			System.out.println("it is a spy number");
		}else {
			System.out.println("it is not a spy number");
		}
	}

}
