import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(105, "Phone", "Electronics"),
            new Product(102, "Shirt", "Clothing"),
            new Product(108, "Book", "Education"),
            new Product(101, "Laptop", "Electronics"),
            new Product(104, "Shoes", "Footwear")
        };

        // Sort for binary search
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        int searchId = 104;

        // Linear Search
        Product result1 = Search.linearSearch(products, searchId);
        System.out.println("Linear Search: " + (result1 != null ? result1 : "Product not found"));

        // Binary Search
        Product result2 = Search.binarySearch(products, searchId);
        System.out.println("Binary Search: " + (result2 != null ? result2 : "Product not found"));
    }
}
