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
    @objid ("351be492-37b3-42d0-92ab-2456150fabcf")
    @Override
    public boolean isIsOrdered() {
        return (Boolean) getAttVal(NaryLinkEndData.Metadata.IsOrderedAtt());
    }

    @objid ("77081db6-3aae-4a6e-9663-8fee39d3565f")
    @Override
    public void setIsOrdered(boolean value) {
        setAttVal(NaryLinkEndData.Metadata.IsOrderedAtt(), value);
    }

    @objid ("4aa5d906-3bbf-4dd9-ba0f-8a469c43b8e8")
    @Override
    public boolean isIsUnique() {
        return (Boolean) getAttVal(NaryLinkEndData.Metadata.IsUniqueAtt());
    }

    @objid ("a7a56454-39a1-4551-8bec-bce8a446f7a7")
    @Override
    public void setIsUnique(boolean value) {
        setAttVal(NaryLinkEndData.Metadata.IsUniqueAtt(), value);
    }

    @objid ("6e45e776-d512-439c-b0a3-fec99b8b23b1")
    @Override
    public String getMultiplicityMax() {
        return (String) getAttVal(NaryLinkEndData.Metadata.MultiplicityMaxAtt());
    }

    @objid ("f31a0b1d-c5b1-4bd0-8b1f-3c6f5bacdd19")
    @Override
    public void setMultiplicityMax(String value) {
        setAttVal(NaryLinkEndData.Metadata.MultiplicityMaxAtt(), value);
    }

    @objid ("b9fc6e7a-249f-42b3-89ac-f75b76c6ebfd")
    @Override
    public String getMultiplicityMin() {
        return (String) getAttVal(NaryLinkEndData.Metadata.MultiplicityMinAtt());
    }

    @objid ("0955ef70-b45d-4281-a2d2-da800c9e7c57")
    @Override
    public void setMultiplicityMin(String value) {
        setAttVal(NaryLinkEndData.Metadata.MultiplicityMinAtt(), value);
    }

    @objid ("b88b5460-1191-4419-9d8d-8a13957a726d")
    @Override
    public Instance getSource() {
        return (Instance) getDepVal(NaryLinkEndData.Metadata.SourceDep());
    }

    @objid ("f12c7034-c0c8-4d25-9492-9a9e1a6e3fe5")
    @Override
    public void setSource(Instance value) {
        appendDepVal(NaryLinkEndData.Metadata.SourceDep(), (SmObjectImpl)value);
    }

    @objid ("1dcc497a-6232-4581-b022-6e312020ce50")
    @Override
    public NaryLink getNaryLink() {
        return (NaryLink) getDepVal(NaryLinkEndData.Metadata.NaryLinkDep());
    }

    @objid ("cc6fd02b-056a-4d70-b889-a57e65c439b9")
    @Override
    public void setNaryLink(NaryLink value) {
        appendDepVal(NaryLinkEndData.Metadata.NaryLinkDep(), (SmObjectImpl)value);
    }

    @objid ("ad03eeec-95a2-432b-b726-e2f489df2568")
    @Override
    public RequiredInterface getConsumer() {
        return (RequiredInterface) getDepVal(NaryLinkEndData.Metadata.ConsumerDep());
    }

    @objid ("f758a462-e55a-4276-abe1-659017741bae")
    @Override
    public void setConsumer(RequiredInterface value) {
        appendDepVal(NaryLinkEndData.Metadata.ConsumerDep(), (SmObjectImpl)value);
    }

    @objid ("14437c11-9f2f-4590-a561-2adbe16daca4")
    @Override
    public ProvidedInterface getProvider() {
        return (ProvidedInterface) getDepVal(NaryLinkEndData.Metadata.ProviderDep());
    }

    @objid ("979352bb-cb0b-4bdf-895a-917b91864918")
    @Override
    public void setProvider(ProvidedInterface value) {
        appendDepVal(NaryLinkEndData.Metadata.ProviderDep(), (SmObjectImpl)value);
    }

    @objid ("45b13039-3121-43a4-a0a0-b5dbc32cf366")
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

    @objid ("1982d7f8-347c-417a-a3f3-1368d6484664")
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

    @objid ("7d05bb70-a6d3-4e99-b6b1-a326fe66ea11")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNaryLinkEnd(this);
        else
          return null;
    }

}
