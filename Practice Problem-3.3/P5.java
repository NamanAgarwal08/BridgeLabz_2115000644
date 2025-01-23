import java.util.*;
class P5{ //DayOfWeek
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//taking input dates
		int m = sc.nextInt();
		int d = sc.nextInt();
		int y = sc.nextInt();

		//calculating day
		int yo = y-(14-m)/12;
		int x = yo+yo/4-yo/100+yo/400;
		int mo = m + 12*((14-m)/12)-2;
		int do1 = (d + x + 31 * mo / 12) * m % 7;
		
		if(do1 == 0)
			System.out.println("Sunday");
		if(do1 == 1)
			System.out.println("Monday");
		if(do1 == 2)
			System.out.println("Tuesday");
		if(do1 == 3)
			System.out.println("Wednesday");
		if(do1 == 4)
			System.out.println("Thursday");
		if(do1 == 5)
			System.out.println("Friday");
		if(do1 == 6)
			System.out.println("Saturday");
			
		sc.close();
	}
}