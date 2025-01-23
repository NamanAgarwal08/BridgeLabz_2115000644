import java.util.*;
class P17{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//taking input
		double salary = sc.nextDouble();
		int year = sc.nextInt();
		double bonusAmount = 0.0d;

		if(year > 5)
			bonusAmount = 0.05 * salary;
			
		System.out.println("The bonus amount is : " + bonusAmount);
		
		sc.close();
	}
}