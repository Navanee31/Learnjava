package javalearning;
import java.util.Scanner;
public class MenuCalc {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean running=true;
		System.out.println("======Calculator V3.0=======");
		while(running) {
			System.out.println();
			System.out.println("select operation :");
			System.out.println(" 1. addition (+)");
			System.out.println(" 2. substraction (-)");
			System.out.println(" 3. multiplication (*)");
			System.out.println(" 4. division (/)");
			System.out.println(" 5. mod (%)");
			System.out.println(" 6. Exit");
			System.out.println("Enter choice(1-6) :");
			int choice=scanner.nextInt();
			if(choice==6) {
				System.out.println("Thank you");
				running=false;
			}else {
				if(choice>=1&&choice<=5) {
					System.out.println("enter first number");
					int num1=scanner.nextInt();
					System.out.println("enter second number");
					int num2=scanner.nextInt();
					int result=0;
					String operation="";
					boolean isValid=true;
					switch(choice) {
					case 1:
						result=num1+num2;
						break;
					case 2:
						result=num1-num2;
						break;
					case 3:
						result=num1*num2;
						break;
					case 4:
						if(num2!=0) {
							result=num1/num2;
						}else {
							System.out.println("Cannot divide with zero");
							isValid=false;
						}
						break;
					case 5:
						if(num2!=0) {
							result=num1%num2;
						}else {
							System.out.println("Cannot divide with zero");
							isValid=false;
						}
						break;	
					}
				}
			}
		}
		

	}

}
