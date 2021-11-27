import java.util.ArrayList;

public class Folder {
    private String folderName;
    private ArrayList<File> files;
    
    Folder(String folderName) {
        setFolderName(folderName);
        files = new ArrayList<File>();
    }
    
    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }
    public String getFolderName() {
        return folderName;
    }
    
    public ArrayList<File> getFiles() {
        return files;
    }
    
    public int getFileAmount() {
        return getFiles().size();
    }
    
    public void addFile(File file) {
        getFiles().add(file);
    }
    
    public void addFile(String fileName, String extension, int size) {
        getFiles().add(new File(fileName, extension, size));
    }
    
    public void addFile(String fileName, String extension, double sizeMB) {
        getFiles().add(new File(fileName, extension, sizeMB));
    }
    
    public void removeFile(File file) {
        getFiles().remove(file);
    }
    
    public void removeFile(String fileName) {
        for (File f: getFiles()) {
            if (f.getFileName() == fileName) {
                getFiles().remove(f);
                break;
            }
        }
    }
    
    public void displayFolder() {
        System.out.println("-" + getFolderName() + " : " + getFileAmount() + " files");
        for (File f: getFiles()) {
            System.out.println("--" + f.getFileInfo());
        }
    }
    
    public static void main() {
        Folder dir1 = new Folder("super folder");
        
        File f1 = new File("instrukcja", "txt", 63291);
        dir1.addFile(f1);
        dir1.addFile("fajny_film", "mp4", 815.64);
        dir1.displayFolder();
        
        File f3 = new File("pp3_sciaga", "pdf", 5.77);
        dir1.addFile(f3);
        dir1.displayFolder();
        
        dir1.removeFile("zdjecie");
        dir1.displayFolder();
    }
}