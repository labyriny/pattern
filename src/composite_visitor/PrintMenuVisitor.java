package composite_visitor;

/**
 * Created by user on 2017-01-22.
 */
public class PrintMenuVisitor implements MenuVisitor {
    @Override
    public void visit(Directory directory) {
        System.out.println("└ [D]" + directory.getName() + "(" + directory.getCode() + ")");
    }

    @Override
    public void visit(Link link) {
        System.out.println("└ [L]" + link.getName() + "(" + link.getCode() + ")" + " : " + link.getLinkUrl());
    }
}
