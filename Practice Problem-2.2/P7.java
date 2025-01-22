import java.util.*;
class P7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//taking inputs
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		//swapping two numbers
		number1 = number1+number2;
		number2 = number1-number2;
		number1 = number1-number2;
		System.out.println("The Swapped numbers are "+number1+" and "+number2);
	}
}