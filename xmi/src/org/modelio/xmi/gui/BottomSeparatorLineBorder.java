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
                                    

package org.modelio.xmi.gui;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.EtchedBorder;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * This class create a swing line separation.
 * It is a Swing EtchedBorder
 * 
 * @author ebrosse
 */
@objid ("7f6b9bea-fa34-4905-8f0c-e58d025cfee8")
public class BottomSeparatorLineBorder extends EtchedBorder {
    /**
     * Constructor of the line with need the swing type of the EtchedBorder
     * @param etchType : the swing type of the border
     */
    @objid ("ab9ff956-4089-4628-9d91-5ee288476f69")
    public BottomSeparatorLineBorder(final int etchType) {
        super(etchType);
    }

    @objid ("9daff01b-f8ad-42d0-972b-9ccf10feae8c")
    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(0, 0, 5, 0);
    }

    @objid ("6ebe6292-d550-41af-b873-d0f89f121360")
    @Override
    public Insets getBorderInsets(Component c, Insets insets) {
        insets.left = insets.right = insets.top = 0;
        insets.bottom = 5;
        return insets;
    }

    @objid ("20781649-a910-4ee8-8df5-4c5399a9ba60")
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        int w = width;
        int h = height;
        
        g.translate(x, y);
        
        g.setColor(this.etchType == LOWERED ? getShadowColor(c) : getHighlightColor(c));
        g.drawLine(0, h - 3, w - 1, h - 3);
        
        g.setColor(this.etchType == LOWERED ? getHighlightColor(c) : getShadowColor(c));
        
        g.drawLine(0, h - 2, w - 1, h - 2);
        g.translate(-x, -y);
    }

}
