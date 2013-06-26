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
    @objid ("ff301397-49f9-45f6-8b68-42e6fed3826a")
    public static final Color BLACK = new Color(Display.getCurrent(), 0, 0, 0);

    @objid ("04774bf8-cdfd-4dcc-bf06-1a8e14dbfeb3")
    public static final Color WHITE = new Color(Display.getCurrent(), 255, 255, 255);

    @objid ("987e7bc4-068e-46ff-aec5-b244595dd795")
    public static final Color RED = new Color(Display.getCurrent(), 255, 0, 0);

    /**
     * KTable even/odd row colors
     */
    @objid ("a203e39f-6b33-4c46-a24c-1f26ac695b1f")
    public static final Color TABLE_EVENROW_BG = new Color(Display.getCurrent(), 230, 240, 255);

    @objid ("81058a28-1ca8-4bb4-98e5-b5a9f6b51b55")
    public static final Color TABLE_ODDROW_BG = new Color(Display.getCurrent(), 245, 255, 255);

    @objid ("b042bd77-b80f-4621-b493-7531f0796bc3")
    public static final Color TABLE_HEADER_BG = new Color(Display.getCurrent(), 212, 208, 200);

    /**
     * Text Field colors
     */
    @objid ("4c38cb53-9886-4881-acea-3550ebfac6bc")
    public static final Color TEXT_WRITABLE_BG = new Color(Display.getCurrent(), 255, 255, 255);

    @objid ("452746ee-ec12-45bb-a487-34d34a0efcb7")
    public static final Color TEXT_READONLY_BG = new Color(Display.getCurrent(), 242, 242, 242);

    /**
     * Editors highlighting colors
     */
    @objid ("73f49ae7-af26-4c4c-9b42-25c4a41ee143")
    public static final Color EDITOR_ROTEXT_FG = new Color(Display.getCurrent(), 0, 0, 0);

    @objid ("2efa1457-be81-47cc-816c-2281269b99b4")
    public static final Color EDITOR_RWTEXT_FG = new Color(Display.getCurrent(), 0, 0, 160);

    @objid ("1e70d710-8d83-49bf-b9d1-213c40feebbd")
    public static final Color EDITOR_KEYWORD_FG = new Color(Display.getCurrent(), 120, 0, 164);

    @objid ("ae3d9922-07d7-4dfd-b4d7-d15aa3c6e717")
    public static final Color EDITOR_MDDTAG_FG = new Color(Display.getCurrent(), 160, 160, 160);

    @objid ("7e5650c0-c95f-4814-8547-6d81e250dc09")
    public static final Color EDITOR_COMMENT_FG = new Color(Display.getCurrent(), 0, 128, 0);

    /**
     * Label
     */
    @objid ("f464d5e0-f0e4-4117-80e1-c45eb945bb33")
    public static final Color LABEL_TIP_FG = new Color(Display.getCurrent(), 113, 111, 100);

    /**
     * Hyperlink color.
     */
    @objid ("7f1d1cd5-4c34-455f-93e9-d2ad3390bcac")
    public static final Color HYPERLINK_FG = new Color(Display.getCurrent(), 0, 0, 128);

    /**
     * Ramc model elements font color is modified yellow #3d5c99
     */
    @objid ("56b5fbde-437e-4b23-b5b8-01239fb3c97a")
    public static final Color RAMC_ELEMENT = new Color(Display.getCurrent(), 61, 92, 153);

    /**
     * Incomplete model elements font color is light red #FF8080.
     */
    @objid ("9ba7ae7b-d251-4f15-acd6-8f8818f54920")
    public static final Color SHELL_ELEMENT = new Color(Display.getCurrent(), 255, 128, 128);

    /**
     * Modifiable model elements font color is black #000000.
     */
    @objid ("c54a505f-1b7f-45b9-bda7-79f342569c37")
    public static final Color MODIFIABLE_ELEMENT = BLACK;

    /**
     * Non-modifiable model component elements font color is dark grey #606060.
     */
    @objid ("8f646e54-7167-4f8c-b9bf-38105d200038")
    public static final Color NONMODIFIABLE_ELEMENT = new Color(Display.getCurrent(), 96, 96, 96);

}
