package net.moewes.cloudui.ui5.breadcrumbs;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BreadcrumbsSeparator {
    SLASH("Slash"),
    BACKSLASH("BackSlash"),
    DOUBLEBACKSLASH("DoubleBackSlash"),
    DOUBLEGRAETERTHAN("DoubleGreaterThan"),
    DOUBLESLASH("DoubleSlash"),
    GREATERTHAN("GreaterThan");

    private final String attributeText;
}
