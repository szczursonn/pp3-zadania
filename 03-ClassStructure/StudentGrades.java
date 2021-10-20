import java.util.Random;
import java.util.Scanner;

public class StudentGrades {
    String studentName;
    double[] grades;
    
    StudentGrades(String name) {
        this.studentName = name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many grades are you going to input?");
        int numberOfGrades = Integer.parseInt(scanner.nextLine());
        this.grades = new double[numberOfGrades];
        for (int i=0; i<numberOfGrades; i++) {
            System.out.print("Input next grade: ");
            this.grades[i] = Double.parseDouble(scanner.nextLine());
        }
    }
    
    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }
    
    StudentGrades(String name, int numberOfGrades) {
        this.studentName = name;
        this.grades = new double[numberOfGrades];
        
        Random rand = new Random();
        for (int i = 0; i < numberOfGrades; i++) {
            this.grades[i] = (rand.nextDouble()*4.5)+1; // 1.0-5.5
        }
    }
    
    double getLowestGrade() {
        double lowestGrade = grades[0];
        for (int i = 1; i<grades.length; i++) {
            if (grades[i] < lowestGrade) lowestGrade = grades[i];
        }
        return lowestGrade;
    }
    
    double getHighestGrade() {
        double highestGrade = grades[0];
        for (int i = 1; i<grades.length; i++) {
            if (grades[i] > highestGrade) highestGrade = grades[i];
        }
        return highestGrade;
    }
    
    int getGradesAmount() {
        return grades.length;
    }
    
    double getGPA() {
        double sum = 0.0;
        for (int i = 0; i < grades.length; i++) {
            sum+=grades[i];
        }
        return sum/grades.length;
    }
    
    void displayInfo() {
        System.out.println(studentName + ": lowest " + getLowestGrade() + ", highest " + getHighestGrade() + ", GPA " + getGPA());
        System.out.print("grades: ");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + ", ");
        }
        System.out.println("");
    }
    
    static void main(String[] args) {
        double[] st1data = {3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5};
        StudentGrades st1gr = new StudentGrades("Amanda", st1data);
        
        double[] st2data = {2.0, 3.0, 2.0, 4.5, 4.5};
        StudentGrades st2gr = new StudentGrades("James", st2data);
    }
    
}