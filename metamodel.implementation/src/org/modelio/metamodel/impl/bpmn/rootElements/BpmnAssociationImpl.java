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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
package org.modelio.metamodel.impl.bpmn.rootElements;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.rootElements.BpmnAssociation;
import org.modelio.metamodel.bpmn.rootElements.BpmnAssociationDirection;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnAssociationData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00775b3c-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnAssociationImpl extends BpmnArtifactImpl implements BpmnAssociation {
    @objid ("64ab97f4-ecf9-4ab0-9097-2a287b6d4af7")
    @Override
    public BpmnAssociationDirection getAssociationDirection() {
        return (BpmnAssociationDirection) getAttVal(BpmnAssociationData.Metadata.AssociationDirectionAtt());
    }

    @objid ("d5fbe82a-625d-48ba-920c-74b4caf78a9d")
    @Override
    public void setAssociationDirection(BpmnAssociationDirection value) {
        setAttVal(BpmnAssociationData.Metadata.AssociationDirectionAtt(), value);
    }

    @objid ("fed70b4f-57ff-4496-94f3-85c784a29b76")
    @Override
    public BpmnBaseElement getTargetRef() {
        return (BpmnBaseElement) getDepVal(BpmnAssociationData.Metadata.TargetRefDep());
    }

    @objid ("1c286947-865d-4678-856e-424b1cb8a826")
    @Override
    public void setTargetRef(BpmnBaseElement value) {
        appendDepVal(BpmnAssociationData.Metadata.TargetRefDep(), (SmObjectImpl)value);
    }

    @objid ("ef2bb4fc-49f4-4ea8-ade3-a174d0f237ae")
    @Override
    public BpmnBaseElement getSourceRef() {
        return (BpmnBaseElement) getDepVal(BpmnAssociationData.Metadata.SourceRefDep());
    }

    @objid ("436e8725-cc6a-4621-a8d9-cd47402963a2")
    @Override
    public void setSourceRef(BpmnBaseElement value) {
        appendDepVal(BpmnAssociationData.Metadata.SourceRefDep(), (SmObjectImpl)value);
    }

    @objid ("107942ad-96a4-4677-a4cc-e995de4921b5")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("5fb6181c-6ebd-4a27-a98c-97d82313ace3")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("daea1695-7a1a-4fcb-86d4-13e1fc21b646")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnAssociation(this);
        else
          return null;
    }

}
