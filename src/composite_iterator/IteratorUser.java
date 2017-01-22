package composite_iterator;

import java.util.Iterator;

/**
 * Created by user on 2017-01-13.
 */
public class IteratorUser {
    MenuComponent menus;

    public IteratorUser(MenuComponent menus) {
        this.menus = menus;
    }

    public void printMenu() {
        menus.print("    ");
        Iterator iterator = menus.createIterator();
        while (iterator.hasNext()) {
            MenuComponent menu = (MenuComponent)iterator.next();
            menu.print("    ");
        }
    }

    public void printPrivateMenu() {
        menus.print("    ");
        Iterator iterator = menus.createIterator();
        while (iterator.hasNext()) {
            MenuComponent menu = (MenuComponent)iterator.next();

            try {
                if(menu.isPrivate()) {
                    menu.print("    ");
                }
            } catch (UnsupportedOperationException e) {}
        }
    }
}
