package composite;

import java.util.Iterator;

/**
 * Created by user on 2017-01-13.
 */
public class Link extends MenuComponent{
    String code;
    String name;
    String linkUrl;
    boolean isPrivate;

    public Link(String code, String name, String linkUrl, boolean isPrivate) {
        this.code = code;
        this.name = name;
        this.linkUrl = linkUrl;
        this.isPrivate = isPrivate;
    }

    public Iterator createIterator() {
        return new Nulliterator();
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public boolean isPrivate() {
        return  isPrivate;
    }

    public void print(String tab) {
        System.out.println(tab + "└ " + getName() + "(" + getCode() + ")" + " : " + getLinkUrl());
    }

    public void printMenuByIterator() {
        System.out.println("└ [D]" + getName() + "(" + getCode() + ")" + " : " + getLinkUrl());
    }
}
