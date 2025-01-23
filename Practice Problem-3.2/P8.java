import java.util.*;

public class P8 { //FindTallestAndYoungest
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declaring variables for age and height
        int age = Integer.MAX_VALUE;
        double height = 0;
        String youngest = "";
        String tallest = "";

        //taking inputs of ages and heights
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter age of friend " + i + ":");
            int x = sc.nextInt();
            System.out.println("Enter height for friend " + i + ":");
            double y = sc.nextDouble();

            if (x < age) {
                age = x;
                if (i == 1) {
                    youngest = "Amar";
                } else if (i == 2) {
                    youngest = "Akbar";
                } else {
                    youngest = "Anthony";
                }
            }

            if (y > height) {
                height = y;
                if (i == 1) {
                    tallest = "Amar";
                } else if (i == 2) {
                    tallest = "Akbar";
                } else {
                    tallest = "Anthony";
                }
            }
        }
        
        System.out.println(
                "Youngest and tallest among three friends is " + youngest + " and " + tallest + " respectively");
        
        sc.close();
    }    
}