

// The RITScholarshipSystem class serves as the entry point to the application.
// It demonstrates the use of the Visitor pattern to calculate scholarships and
// performance evaluations for students.

public class RITScholarshipSystem {
    public static void main(String[] args) {
        // Create student objects with their names and GRE scores.
        Student student1 = new Student("Jake Miller", 312);
        Student student2 = new Student("Lindsay Smith", 308);

        // Create student objects with their names and GPAs.
        Student student3 = new Student("Mike Taylor", 3.75);
        Student student4 = new Student("Lance", 3.2);

        // Instantiate the visitors.
        ScholarshipVisitor scholarshipVisitor = new ScholarshipVisitor();
        PerformanceEvaluationVisitor performanceVisitor = new PerformanceEvaluationVisitor();

        // Students with GRE scores accept the ScholarshipVisitor, which calculates
        // the scholarship based on their GRE score.
        student1.accept(scholarshipVisitor);
        student2.accept(scholarshipVisitor);

        // Students with GPA accept the PerformanceEvaluationVisitor, which calculates
        // the performance bonus based on their GPA.
        student3.accept(performanceVisitor);
        student4.accept(performanceVisitor);
    }
}
