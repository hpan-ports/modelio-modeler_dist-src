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
    @objid ("6ba0ea59-a7e2-4497-abe5-fff9f124ec58")
    @Override
    public String getSelector() {
        return (String) getAttVal(LifelineData.Metadata.SelectorAtt());
    }

    @objid ("a3af020f-c3ff-4c18-934c-6287f9c73386")
    @Override
    public void setSelector(String value) {
        setAttVal(LifelineData.Metadata.SelectorAtt(), value);
    }

    @objid ("4b6ed9f7-51a6-4c1f-972b-7c3b723770a4")
    @Override
    public EList<InteractionFragment> getCoveredBy() {
        return new SmList<>(this, LifelineData.Metadata.CoveredByDep());
    }

    @objid ("adbecbfe-9982-4914-b1ef-4de60e0560a4")
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

    @objid ("b50e5ba0-80e7-4f89-8d23-5d876259117e")
    @Override
    public PartDecomposition getDecomposedAs() {
        return (PartDecomposition) getDepVal(LifelineData.Metadata.DecomposedAsDep());
    }

    @objid ("590e5a96-bc55-45df-b504-909b88a3c517")
    @Override
    public void setDecomposedAs(PartDecomposition value) {
        appendDepVal(LifelineData.Metadata.DecomposedAsDep(), (SmObjectImpl)value);
    }

    @objid ("aaf7619e-8b48-4577-9ced-9e5c8fe44860")
    @Override
    public Interaction getOwner() {
        return (Interaction) getDepVal(LifelineData.Metadata.OwnerDep());
    }

    @objid ("3bab91ac-4c7e-4100-9805-9c60763a390e")
    @Override
    public void setOwner(Interaction value) {
        appendDepVal(LifelineData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("116509c2-3bd5-4d10-a5fb-83f5f803d517")
    @Override
    public Instance getRepresented() {
        return (Instance) getDepVal(LifelineData.Metadata.RepresentedDep());
    }

    @objid ("26e7562f-1ec9-40ee-95c8-13383489db1e")
    @Override
    public void setRepresented(Instance value) {
        appendDepVal(LifelineData.Metadata.RepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("bb0a22d0-889f-4ff6-8804-405c47e1e720")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(LifelineData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("95681080-5c51-4fda-9745-bb7ec70c040d")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(LifelineData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(LifelineData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("bac70f15-8060-483a-ba73-507b8d24e79c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitLifeline(this);
        else
          return null;
    }

}
