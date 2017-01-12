package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by user on 2017-01-13.
 */
public class Directory extends MenuComponent{
    String code;
    String name;
    boolean isPrivate;
    List<MenuComponent> menuComponentList = new ArrayList<>();

    public Directory(String code, String name, boolean isPrivate) {
        this.code = code;
        this.name = name;
        this.isPrivate = isPrivate;
    }

    // iterator 적용
    public Iterator createIterator() {
        return new CompositIterator(menuComponentList.iterator());
    }

    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    public MenuComponent getChild(int idx) {
        return menuComponentList.get(idx);
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void print(String tab) {
        System.out.println(tab + "└ [D]" + getName() + "(" + getCode() + ")");

        Iterator iterator = menuComponentList.iterator();
        while (iterator.hasNext()) {
            MenuComponent menu = (MenuComponent) iterator.next();
            menu.print(tab + "    ");
        }
    }

    public void printMenuByIterator() {
        System.out.println("└ [D]" + getName() + "(" + getCode() + ")");
    }
}
