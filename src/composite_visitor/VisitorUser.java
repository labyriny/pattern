package composite_visitor;

/**
 * Created by user on 2017-01-13.
 */
public class VisitorUser {
    MenuComponent menus;

    public VisitorUser(MenuComponent menus) {
        this.menus = menus;
    }

    public void printMenu() {
        menus.accept(new PrintMenuVisitor());
    }

    public void printPrivateMenu() {
        menus.accept(new PrintOnlyPrivateMenuVisitor());
    }
}
