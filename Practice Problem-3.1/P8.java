import java.util.*;
class P8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//taking input
		int counter = sc.nextInt();

		while (counter >= 1) {
			System.out.println(counter);
			counter--;
		}
		
		sc.close();
	}
}