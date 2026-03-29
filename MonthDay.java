package javalearning;
import java.util.Scanner;
public class MonthDay {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("====month day====");
		System.out.println("enter month number(1-12)");
		int month=scanner.nextInt();
		System.out.println("enter year");
		int year=scanner.nextInt();
		if(month<1||month>12) {
			System.out.println("ERROR : shoulb be 1 to 12");
		}else {
			String monthname;
			int days;
			switch(month) {
			case 1:
				monthname="JANUARY";
				days=31;
				break;
			case 2:
				monthname="FEBUARY";
				if((year%4==0&&year%100!=0)||(year%400==0)) {
					days=29;
				}else {
					days=28;
				}
				break;
			case 3:
				monthname="MARCH";
				days=31;
				break;
			case 4:
				monthname="APRIL";
				days=31;
				break;
			case 5:
				monthname="MAY";
				days=30;
				break;
			case 6:
				monthname="JUNE";
				days=30;
				break;
			case 7:
				monthname="JULY";
				days=31;
				break;
			case 8:
				monthname="AUGUST";
				days=31;
				break;
			case 9:
				monthname="SEPTEMBER";
				days=30;
				break;
			case 10:
				monthname="OCTOBER";
				days=31;
				break;
			case 11:
				monthname="NOVEMBER";
				days=30;
				break;
			case 12:
				monthname="DECEMBER";
				days=31;
				break;	
			default:
				monthname="unknown";
				days=0;
				break;
			}
			System.out.printf("%s %d has %d days.%n", monthname,year,days);
		}
		scanner.close();
	}

}
