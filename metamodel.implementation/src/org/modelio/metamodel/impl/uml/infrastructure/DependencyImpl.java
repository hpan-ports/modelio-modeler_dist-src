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
    @objid ("7ad3853d-0062-4398-be98-f9d6c4455905")
    @Override
    public String getDependsOnId() {
        return (String) getAttVal(DependencyData.Metadata.DependsOnIdAtt());
    }

    @objid ("0ad0d5ff-5f96-45ef-a6c9-67cf54538050")
    @Override
    public void setDependsOnId(String value) {
        setAttVal(DependencyData.Metadata.DependsOnIdAtt(), value);
    }

    @objid ("158fa665-f750-4691-9858-b7b45354038d")
    @Override
    public String getDependsOnName() {
        return (String) getAttVal(DependencyData.Metadata.DependsOnNameAtt());
    }

    @objid ("c699babf-04ec-4a66-a98c-40297d269576")
    @Override
    public void setDependsOnName(String value) {
        setAttVal(DependencyData.Metadata.DependsOnNameAtt(), value);
    }

    @objid ("1e155bc0-8e3a-4143-8d54-b13d55422a66")
    @Override
    public ModelElement getDependsOn() {
        return (ModelElement) getDepVal(DependencyData.Metadata.DependsOnDep());
    }

    @objid ("056ce695-f3be-4d20-b2ca-5e6f29c2c4fe")
    @Override
    public void setDependsOn(ModelElement value) {
        appendDepVal(DependencyData.Metadata.DependsOnDep(), (SmObjectImpl)value);
    }

    @objid ("80b0ae00-f103-473c-879a-c0c4c90fe479")
    @Override
    public ModelElement getImpacted() {
        return (ModelElement) getDepVal(DependencyData.Metadata.ImpactedDep());
    }

    @objid ("dc79c96b-033f-49e9-8c1c-2c52520db344")
    @Override
    public void setImpacted(ModelElement value) {
        appendDepVal(DependencyData.Metadata.ImpactedDep(), (SmObjectImpl)value);
    }

    @objid ("e015fba3-ea16-4e9e-89f6-1f2ffc73b12e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(DependencyData.Metadata.ImpactedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("8594caf2-2d2f-4dfe-be99-f303542aee87")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(DependencyData.Metadata.ImpactedDep());
        if (obj != null)
          return new SmDepVal(DependencyData.Metadata.ImpactedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("19fbfece-bdee-45a8-a44f-2975f8d9c873")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitDependency(this);
        else
          return null;
    }

}
