
public class P12 { // Random
    public static void main(String[] args) {
        
        // double r[] = new double[5];
        // double ans[] = new double[3];
        int digit[] = generate4DigitRandomArray(5);
        System.out.println("random numbers are: ");
        for(int i:digit)
        {
            System.out.print(i+" , ");
        }
        System.out.println(" ");
        double output[] = findAverageMinMax(digit);
        System.out.println("Avg value: "+output[0]);
        System.out.println("Min value: "+output[1]);
        System.out.println("Max value: " + output[2]);
        
        
    }
    static int[] generate4DigitRandomArray(int size)
    {
        int a[] = new int[size];
        for(int i=0;i<size;i++)
        {
            a[i] =(int) Math.random()*9000+1000;
        }
        return a;
    }
    static double[] findAverageMinMax(int[] numbers)
    {
        int max =numbers[0], min = numbers[0],avg =numbers[0];
        for(int i :numbers)
        {
            avg +=i;
            max = Math.max(max,i);
            min = Math.min(min,i);
        }
        double a[] =new double[3];
        a[0]= avg/numbers.length;
        a[1] = min;
        a[2] = max;
        return a;
    }
}
