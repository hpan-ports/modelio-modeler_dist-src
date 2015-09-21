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


package org.modelio.diagram.editor.activity.elements.activitydiagramview;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.diagram.editor.activity.style.ActivityAbstractStyleKeyProvider;
import org.modelio.diagram.styles.core.StyleKey;

/**
 * Style keys for the stereotype image representation mode.
 * 
 * @author cmarin
 */
@objid ("6bef6e37-4d17-49e1-9979-8e9843ade156")
public class ActivityDiagramViewUserImageStyleKeys extends ActivityAbstractStyleKeyProvider {
    @objid ("24dd962d-0a69-424e-9bd9-97151f1a00af")
     static final StyleKey FONT = ActivityDiagramViewStructuredStyleKeys.FONT;

    @objid ("736844fa-7182-41c3-956c-64b2f17c2d0f")
     static final StyleKey TEXTCOLOR = ActivityDiagramViewStructuredStyleKeys.TEXTCOLOR;

    @objid ("d34eaa47-876f-4ecd-9bdb-afeb3b389983")
     static final StyleKey SHOWNAME = ActivityDiagramViewStructuredStyleKeys.SHOWNAME;

    @objid ("9d556603-83cc-4bc3-976f-2875261f4ea1")
     static final StyleKey SHOWSTEREOTYPES = ActivityDiagramViewStructuredStyleKeys.SHOWSTEREOTYPES;

    @objid ("5f0d6039-ab23-46c9-bd95-dbbec974d981")
     static final StyleKey SHOWTAGS = ActivityDiagramViewStructuredStyleKeys.SHOWTAGS;

}
