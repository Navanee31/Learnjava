package javalearning;

import java.util.Scanner;

public class DayName {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("======================");
		System.out.println("    Day Name program    ");
		System.out.println("======================");
		System.out.println();
		System.out.println("Enter day number(1=monday,7=sunday) : ");
		int dayNumber=scanner.nextInt();
		System.out.println();
		if(dayNumber<1||dayNumber>7) {
			System.out.println("Entered wrong");
		} else {
			String dayName;
			String dayType;
			switch(dayNumber){
			case 1:
				dayName="monday";
				break;
			case 2:
				dayName="tuesday";
				break;
			case 3:
				dayName="wednessday";
				break;
			case 4:
				dayName="thursday";
				break;
			case 5:
				dayName="friday";
				break;
			case 6:
				dayName="saturday";
				break;
			case 7:
				dayName="sunday";
				break;
			default:
				dayName="unknown";
				break;
			}
			if(dayNumber==6||dayNumber==7) {
				dayType="weekend";
			}else {
				dayType="weekday";
			}
			System.out.println("==============");
			System.out.printf("day %d is %s (%s)%n", dayNumber,dayName,dayType);
			System.out.println("==============");
		}
		scanner.close();

	}

}
