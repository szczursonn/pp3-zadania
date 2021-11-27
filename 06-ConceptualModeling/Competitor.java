public class Competitor {
    private String name;
    private double score;
    
    Competitor(String name) {
        setName(name);
    }
    
    
    public void judge(int[] scores) {
        int sum=0;
        int lowest=6;
        int highest=0;
        for (int score: scores) {
            sum+=score;
            if (score<lowest) lowest=score;
            if (score>highest) highest=score;
        }
        sum-=(lowest+highest);
        this.score = (double)sum/(scores.length-2);
    }
    
    public void displayScore() {
        System.out.println(name + " : " + score + " pts");
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public static void main() {
        Competitor c1 = new Competitor("Jan Kowalski");
        int[] scores1 = {2,4,5,2,3};
        c1.judge(scores1);
        c1.displayScore();
        
        Competitor c2 = new Competitor("Adam Mickiewicz");
        int[] scores2 = {5,4,2,1,1};
        c2.judge(scores2);
        c2.displayScore();
        
        Competitor c3 = new Competitor("Maciek Nowak");
        int[] scores3 = {3,3,3,3,3};
        c3.judge(scores3);
        c3.displayScore();
    }
}