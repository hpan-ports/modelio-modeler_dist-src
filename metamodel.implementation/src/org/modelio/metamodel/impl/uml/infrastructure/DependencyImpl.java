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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.DependencyData;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00860ba0-c4be-1fd8-97fe-001ec947cd2a")
public class DependencyImpl extends ModelElementImpl implements Dependency {
    @objid ("ef684d90-a5b2-4590-8d46-199612678aa2")
    @Override
    public String getDependsOnId() {
        return (String) getAttVal(DependencyData.Metadata.DependsOnIdAtt());
    }

    @objid ("61b9d70c-7a5a-4f43-bdb0-04a1da55638d")
    @Override
    public void setDependsOnId(String value) {
        setAttVal(DependencyData.Metadata.DependsOnIdAtt(), value);
    }

    @objid ("615404e0-22aa-4a10-bb15-ffab3600f244")
    @Override
    public String getDependsOnName() {
        return (String) getAttVal(DependencyData.Metadata.DependsOnNameAtt());
    }

    @objid ("f6989549-7d74-409f-8b00-6985c8be5a57")
    @Override
    public void setDependsOnName(String value) {
        setAttVal(DependencyData.Metadata.DependsOnNameAtt(), value);
    }

    @objid ("8b5f4b2e-84c4-43fc-b49b-e5f876dadc9a")
    @Override
    public ModelElement getDependsOn() {
        return (ModelElement) getDepVal(DependencyData.Metadata.DependsOnDep());
    }

    @objid ("bc21a5d1-dcc2-4be2-a1e4-7f420756988e")
    @Override
    public void setDependsOn(ModelElement value) {
        appendDepVal(DependencyData.Metadata.DependsOnDep(), (SmObjectImpl)value);
    }

    @objid ("ef6e1ce5-23c5-4eed-bacf-c280ab2a1d1a")
    @Override
    public ModelElement getImpacted() {
        return (ModelElement) getDepVal(DependencyData.Metadata.ImpactedDep());
    }

    @objid ("cb932c4d-504e-4d6e-b6f5-513c1ff07c55")
    @Override
    public void setImpacted(ModelElement value) {
        appendDepVal(DependencyData.Metadata.ImpactedDep(), (SmObjectImpl)value);
    }

    @objid ("d1fb8357-f9fc-42f7-a025-3f88b6f9153a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(DependencyData.Metadata.ImpactedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("4c36c294-bd08-4aca-99a1-47af595d01b6")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(DependencyData.Metadata.ImpactedDep());
        if (obj != null)
          return new SmDepVal(DependencyData.Metadata.ImpactedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("88c5a58c-b23c-4a0d-940c-a3b84f9121a7")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitDependency(this);
        else
          return null;
    }

}
