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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.NaryLinkData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.statik.NaryAssociation;
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

    @objid ("6a34fa02-867e-4419-8e01-d7f7daf384b1")
    @Override
    public EList<NaryLinkEnd> getNaryLinkEnd() {
        return new SmList<>(this, NaryLinkData.Metadata.NaryLinkEndDep());
    }

    @objid ("54de1fa9-5d67-429f-85ee-0ff524a571d5")
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

    @objid ("92d59d94-0b1c-46a9-83a3-9373962ca9b6")
    @Override
    public NaryAssociation getModel() {
        return (NaryAssociation) getDepVal(NaryLinkData.Metadata.ModelDep());
    }

    @objid ("1c6a6ff2-6a6b-462e-8d96-5836151012a7")
    @Override
    public void setModel(NaryAssociation value) {
        appendDepVal(NaryLinkData.Metadata.ModelDep(), (SmObjectImpl)value);
    }

    @objid ("f3c9f77d-4bbf-40e0-b19e-5d2fbc4f1f97")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, NaryLinkData.Metadata.RealizedInformationFlowDep());
    }

    @objid ("dd32acb2-2013-4b90-8777-bc9586b4492c")
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

    @objid ("32623fb7-9c93-466f-b6c3-f0e4a569db5f")
    @Override
    public EList<CommunicationChannel> getSent() {
        return new SmList<>(this, NaryLinkData.Metadata.SentDep());
    }

    @objid ("eb1f6313-d9f8-4f7b-91f2-6eac32f2a58a")
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

    @objid ("2672ddcd-0979-4546-9749-f78d69eab27a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNaryLink(this);
        else
          return null;
    }

}
