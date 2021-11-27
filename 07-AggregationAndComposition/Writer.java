public class Writer {
    private String name;
    private int age;
    private boolean isDead;
    
    Writer(String name, int age, boolean isDead) {
        setName(name);
        setAge(age);
        setIsDead(isDead);
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    
    public void setIsDead(boolean isDead) {
        this.isDead = isDead;
    }
    public boolean getIsDead() {
        return isDead;
    }
}