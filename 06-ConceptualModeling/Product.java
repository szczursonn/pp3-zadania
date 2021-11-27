public class Product {
    private String productName;
    private double price;
    
    Product(String productName, double price) {
        setProductName(productName);
        this.price = price;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductName() {
        return productName;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}