import java.util.*;
class P4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//take input
		int number = sc.nextInt();

		int sum = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0)
				sum += i;
		}
		
		if(sum > number)
			System.out.println("Abundant Number");
		else
			System.out.println("Not a Abundant Number");

		sc.close();
	}
}