package composite;

import java.util.Iterator;

/**
 * Created by user on 2017-01-13.
 */
public class User {
    MenuComponent menus;

    public User(MenuComponent menus) {
        this.menus = menus;
    }

    public void printMenu() {
        menus.print("");
    }

    public void printPrivateMenu() {
        menus.printMenuByIterator();
        Iterator iterator = menus.createIterator();
        while (iterator.hasNext()) {
            MenuComponent menu = (MenuComponent)iterator.next();

            try {
                if(menu.isPrivate()) {
                    menu.printMenuByIterator();
                }
            } catch (UnsupportedOperationException e) {}
        }
    }
}
