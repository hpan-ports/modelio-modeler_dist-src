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
    @objid ("6880c074-c5df-4423-9e1e-f78a59fc3adb")
    @Override
    public String getDependsOnId() {
        return (String) getAttVal(DependencyData.Metadata.DependsOnIdAtt());
    }

    @objid ("6836b2d3-791c-4266-a314-3217ac5aad09")
    @Override
    public void setDependsOnId(String value) {
        setAttVal(DependencyData.Metadata.DependsOnIdAtt(), value);
    }

    @objid ("8c1bf782-586d-4cf1-ad34-a6854dd3286d")
    @Override
    public String getDependsOnName() {
        return (String) getAttVal(DependencyData.Metadata.DependsOnNameAtt());
    }

    @objid ("428f6a5e-7ebf-4236-b3a3-b5c18f935e66")
    @Override
    public void setDependsOnName(String value) {
        setAttVal(DependencyData.Metadata.DependsOnNameAtt(), value);
    }

    @objid ("b22946d5-429f-4ea7-9f8e-d47915b57e70")
    @Override
    public ModelElement getDependsOn() {
        return (ModelElement) getDepVal(DependencyData.Metadata.DependsOnDep());
    }

    @objid ("818d3b56-60d2-4cca-b6d5-de9b3d6e6c39")
    @Override
    public void setDependsOn(ModelElement value) {
        appendDepVal(DependencyData.Metadata.DependsOnDep(), (SmObjectImpl)value);
    }

    @objid ("ee114832-90b7-4c6e-bf17-f178f3d4baab")
    @Override
    public ModelElement getImpacted() {
        return (ModelElement) getDepVal(DependencyData.Metadata.ImpactedDep());
    }

    @objid ("efb77832-691a-4037-ab63-1110dedd173f")
    @Override
    public void setImpacted(ModelElement value) {
        appendDepVal(DependencyData.Metadata.ImpactedDep(), (SmObjectImpl)value);
    }

    @objid ("f8444576-c2f5-48c8-9267-ef8987149b23")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(DependencyData.Metadata.ImpactedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("93599b5d-93a3-4f0d-b3c1-e990d1203512")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(DependencyData.Metadata.ImpactedDep());
        if (obj != null)
          return new SmDepVal(DependencyData.Metadata.ImpactedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("1b295f45-185a-40f8-b011-c2600493ea92")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitDependency(this);
        else
          return null;
    }

}
