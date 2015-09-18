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
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.GeneralizationData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.statik.Generalization;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("000cb930-c4bf-1fd8-97fe-001ec947cd2a")
public class GeneralizationImpl extends ModelElementImpl implements Generalization {
    @objid ("a2be79cb-d96a-4f76-a48b-d406af1499dc")
    @Override
    public String getDiscriminator() {
        return (String) getAttVal(GeneralizationData.Metadata.DiscriminatorAtt());
    }

    @objid ("dad90eaf-de59-4410-b04b-19044a0ba0c9")
    @Override
    public void setDiscriminator(String value) {
        setAttVal(GeneralizationData.Metadata.DiscriminatorAtt(), value);
    }

    @objid ("5f59d227-bc2d-4ec6-8f7f-08d5f3ba0951")
    @Override
    public NameSpace getSuperType() {
        return (NameSpace) getDepVal(GeneralizationData.Metadata.SuperTypeDep());
    }

    @objid ("78a3c9f5-56d1-4666-8969-7f328d3626d4")
    @Override
    public void setSuperType(NameSpace value) {
        appendDepVal(GeneralizationData.Metadata.SuperTypeDep(), (SmObjectImpl)value);
    }

    @objid ("ba7cdbeb-abdf-4f39-971d-90a4f1f251bb")
    @Override
    public NameSpace getSubType() {
        return (NameSpace) getDepVal(GeneralizationData.Metadata.SubTypeDep());
    }

    @objid ("7a01c191-493f-4c31-9c68-a13ec43984f1")
    @Override
    public void setSubType(NameSpace value) {
        appendDepVal(GeneralizationData.Metadata.SubTypeDep(), (SmObjectImpl)value);
    }

    @objid ("1fb5fb44-c066-4021-b455-09268c811cc0")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GeneralizationData.Metadata.SubTypeDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("a49f2db9-92ff-4cad-a497-728809375388")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GeneralizationData.Metadata.SubTypeDep());
        if (obj != null)
          return new SmDepVal(GeneralizationData.Metadata.SubTypeDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("c2ab9dcf-0f7a-49f6-892d-d89b3ff43842")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGeneralization(this);
        else
          return null;
    }

}
