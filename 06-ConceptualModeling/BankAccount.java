public class BankAccount {
    private double balance;
    private String ownerName;
    
    BankAccount(String ownerName) {
        setOwnerName(ownerName);
        this.balance = 0;
    }
    
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance+=amount;
    }
    public void withdraw(double amount) {
        if (amount > 500) {
            System.out.println("You can only withdraw 500PLN at once!");
            return;
        }
        if (amount>getBalance()) {
            System.out.println("Not enough funds!");
            return;
        }
        balance-=amount;
    }
    public void displayBalance() {
        System.out.println(getBalance() + " PLN");
    }
    
    static public void main() {
        BankAccount acc1 = new BankAccount("Jan Kowalski");
        acc1.deposit(500);
        acc1.displayBalance();
        acc1.deposit(200);
        acc1.displayBalance();
        acc1.withdraw(300);
        acc1.displayBalance();
    }
}