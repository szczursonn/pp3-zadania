// 15.
public class Lamp
{
    boolean isOn;
    
    void switchOn() {
        if (isOn) {
            System.out.println("The lamp is already on!");
        } else {
            isOn = true;
        }
    }
    
    void switchOff() {
        if (!isOn) {
            System.out.println("The lamp is already off!");
        } else {
            isOn = false;
        }
    }
    
    void displayInfo() {
        System.out.println("The lamp is " + (isOn ? "on" : "off"));
    }
}
