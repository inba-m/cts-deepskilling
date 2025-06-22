import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void sortProducts(Product[] products)
    {
        Arrays.sort(products, Comparator.comparingInt(Product::getProductId));
    }

	public static void main(String[] args) {
        Product[] products = { 
            new Product(1001, "Laptop", "Electronics"),
            new Product(1012, "Handbag", "Fashion"),
            new Product(1023, "Earrings", "Accessories"),
            new Product(1304, "T-shirt", "Apparel"),
            new Product(1001, "Smartwatch", "Electronics"),

        };
        
        //Linear Search
        Product lin = LinearSearch.search(products, 1304);
        System.out.println("Linear search : Product found\n" + lin);

        //Binary Search
        sortProducts(products);
        Product bin = BinarySearch.search(products, 1023);
        System.out.println("Binary search : Product found\n" + bin);
    }
}
