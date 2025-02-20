import java.util.*;

public class ShoppingCart {
    HashMap<String, Integer> prices = new HashMap<>();
    ArrayList<String> items = new ArrayList<>();

    public void addItem(String item, int price) {
        prices.put(item, price);
        items.add(item);
    }

    public void displaySortedByPrice() {
        ArrayList<String> sortedItems = new ArrayList<>(items);
        Collections.sort(sortedItems, (a, b) -> prices.get(a) - prices.get(b));
        for (String item : sortedItems) {
            System.out.println(item + ": " + prices.get(item));
        }
    }
}
