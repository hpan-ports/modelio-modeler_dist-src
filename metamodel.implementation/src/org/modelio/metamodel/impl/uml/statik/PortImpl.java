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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.PortData;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.PortOrientation;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.uml.statik.RequiredInterface;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0018eeee-c4bf-1fd8-97fe-001ec947cd2a")
public class PortImpl extends BindableInstanceImpl implements Port {
    @objid ("f51ae0f7-63cd-4e8a-94f7-ec0158931a58")
    @Override
    public boolean isIsBehavior() {
        return (Boolean) getAttVal(PortData.Metadata.IsBehaviorAtt());
    }

    @objid ("6d2cd4ee-9b74-4d5e-98f5-47511be76e6b")
    @Override
    public void setIsBehavior(boolean value) {
        setAttVal(PortData.Metadata.IsBehaviorAtt(), value);
    }

    @objid ("1a986a4b-5d61-41a6-8c74-9d4a3b13926b")
    @Override
    public boolean isIsService() {
        return (Boolean) getAttVal(PortData.Metadata.IsServiceAtt());
    }

    @objid ("b35c6119-2ec2-44a1-a164-e72e90a3fde6")
    @Override
    public void setIsService(boolean value) {
        setAttVal(PortData.Metadata.IsServiceAtt(), value);
    }

    @objid ("43337f2c-b68c-49ed-9a5c-37866dfd9bed")
    @Override
    public boolean isIsConjugated() {
        return (Boolean) getAttVal(PortData.Metadata.IsConjugatedAtt());
    }

    @objid ("5b1a4f81-c4cf-4454-87fd-cbea0e26538f")
    @Override
    public void setIsConjugated(boolean value) {
        setAttVal(PortData.Metadata.IsConjugatedAtt(), value);
    }

    @objid ("58aa6fde-3dc2-4c0c-acb6-31a2697d55e8")
    @Override
    public PortOrientation getDirection() {
        return (PortOrientation) getAttVal(PortData.Metadata.DirectionAtt());
    }

    @objid ("85d2162e-0955-4aaf-ab11-151719ad1d71")
    @Override
    public void setDirection(PortOrientation value) {
        setAttVal(PortData.Metadata.DirectionAtt(), value);
    }

    @objid ("3cf76621-f8ed-487e-bd66-495c17abb3d2")
    @Override
    public EList<ProvidedInterface> getProvided() {
        return new SmList<>(this, PortData.Metadata.ProvidedDep());
    }

    @objid ("ccc1186d-90c4-42a2-8a61-b423f6763d97")
    @Override
    public <T extends ProvidedInterface> List<T> getProvided(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ProvidedInterface element : getProvided()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e0eda6b8-5a94-4c7b-8dc5-f4351069d189")
    @Override
    public EList<RequiredInterface> getRequired() {
        return new SmList<>(this, PortData.Metadata.RequiredDep());
    }

    @objid ("ff3fd9f3-7e6e-4765-b0d0-daa72803deda")
    @Override
    public <T extends RequiredInterface> List<T> getRequired(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final RequiredInterface element : getRequired()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("58605322-265e-4484-926a-6d14f7b63bbf")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("bd01b46e-0d83-49bf-a4b3-3d7857e80b1c")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("7e0f0fec-c166-49c2-976b-e25cc1f690b1")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPort(this);
        else
          return null;
    }

}
