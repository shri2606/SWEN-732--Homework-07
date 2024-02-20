

// The PerformanceEvaluationVisitor class is part of the Visitor pattern implementation.
// It is a concrete visitor that calculates the performance bonus for a student based
// on their GPA.

public class PerformanceEvaluationVisitor implements Visitor {
    // Threshold GPA for a student to be considered for a performance bonus.
    private static final double HIGH_PERFORMANCE_THRESHOLD = 3.75;

    // The percentage of the tuition fee that will be awarded as a performance bonus.
    private static final double PERFORMANCE_BONUS_PERCENTAGE = 0.05;

    // The visit method for the Student class.
    // This is where the performance bonus calculation is applied to a student object.
    @Override
    public void visit(Student student) {
        // Initialize the performance bonus to zero.
        double performanceBonus = 0;

        // If the student's GPA is equal to or greater than the threshold,
        // calculate the performance bonus.
        if (student.getGpa() >= HIGH_PERFORMANCE_THRESHOLD) {
            performanceBonus = ScholarshipVisitor.getTuitionFee() * PERFORMANCE_BONUS_PERCENTAGE;
        }

        // Output the student's name, GPA, and the performance bonus they would receive.
        System.out.println("Student: " + student.getName() + " with GPA " + student.getGpa() +
                " receives a performance bonus of $" + performanceBonus + " per semester.");
    }
}
