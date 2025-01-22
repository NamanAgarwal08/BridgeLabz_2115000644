import java.util.*;
class P5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double fahrenheit = sc.nextDouble();
		double celsiusResult = (fahrenheit-32)*((double)5/9);
		System.out.println("The "+fahrenheit+" fahrenheit is "+celsiusResult+" celsius");
	}
}