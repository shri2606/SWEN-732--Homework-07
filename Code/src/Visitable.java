public interface Visitable {
    // The accept method is the entry point for a Visitor to access the element.
    void accept(Visitor visitor);
}
