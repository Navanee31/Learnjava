import java.util.Scanner;
public class StudentInfo
{
	public static void main(String[] args)
	{
	Scanner scanner=new Scanner(System.in);

	System.out.println(" enter name : ");
	String stdName=scanner.next();

	System.out.println(" enter age : ");
	int stdAge=scanner.nextInt();

	System.out.println(" enter marks : ");
	double marks=scanner.nextDouble();


	System.out.println(" enter passed (true/false): ");
	boolean isPassed=scanner.nextBoolean();

	System.out.println(" enter gender : ");
	char gender=scanner.next().charAt(0);

	System.out.println("Student Name : "+stdName);
	System.out.println("Student Age : "+stdAge);
	System.out.println("Student marks : "+marks);
	System.out.println("Student is passed: "+isPassed);
	System.out.println("Student gender : "+gender);


	}
}
