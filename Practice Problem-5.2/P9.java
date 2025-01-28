import java.util.Scanner;

public class P9 { //NumberCheck
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[] = new int[5];
        for(int i=0;i<5;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i:a)
        {
            if(isPositive(i)==1)
            {System.out.println(i+ " is positive.");
            if(isEven(i)==1)
            System.out.println(i+ "is Even");
            else
            System.out.println(i+ "is Odd");
            }
            else if(isPositive(i)==-1)
            System.out.println(i+ " is negative.");
            else if(isPositive(i)==0)
            System.out.println(i+ " is Zero.");
        }
        System.out.println(compare(a[0], a[4]));

        sc.close();

    }

    static int isPositive(int a) {
        if (a > 0)
            return 1;
        else if (a < 0)
            return -1;
        else
            return 0;
    }

    static int isEven(int a) {
        if (a % 2 == 0)
            return 1;
        else
            return 0;
    }

    static String compare(int a, int b) {
        if (a > b) {
            return "First number is greater than Last number.";
        } else if (a < b) {
            return "First number is smaller than Last number.";
        } else {
            return "First number is equal to Last number.";
        }
    }

}
