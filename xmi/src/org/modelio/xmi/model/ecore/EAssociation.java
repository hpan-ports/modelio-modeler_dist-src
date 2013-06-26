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

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.uml2.uml.Property;
import org.modelio.api.modelio.Modelio;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.xmi.util.EcoreModelNavigation;
import org.modelio.xmi.util.ReverseProperties;

@objid ("5adff1b3-6055-4371-83cd-c9bd6c1fe10f")
public class EAssociation extends ENamedElement implements IEElement {
    @objid ("ab148b55-e405-44f7-8d6c-02d9d133caf8")
    public Element createObjingElt() {
        if (EcoreModelNavigation.hasTwoValidEnds((org.eclipse.uml2.uml.Association)getEcoreElement()))
            return Modelio.getInstance().getModelingSession().getModel().createAssociation();
        return null;
    }

    @objid ("3562eaaa-5bad-4c51-87d9-84c227fdc992")
    public EAssociation(org.eclipse.uml2.uml.Association element) {
        super(element);
    }

    @objid ("24007735-fd41-411d-b69b-ae9f0027163e")
    public void attach(Element objingElt) {
        ReverseProperties revProp = ReverseProperties.getInstance();
        Association objingAssoc = (Association) objingElt;
        
        for (Object memberEnd : ((org.eclipse.uml2.uml.Association) getEcoreElement()).getMemberEnds()) {
            Object ends = revProp.getMappedElement((org.eclipse.uml2.uml.Element) memberEnd);
            AssociationEnd objingAssocEnd = null;
            if (ends instanceof AssociationEnd){
                objingAssocEnd = (AssociationEnd) ends;
            }else if (ends instanceof ArrayList<?>){
                for (ModelElement end : (ArrayList<ModelElement>) ends ){
                    if (end instanceof AssociationEnd){
                        objingAssocEnd = (AssociationEnd) end;
                        break;
                    }
                }
            }
        
            if ((objingAssocEnd != null) 
                    && (!(((Property) memberEnd).getType() instanceof org.eclipse.uml2.uml.Artifact))){
                // Links the AssociationEnd to the org.eclipse.uml2.uml.Association:
                    objingAssocEnd.setAssociation(objingAssoc);
            }
        }
    }

    @objid ("621be3c5-0ac9-4df0-90d8-ec7feb22c548")
    public void attach(List<Object> objingElts) {
    }

    @objid ("db6cc20c-f994-40ec-a04f-78c01a928f14")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
