package net.moewes.cloudui.ui5.breadcrumbs;

import net.moewes.cloudui.UiComponent;

public class Ui5BreadcrumbsItem extends UiComponent {


    public Ui5BreadcrumbsItem() {
        super("ui5-breadcrumbs-item");
    }

    public Ui5BreadcrumbsItem(String text, String href) {
        this();
        setText(text);
        setHref(href);
    }

    public void setText(String text) {
        setInnerHtml(text);
    }

    public void setHref(String href, String target) {

        getElement().setAttribute("href", href);
        getElement().setAttribute("target", target);
    }

    public void setHref(String href) {
        setHref(href, "_self");
    }

}
