import java.util.*;

abstract class ProductCategory {
    private String name;

    public ProductCategory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class BookCategory extends ProductCategory {
    public BookCategory(String name) {
        super(name);
    }
}

class ClothingCategory extends ProductCategory {
    public ClothingCategory(String name) {
        super(name);
    }
}

class GadgetCategory extends ProductCategory {
    public GadgetCategory(String name) {
        super(name);
    }
}

class Product<T extends ProductCategory> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

public class Marketplace {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountAmount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discountAmount);
        System.out.println("Discount applied: " + percentage + "% off on " + product.getName());
    }

    public static void main(String[] args) {
        List<Product<?>> catalog = new ArrayList<>();
        Product<BookCategory> book = new Product<>("Java Programming", 500, new BookCategory("Science"));
        Product<ClothingCategory> shirt = new Product<>("Formal Shirt", 1200, new ClothingCategory("Men"));
        Product<GadgetCategory> phone = new Product<>("Smartphone", 25000, new GadgetCategory("Mobile"));
        catalog.add(book);
        catalog.add(shirt);
        catalog.add(phone);
        applyDiscount(book, 10);
        applyDiscount(shirt, 15);
        applyDiscount(phone, 5);
        for (Product<?> p : catalog) {
            System.out.println(p.getName() + " - " + p.getPrice() + " - " + p.getCategory().getName());
        }
    }
}
