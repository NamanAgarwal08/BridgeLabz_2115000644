import java.util.*;
class P18{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//taking input
		int number = sc.nextInt();

		for (int i = 6; i <= 9; i++) {
			System.out.println(number + " * " + i + " = " + (number * i));
		}
		
		sc.close();
	}
}