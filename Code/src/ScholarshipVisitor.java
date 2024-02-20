

// ScholarshipVisitor is a concrete visitor that calculates the scholarship amount
// for students based on their GRE scores.

public class ScholarshipVisitor implements Visitor {
    // The standard tuition fee for the university.
    protected static final double TUITION_FEE = 15000;

    // The scholarship percentage awarded for students who meet the GRE score threshold.
    private static final double SCHOLARSHIP_PERCENTAGE = 0.30;

    // The GRE score threshold for eligibility for the scholarship.
    private static final int SCORE_THRESHOLD = 310;

    // The visit method that is called when a ScholarshipVisitor visits a Student object.
    // This method calculates the scholarship amount based on the GRE score.
    @Override
    public void visit(Student student) {
        double scholarshipAmount = 0; // Initialize the scholarship amount to zero.

        // Check if the student's GRE score exceeds the defined threshold.
        if (student.getGreScore() > SCORE_THRESHOLD) {
            // Calculate the scholarship amount as a percentage of the tuition fee.
            scholarshipAmount = TUITION_FEE * SCHOLARSHIP_PERCENTAGE;
        }

        // Print out the student's name, GRE score, and the scholarship amount they are awarded.
        System.out.println("Student: " + student.getName() + " with GRE score " + student.getGreScore() +
                " receives a scholarship of $" + scholarshipAmount + " per semester.");
    }

    // A getter method for the tuition fee, providing a way to access the tuition fee from outside.
    public static double getTuitionFee() {
        return TUITION_FEE;
    }
}
