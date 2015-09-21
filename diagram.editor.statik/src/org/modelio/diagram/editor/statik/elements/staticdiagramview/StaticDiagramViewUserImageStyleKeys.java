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


package org.modelio.diagram.editor.statik.elements.staticdiagramview;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.diagram.editor.statik.style.StaticAbstractStyleKeyProvider;
import org.modelio.diagram.styles.core.StyleKey;

/**
 * GmClass style keys for the stereotype image representation mode.
 * 
 * @author cmarin
 */
@objid ("5aee0ade-ffcf-4f93-9ed5-31ae037dbe99")
public class StaticDiagramViewUserImageStyleKeys extends StaticAbstractStyleKeyProvider {
    @objid ("3e7d7c66-024f-4f54-a571-d8dd6f35b7d0")
     static final StyleKey FONT = StaticDiagramViewStructuredStyleKeys.FONT;

    @objid ("83c928ad-97b1-4686-98bc-a4b5f1497d97")
     static final StyleKey TEXTCOLOR = StaticDiagramViewStructuredStyleKeys.TEXTCOLOR;

    @objid ("2c764aaf-0224-476e-b105-6ed25ccc5047")
     static final StyleKey SHOWNAME = StaticDiagramViewStructuredStyleKeys.SHOWNAME;

    @objid ("918d3d75-5560-4819-ab6f-b29a82ade2c7")
     static final StyleKey SHOWSTEREOTYPES = StaticDiagramViewStructuredStyleKeys.SHOWSTEREOTYPES;

    @objid ("c5ba1542-3cc3-41d5-a23b-1f14b13aad87")
     static final StyleKey SHOWTAGS = StaticDiagramViewStructuredStyleKeys.SHOWTAGS;

}
