import java.util.Scanner;
public class P8 { //3Friends
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of 3 friends:");
        int age[] = new int[3];
        int height [] =new int[3];
        for(int i=0;i<3;i++)
        {
            age[i]=sc.nextInt();
        }
        System.out.println("enter the heights of 3 friends:");
        for(int i=0;i<3;i++)
        {
            height[i]=sc.nextInt();
        }
        System.out.println("Youngest: "+youngest(age));
        System.out.println("Tallest: " + tallest(age));
        
        sc.close();
    }
    static String youngest(int age[])
    {
        if(age[0]<age[1] && age[0]<age[2])
        return "Amar";
        else if(age[1]<age[0] && age[1]<age[2])
        return "Akbar";
        else
        return "Anthony";
    }
    static String tallest(int height[])
    {
        if(height[0]>height[1] && height[0]>height[2])
        return "Amar";
        else if(height[1]>height[0] && height[1]>height[2])
        return "Akbar";
        else
        return "Anthony";
    }
}
