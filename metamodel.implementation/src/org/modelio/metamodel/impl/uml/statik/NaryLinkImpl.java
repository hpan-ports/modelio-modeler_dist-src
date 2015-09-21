/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
 Metamodel: Standard, version 9024, by Modeliosoft
 Generator version: 3.0.01.9022
 Generated on: 28 janv. 2015
 */
/* WARNING: GENERATED FILE -  DO NOT EDIT
 Metamodel: Standard, version 9024, by Modeliosoft
 Generator version: 3.2.07.9022
 Generated on: Mar 9, 2015
 */
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.2.07.9022
     Generated on: Mar 10, 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.impl.uml.statik.NaryLinkData;
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
        for (SmObjectImpl obj : this.getDepValList(((NaryLinkSmClass) getClassOf()).getNaryLinkEndDep())) {
            // Avoid infinite composition loops
            SmObjectImpl objOwner = obj.getCompositionOwner();
            if (objOwner != this && objOwner != null) {
                return obj;
            }
        
        }
        return super.getCompositionOwner();
    }

    @objid ("154596a6-bea0-4b8c-b421-c4f78eeb540c")
    @Override
    public SmDepVal getCompositionRelation() {
        for (SmObjectImpl obj : this.getDepValList(((NaryLinkSmClass) getClassOf()).getNaryLinkEndDep())) {
            // Avoid infinite composition loops
            SmObjectImpl objOwner = obj.getCompositionOwner();
            if (objOwner != this && objOwner != null) {
                return new SmDepVal(((NaryLinkSmClass) getClassOf()).getNaryLinkEndDep(), obj);
            }
        }
        return super.getCompositionRelation();
    }

    @objid ("9d635ed3-8666-4eaa-be31-8cde824199c0")
    @Override
    public void afterEraseDepVal(SmDependency dep, SmObjectImpl value) {
        if (dep == ((NaryLinkSmClass) getClassOf()).getNaryLinkEndDep()) {
            // Workaround bug where the storage handle is not updated
            EList<NaryLinkEnd> remainingOwners = getNaryLinkEnd();
            if (!remainingOwners.isEmpty()) {
                // Remove and add again the first remaining owner.
                // Note : this will trigger recursively the removal & addition of all other owners.
                NaryLinkEnd r = remainingOwners.get(0);
                r.setNaryLink(null);
                r.setNaryLink(this);
            }
        }
        
        super.afterEraseDepVal(dep, value);
    }

    @objid ("1c523a83-fa53-4f9c-b68d-fd78dfad7589")
    @Override
    public EList<NaryLinkEnd> getNaryLinkEnd() {
        return new SmList<>(this, ((NaryLinkSmClass)getClassOf()).getNaryLinkEndDep());
    }

    @objid ("d15be2f3-2dd6-468b-ab30-79cfbc2b02b2")
    @Override
    public <T extends NaryLinkEnd> List<T> getNaryLinkEnd(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final NaryLinkEnd element : getNaryLinkEnd()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("0a5d0897-5a81-40f4-a1fc-409ad0e6de5d")
    @Override
    public NaryAssociation getModel() {
        Object obj = getDepVal(((NaryLinkSmClass)getClassOf()).getModelDep());
        return (obj instanceof NaryAssociation)? (NaryAssociation)obj : null;
    }

    @objid ("e973ac92-751e-46da-b4b1-476342c14a60")
    @Override
    public void setModel(NaryAssociation value) {
        appendDepVal(((NaryLinkSmClass)getClassOf()).getModelDep(), (SmObjectImpl)value);
    }

    @objid ("5a44092a-63fd-4c8d-9fa3-6a29d8f91d8b")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, ((NaryLinkSmClass)getClassOf()).getRealizedInformationFlowDep());
    }

    @objid ("2dd388e9-fb0e-41b6-9514-daeb25a5c2a1")
    @Override
    public <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final InformationFlow element : getRealizedInformationFlow()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4446ced7-f8c6-41bd-acc6-0175a678275f")
    @Override
    public EList<CommunicationChannel> getSent() {
        return new SmList<>(this, ((NaryLinkSmClass)getClassOf()).getSentDep());
    }

    @objid ("33cafd58-ec4f-4a89-92e2-380c324b9dad")
    @Override
    public <T extends CommunicationChannel> List<T> getSent(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final CommunicationChannel element : getSent()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("669f2c48-9ac5-48e6-b793-e04c5c689a6a")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNaryLink(this);
        else
          return null;
    }

}
