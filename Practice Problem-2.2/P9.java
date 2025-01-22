import java.util.*;
class P9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();
		int totalRounds = 5000/(side1+side2+side3);
		System.out.println("The total number of rounds the athele will run is "+totalRounds+" to complete 5km");
	}
}