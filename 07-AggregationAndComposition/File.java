public class File {
    private String fileName;
    private String extension;
    private int size;
    
    File(String fileName, String extension, int size) {
        setFileName(fileName);
        setExtension(extension);
        setSize(size);
    }
    
    File(String fileName, String extension, double sizeMB) {
        setFileName(fileName);
        setExtension(extension);
        setSizeMB(sizeMB);
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public String getFileName() {
        return fileName;
    }
    
    public void setExtension(String extension) {
        this.extension = extension;
    }
    public String getExtension() {
        return extension;
    }
    
    public void setSize(int size) {
        if (size>0) this.size = size;
    }
    public int getSize() {
        return size;
    }
    
    public String getFullFileName() {
        return getFileName() + "." + getExtension();
    }
    
    public double getSizeMB() {
        return (double)size/1048576;
    }
    
    public void setSizeMB(double sizeMB) {
        this.size = (int)(sizeMB*1048576);
    }
    
    public String getFileInfo() {
        String sizeMB = String.format("%.2f", getSizeMB());
        return getFullFileName() + " " + sizeMB + "MB";
    }
}