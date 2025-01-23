import java.util.*;
class P16{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//taking input
		int number = sc.nextInt();

		for (int i = 1; i <= number; i++) {
			if (i % 2 == 1)
				System.out.println("The number " + i + " is odd");
			else
				System.out.println("The number " + i + " is even");
		}
		
		sc.close();
	}
}