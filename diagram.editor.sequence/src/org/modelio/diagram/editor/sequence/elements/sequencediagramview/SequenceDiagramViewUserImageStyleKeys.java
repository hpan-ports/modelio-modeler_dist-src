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


package org.modelio.diagram.editor.sequence.elements.sequencediagramview;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.diagram.editor.sequence.style.SequenceAbstractStyleKeyProvider;
import org.modelio.diagram.styles.core.StyleKey;

/**
 * Style keys for the stereotype image representation mode.
 * 
 * @author cmarin
 */
@objid ("1d7ceba5-2a82-4434-860f-27582a8c36cf")
public class SequenceDiagramViewUserImageStyleKeys extends SequenceAbstractStyleKeyProvider {
    @objid ("aed028f9-67a1-4882-b303-e4d98e5a90d4")
     static final StyleKey FONT = SequenceDiagramViewStructuredStyleKeys.FONT;

    @objid ("7447d932-1f18-49c1-aa8e-12c7bade44ad")
     static final StyleKey TEXTCOLOR = SequenceDiagramViewStructuredStyleKeys.TEXTCOLOR;

    @objid ("d2038d10-bb3c-4871-9c3a-77e7d40c8331")
     static final StyleKey SHOWNAME = SequenceDiagramViewStructuredStyleKeys.SHOWNAME;

    @objid ("1e1fc1c7-5386-4a25-9104-8ab4d283116c")
     static final StyleKey SHOWSTEREOTYPES = SequenceDiagramViewStructuredStyleKeys.SHOWSTEREOTYPES;

    @objid ("2e04dc2c-b6c3-4380-990a-a7344f557630")
     static final StyleKey SHOWTAGS = SequenceDiagramViewStructuredStyleKeys.SHOWTAGS;

}
