import java.util.*;
class P5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//taking input
		int age = sc.nextInt();

		if(age >= 18)
			System.out.println("The person's age is "+age+" and can vote.");
		else
			System.out.println("The person's age is " + age + " and cannot vote.");
			
		sc.close();
	}
}