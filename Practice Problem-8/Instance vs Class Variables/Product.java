public class Product {

    private String productName;
    private int productPrice;

    static int totalProducts = 0;

    //parameterized Constructor
    public Product(String productName, int productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
        Product.totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + this.productName + "\nProduct Price: " + this.productPrice);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + Product.totalProducts);
    }

    public String getProductName(){
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return this.productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

}