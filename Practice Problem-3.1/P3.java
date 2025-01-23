import java.util.*;
class P3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//taking input
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();

		if(number1 >= number2 && number1 >= number3)
			System.out.println("Is the first number the largest? Yes\nIs the second number the largest? No\nis the third number the largest? No");
		else if(number2 >= number3 && number2 >= number1)
			System.out.println("Is the first number the largest? No\nIs the second number the largest? Yes\nis the third number the largest? No");
		else if(number3 >= number2 && number3 >= number1)
			System.out.println(
					"Is the first number the largest? No\nIs the second number the largest? No\nis the third number the largest? Yes");
			
		sc.close();
	}
}