public class P7 {
    
    public static void main(String[] args) {
        
        //radius in kilometer
        int radiusKilo = 6378;

        //radius in miles
        double radiusMiles = (double)6378 / 1.6;

        double pi = 3.14159;

        double volKilo = pi * 4 / 3 * Math.pow(radiusKilo, 3);
        double volMiles = pi * 4 / 3 * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is "+ volKilo + " and cubic miles is " + volMiles);
    }
}
