package net.moewes.cloudui.ui5.breadcrumbs;

import lombok.Setter;
import net.moewes.cloudui.UiComponent;
import net.moewes.cloudui.UiElement;

public class Ui5Breadcrumbs extends UiComponent {

    @Setter
    private BreadcrumbsSeparator separator = BreadcrumbsSeparator.SLASH;

    @Setter
    private boolean noCurrentPage = false;

    public Ui5Breadcrumbs() {
        super("ui5-breadcrumbs");
    }

    @Override
    public UiElement render() {

        if (noCurrentPage) {
            getElement().setAttribute("Design", "NoCurrentPage");
        }

        getElement().setAttribute("separators", separator.getAttributeText());
        return super.render();
    }
}
