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


package org.modelio.diagram.editor.bpmn.elements.diagrams.view;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.diagram.editor.bpmn.elements.style.BpmnAbstractStyleKeyProvider;
import org.modelio.diagram.styles.core.StyleKey;

/**
 * GmClass style keys for the stereotype image representation mode.
 */
@objid ("253bb742-e1a3-4603-80db-ec303131c8cd")
public class BpmnDiagramViewUserImageStyleKeys extends BpmnAbstractStyleKeyProvider {
    @objid ("b85fb6b4-329a-4cba-8f79-df6827b39f43")
     static final StyleKey FONT = BpmnDiagramViewStructuredStyleKeys.FONT;

    @objid ("fe497459-5b2c-43ce-a8d0-1c0993ecd60b")
     static final StyleKey TEXTCOLOR = BpmnDiagramViewStructuredStyleKeys.TEXTCOLOR;

    @objid ("23045f81-643e-4d92-84ce-92c13e140ad2")
     static final StyleKey SHOWNAME = BpmnDiagramViewStructuredStyleKeys.SHOWNAME;

    @objid ("811c1fe3-0f3b-4d1f-97e7-a81fe0359d8d")
     static final StyleKey SHOWSTEREOTYPES = BpmnDiagramViewStructuredStyleKeys.SHOWSTEREOTYPES;

    @objid ("cecbf5a6-b6be-422d-9649-6b1fa8d1462b")
     static final StyleKey SHOWTAGS = BpmnDiagramViewStructuredStyleKeys.SHOWTAGS;

}
