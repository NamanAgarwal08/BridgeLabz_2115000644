import java.util.Scanner;
public class P7 { //Vote
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]= new int[10];
        System.out.println("Enter the age of 10 people.");
        for(int i=0;i<10;i++)
        {
            a[i]= sc.nextInt();
            if(a[i]<0)
            {
                System.out.println("Do not enter negetive numbers, ente again.");
                a[i] = sc.nextInt();
            }
        }
        for(int i:a)
        {
            System.out.println((i + 1) + " aged person " + canVote(i));
        }
        
        sc.close();
    }
    static String canVote(int a)
    {
        if(a>18)
        return "can vote.";
        else 
        return "can not vote.";
    }
}
