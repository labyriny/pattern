package composite_visitor;

/**
 * Created by user on 2017-01-22.
 */
public class PrintOnlyPrivateMenuVisitor implements MenuVisitor {
    @Override
    public void visit(Directory directory) {
        if (!directory.isPrivate()) {
            return;
        }
        System.out.println("└ [D]" + directory.getName() + "(" + directory.getCode() + ")");
    }

    @Override
    public void visit(Link link) {
        if (!link.isPrivate()) {
            return;
        }
        System.out.println("└ [L]" + link.getName() + "(" + link.getCode() + ")" + " : " + link.getLinkUrl());
    }
}
