package javalearning;
import java.util.Scanner;

public class Eligible {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Eligibility checking system");
		System.out.println();
		System.out.println("enter ur name :");
		String name=scanner.nextLine();
		System.out.println("enter ur age :");
		int age=scanner.nextInt();
		System.out.println();
		if(age<1||age>120) {
			System.out.println("error");
			} else {
				System.out.printf("Name : %s%n", name);
				System.out.printf("Age :%d years%n", age);
				if(age>=5&&age<=18) {
					System.out.println("eligible for school education");
				}else {
					if(age>=18) {
						System.out.println("eligible for driving ");
					}
				}
		}
		
	}

}
