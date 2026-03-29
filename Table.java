package javalearning;
import java.util.Scanner;
public class Table {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter table number");
		int number=scanner.nextInt();
		for(int i=20;i>=1;i--) {
			System.out.println(+number+"*"+i+"="+(number*i));
		}
		scanner.close();
	}

}
