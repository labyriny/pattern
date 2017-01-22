package composite_visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by user on 2017-01-13.
 */
public class Directory extends MenuComponent {
    String code;
    String name;
    boolean isPrivate;
    List<MenuComponent> menuComponentList = new ArrayList<>();

    public Directory(String code, String name, boolean isPrivate) {
        this.code = code;
        this.name = name;
        this.isPrivate = isPrivate;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int idx) {
        return menuComponentList.get(idx);
    }

    @Override
    public List<MenuComponent> getChildren() {
        return menuComponentList;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isPrivate() {
        return isPrivate;
    }

    @Override
    public void accept(MenuVisitor visitor) {
        visitor.visit(this);

        Iterator iterator = menuComponentList.iterator();
        while (iterator.hasNext()) {
            MenuComponent menu = (MenuComponent) iterator.next();
            menu.accept(visitor);
        }
    }
}
