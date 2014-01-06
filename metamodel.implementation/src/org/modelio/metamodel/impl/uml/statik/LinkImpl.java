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

    @objid ("ce3cec8e-dd17-4c5c-8b78-4193deac1460")
    @Override
    public Association getModel() {
        return (Association) getDepVal(LinkData.Metadata.ModelDep());
    }

    @objid ("3f72c943-a7f6-4e0e-b860-f1872f94de2b")
    @Override
    public void setModel(Association value) {
        appendDepVal(LinkData.Metadata.ModelDep(), (SmObjectImpl)value);
    }

    @objid ("c3640b1e-d12b-47b8-9ba9-65e8488b6658")
    @Override
    public EList<LinkEnd> getLinkEnd() {
        return new SmList<>(this, LinkData.Metadata.LinkEndDep());
    }

    @objid ("d98fe0ad-4311-4491-8470-9e8f2e741ac1")
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

    @objid ("4776ad25-cb11-4b25-abf1-515605f1e63c")
    @Override
    public CommunicationChannel getSent() {
        return (CommunicationChannel) getDepVal(LinkData.Metadata.SentDep());
    }

    @objid ("9fee5732-8438-4900-9de5-6ce07180863a")
    @Override
    public void setSent(CommunicationChannel value) {
        appendDepVal(LinkData.Metadata.SentDep(), (SmObjectImpl)value);
    }

    @objid ("544b4724-8664-4965-aaf0-f82a69e468a7")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitLink(this);
        else
          return null;
    }

}
