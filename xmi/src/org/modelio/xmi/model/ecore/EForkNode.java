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
import org.modelio.metamodel.uml.behavior.activityModel.ForkJoinNode;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.xmi.util.ObjingEAnnotation;
import org.modelio.xmi.util.ReverseProperties;

@objid ("ddc43901-fed0-45a2-b064-a9359485870c")
public class EForkNode extends EActivityNode implements IEElement {
    @objid ("0cc1ca2b-3148-4744-8ffb-657d84da914d")
    private org.eclipse.uml2.uml.ForkNode ecoreElement;

    @objid ("d0277751-43ec-4b9b-916f-0134446962e7")
    public Element createObjingElt() {
        return Modelio.getInstance().getModelingSession().getModel()
                .createForkJoinNode();
    }

    @objid ("78748afc-0fac-4636-a4c6-55d597e22cca")
    public EForkNode(org.eclipse.uml2.uml.ForkNode element) {
        super(element);
        ecoreElement = element;
    }

    @objid ("8696816c-5066-41bf-bb6e-ed3836ba5c3f")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("f2cc8662-f56b-4db5-82af-5f697e7e0a00")
    public void attach(List<Object> objingElts) {
    }

    @objid ("4eee6c5c-cf47-4c85-8cf5-7b97ad8eb4b9")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
        setJoinSpec((ForkJoinNode) objingElt);
        setCombineDuplicate((ForkJoinNode) objingElt);
    }

    @objid ("83bc8c39-ea9c-4438-b30a-9b057c5a12ee")
    private void setCombineDuplicate(ForkJoinNode node) {
        if (ReverseProperties.getInstance().isRoundtripEnabled())
            node.setIsCombineDuplicate(ObjingEAnnotation.isCombineDuplicate(ecoreElement));
    }

    @objid ("693d8b4f-3b57-407e-8351-82fc3d6ddbfe")
    private void setJoinSpec(ForkJoinNode node) {
        if (ReverseProperties.getInstance().isRoundtripEnabled())
        node.setJoinSpec(ObjingEAnnotation.getJoinSpec(ecoreElement));
    }

}
