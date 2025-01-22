public class P6 {
    
    public static void main(String[] args) {
        
        int fees = 125000;
        int discountPercentage = 10;
        
        double discount = (double) discountPercentage / 100 * 125000;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + (fees - discount));
    }
}
