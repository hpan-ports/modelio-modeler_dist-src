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
                                    

package org.modelio.diagram.elements.core.figures.labelum;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Dimension;

/**
 * Line breaking strategy interface for a {@link LabelumFigure}.
 */
@objid ("d580e31d-6404-4c65-aa6b-90660dd0b383")
public interface ILabelumTextLayouter {
    /**
     * get the symbol that will be added as line wrapping symbol.
     * @return the line wrap symbol
     */
    @objid ("daf4693a-ccaa-4d37-a6e2-66ee30ad6c68")
    String getLineEndSymbol();

    /**
     * Format the given text using the available maximum size.
     * <p>
     * As side effect, the implementation may use and modify
     * {@link LabelumFigure#getTextLayout()}.
     * @param labelumFigure the labellum to format
     * @param origText the text to format/wrap
     * @param maxSize the allowed size
     * @return the formatted text.
     */
    @objid ("d4dc5874-6ec5-411f-ae0b-af26e2759cde")
    String formatText(LabelumFigure labelumFigure, String origText, Dimension maxSize);

}
