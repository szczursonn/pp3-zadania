public class Company {
    private String companyName;
    private double balance;
    
    Company(String companyName) {
        this.companyName = companyName;
        this.balance = 0.0;
    }
    
    Company(String companyName, double balance) {
        this.companyName = companyName;
        this.balance = balance;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getCompanyName() {
        return companyName;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void displayInfo() {
        System.out.println(getCompanyName() + " - Balance: " + getBalance() + "PLN");
    }
    
    public void sell(Product product, Customer customer) {
        balance+=product.getPrice();
    }
    
    public static void main() {
        Company com1 = new Company("Zabka", 10000.0);
        Customer cus1 = new Customer("Jacek");
        Product pr1 = new Product("redbull", 5.00);
        
        com1.displayInfo();
        com1.sell(pr1, cus1);
        com1.displayInfo();
    }
}