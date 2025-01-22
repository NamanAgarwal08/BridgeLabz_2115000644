import java.util.*;
class P4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double celsius = sc.nextDouble();
		double farenheitResult = celsius*((double)9/5)+32;
		System.out.println("The "+celsius+" celsius is "+farenheitResult+" fahrenheit");
	}
}