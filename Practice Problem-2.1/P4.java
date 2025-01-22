public class P4 { //ProfirAndLoss
    
    public static void main(String[] args) {
        
        //cost price and selling price
        int cp = 129;
        int sp = 191;

        System.out.println("The Cost Price is INR " + cp + " and Selling Price is INR " + sp + "\n" + "The Profit is INR "
                + (sp - cp) + " and the Profit Percentage is " + (((double) (sp - cp) / cp) * 100));
                        
    }
}
