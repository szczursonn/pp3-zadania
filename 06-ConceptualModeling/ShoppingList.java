import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    private ArrayList<String> products;
    
    ShoppingList() {
        products = new ArrayList<String>();
    }
    
    public void addProduct(String productName) {
        products.add(productName);
    }
    
    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the name of the product:");
        products.add(scanner.nextLine());
    }
    
    public int getListLength() {
        return products.size();
    }
    
    public void displayList() {
        displayListLength();
        for (int i=0;i<getListLength();i++) {
            System.out.println(i+1 + ". " + products.get(i));
        }
    }
    
    public void displayListLength() {
        System.out.println("The shopping list contains " + getListLength() + " items.");
    }
    
    public static void main() {
        ShoppingList sl1 = new ShoppingList();
        sl1.displayListLength();
        sl1.addProduct("jogurt");
        sl1.addProduct("chleb");
        sl1.addProduct("redbull");
        sl1.displayList();
        sl1.addProduct("pizza");
        sl1.displayList();
        
        sl1.addProduct();
        sl1.displayList();
    }
}