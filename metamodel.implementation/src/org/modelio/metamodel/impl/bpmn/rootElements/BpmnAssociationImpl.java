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
/*   Metamodel version: 9019              */
/*   SemGen version   : 2.0.07.9012       */
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
    @objid ("b24bdfbc-87f4-4324-8f15-00fa660ba382")
    @Override
    public BpmnAssociationDirection getAssociationDirection() {
        return (BpmnAssociationDirection) getAttVal(BpmnAssociationData.Metadata.AssociationDirectionAtt());
    }

    @objid ("ad0fe430-f0dd-43e7-8476-6a6d204d1212")
    @Override
    public void setAssociationDirection(BpmnAssociationDirection value) {
        setAttVal(BpmnAssociationData.Metadata.AssociationDirectionAtt(), value);
    }

    @objid ("8c38a5bb-e5ef-4401-b097-7149b1e29ca6")
    @Override
    public BpmnBaseElement getTargetRef() {
        return (BpmnBaseElement) getDepVal(BpmnAssociationData.Metadata.TargetRefDep());
    }

    @objid ("18ee61ab-770b-4df7-a07f-17ee5299d084")
    @Override
    public void setTargetRef(BpmnBaseElement value) {
        appendDepVal(BpmnAssociationData.Metadata.TargetRefDep(), (SmObjectImpl)value);
    }

    @objid ("3e2a8a1c-bddd-413b-9305-03b6f3347e20")
    @Override
    public BpmnBaseElement getSourceRef() {
        return (BpmnBaseElement) getDepVal(BpmnAssociationData.Metadata.SourceRefDep());
    }

    @objid ("38986561-66ea-435e-8b81-fcb8401de7cf")
    @Override
    public void setSourceRef(BpmnBaseElement value) {
        appendDepVal(BpmnAssociationData.Metadata.SourceRefDep(), (SmObjectImpl)value);
    }

    @objid ("7dc56ebc-2b9e-440d-99fe-e2bca044a981")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("484edf94-af5f-4735-a7d4-68fd428813ec")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("04bd6623-45ac-4c18-ad72-a039bb88d7de")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnAssociation(this);
        else
          return null;
    }

}
