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
import org.modelio.metamodel.impl.uml.statik.PortData;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.PortOrientation;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0018eeee-c4bf-1fd8-97fe-001ec947cd2a")
public class PortImpl extends BindableInstanceImpl implements Port {
    @objid ("92ffd663-c04d-4ee3-b15a-d815e8e50439")
    @Override
    public boolean isIsBehavior() {
        return (Boolean) getAttVal(((PortSmClass)getClassOf()).getIsBehaviorAtt());
    }

    @objid ("0063fa3f-0c5a-444e-999d-ed4894e2cc7e")
    @Override
    public void setIsBehavior(boolean value) {
        setAttVal(((PortSmClass)getClassOf()).getIsBehaviorAtt(), value);
    }

    @objid ("49af3051-04ef-4101-b3c9-54643d092d82")
    @Override
    public boolean isIsService() {
        return (Boolean) getAttVal(((PortSmClass)getClassOf()).getIsServiceAtt());
    }

    @objid ("ca0517d6-91aa-4c41-a3d7-246944a0edfb")
    @Override
    public void setIsService(boolean value) {
        setAttVal(((PortSmClass)getClassOf()).getIsServiceAtt(), value);
    }

    @objid ("19fba8a2-f1ff-4b06-b59c-102e521585b7")
    @Override
    public boolean isIsConjugated() {
        return (Boolean) getAttVal(((PortSmClass)getClassOf()).getIsConjugatedAtt());
    }

    @objid ("dd81f27c-4bcc-4219-bc74-a75b31867c08")
    @Override
    public void setIsConjugated(boolean value) {
        setAttVal(((PortSmClass)getClassOf()).getIsConjugatedAtt(), value);
    }

    @objid ("9d59017b-3a45-4c11-a7a3-3fbe5d8757c4")
    @Override
    public PortOrientation getDirection() {
        return (PortOrientation) getAttVal(((PortSmClass)getClassOf()).getDirectionAtt());
    }

    @objid ("dd64cc0c-ba7c-4f38-8045-1fe4c869d486")
    @Override
    public void setDirection(PortOrientation value) {
        setAttVal(((PortSmClass)getClassOf()).getDirectionAtt(), value);
    }

    @objid ("7cdfc06d-6f24-4910-bf2a-431527f51d9a")
    @Override
    public EList<ProvidedInterface> getProvided() {
        return new SmList<>(this, ((PortSmClass)getClassOf()).getProvidedDep());
    }

    @objid ("fe3c1c3a-7b64-43c4-b9b8-3d2a5370dd60")
    @Override
    public <T extends ProvidedInterface> List<T> getProvided(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ProvidedInterface element : getProvided()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("de5a0e84-2c2c-41fd-8149-aec1a5c4a4cc")
    @Override
    public EList<RequiredInterface> getRequired() {
        return new SmList<>(this, ((PortSmClass)getClassOf()).getRequiredDep());
    }

    @objid ("11ea82b2-7dc0-4f4c-a9d2-08961427880f")
    @Override
    public <T extends RequiredInterface> List<T> getRequired(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final RequiredInterface element : getRequired()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1ae74d29-7be5-46a5-ba19-3b4e00f34300")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("8cf5c6d9-f884-4b4d-bc2d-a394ba6e9099")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("bf5b5704-c33e-410f-a238-ee86000edd1b")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPort(this);
        else
          return null;
    }

}
