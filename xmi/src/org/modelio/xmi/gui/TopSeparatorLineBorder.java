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
 * This class creates the top SWT line.
 * It is a SWT EtchedBorder.
 * @author ebrosse
 */
@objid ("2c73aa9c-b508-4386-be0c-89a3b13382a4")
public class TopSeparatorLineBorder extends EtchedBorder {
    /**
     * Default constructor
     * @param etchType : the SWT type of the EtchedBorder
     */
    @objid ("b61ebf94-a294-404e-9f5b-05a3e3940738")
    public TopSeparatorLineBorder(final int etchType) {
        super(etchType);
    }

    @objid ("67712721-6994-4b89-9587-8d5c0dbb329e")
    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(5, 0, 0, 0);
    }

    @objid ("026f9e6b-e5ab-4e81-a8f2-380e3d32e048")
    @Override
    public Insets getBorderInsets(Component c, Insets insets) {
        insets.left = insets.right = insets.bottom = 0;
        insets.top = 5;
        return insets;
    }

    @objid ("41a241be-94d5-41cc-93b4-413e967f6d9b")
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        int w = width;
               
        g.translate(x, y);
        
        g.setColor(this.etchType == LOWERED ? getShadowColor(c) : getHighlightColor(c));
        g.drawLine(0, 0, w - 1, 0);
        
        g.setColor(this.etchType == LOWERED ? getHighlightColor(c) : getShadowColor(c));
        g.drawLine(0, 1, w - 1, 1);
        
        g.translate(-x, -y);
    }

}
