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
/*   Metamodel version: 9020              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.NaryAssociationData;
import org.modelio.metamodel.data.uml.statik.NaryLinkData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.statik.NaryAssociation;
import org.modelio.metamodel.uml.statik.NaryAssociationEnd;
import org.modelio.metamodel.uml.statik.NaryLink;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00227a86-c4bf-1fd8-97fe-001ec947cd2a")
public class NaryLinkImpl extends ModelElementImpl implements NaryLink {
    @objid ("892a19eb-169c-4d68-bdb7-aada6bad2672")
    @Override
    public SmObjectImpl getCompositionOwner() {
        for (SmObjectImpl obj : this.getDepValList(NaryLinkData.Metadata.NaryLinkEndDep())) {
            // Avoid infinite composition loops
            SmObjectImpl objOwner = obj.getCompositionOwner();
            if (objOwner != this && objOwner != null)
                return obj;
            
        }
        return super.getCompositionOwner();
    }

    @objid ("154596a6-bea0-4b8c-b421-c4f78eeb540c")
    @Override
    public SmDepVal getCompositionRelation() {
        for (SmObjectImpl obj : this.getDepValList(NaryLinkData.Metadata.NaryLinkEndDep()))  {
            // Avoid infinite composition loops
            SmObjectImpl objOwner = obj.getCompositionOwner();
            if (objOwner != this && objOwner != null)
                return new SmDepVal(NaryLinkData.Metadata.NaryLinkEndDep(), obj);
        }
        return super.getCompositionRelation();
    }

    @objid ("f269be34-1125-47b5-bccc-bfa221cb6427")
    @Override
    public EList<NaryLinkEnd> getNaryLinkEnd() {
        return new SmList<>(this, NaryLinkData.Metadata.NaryLinkEndDep());
    }

    @objid ("f3699254-df19-42c1-9fa7-0ef88a909ded")
    @Override
    public <T extends NaryLinkEnd> List<T> getNaryLinkEnd(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final NaryLinkEnd element : getNaryLinkEnd()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("18565354-762c-49a6-987c-0bec57a0d86e")
    @Override
    public NaryAssociation getModel() {
        return (NaryAssociation) getDepVal(NaryLinkData.Metadata.ModelDep());
    }

    @objid ("7169983e-810f-47b2-a531-ce8ee9df5764")
    @Override
    public void setModel(NaryAssociation value) {
        appendDepVal(NaryLinkData.Metadata.ModelDep(), (SmObjectImpl)value);
    }

    @objid ("1f0dfd9c-721e-4845-a7a9-7e16b151769e")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, NaryLinkData.Metadata.RealizedInformationFlowDep());
    }

    @objid ("6d2d5acc-f1f2-4cf1-af5a-46df0a8ac7a5")
    @Override
    public <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InformationFlow element : getRealizedInformationFlow()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a5b06243-88ad-42ad-85fb-5fa0ff7e7ebc")
    @Override
    public EList<CommunicationChannel> getSent() {
        return new SmList<>(this, NaryLinkData.Metadata.SentDep());
    }

    @objid ("d1d400d8-a2e7-4595-a47e-cdaf259d4338")
    @Override
    public <T extends CommunicationChannel> List<T> getSent(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final CommunicationChannel element : getSent()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("16b15030-2205-4281-8b59-a2b29d4efd28")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNaryLink(this);
        else
          return null;
    }

    @objid ("9d635ed3-8666-4eaa-be31-8cde824199c0")
    @Override
    public void afterEraseDepVal(SmDependency dep, SmObjectImpl value) {
        if (dep == NaryLinkData.Metadata.NaryLinkEndDep()) {
            // Workaround bug where the storage handle is not updated
            EList<NaryLinkEnd> remainingOwners = getNaryLinkEnd();
            if (! remainingOwners.isEmpty()) {
                // Remove and add again the first remaining owner.
                // Note : this will trigger recursively the removal & addition of all other owners.
                NaryLinkEnd r = remainingOwners.get(0);
                r.setNaryLink(null);
                r.setNaryLink(this);
            }
        }
        
        super.afterEraseDepVal(dep, value);
    }

}
