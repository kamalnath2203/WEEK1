import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {
    private Product[] products;
    private Product[] sortedProducts; // For binary search

    public SearchDemo(Product[] products) {
        this.products = products;
        this.sortedProducts = Arrays.copyOf(products, products.length);
        Arrays.sort(sortedProducts, Comparator.comparing(Product::getProductId));
    }

    
    public Product binarySearchById(String productId) {
        int left = 0;
        int right = sortedProducts.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            String midProductId = sortedProducts[mid].getProductId();
            
            if (midProductId.equals(productId)) {
                return sortedProducts[mid];
            } else if (midProductId.compareTo(productId) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; 
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product("P100", "Wireless Mouse", "Electronics", 24.99),
            new Product("P200", "Bluetooth Headphones", "Electronics", 59.99),
            new Product("P300", "Desk Lamp", "Home", 34.50),
            new Product("P400", "Notebook", "Office", 9.99),
            new Product("P500", "Water Bottle", "Kitchen", 19.95)
        };

        SearchDemo search = new SearchDemo(products);
        Product result = search.binarySearchById("P200");
        System.out.println(result != null ? result : "Product not found.");
    }
}