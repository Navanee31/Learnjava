package javalearning;
import java.util.Scanner;
public class Pallindro {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number");
		int number=scanner.nextInt();
		if(number<0) {
			number=-(number);
		}
		int originalNumber=number;
		int reverseNumber=0;
		while(number!=0) {
			int lastdigit=number%10;
			reverseNumber=reverseNumber*10+lastdigit;
			number/=10;
		}
		if(originalNumber==reverseNumber) {
			System.out.println(originalNumber+ " is palindome number");
		}else {
			System.out.println("not a palindom");
		}
	}

}