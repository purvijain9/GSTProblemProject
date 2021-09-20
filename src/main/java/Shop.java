import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products;


    Shop() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getAllProduct() {
        return products;
    }

    // To get all GST Eligible Products
    public ArrayList<Product> getAllGstProducts() {
        ArrayList<Product> gstProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.isProductElibleForGst())
                gstProducts.add(product);
        }
        return gstProducts;
    }

    //To get products having price more than 2000 including GST
    public List<Product> getGstProductHavingPriceMoreThan2000(int amount) {
        List<Product> gstProducts = new ArrayList<>();
        for (Product product1 : getAllProduct()) {
            if (calculateGstAndGetTotalPrice(product1) > amount) {
                gstProducts.add(product1);
            }
        }
        return gstProducts;
    }

    // To calculate GST
    public long calculateGstAndGetTotalPrice(Product product) {
        long gstAmount = (product.getBasePrice() * product.getProductGstPercenatge()) / 100;
        return product.getBasePrice() + gstAmount;
    }
}

