package net.moewes.cloudui.ui5.breadcrumbs;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BreadcrumbsSeparator {
    SLASH("Slash"),
    BACKSLASH("BackSlash"),
    DOUBLEBACKSLASH("DoubleBackSlash"),
    DOUBLEGRAETERTHEN("DoubleGreaterThen"),
    DOUBLESLASH("DoubleSlash"),
    GREATERTHEN("GreaterThen");

    private final String attributeText;
}
