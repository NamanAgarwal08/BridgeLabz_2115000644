import java.util.*;
class P11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//taking inputs
		double principal = sc.nextDouble();
		double rate = sc.nextDouble();
		double time = sc.nextDouble();
		//calculating simple interest
		double simpleInterest = (principal*time*rate)/100;
		//printing results
		System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
	
	}
}