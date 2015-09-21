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
import org.modelio.metamodel.impl.uml.statik.LinkData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("01170c7c-f6f1-4d69-b50e-5f5e0b067212")
public class LinkImpl extends ModelElementImpl implements Link {
    @objid ("8a613814-6158-4adc-a1ab-5dac81598ce7")
    @Override
    public SmObjectImpl getCompositionOwner() {
        for (SmObjectImpl obj : this.getDepValList(((LinkSmClass) getClassOf()).getLinkEndDep())) {
            return obj;
        }
        return super.getCompositionOwner();
    }

    @objid ("4fb95fb2-6b47-4648-9ee9-8381d233fe17")
    @Override
    public SmDepVal getCompositionRelation() {
        for (SmObjectImpl obj : this.getDepValList(((LinkSmClass) getClassOf()).getLinkEndDep())) {
            return new SmDepVal(((LinkSmClass) getClassOf()).getLinkEndDep(), obj);
        }
        return super.getCompositionRelation();
    }

    @objid ("9d89d8f5-7e87-44bf-951d-d3935268603c")
    @Override
    public Association getModel() {
        Object obj = getDepVal(((LinkSmClass)getClassOf()).getModelDep());
        return (obj instanceof Association)? (Association)obj : null;
    }

    @objid ("455f054b-82b5-46d1-9684-6a48383dd2c4")
    @Override
    public void setModel(Association value) {
        appendDepVal(((LinkSmClass)getClassOf()).getModelDep(), (SmObjectImpl)value);
    }

    @objid ("996b4520-116b-4fad-8e24-900ea538fbf3")
    @Override
    public EList<LinkEnd> getLinkEnd() {
        return new SmList<>(this, ((LinkSmClass)getClassOf()).getLinkEndDep());
    }

    @objid ("7eee8010-6700-4241-853f-278d2e218a48")
    @Override
    public <T extends LinkEnd> List<T> getLinkEnd(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final LinkEnd element : getLinkEnd()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("7034f75d-b3ad-4285-86c0-66f2dc90e8a4")
    @Override
    public CommunicationChannel getSent() {
        Object obj = getDepVal(((LinkSmClass)getClassOf()).getSentDep());
        return (obj instanceof CommunicationChannel)? (CommunicationChannel)obj : null;
    }

    @objid ("9163e6dd-bf73-4bdc-acd7-97a101aa8b36")
    @Override
    public void setSent(CommunicationChannel value) {
        appendDepVal(((LinkSmClass)getClassOf()).getSentDep(), (SmObjectImpl)value);
    }

    @objid ("d33ffc6c-cda7-4d8c-91d9-0767ea3ca258")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitLink(this);
        else
          return null;
    }

}
