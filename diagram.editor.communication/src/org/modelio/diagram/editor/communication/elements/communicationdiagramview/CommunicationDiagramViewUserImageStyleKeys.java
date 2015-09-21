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


package org.modelio.diagram.editor.communication.elements.communicationdiagramview;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.diagram.editor.communication.style.CommunicationAbstractStyleKeyProvider;
import org.modelio.diagram.styles.core.StyleKey;

/**
 * Style keys for the stereotype image representation mode.
 * 
 * @author cmarin
 */
@objid ("43efde5d-1d19-429e-82f2-c2765322a80b")
public class CommunicationDiagramViewUserImageStyleKeys extends CommunicationAbstractStyleKeyProvider {
    @objid ("34ede4d4-16d1-49a8-aea3-3125ded959e8")
     static final StyleKey FONT = CommunicationDiagramViewStructuredStyleKeys.FONT;

    @objid ("b7283051-f2df-4273-969e-8bf0c412c5bc")
     static final StyleKey TEXTCOLOR = CommunicationDiagramViewStructuredStyleKeys.TEXTCOLOR;

    @objid ("5c633b00-6b8c-421c-867c-0c6a144d9daf")
     static final StyleKey SHOWNAME = CommunicationDiagramViewStructuredStyleKeys.SHOWNAME;

    @objid ("b202b075-449f-41bf-838a-cb401b942c6a")
     static final StyleKey SHOWSTEREOTYPES = CommunicationDiagramViewStructuredStyleKeys.SHOWSTEREOTYPES;

    @objid ("ccbadba1-5c85-4b1c-845f-aa68a3b46bd6")
     static final StyleKey SHOWTAGS = CommunicationDiagramViewStructuredStyleKeys.SHOWTAGS;

}
