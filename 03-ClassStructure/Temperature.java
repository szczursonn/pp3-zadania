public class Temperature {
    static double celciusToKelvin(double tempCelcius) {
        return tempCelcius+273;
    }
    
    static double celciusToFahrenheit(double tempCelcius) {
        return (tempCelcius*9/5)+32;
    }
    
    static double kelvinToCelcius(double tempKelvin) {
        return tempKelvin-273;
    }
    
    static double kelvinToFahrenheit(double tempKelvin) {
        return celciusToFahrenheit(kelvinToCelcius(tempKelvin));
    }
    
    static double fahrenheitToCelcius(double tempFahrenheit) {
        return (tempFahrenheit-32)*5/9;
    }
    
    static double fahrenheitToKelvin(double tempFahrenheit) {
        return celciusToKelvin(fahrenheitToCelcius(tempFahrenheit));
    }
    
    static void main(String[] args) {
        System.out.println("25C = " + celciusToKelvin(25) + "K = " + celciusToFahrenheit(25) + "F");
        
        System.out.println("100F = " + fahrenheitToKelvin(100) + "K = " + fahrenheitToCelcius(100) + "C");
        
        System.out.println("0K = " + kelvinToCelcius(0) + "C = " + kelvinToFahrenheit(0) + "F");
    }
}