public class Product {
    String name;
    String brand;
    String color;
    long price;
    boolean isGstApplicable;
    private int gstPercentage = 18;

    Product(String name, String brand, String color, int price, boolean isGstApplicable) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.isGstApplicable = isGstApplicable;
    }

    public long getBasePrice() {
        return price;
    }

    public int getProductGstPercenatge() {
        return gstPercentage;
    }

    public boolean isProductElibleForGst() {
        return isGstApplicable;
    }

}
