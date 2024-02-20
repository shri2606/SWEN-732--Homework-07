
public interface Visitor {
    // The visit method for the Student type.
    // This method will be implemented by concrete visitors to perform specific
    // actions on Student instances.

    void visit(Student student);
}
