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
import org.modelio.metamodel.uml.infrastructure.LocalTaggedValue;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.util.XMILogs;

@objid ("d75d8b8a-9ba2-47fe-8e22-630f70182226")
public class OLocalTaggedValue extends OElement implements IOElement {
    @objid ("2e523c2a-f377-4702-bdef-19ed287cd41e")
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

    @objid ("558b1af0-2df9-4cae-bdfc-ca2a6dffc76c")
    public OLocalTaggedValue(LocalTaggedValue param) {
        super(param);
    }

    @objid ("8196f53e-bc75-433c-be0a-a1ffc2ed924d")
    public void attach(org.eclipse.uml2.uml.Element ecoreElt) {
        // TODO Auto-generated method stub
    }

    @objid ("6dc921c1-e135-4201-a0b1-8ea888f73454")
    public void setProperties(org.eclipse.uml2.uml.Element ecoreElt) {
        // TODO Auto-generated method stub
    }

}
