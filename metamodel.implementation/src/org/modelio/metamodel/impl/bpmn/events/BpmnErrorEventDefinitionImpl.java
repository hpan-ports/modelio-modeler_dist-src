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
package org.modelio.metamodel.impl.bpmn.events;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.events.BpmnErrorEventDefinition;
import org.modelio.metamodel.data.bpmn.events.BpmnErrorEventDefinitionData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("008b71e4-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnErrorEventDefinitionImpl extends BpmnEventDefinitionImpl implements BpmnErrorEventDefinition {
    @objid ("316850c8-7469-4627-9d16-d83ef7c236bd")
    @Override
    public String getErrorCode() {
        return (String) getAttVal(BpmnErrorEventDefinitionData.Metadata.ErrorCodeAtt());
    }

    @objid ("d085fbac-3898-412b-b1a0-614e8b1e9e09")
    @Override
    public void setErrorCode(String value) {
        setAttVal(BpmnErrorEventDefinitionData.Metadata.ErrorCodeAtt(), value);
    }

    @objid ("3f0199b5-87ef-4aca-97cb-32d00ccdcb87")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("b097ccb4-9c61-4b9f-bab7-ad3312dda729")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("4aa5007e-1b5d-4ab8-8142-cede5b5cefbe")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnErrorEventDefinition(this);
        else
          return null;
    }

}
