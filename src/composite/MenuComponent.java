package composite;

import java.util.Iterator;

/**
 * Created by user on 2017-01-13.
 */
public abstract class MenuComponent {
    public Iterator createIterator() {
        throw new UnsupportedOperationException();
    }

    // 하위 메뉴 관리 기능
    public void add(MenuComponent menu) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menu) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    // 메뉴 고유 기능
    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getCode() {
        throw new UnsupportedOperationException();
    }

    public String getLinkUrl() {
        throw new UnsupportedOperationException();
    }

    public boolean isPrivate() {
        throw new UnsupportedOperationException();
    }

    // 메뉴 정보 출력
    public void print(String tab) {
        throw new UnsupportedOperationException();
    }

    public void printMenuByIterator() {
        throw new UnsupportedOperationException();
    }

}
