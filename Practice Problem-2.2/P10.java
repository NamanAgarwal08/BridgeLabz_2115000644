import java.util.*;
class P10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numberOfChocolates = sc.nextInt();
		int numberOfChildren = sc.nextInt();
		//number of chocolates each child gets
		int chocolatesEach = numberOfChocolates/numberOfChildren;
		//remaining chocolates
		int remainChocolates = numberOfChocolates%numberOfChildren;
		//printing the result
		System.out.println("The number of chocolates each child gets is "+chocolatesEach+" and the number of remaining chocolates are "+remainChocolates);
	}

}