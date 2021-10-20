public class InternetDevice {
    
    static int connectedDevices = 0;
    String deviceName;
    boolean connected;
    
    InternetDevice(String deviceName) {
        this.deviceName = deviceName;
    }
    
    void connect() {
        if (isConnected()) System.out.println("Device is already connected!");
        else {
            connected = true;
            connectedDevices++;
        }
    }
    
    void disconnect() {
        if (!isConnected()) System.out.println("Device is already disconnected!");
        else {
            connected = false;
            connectedDevices--;
        }
    }
    
    boolean isConnected() {
        return connected;
    }
    
    void displayStatus() {
        System.out.println(deviceName + " is " + (isConnected() ? "connected" : "disconnected"));
    }
    
    static void displayConnections() {
        System.out.println("There are " + connectedDevices + " connected devices.");
    }
    
    static void main(String[] args) {
        InternetDevice dev1 = new InternetDevice("laptop");
        InternetDevice dev2 = new InternetDevice("telefon1");
        InternetDevice dev3 = new InternetDevice("telefon2");
        InternetDevice dev4 = new InternetDevice("smartwatch");
        InternetDevice dev5 = new InternetDevice("tv");
        
        dev1.connect();
        dev3.connect();
        dev5.connect();
        
        dev1.displayStatus();
        dev2.displayStatus();
        dev3.displayStatus();
        dev4.displayStatus();
        dev5.displayStatus();
        
        displayConnections();
        
    }
    
}
