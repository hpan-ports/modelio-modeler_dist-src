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
                                    

package org.modelio.xmi.model.objing;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.LocalNote;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.util.XMILogs;

@objid ("7050ed40-aad8-4a4b-b2d0-ba369751f260")
public class OLocalNote extends OElement implements IOElement {
    @objid ("9c4d193e-4469-48df-a6c6-991b606c608d")
    public org.eclipse.uml2.uml.Element createEcoreElt() {
        // TODO Auto-generated method stub
        String metaClassName = this.getClass().getSimpleName();
        // String packagingStr = "org.modelio.xmi.model.objing";
        metaClassName = metaClassName.substring(1);
                
        XMILogs.getInstance().writelnInLog(
                Xmi.I18N.getMessage("logFile.warning.elementNotMapped",
                        metaClassName));
        return null;
    }

    @objid ("c14eb391-e5c4-4078-9a26-73f54c1ba068")
    public OLocalNote(LocalNote param) {
        super(param);
    }

    @objid ("4cb32d17-b758-4c77-826e-86a56cc08ef4")
    public void attach(org.eclipse.uml2.uml.Element ecoreElt) {
        // TODO Auto-generated method stub
    }

    @objid ("40a463f8-1a24-4201-a817-2973baa42d28")
    public void setProperties(org.eclipse.uml2.uml.Element ecoreElt) {
        // TODO Auto-generated method stub
    }

}
