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
                                    

package org.modelio.core.ui.textelement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("37efae21-81ac-4881-b112-24a8e8dfb216")
class ElementHtmlTooltip {
    @objid ("edb419a5-7ec6-4df4-8849-2e5cd14e72ee")
    public static String getHtml(MObject element) {
        // FIXME: propose better representation and contents for element info
        
        final Color background = Display.getCurrent().getSystemColor(SWT.COLOR_INFO_BACKGROUND);
        final String bgColor = "#" + Integer.toHexString(background.getRed()) + Integer.toHexString(background.getGreen())
                + Integer.toHexString(background.getBlue());
        
        final Color foreground = Display.getCurrent().getSystemColor(SWT.COLOR_INFO_FOREGROUND);
        final String fgColor = "#" + Integer.toHexString(foreground.getRed()) + Integer.toHexString(foreground.getGreen())
                + Integer.toHexString(foreground.getBlue());
        
        final StringBuilder builder = new StringBuilder();
        builder.append("<html>");
        builder.append("<header>");
        builder.append("<meta charset=\"utf-8\" />");
        
        builder.append("<style>");
        builder.append("body {background-color: ");
        builder.append(bgColor);
        builder.append("; color:");
        builder.append(fgColor);
        builder.append("; font-family: Impact, Arial, Verdana, sans-serif; font-size: small;}");
        builder.append("</style>");
        
        builder.append("</header>");
        builder.append("<body>");
        if (element != null) {
            builder.append("<p><strong>Name: </strong>");
            builder.append(element.getName());
            builder.append("</p>");
            builder.append("<p><strong>Full path: </strong>");
            builder.append(getCompositionPath(element));
            builder.append("</p>");
            builder.append("<p><strong>Metaclass: </strong>");
            builder.append(element.getMClass().getName());
            builder.append("</p>");
            builder.append("<p><strong>Identifier: </strong>");
            builder.append(element.getUuid().toString());
            builder.append("</p>");
            builder.append("<p><strong>Description: </strong>");
            builder.append("</p><em>");
            if (element instanceof ModelElement) {
                String desc = ((ModelElement) element).getNoteContent("ModelerModule", "description");
                if (desc != null) {
                    builder.append(desc);
                }
            }
            builder.append("<br/></em>");
        }
        builder.append("</body>");
        builder.append("</html>");
        return builder.toString();
    }

    @objid ("970cee64-218a-4952-82de-8424f66039c8")
    private static String getCompositionPath(MObject o) {
        final String name = o.getName();
        
        final MObject owner = o.getCompositionOwner();
        if (owner != null) {
            return getCompositionPath(owner) + "." + name;
        }
        return name;
    }

}
