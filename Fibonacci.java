package javalearning;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of terms in fibanocci series");
		int numberofterms=scanner.nextInt();
		int firstTerm=0;
		int secondTerm=1;
		System.out.println("fibanocci series");
		System.out.print(firstTerm+" "+secondTerm+" ");
		for(int i=2;i<numberofterms;i++) {
			int nextTerm=firstTerm+secondTerm;
			System.out.print(nextTerm+" ");
			firstTerm=secondTerm;
			secondTerm=nextTerm;
		}
		scanner.close();
	}

}
