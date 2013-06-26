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
    @objid ("210b83eb-95f6-49af-83ef-cebfa4516f22")
    @Override
    public String getErrorCode() {
        return (String) getAttVal(BpmnErrorEventDefinitionData.Metadata.ErrorCodeAtt());
    }

    @objid ("3ea83834-b81c-4d7d-be5e-cbc4604c0d1f")
    @Override
    public void setErrorCode(String value) {
        setAttVal(BpmnErrorEventDefinitionData.Metadata.ErrorCodeAtt(), value);
    }

    @objid ("af975ae8-bde6-4e63-a5a2-f2b6d218a5ae")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("a60259c2-6151-4cd0-a8e7-d69474a83b2a")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("4c07e74c-8cbc-415b-b46e-d1cb485ede98")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnErrorEventDefinition(this);
        else
          return null;
    }

}
