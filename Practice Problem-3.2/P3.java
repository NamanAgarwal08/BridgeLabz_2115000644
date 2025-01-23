import java.util.*;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking marks of each subject
        System.out.println("Enter marks of physics:");
        double p = sc.nextDouble();
        System.out.println("Enter marks of chemistry:");
        double c = sc.nextDouble();
        System.out.println("Enter marks of maths:");
        double m = sc.nextDouble();

        double avg = (p + c + m) / 3;

        if(avg >= 80){
            System.out.println("Grade : A\nRemark : Level-4, above agency-normalized standards.\nMarks : "+avg);
        }else if(avg>=70 && avg<=79){
            System.out.println("Grade : B\nRemark : Level-3, at agency-normalized standards.\nMarks : "+avg);
        }else if(avg>=60 && avg<=69){
            System.out.println("Grade : C\nRemark : Level-2, below, but approaching agency-normalized standards.\nMarks : "+avg);
        }else if(avg>=50 && avg<=59){
            System.out.println("Grade : D\nRemark : Level-1, well below agency-normalized standards.\nMarks : "+avg);
        }else if(avg>=40 && avg<=49){
            System.out.println("Grade : E\nRemark : Level-1, too-below agency-normalized standards.\nMarks : "+avg);
        } else {
            System.out.println("Grade : R\nRemark : Remedial Standards\nMarks : " + avg);
        }
        
        sc.close();
    }    
}
