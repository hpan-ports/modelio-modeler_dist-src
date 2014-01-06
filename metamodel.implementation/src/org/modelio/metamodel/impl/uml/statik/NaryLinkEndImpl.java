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
    @objid ("8ce3c750-736a-4619-9f3f-72e1af977e2c")
    @Override
    public boolean isIsOrdered() {
        return (Boolean) getAttVal(NaryLinkEndData.Metadata.IsOrderedAtt());
    }

    @objid ("554642eb-67b6-4517-bc17-c356c0c12070")
    @Override
    public void setIsOrdered(boolean value) {
        setAttVal(NaryLinkEndData.Metadata.IsOrderedAtt(), value);
    }

    @objid ("c09c7aa7-1859-461c-bec1-e2ccfd74d16b")
    @Override
    public boolean isIsUnique() {
        return (Boolean) getAttVal(NaryLinkEndData.Metadata.IsUniqueAtt());
    }

    @objid ("82049e4b-eed1-4748-b9c3-41cad0f09653")
    @Override
    public void setIsUnique(boolean value) {
        setAttVal(NaryLinkEndData.Metadata.IsUniqueAtt(), value);
    }

    @objid ("d4b4cb92-26f4-4b00-85a2-423ac25ba115")
    @Override
    public String getMultiplicityMax() {
        return (String) getAttVal(NaryLinkEndData.Metadata.MultiplicityMaxAtt());
    }

    @objid ("f4a98625-b2e4-4846-96ff-709e72b69a96")
    @Override
    public void setMultiplicityMax(String value) {
        setAttVal(NaryLinkEndData.Metadata.MultiplicityMaxAtt(), value);
    }

    @objid ("d8c2ad8e-e26b-48c7-9486-0475c893c78d")
    @Override
    public String getMultiplicityMin() {
        return (String) getAttVal(NaryLinkEndData.Metadata.MultiplicityMinAtt());
    }

    @objid ("b87b71e9-0cbd-42ce-a55c-fb47f1f6e2e3")
    @Override
    public void setMultiplicityMin(String value) {
        setAttVal(NaryLinkEndData.Metadata.MultiplicityMinAtt(), value);
    }

    @objid ("32e4c981-b947-41d7-9a98-74d5043fc2e4")
    @Override
    public Instance getSource() {
        return (Instance) getDepVal(NaryLinkEndData.Metadata.SourceDep());
    }

    @objid ("af27ebf4-d8f8-493f-9163-d6e3ab478a3b")
    @Override
    public void setSource(Instance value) {
        appendDepVal(NaryLinkEndData.Metadata.SourceDep(), (SmObjectImpl)value);
    }

    @objid ("29b121f9-71be-45bd-95d9-26bac854c50a")
    @Override
    public NaryLink getNaryLink() {
        return (NaryLink) getDepVal(NaryLinkEndData.Metadata.NaryLinkDep());
    }

    @objid ("d2321ede-1284-49ec-8f57-1f67814ab3f4")
    @Override
    public void setNaryLink(NaryLink value) {
        appendDepVal(NaryLinkEndData.Metadata.NaryLinkDep(), (SmObjectImpl)value);
    }

    @objid ("e40c2f7d-baa9-4d1d-9954-ae2adc4cb77b")
    @Override
    public RequiredInterface getConsumer() {
        return (RequiredInterface) getDepVal(NaryLinkEndData.Metadata.ConsumerDep());
    }

    @objid ("1498d7e6-5fff-4eb2-9755-dc26c10fe79c")
    @Override
    public void setConsumer(RequiredInterface value) {
        appendDepVal(NaryLinkEndData.Metadata.ConsumerDep(), (SmObjectImpl)value);
    }

    @objid ("2637d46d-88fb-4619-8d49-8420a85e7218")
    @Override
    public ProvidedInterface getProvider() {
        return (ProvidedInterface) getDepVal(NaryLinkEndData.Metadata.ProviderDep());
    }

    @objid ("2bfddeeb-c8ac-40ad-8d23-3fc5bd5526cc")
    @Override
    public void setProvider(ProvidedInterface value) {
        appendDepVal(NaryLinkEndData.Metadata.ProviderDep(), (SmObjectImpl)value);
    }

    @objid ("baae4457-6e7b-4356-9511-1a89d6bbb6ba")
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

    @objid ("e66f81d9-03b5-46e5-a041-f4aa9fc0b706")
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

    @objid ("f42013dc-2a70-4bc1-9c2d-17fafe91386e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNaryLinkEnd(this);
        else
          return null;
    }

}
