import java.util.*;

public class ItemCalculator {
    public static void printItems(ArrayList<Item> items) {
        for (Item a : items)
            System.out.println(a.getName() + " costs " + a.getPrice());
    }

    public static double averagePrice(ArrayList<Item> prices) {
        double sum = 0;

        for (Item a : prices) {
            sum += a.getPrice();
        }

        return sum / prices.size();
    }

    public static Item mostExpensive(ArrayList<Item> prices) {
        Item expensive = prices.get(0);

        for (Item a : prices) {
            if (a.getPrice() > expensive.getPrice()) {
                expensive = a;
            }
        }
        return expensive;
    }

    public static void main(String[] args) {
        ArrayList<Item> prices = new ArrayList<>();

        prices.add(new Item("Shirt", 14.99));
        prices.add(new Item("Bananas", 99.99));
        prices.add(new Item("Diaper", 2.99));

        printItems(prices);
        System.out.println("Average price: " + averagePrice(prices));
        System.out.println("Most expensive item: " + mostExpensive(prices).getName());
    }
}