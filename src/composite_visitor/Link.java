package composite_visitor;

/**
 * Created by user on 2017-01-13.
 */
public class Link extends MenuComponent {
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

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLinkUrl() {
        return linkUrl;
    }

    @Override
    public boolean isPrivate() {
        return  isPrivate;
    }

    @Override
    public void accept(MenuVisitor visitor) {
        visitor.visit(this);
    }
}
