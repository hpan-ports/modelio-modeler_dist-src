/* 
 * Copyright 2013-2015 Modeliosoft
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


package org.modelio.diagram.editor.state.elements.statediagramview;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.diagram.editor.state.style.StateAbstractStyleKeyProvider;
import org.modelio.diagram.styles.core.StyleKey;

/**
 * Style keys for the stereotype image representation mode.
 * 
 * @author cmarin
 */
@objid ("122eb98f-a833-476c-baa5-986c4e3b1a5f")
public class StateDiagramViewUserImageStyleKeys extends StateAbstractStyleKeyProvider {
    @objid ("5f9460b2-8378-4da5-9154-46c5ad908158")
     static final StyleKey FONT = StateDiagramViewStructuredStyleKeys.FONT;

    @objid ("325f9a2d-2d39-4e88-be73-10094ea4b344")
     static final StyleKey TEXTCOLOR = StateDiagramViewStructuredStyleKeys.TEXTCOLOR;

    @objid ("b93acaec-a89a-4e47-8a34-c731bd5e0803")
     static final StyleKey SHOWNAME = StateDiagramViewStructuredStyleKeys.SHOWNAME;

    @objid ("2407796b-94b3-40d5-9ab3-fbfeea98ead5")
     static final StyleKey SHOWSTEREOTYPES = StateDiagramViewStructuredStyleKeys.SHOWSTEREOTYPES;

    @objid ("24a4d59d-b907-4954-91b3-2cc9222cb4a6")
     static final StyleKey SHOWTAGS = StateDiagramViewStructuredStyleKeys.SHOWTAGS;

}
