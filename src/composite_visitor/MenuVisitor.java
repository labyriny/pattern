package composite_visitor;

/**
 * Created by user on 2017-01-22.
 */
public interface MenuVisitor {
    void visit(Directory directory);

    void visit(Link link);
}
