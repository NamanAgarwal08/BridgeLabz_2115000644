import java.util.*;
class P6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//taking input
		int number = sc.nextInt();

		if(number > 0)
			System.out.println("positive");
		else if(number < 0)
			System.out.println("negative");
		else	
			System.out.println("zero");

		sc.close();
	}
}