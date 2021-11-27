public class Computer {
    private String cpuModel;
    private int memoryAmount;
    private String gpuModel;
    private boolean isOn;
    
    Computer(String cpuModel, int memoryAmount) {
        setCpuModel(cpuModel);
        setMemoryAmount(memoryAmount);
        this.isOn = false;
    }
    
    Computer(String cpuModel, int memoryAmount, String gpuModel) {
        setCpuModel(cpuModel);
        setMemoryAmount(memoryAmount);
        setGpuModel(gpuModel);
        this.isOn = false;
    }
    
    public int getMemoryAmount() {
        return memoryAmount;
    }
    public void setMemoryAmount(int memoryAmount) {
        if (memoryAmount>0) this.memoryAmount=memoryAmount;
    }
    
    public String getCpuModel() {
        return cpuModel;
    }
    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }
    
    public String getGpuModel() {
        return (gpuModel == null ? "integrated graphics" : gpuModel);
    }
    public void setGpuModel(String gpuModel) {
        this.gpuModel = gpuModel;
    }
    
    public boolean getIsOn() {
        return isOn;
    }
    public void turnOn() {
        isOn=true;
    }
    public void turnOff() {
        isOn=false;
    }
    
    public String toString() {
        return (getIsOn() ? "ON" : "OFF") + ", " + getCpuModel() + ", " + getMemoryAmount() + "GB ram, " + getGpuModel();
    }
    
    public void displayInfo() {
        System.out.println(toString());
    }
    
    static public void main() {
        Computer pc1 = new Computer("Ryzen 5 5600G", 12);
        pc1.turnOn();
        pc1.displayInfo();
        
        Computer pc2 = new Computer("i5-11400F", 16, "GTX 1060");
        pc2.displayInfo();
        pc2.setCpuModel("i9-11900KF");
        pc2.setMemoryAmount(-30);
        pc2.setGpuModel("RTX 3080");
        pc2.displayInfo();
    }
}