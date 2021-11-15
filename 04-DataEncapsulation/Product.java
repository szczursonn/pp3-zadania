public class Product
{
    private String productName;
    private boolean isVegetarian;
    
    Product(String productName, boolean isVegetarian) {
        setProductName(productName);
        setIsVegetarian(isVegetarian);
    }
    
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    public boolean getIsVegetarian() {
        return isVegetarian;
    }
    public void setIsVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }
    
    public String toString() {
        return productName + ", " + (isVegetarian ? "vegetarian" : "not vegetarian");
    }
    
    public void displayInfo() {
        System.out.println(toString());
    }
    
    static public void main() {
        Product pr1 = new Product("Banana", true);
        pr1.displayInfo();
    }
    
}
