// 8. - 12.
public class Student
{
    String name;
    int age;
    String cardId;
    int semester;
    boolean isCardValid;
    double avgGrade;
    
    // 10.
    void sayHello() {
        System.out.println("Hello everyone!");
    }
    
    void displayName() {
        System.out.println(name);
    }
    
    void displayAge() {
        System.out.println(age);
    }
    
    // 12.
    void displayInfo() {
        System.out.println(name + " : semester " + semester + ", average grade: " + avgGrade);
    }
    
    void setCardValidationStatus(boolean newStatus) {
        isCardValid = newStatus;
    }
    
    void displayCardInfo() {
        System.out.println(name + ", card ID: " + cardId + ", card is " + (isCardValid ? "valid" : "invalid"));
    }
}
