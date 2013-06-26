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
    @objid ("7340e585-b5e1-413b-a77f-a321ebc1c642")
    @Override
    public boolean isIsBehavior() {
        return (Boolean) getAttVal(PortData.Metadata.IsBehaviorAtt());
    }

    @objid ("8c65baf1-d917-42a3-a24c-16e244267101")
    @Override
    public void setIsBehavior(boolean value) {
        setAttVal(PortData.Metadata.IsBehaviorAtt(), value);
    }

    @objid ("bab84f15-5bf4-4ab3-85db-04d0ac7be35f")
    @Override
    public boolean isIsService() {
        return (Boolean) getAttVal(PortData.Metadata.IsServiceAtt());
    }

    @objid ("88670b6b-974f-437c-9b51-aff7fbd4212d")
    @Override
    public void setIsService(boolean value) {
        setAttVal(PortData.Metadata.IsServiceAtt(), value);
    }

    @objid ("bb7deee3-0c7b-4985-8fc1-05fb84e4a036")
    @Override
    public boolean isIsConjugated() {
        return (Boolean) getAttVal(PortData.Metadata.IsConjugatedAtt());
    }

    @objid ("1960df64-d7c0-431d-9023-51bbb2b896d1")
    @Override
    public void setIsConjugated(boolean value) {
        setAttVal(PortData.Metadata.IsConjugatedAtt(), value);
    }

    @objid ("040f3d2d-749b-4439-93d6-ae07863ce2a9")
    @Override
    public PortOrientation getDirection() {
        return (PortOrientation) getAttVal(PortData.Metadata.DirectionAtt());
    }

    @objid ("52b098e0-a3b9-4cdc-833b-9bd901152ef0")
    @Override
    public void setDirection(PortOrientation value) {
        setAttVal(PortData.Metadata.DirectionAtt(), value);
    }

    @objid ("f47ba078-b047-4f75-b97d-05b14138381b")
    @Override
    public EList<ProvidedInterface> getProvided() {
        return new SmList<>(this, PortData.Metadata.ProvidedDep());
    }

    @objid ("ff5d1bcd-401b-4894-8a28-a70b3c052e97")
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

    @objid ("68595fdb-c744-4315-b9e9-4aaed3be79e6")
    @Override
    public EList<RequiredInterface> getRequired() {
        return new SmList<>(this, PortData.Metadata.RequiredDep());
    }

    @objid ("93487cde-dc42-46fe-adec-ef5e9f12b698")
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

    @objid ("82834148-3f20-4f29-9a20-392384dbda44")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("2753eb4c-ed71-4ef2-9431-b986940f00a0")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("d8210ff2-7309-465d-932b-bde79803fcc7")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPort(this);
        else
          return null;
    }

}
