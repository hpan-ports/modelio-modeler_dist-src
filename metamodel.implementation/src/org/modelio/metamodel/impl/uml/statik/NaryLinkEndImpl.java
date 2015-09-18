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
import org.modelio.metamodel.data.uml.statik.NaryLinkEndData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NaryLink;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;
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

@objid ("0075d726-17e8-10a1-88a0-001ec947cd2a")
public class NaryLinkEndImpl extends ModelElementImpl implements NaryLinkEnd {
    @objid ("0abcc7ab-0684-4e16-a7ad-0060e24a8474")
    @Override
    public boolean isIsOrdered() {
        return (Boolean) getAttVal(NaryLinkEndData.Metadata.IsOrderedAtt());
    }

    @objid ("1bf8316f-92fb-49c6-a553-359ce3d13aff")
    @Override
    public void setIsOrdered(boolean value) {
        setAttVal(NaryLinkEndData.Metadata.IsOrderedAtt(), value);
    }

    @objid ("45e28205-d7ea-49b8-9ed2-9e4f94f28d7c")
    @Override
    public boolean isIsUnique() {
        return (Boolean) getAttVal(NaryLinkEndData.Metadata.IsUniqueAtt());
    }

    @objid ("4c233a33-63f4-4b8f-b85c-a9e464e543c7")
    @Override
    public void setIsUnique(boolean value) {
        setAttVal(NaryLinkEndData.Metadata.IsUniqueAtt(), value);
    }

    @objid ("e9ee0a4b-b1fd-48cf-a630-4315812b1050")
    @Override
    public String getMultiplicityMax() {
        return (String) getAttVal(NaryLinkEndData.Metadata.MultiplicityMaxAtt());
    }

    @objid ("01a1c541-31de-431d-b4d6-27500610b8b1")
    @Override
    public void setMultiplicityMax(String value) {
        setAttVal(NaryLinkEndData.Metadata.MultiplicityMaxAtt(), value);
    }

    @objid ("46e0f488-2a6d-4a3c-9d9a-d15a54b6586f")
    @Override
    public String getMultiplicityMin() {
        return (String) getAttVal(NaryLinkEndData.Metadata.MultiplicityMinAtt());
    }

    @objid ("b5a41037-6bd5-4410-950b-2729b910c3ed")
    @Override
    public void setMultiplicityMin(String value) {
        setAttVal(NaryLinkEndData.Metadata.MultiplicityMinAtt(), value);
    }

    @objid ("79c8a948-8f20-4bc3-af23-3e798c9bae13")
    @Override
    public Instance getSource() {
        return (Instance) getDepVal(NaryLinkEndData.Metadata.SourceDep());
    }

    @objid ("d77e9e64-025f-497f-b353-4b6e245996fb")
    @Override
    public void setSource(Instance value) {
        appendDepVal(NaryLinkEndData.Metadata.SourceDep(), (SmObjectImpl)value);
    }

    @objid ("019b8660-c3ce-4075-ade2-d72f7a45fcd2")
    @Override
    public NaryLink getNaryLink() {
        return (NaryLink) getDepVal(NaryLinkEndData.Metadata.NaryLinkDep());
    }

    @objid ("c68a9ece-a182-49dc-af64-5ac4ce93ece7")
    @Override
    public void setNaryLink(NaryLink value) {
        appendDepVal(NaryLinkEndData.Metadata.NaryLinkDep(), (SmObjectImpl)value);
    }

    @objid ("7c1535cc-b2c5-441f-a66e-ba7d0f8d9dba")
    @Override
    public RequiredInterface getConsumer() {
        return (RequiredInterface) getDepVal(NaryLinkEndData.Metadata.ConsumerDep());
    }

    @objid ("b6b0718f-43a0-4082-bc33-61c3031147f6")
    @Override
    public void setConsumer(RequiredInterface value) {
        appendDepVal(NaryLinkEndData.Metadata.ConsumerDep(), (SmObjectImpl)value);
    }

    @objid ("e8823189-e4b5-471b-a20e-cc11b8e3e270")
    @Override
    public ProvidedInterface getProvider() {
        return (ProvidedInterface) getDepVal(NaryLinkEndData.Metadata.ProviderDep());
    }

    @objid ("6c018eb6-af8b-4de0-9ec7-132c85f4020d")
    @Override
    public void setProvider(ProvidedInterface value) {
        appendDepVal(NaryLinkEndData.Metadata.ProviderDep(), (SmObjectImpl)value);
    }

    @objid ("c1696e7b-36a2-4a1c-b1b3-b0acf9ae3217")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(NaryLinkEndData.Metadata.SourceDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(NaryLinkEndData.Metadata.NaryLinkDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("d7066d8b-3cc1-4c99-a7c7-7220bf1106d4")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(NaryLinkEndData.Metadata.SourceDep());
        if (obj != null)
          return new SmDepVal(NaryLinkEndData.Metadata.SourceDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(NaryLinkEndData.Metadata.NaryLinkDep());
        if (obj != null)
          return new SmDepVal(NaryLinkEndData.Metadata.NaryLinkDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("b95b9771-dc73-440a-adf8-c33245265cf9")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNaryLinkEnd(this);
        else
          return null;
    }

}
