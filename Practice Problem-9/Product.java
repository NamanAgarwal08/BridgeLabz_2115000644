class Product {
    static int discount = 5;
    String productName;
    int price;
    int quantity;
    final int productID;

    Product() { // default contructor
        this("abc", 123, 500, 345);
    }

    Product(String productName, int price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(int dis) {
        discount = dis;
    }

    void displayDetails(Object b) {
        if (b instanceof Product) {
            System.out.println("Discount is : " + discount);
            System.out.println("Product Name is : " + productName);
            System.out.println("Price is : " + price);
            System.out.println("Quantity is : " + quantity);
        } else
            System.out.println("Not an instance of Product class");
    }
}