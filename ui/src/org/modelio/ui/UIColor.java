/*
 * Copyright 2013 Modeliosoft
 *
 * This file is part of Modelio.
 *
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */  
                                    

package org.modelio.ui;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

/**
 * The UIColor values are named upon a more or less formal set of rules.
 * <p>
 * Here is the rules summary:
 * <ul>
 * <li>'color-named' colors are named from the color they represent, for example BLACK, WHITE and so on
 * <li>'functional-colors' are named from their intended context and usage
 * </ul>
 * For 'functional-colors' the name has the form: XXX_YYY_ZZ where:
 * <ul>
 * <li>XXX stands for the SWT widget or category of widget the color applies to.
 * <li>YYY stands for the functional context of the color
 * <li>ZZ is either BG for background, FG for foreground
 * </ul>
 * Example:
 * <ul>
 * <li>TEXT_WRITABLE_BG => background color of a writable SWT Text widget
 * <li>TABLE_EVENROW_BG => background color of the even rows of a table
 * </ul>
 */
@objid ("8d550e35-c068-11e1-8c0a-002564c97630")
public interface UIColor {
    @objid ("d60d8336-e17a-43eb-bdc1-20c961fdf639")
    public static final Color BLACK = new Color(Display.getCurrent(), 0, 0, 0);

    @objid ("8ddd09d9-144d-4768-b0fe-d130119221df")
    public static final Color WHITE = new Color(Display.getCurrent(), 255, 255, 255);

    @objid ("72708225-1581-4089-ad72-b0829bc5f6b3")
    public static final Color RED = new Color(Display.getCurrent(), 255, 0, 0);

    /**
     * KTable even/odd row colors
     */
    @objid ("623e9c49-b784-4038-8941-2f1d865d3b95")
    public static final Color TABLE_EVENROW_BG = new Color(Display.getCurrent(), 230, 240, 255);

    @objid ("0e06ed70-34e2-436f-919c-c8ed9759aee4")
    public static final Color TABLE_ODDROW_BG = new Color(Display.getCurrent(), 245, 255, 255);

    @objid ("921309a3-6efc-419c-a65b-ca83b3dbeb10")
    public static final Color TABLE_HEADER_BG = new Color(Display.getCurrent(), 212, 208, 200);

    /**
     * Text Field colors
     */
    @objid ("f5c7724d-d4d2-44b6-9575-c635ba3c0418")
    public static final Color TEXT_WRITABLE_BG = new Color(Display.getCurrent(), 255, 255, 255);

    @objid ("bf3492e3-6a88-47e9-96d3-87391dfded76")
    public static final Color TEXT_READONLY_BG = new Color(Display.getCurrent(), 242, 242, 242);

    /**
     * Editors highlighting colors
     */
    @objid ("c4aa6786-3cd9-43c1-a646-22c74b35b49c")
    public static final Color EDITOR_ROTEXT_FG = new Color(Display.getCurrent(), 0, 0, 0);

    @objid ("f5f048f6-0b63-4009-9be0-c91b46603518")
    public static final Color EDITOR_RWTEXT_FG = new Color(Display.getCurrent(), 0, 0, 160);

    @objid ("7d1f24ab-0f4b-46a8-b9db-a885891ec1f5")
    public static final Color EDITOR_KEYWORD_FG = new Color(Display.getCurrent(), 120, 0, 164);

    @objid ("3073da9b-c5f6-4d44-9674-edfbe7737d2f")
    public static final Color EDITOR_MDDTAG_FG = new Color(Display.getCurrent(), 160, 160, 160);

    @objid ("74970769-fc5a-478e-af57-84f436d4496c")
    public static final Color EDITOR_COMMENT_FG = new Color(Display.getCurrent(), 0, 128, 0);

    /**
     * Label
     */
    @objid ("50edd859-6cac-40f5-9743-0163c83e9f0d")
    public static final Color LABEL_TIP_FG = new Color(Display.getCurrent(), 113, 111, 100);

    /**
     * Hyperlink color.
     */
    @objid ("a8f59bf9-24eb-42fc-b7b5-50f86a478b34")
    public static final Color HYPERLINK_FG = new Color(Display.getCurrent(), 0, 0, 128);

    /**
     * Ramc model elements font color is modified yellow #3d5c99
     */
    @objid ("272465f7-859e-4a2c-bf2d-74f26f362ef5")
    public static final Color RAMC_ELEMENT = new Color(Display.getCurrent(), 61, 92, 153);

    /**
     * Incomplete model elements font color is light red #FF8080.
     */
    @objid ("d9e571aa-645b-409c-937e-05376228407e")
    public static final Color SHELL_ELEMENT = new Color(Display.getCurrent(), 255, 128, 128);

    /**
     * Modifiable model elements font color is black #000000.
     */
    @objid ("c5b79f65-3de4-4e62-b157-a9a6fe462a4d")
    public static final Color MODIFIABLE_ELEMENT = BLACK;

    /**
     * Non-modifiable model component elements font color is dark grey #606060.
     */
    @objid ("58719bca-fb0b-4dee-8593-0e18b5255b5f")
    public static final Color NONMODIFIABLE_ELEMENT = new Color(Display.getCurrent(), 96, 96, 96);

}
