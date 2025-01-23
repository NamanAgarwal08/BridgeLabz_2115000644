import java.util.*;
class P10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// taking input
		double total = 0.0d;
		double uservalue = sc.nextDouble();

		while (uservalue != 0) {
			total += uservalue;
			uservalue = sc.nextDouble();
		}
		
		System.out.println("the total value is " + total);
	
		sc.close();
	}
}