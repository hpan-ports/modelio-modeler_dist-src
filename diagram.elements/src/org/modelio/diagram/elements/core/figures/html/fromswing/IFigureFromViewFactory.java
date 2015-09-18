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
                                    

package org.modelio.diagram.elements.core.figures.html.fromswing;

import javax.swing.text.View;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.Figure;
import org.eclipse.swt.graphics.Font;

/**
 * Interface for factories that creates {@link Figure} from {@link View}.
 * @author cmarin
 */
@objid ("abfab656-5841-4215-810e-c761102ec135")
interface IFigureFromViewFactory {
    /**
     * Create a figure for the given view.
     * <p>
     * The implementation may return:<ul>
     * <li> <i>null</i> : the child view will be skipped with all its content
     * <li> a new figure: the figure will be added to <i>parentFigure</i>.
     * <li> the <i>parentFigure</i> : no figure is created but the view children will be processed
     * and their figures will be added to the same <i>parentFigure</i>.
     * @param view a View to create a figure for.
     * @param parentFigure the Figure in which the created figure will be put.
     * @return the created figure, <i>parentFigure</i> or <i>null</i>.
     */
    @objid ("6bcce0f9-3947-49cf-845c-50f1472e9a43")
    Figure createFigure(View view, Figure parentFigure);

    /**
     * Get the factory to use to create the child views of the given view.
     * @param view the view to get a factory from
     * @param viewFigure the figure matching the view
     * @return the factory to use to instantiate children views.
     */
    @objid ("7e7d7d9a-69ee-4efc-b4f6-03ace8d20e49")
    IFigureFromViewFactory getFactory(View view, Figure viewFigure);

    /**
     * @return the font to use by default
     */
    @objid ("d33285b4-89d0-4b04-82a8-b230b6f2342a")
    Font getFont();

}
