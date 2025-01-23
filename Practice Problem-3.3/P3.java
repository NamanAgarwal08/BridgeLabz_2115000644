import java.util.*;
class P3{ //HarshadNumber
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//take input of number
		int number = sc.nextInt();

		int sum = 0;
		int originalNumber = number;

		while (number > 0) {
			sum += number % 10;
			number = number / 10;
		}
		
		if(originalNumber % sum == 0)
			System.out.println("Harshad Number");
		else
			System.out.println("Not a Harshad Number");

		sc.close();
	}
}