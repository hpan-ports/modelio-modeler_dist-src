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
                                    

package org.modelio.xmi.model.ecore;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.Modelio;
import org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.xmi.util.IModelerModuleStereotypes;

@objid ("2c32feb0-a23e-4353-afad-57673c2cabda")
public class EReadLinkObjectEndAction extends EActivityNode implements IEElement {
    @objid ("973ec6da-3818-47a2-afcd-eb248f3298b7")
    public Element createObjingElt() {
        OpaqueAction element = Modelio.getInstance().getModelingSession().getModel()
                .createOpaqueAction();
        
        Stereotype stereo = Modelio.getInstance().getModelingSession().getMetamodelExtensions()
                .getStereotype(IModelerModuleStereotypes.UML2READLINKOBJECTENDQUALIFIERACTION, element.getMClass());
        element.getExtension().add(stereo);
        return element;
    }

    @objid ("ae076631-d97e-4505-81df-60bf0a015b6d")
    public EReadLinkObjectEndAction(org.eclipse.uml2.uml.ReadLinkObjectEndAction element) {
        super(element);
    }

    @objid ("2e3a0672-c822-4421-92b5-a5a392a68da8")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("a58fc3c3-e14c-4b72-ac29-34cb64f79fca")
    public void attach(List<Object> objingElts) {
    }

    @objid ("366c2330-dcf3-472d-ab69-8d30430bf7dc")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
