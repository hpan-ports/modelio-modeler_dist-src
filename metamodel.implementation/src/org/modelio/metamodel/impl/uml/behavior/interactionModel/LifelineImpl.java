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
    @objid ("161a20b7-3b2a-4749-9707-b8a972da2e7d")
    @Override
    public String getSelector() {
        return (String) getAttVal(LifelineData.Metadata.SelectorAtt());
    }

    @objid ("91823c47-974f-45e1-94e1-980395ac6786")
    @Override
    public void setSelector(String value) {
        setAttVal(LifelineData.Metadata.SelectorAtt(), value);
    }

    @objid ("3a669847-40c6-48fd-a787-ca2d17235ff1")
    @Override
    public EList<InteractionFragment> getCoveredBy() {
        return new SmList<>(this, LifelineData.Metadata.CoveredByDep());
    }

    @objid ("9d6c33e5-376c-45c2-9f16-f3ce8bc1246e")
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

    @objid ("7768e4e0-9df4-4fcb-8dcd-cfe1faa0cff3")
    @Override
    public PartDecomposition getDecomposedAs() {
        return (PartDecomposition) getDepVal(LifelineData.Metadata.DecomposedAsDep());
    }

    @objid ("a9251ed5-bc7c-4021-9ee3-f845e3d45e63")
    @Override
    public void setDecomposedAs(PartDecomposition value) {
        appendDepVal(LifelineData.Metadata.DecomposedAsDep(), (SmObjectImpl)value);
    }

    @objid ("7d05e176-6de8-4256-914a-70b38791090a")
    @Override
    public Interaction getOwner() {
        return (Interaction) getDepVal(LifelineData.Metadata.OwnerDep());
    }

    @objid ("5ea6fed6-4e1c-483d-a3df-9714cecfc4b9")
    @Override
    public void setOwner(Interaction value) {
        appendDepVal(LifelineData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("df9299a5-8797-40d5-8ef1-f8b7a9e4baf8")
    @Override
    public Instance getRepresented() {
        return (Instance) getDepVal(LifelineData.Metadata.RepresentedDep());
    }

    @objid ("8bd95bc0-7391-40d2-83bd-4c3f378aa0ab")
    @Override
    public void setRepresented(Instance value) {
        appendDepVal(LifelineData.Metadata.RepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("1556b14a-917a-467b-85e6-3b60115680be")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(LifelineData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("08cf7940-1600-41ec-be3e-eaa491ccd2e0")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(LifelineData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(LifelineData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("649209e6-7883-4a24-b5bf-bea62d53ed81")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitLifeline(this);
        else
          return null;
    }

}
