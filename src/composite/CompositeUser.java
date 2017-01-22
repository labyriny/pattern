package composite;

import java.util.Iterator;
import java.util.List;

/**
 * Created by user on 2017-01-13.
 */
public class CompositeUser {
    MenuComponent menus;

    public CompositeUser(MenuComponent menus) {
        this.menus = menus;
    }

    public void printMenu() {
        menus.print("    ");
    }

    public void printPrivateMenu() {
        menus.printOnlyThis("    ");
        List<MenuComponent> list = menus.getChildren();
        list.stream().filter(x -> x.isPrivate()).forEach(x -> x.print("    "));
    }
}
