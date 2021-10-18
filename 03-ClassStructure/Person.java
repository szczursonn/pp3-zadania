public class Person {
    String name;
    double weight;
    double height;
    
    Person(String name) {
        this.name = name;
    }
    
    Person(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    
    void setWeightAndHeight(double newWeight, double newHeight) {
        this.weight = newWeight;
        this.height = newHeight;
    }
    
    double calculateBMI() {
        return weight/(height*height/10000);
    }
    
    void displayRecord() {
        double BMI = calculateBMI();
        System.out.println(name + " : " + weight + "kg, " + height + "cm" + ", BMI = " + BMI);
        if (BMI < 18.5) {
            System.out.println("Your BMI is too low!");
        } else if (BMI > 24.9) {
            System.out.println("Your BMI is too high!");
        } else {
            System.out.println("Your BMI is ok!");
        }
    }
    
}