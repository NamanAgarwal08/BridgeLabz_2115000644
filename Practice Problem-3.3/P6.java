import java.util.*;
class P6{ //Calculator
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//input
		double first = sc.nextDouble();
		double second = sc.nextDouble();

		String op = sc.next();

		switch (op) {
			case "+":
				System.out.println(first + second);
				break;
			case "-":
				System.out.println(first - second);
				break;
			case "*":
				System.out.println(first * second);
				break;
			case "/":
				System.out.println(first / second);
				break;
			default:
				System.out.println("Invalid Operator");
				break;
		}
		
		sc.close();
	}
}