import java.util.*;
class P1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double number1 = sc.nextDouble();
		double number2 = sc.nextDouble();
		double quotient = number1/number2;
		double remainder = number1%number2;
		System.out.println("The Quotient is "+quotient+" and Remainder is "+remainder+" of two number "+number1+" and "+number2);
	}
}