import java.util.Scanner;
public class Calculator
{
	public static void main(String[] args)
	{
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("enter first number :");
	 double num1= scanner.nextDouble();
	 System.out.println("select the operator : +,-,*,/,%");
	 char operator= scanner.next().charAt(0);
	 System.out.println("enter second number :");
	 double num2= scanner.nextDouble();
	 double result=0;
	 if(operator == '+'){
	    result = num1+num2;
	 }
	 else if(operator == '-'){
	     result = num1-num2;
	 }
	 else if(operator == '/'){
	     result = num1/num2;
	 }
	 else  if(operator == '%'){
	      result = num1%num2;
	 }
	 else{
  	       System.out.println("INVALID OPERATOR");
	       return;
	 }
	 System.out.println("result :"+result);
	 
	}
}