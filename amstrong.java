package javalearning;
import java.util.Scanner;
public class amstrong {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=scanner.nextInt();
		int originalnumber=n;
		int numdigits=0;
		while(n!=0) {
			n/=10;
			numdigits++;
		}
		n=originalnumber;
		int temp=n;
		double sum=0;
		while(temp!=0) {
			int digit=temp%10;
			sum=sum+Math.pow(digit,numdigits);
			temp/=10;
		}
		if(sum==originalnumber) {
			System.out.println("it is an amstrong number");
		}else {
			System.out.println("it is not a amstrong");
		}
		scanner.close();
	}

}
