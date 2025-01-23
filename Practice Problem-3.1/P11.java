import java.util.*;
class P11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//taking inputs
		double total = 0.0d;
		double userValue = sc.nextDouble();
		
		while (true) {
			if (userValue == 0 || userValue < 0)
				break;
			total += userValue;
			userValue = sc.nextDouble();
		}
		
		System.out.println("the total value is " + total);
	
		sc.close();
	}
}