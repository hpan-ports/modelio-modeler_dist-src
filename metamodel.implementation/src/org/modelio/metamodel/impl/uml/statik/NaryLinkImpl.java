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

    @objid ("3433b280-3c3c-4ec9-9105-95d477a1e22a")
    @Override
    public EList<NaryLinkEnd> getNaryLinkEnd() {
        return new SmList<>(this, NaryLinkData.Metadata.NaryLinkEndDep());
    }

    @objid ("c0138618-de06-41bb-a432-cff8336e7724")
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

    @objid ("80cd9baf-0718-4973-9ced-e6230f6d8d2a")
    @Override
    public NaryAssociation getModel() {
        return (NaryAssociation) getDepVal(NaryLinkData.Metadata.ModelDep());
    }

    @objid ("4aaaba95-ac9d-4691-892a-0294c3e76fc2")
    @Override
    public void setModel(NaryAssociation value) {
        appendDepVal(NaryLinkData.Metadata.ModelDep(), (SmObjectImpl)value);
    }

    @objid ("d66b492c-667e-41bf-a208-530d0badb041")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, NaryLinkData.Metadata.RealizedInformationFlowDep());
    }

    @objid ("2bb97675-c73b-41c8-9d4f-a97ab7a886df")
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

    @objid ("afde9dd9-1b55-4b98-9e24-22365707c8b6")
    @Override
    public EList<CommunicationChannel> getSent() {
        return new SmList<>(this, NaryLinkData.Metadata.SentDep());
    }

    @objid ("88cc12aa-a42d-4323-9cca-ef1f3cb0e3c3")
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

    @objid ("bdf2d0f2-37f4-4be2-a911-c3c9b5462fe2")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNaryLink(this);
        else
          return null;
    }

}
