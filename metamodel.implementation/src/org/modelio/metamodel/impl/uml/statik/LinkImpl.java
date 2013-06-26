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
import org.modelio.metamodel.data.uml.statik.LinkData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("01170c7c-f6f1-4d69-b50e-5f5e0b067212")
public class LinkImpl extends ModelElementImpl implements Link {
    @objid ("8a613814-6158-4adc-a1ab-5dac81598ce7")
    @Override
    public SmObjectImpl getCompositionOwner() {
        for (SmObjectImpl obj : this.getDepValList(LinkData.Metadata.LinkEndDep())) {
            return obj;
        }
        return super.getCompositionOwner();
    }

    @objid ("4fb95fb2-6b47-4648-9ee9-8381d233fe17")
    @Override
    public SmDepVal getCompositionRelation() {
        for (SmObjectImpl obj : this.getDepValList(LinkData.Metadata.LinkEndDep())) 
          return new SmDepVal(LinkData.Metadata.LinkEndDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("b0dceaaf-091a-4860-b678-b0d607dc310e")
    @Override
    public Association getModel() {
        return (Association) getDepVal(LinkData.Metadata.ModelDep());
    }

    @objid ("cd13681b-d3d5-4425-b033-fba30c798154")
    @Override
    public void setModel(Association value) {
        appendDepVal(LinkData.Metadata.ModelDep(), (SmObjectImpl)value);
    }

    @objid ("a0bca92d-3c1b-4b67-a4ae-06fe90b9b9e8")
    @Override
    public EList<LinkEnd> getLinkEnd() {
        return new SmList<>(this, LinkData.Metadata.LinkEndDep());
    }

    @objid ("dccc9fe0-cfee-4c8d-9364-8dcc5043db70")
    @Override
    public <T extends LinkEnd> List<T> getLinkEnd(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final LinkEnd element : getLinkEnd()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8cde2b56-594b-4599-9806-7753a05578c8")
    @Override
    public CommunicationChannel getSent() {
        return (CommunicationChannel) getDepVal(LinkData.Metadata.SentDep());
    }

    @objid ("b5cbba47-1627-4886-b3d0-03c03cd4444b")
    @Override
    public void setSent(CommunicationChannel value) {
        appendDepVal(LinkData.Metadata.SentDep(), (SmObjectImpl)value);
    }

    @objid ("1c488473-6209-47b0-b7cb-61e3a7c389eb")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitLink(this);
        else
          return null;
    }

}
