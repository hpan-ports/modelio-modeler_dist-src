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
                                    

package org.modelio.core.ui.images;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.graphics.Image;
import org.modelio.metamodel.uml.infrastructure.Element;

/**
 * Basic label provider for model elements. Provides the element name as label, the metaclass icon as image and apply text standard
 * decoration (static, abstract).<br>
 * This provider can typically be used as a base provider for a ElementDecoratedStyledLabelProvider.
 * 
 * 
 * @author phv
 */
@objid ("39807b29-9409-41a9-a853-8482f2952d74")
public class BasicModelElementLabelProvider extends AbstractModelioElementLabelProvider {
    @objid ("6d29b7ad-1d8b-4878-9f8f-bc27a891796c")
    private static final StyleRange[] NO_STYLERANGE = new StyleRange[0];

    @objid ("88cbf065-4df5-4c34-a6a8-802db16452c3")
    @Override
    public String getText(Object element) {
        return ((Element) element).getName();
    }

    @objid ("11090afc-b3ae-436d-8f40-4c29daf4e13f")
    @Override
    public Image getImage(Object obj) {
        final Element element = (Element) obj;
        return ElementImageService.getIcon(element);
    }

    @objid ("85f45c86-cba0-482f-a733-f1a25aedfe50")
    @Override
    public StyledString getStyledText(Object element) {
        final String s = getText(element);
        return new StyledString(s);
    }

}
