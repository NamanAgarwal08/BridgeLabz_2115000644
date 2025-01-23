import java.util.*;
class P1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//taking input
		int number = sc.nextInt();
		if(number%5 ==0)
			System.out.println("Is the number "+number+" divisible by 5? Yes");
		else
			System.out.println("Is the number " + number + " divisible by 5? No");
			
		sc.close();
	
	}

}