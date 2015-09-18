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
    @objid ("4bfe35b0-2381-47f9-b8f3-e8da96a52f32")
    @Override
    public boolean isIsBehavior() {
        return (Boolean) getAttVal(PortData.Metadata.IsBehaviorAtt());
    }

    @objid ("c145567e-9300-4207-8ca7-51567adce6f0")
    @Override
    public void setIsBehavior(boolean value) {
        setAttVal(PortData.Metadata.IsBehaviorAtt(), value);
    }

    @objid ("c2b3e06f-56d5-4066-95d6-2c9fb1193ca4")
    @Override
    public boolean isIsService() {
        return (Boolean) getAttVal(PortData.Metadata.IsServiceAtt());
    }

    @objid ("30236e33-4fc7-4772-90b6-18b840d3abda")
    @Override
    public void setIsService(boolean value) {
        setAttVal(PortData.Metadata.IsServiceAtt(), value);
    }

    @objid ("dcc43750-397b-46da-8812-32d10594369e")
    @Override
    public boolean isIsConjugated() {
        return (Boolean) getAttVal(PortData.Metadata.IsConjugatedAtt());
    }

    @objid ("5acc88a3-b0c3-4f68-9b01-528e0a84c28c")
    @Override
    public void setIsConjugated(boolean value) {
        setAttVal(PortData.Metadata.IsConjugatedAtt(), value);
    }

    @objid ("1b707fb0-3906-445c-a9b4-2d2c4187532b")
    @Override
    public PortOrientation getDirection() {
        return (PortOrientation) getAttVal(PortData.Metadata.DirectionAtt());
    }

    @objid ("02badbc7-f433-4695-84a4-edf232b324f1")
    @Override
    public void setDirection(PortOrientation value) {
        setAttVal(PortData.Metadata.DirectionAtt(), value);
    }

    @objid ("f290dd0d-f63d-4193-9c51-e273ff63f085")
    @Override
    public EList<ProvidedInterface> getProvided() {
        return new SmList<>(this, PortData.Metadata.ProvidedDep());
    }

    @objid ("96af5b9e-57ee-47ee-8ce4-54fa22d4aa6a")
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

    @objid ("7975b9a5-082e-47e1-a4b4-85298479e40e")
    @Override
    public EList<RequiredInterface> getRequired() {
        return new SmList<>(this, PortData.Metadata.RequiredDep());
    }

    @objid ("8394cf45-ce7b-479b-a0da-49a53c3f115c")
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

    @objid ("7d9121cb-11f2-4054-a9fa-3dc3e8d7edd2")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("13121e38-5514-47b2-b83f-cde1e8e50ca0")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("a93c2862-512d-4c37-adcb-1c4fe10a4d39")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPort(this);
        else
          return null;
    }

}
