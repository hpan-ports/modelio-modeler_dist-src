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
package org.modelio.metamodel.impl.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.interactionModel.LifelineData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.behavior.interactionModel.PartDecomposition;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0048dfe6-c4bf-1fd8-97fe-001ec947cd2a")
public class LifelineImpl extends ModelElementImpl implements Lifeline {
    @objid ("44847b96-ceae-44dd-84f0-ef7b3a6b0f57")
    @Override
    public String getSelector() {
        return (String) getAttVal(LifelineData.Metadata.SelectorAtt());
    }

    @objid ("183e480b-caea-4df4-a9bf-f610dfbe8e7e")
    @Override
    public void setSelector(String value) {
        setAttVal(LifelineData.Metadata.SelectorAtt(), value);
    }

    @objid ("18905cdf-daea-489e-bcff-973fa0a601b2")
    @Override
    public EList<InteractionFragment> getCoveredBy() {
        return new SmList<>(this, LifelineData.Metadata.CoveredByDep());
    }

    @objid ("d27b8c5b-6899-4fc1-829f-3e67fb04665a")
    @Override
    public <T extends InteractionFragment> List<T> getCoveredBy(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InteractionFragment element : getCoveredBy()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4406787d-281f-4ad4-b464-9f58ad87db98")
    @Override
    public PartDecomposition getDecomposedAs() {
        return (PartDecomposition) getDepVal(LifelineData.Metadata.DecomposedAsDep());
    }

    @objid ("46c846d2-370f-4dc9-aa2b-8b33117b9a7b")
    @Override
    public void setDecomposedAs(PartDecomposition value) {
        appendDepVal(LifelineData.Metadata.DecomposedAsDep(), (SmObjectImpl)value);
    }

    @objid ("b4005978-5043-4a7d-aea2-75c62bb9ef04")
    @Override
    public Interaction getOwner() {
        return (Interaction) getDepVal(LifelineData.Metadata.OwnerDep());
    }

    @objid ("18ea0d59-b830-4114-82c0-64c919e6e02b")
    @Override
    public void setOwner(Interaction value) {
        appendDepVal(LifelineData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("0a4aab43-1a12-4588-a9a0-1f72ec97e0b6")
    @Override
    public Instance getRepresented() {
        return (Instance) getDepVal(LifelineData.Metadata.RepresentedDep());
    }

    @objid ("cb814a50-2825-4fff-be73-1cefede26300")
    @Override
    public void setRepresented(Instance value) {
        appendDepVal(LifelineData.Metadata.RepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("263161ab-d8c9-4a1b-80da-5df33a8faf89")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(LifelineData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("1144fdea-bef3-43cc-b6d8-07b9bfdda451")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(LifelineData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(LifelineData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("8e70e66a-739a-4f7e-94fd-81278c3b64e8")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitLifeline(this);
        else
          return null;
    }

}
