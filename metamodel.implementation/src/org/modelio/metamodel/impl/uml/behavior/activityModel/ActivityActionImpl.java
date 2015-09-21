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
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityActionData;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;
import org.modelio.metamodel.uml.behavior.activityModel.InputPin;
import org.modelio.metamodel.uml.behavior.activityModel.OutputPin;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0026b060-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class ActivityActionImpl extends ActivityNodeImpl implements ActivityAction {
    @objid ("3835350b-eaab-4c1a-a8d0-592b131524e8")
    @Override
    public boolean isIsMultipleInstance() {
        return (Boolean) getAttVal(((ActivityActionSmClass)getClassOf()).getIsMultipleInstanceAtt());
    }

    @objid ("4e33ac56-f8e6-4252-b0d9-24a14542085d")
    @Override
    public void setIsMultipleInstance(boolean value) {
        setAttVal(((ActivityActionSmClass)getClassOf()).getIsMultipleInstanceAtt(), value);
    }

    @objid ("8fd671b0-1258-4a24-9ed9-a77797c71e56")
    @Override
    public boolean isIsCompensation() {
        return (Boolean) getAttVal(((ActivityActionSmClass)getClassOf()).getIsCompensationAtt());
    }

    @objid ("23c7f268-d7e8-4b8e-b550-1e154d2c0578")
    @Override
    public void setIsCompensation(boolean value) {
        setAttVal(((ActivityActionSmClass)getClassOf()).getIsCompensationAtt(), value);
    }

    @objid ("3c4c9460-7880-47aa-b7f9-98cc90667bb5")
    @Override
    public EList<OutputPin> getOutput() {
        return new SmList<>(this, ((ActivityActionSmClass)getClassOf()).getOutputDep());
    }

    @objid ("9e6a7a4c-36ba-47d8-bf04-2a0713981ce5")
    @Override
    public <T extends OutputPin> List<T> getOutput(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final OutputPin element : getOutput()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e59d59b8-36f3-48af-afae-cb7407f9aaa1")
    @Override
    public EList<InputPin> getInput() {
        return new SmList<>(this, ((ActivityActionSmClass)getClassOf()).getInputDep());
    }

    @objid ("3e2c789e-53fa-4a50-97da-6decf1159bcc")
    @Override
    public <T extends InputPin> List<T> getInput(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final InputPin element : getInput()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("49326a99-a137-490d-939d-f3cde6404523")
    @Override
    public EList<ExceptionHandler> getHandler() {
        return new SmList<>(this, ((ActivityActionSmClass)getClassOf()).getHandlerDep());
    }

    @objid ("afc5af6e-69a9-44ae-b655-52b91e1ede03")
    @Override
    public <T extends ExceptionHandler> List<T> getHandler(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ExceptionHandler element : getHandler()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3c4cb3c7-2e70-4f0e-9792-8777cfa21778")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("2182989b-5bf7-4602-855a-deedb508806a")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("f4553901-d248-4c2c-8108-07a40fb42c5f")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivityAction(this);
        else
          return null;
    }

}
