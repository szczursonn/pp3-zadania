public class ComputerFile {
    
    private String name;
    private String extension;
    private int size;
    
    ComputerFile(String name, String extension, int size) {
        setName(name);
        setExtension(extension);
        setSize(size);
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setExtension(String extension) {
        this.extension = extension;
    }
    public String getExtension() {
        return extension;
    }
    
    public String getFullFilename() {
        return name + "." + extension;
    }
    
    public void setSize(int size) {
        if (size>0) this.size=size;
    }
    public int getSize() {
        return size;
    }
    public double getSizeMB() {
        return size/1048576;
    }
}