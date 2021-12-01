public class Publisher {
    String name;
    String city;
    
    Publisher(String name, String city) {
        setName(name);
        setCity(city);
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }
    
    public String toString() {
        return getName() + ", " + getCity();
    }
}