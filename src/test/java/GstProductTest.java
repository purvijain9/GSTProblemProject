import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GstProductTest {

    Shop products;


    @Test
    public void verifyAllProduct() {
        //Arrange
        products = new Shop();
        Product laptop = new Laptop("Laptop", "HP", "Black", 60000, true);
        Product mobile = new Mobile("Mobile", "Poco", "Silver", 6000, true);
        Product mouse = new Mouse("Mouse", "Dell", "Black", 500, false);
        Product television = new Television
                ("LG-4KHD", "LG", "Black", 45000, true);
        //Act
        products.addProduct(laptop);
        products.addProduct(mobile);
        products.addProduct(mouse);
        products.addProduct(television);
        //Assertion
        List<Product> product = products.getAllProduct();
        for (Product product1 : product) {

            Assert.assertTrue(product1 instanceof Laptop || product1 instanceof Mobile || product1 instanceof Mouse
                    || product1 instanceof Television);

        }

    }

    @Test
    public void getProductsWithGst() {
        //Arrange
        products = new Shop();
        Product laptop = new Laptop("Laptop", "HP", "Black", 60000, true);
        Product mobile = new Mobile("Mobile", "Poco", "Silver", 6000, true);
        Product mouse = new Mouse("Mouse", "Dell", "Black", 500, false);
        Product television = new Television
                ("LG-4KHD", "LG", "Black", 45000, true);
        //Act
        products.addProduct(laptop);
        products.addProduct(mobile);
        products.addProduct(mouse);
        products.addProduct(television);
        //Assertion
        List<Product> product = products.getAllGstProducts();
        for (Product product1 : product) {
            Assert.assertTrue(product1 instanceof Laptop || product1 instanceof Mobile ||
                    product1 instanceof Television);
        }

    }

    @Test
    public void verifyProductTotalPriceIncludingGstIsGreaterThan2000() {
        //Arrange
        products = new Shop();
        Product laptop = new Laptop("Laptop", "HP", "Black", 60000, true);
        Product mobile = new Mobile("Mobile", "Poco", "Silver", 6000, true);
        Product mouse = new Mouse("Mouse", "Dell", "Black", 500, false);
        Product television = new Television
                ("LG-4KHD", "LG", "Black", 45000, true);
        //Act
        products.addProduct(laptop);
        products.addProduct(mobile);
        products.addProduct(mouse);
        products.addProduct(television);
        //Assertion
        for (Product product : products.getGstProductHavingPriceMoreThan2000(2000)) {
            Assert.assertTrue(product.name.equals("Laptop") || product.name.equals("Mobile")
                    || product.name.equals("LG-4KHD"));
        }


    }


}
