package composite;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by user on 2017-01-13.
 */
public class CompositIterator implements Iterator {
    Stack stack = new Stack();

    public CompositIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.empty()) {
            return false;
        }

        Iterator iterator = (Iterator)stack.peek();
        if(!iterator.hasNext()) {
            stack.pop();
            return hasNext();
        }

        return true;
    }

    @Override
    public Object next() {
        if(!hasNext()) {
            return null;
        }
        Iterator iterator = (Iterator)stack.peek();
        MenuComponent menu = (MenuComponent)iterator.next();
        if(menu instanceof Directory) {
            stack.push(((Directory) menu).createIterator());
        }
        return menu;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
