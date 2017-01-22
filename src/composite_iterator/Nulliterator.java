package composite_iterator;

import java.util.Iterator;

/**
 * Created by user on 2017-01-13.
 */
public class Nulliterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
