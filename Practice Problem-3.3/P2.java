import java.util.*;
class P2{ //CountDigits
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//take input of the number
		int number = sc.nextInt();
		int count = 0;

		while (number > 0) {
			count++;
			number = number / 10;
		}
		
		System.out.println("The number of digits are " + count);
		
		sc.close();
	}
}