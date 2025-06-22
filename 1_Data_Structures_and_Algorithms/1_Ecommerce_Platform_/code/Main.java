import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[5];

        products[0] = new Product(1, "Laptop", "Electronics");
        products[1] = new Product(2, "Smartphone", "Electronics");
        products[2] = new Product(3, "Table", "Furniture");
        products[3] = new Product(4, "Chair", "Furniture");
        products[4] = new Product(5, "Book", "Stationery");
        
        System.out.println("Product List:");
        for (Product product : products) {
            System.out.println("Product ID: " + product.productId + ", Name: " + product.productName + ", Category: " + product.category);
        }

        System.out.println("\nPerforming Linear Search for 'Smartphone':");
        for (Product product : products) {
            if (product.productName.equals("Smartphone")) {
                System.out.println("Found: Product ID: " + product.productId + ", Name: " + product.productName + ", Category: " + product.category);
                break;
            }
        }

        // Sorting products by productName using Arrays.sort
        Arrays.sort(products, (p1, p2) -> p1.productName.compareTo(p2.productName));

        System.out.println("\nPerforming Binary Search for 'Smartphone':");
        int left = 0;
        int right = products.length - 1;
        String searchName = "Chair";
        boolean found = false;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].productName.equals(searchName)) {
                System.out.println("Found: Product ID: " + products[mid].productId + ", Name: " + products[mid].productName + ", Category: " + products[mid].category);
                found = true;
                break;
            } else if (products[mid].productName.compareTo(searchName) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Product not found: " + searchName);
        }

        System.out.println("\nResults of Linear Search vs Binary Search:");
        System.out.println("For worst case, the time complexity is O(log n) for binary search, while linear search has a time complexity of O(n).");
    }
}
