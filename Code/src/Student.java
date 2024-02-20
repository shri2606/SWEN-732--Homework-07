

public class Student implements Visitable {
    private String name;       // The name of the student.
    private int greScore;      // The GRE score of the student (for scholarship evaluation).
    private double gpa;        // The GPA of the student (for performance evaluation).

    // Constructor for the Student class that initializes the student's name and GRE score.
    public Student(String name, int greScore) {
        this.name = name;
        this.greScore = greScore;
    }

    // Overloaded constructor for the Student class that initializes the student's name and GPA.
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    // Getter for the student's name.
    public String getName() {
        return name;
    }

    // Getter for the student's GRE score.
    public int getGreScore() {
        return greScore;
    }

    // Getter for the student's GPA.
    public double getGpa() {
        return gpa;
    }

    // The accept method allows the visitor to pass in itself.
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
