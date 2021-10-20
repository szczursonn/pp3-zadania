public class Statistics {
    static int itemsInRange(int limit1, int limit2) {
        return Math.abs(limit1-limit2);
    }
    
    static int sumOfRange(int limit1, int limit2) {
        return (limit1+limit2)*itemsInRange(limit1, limit2)/2;
    }
    
    static double meanOfRange(int limit1, int limit2) {
        return sumOfRange(limit1, limit2)/itemsInRange(limit1, limit2);
    }
    
    static void main(String[] args) {
        System.out.println("range: <5,10>");
        System.out.println("items in range: " + itemsInRange(5,10));
        System.out.println("sum of range: " + sumOfRange(5,10));
        System.out.println("arithmetic mean of range: " + meanOfRange(5,10));
    }
}