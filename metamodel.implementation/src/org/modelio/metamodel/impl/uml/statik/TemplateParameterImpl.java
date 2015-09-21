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
import org.modelio.metamodel.impl.uml.statik.TemplateParameterData;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.metamodel.uml.statik.TemplateParameterSubstitution;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("001d5f2e-c4bf-1fd8-97fe-001ec947cd2a")
public class TemplateParameterImpl extends GeneralClassImpl implements TemplateParameter {
    @objid ("358f76fd-8456-4fe0-bc1b-5beb846826db")
    @Override
    public String getDefaultValue() {
        return (String) getAttVal(((TemplateParameterSmClass)getClassOf()).getDefaultValueAtt());
    }

    @objid ("2e2ca9d8-ca38-4937-8e1f-25e5c6a75fbd")
    @Override
    public void setDefaultValue(String value) {
        setAttVal(((TemplateParameterSmClass)getClassOf()).getDefaultValueAtt(), value);
    }

    @objid ("6568c3c0-f447-43e2-900a-515e7b227997")
    @Override
    public boolean isIsValueParameter() {
        return (Boolean) getAttVal(((TemplateParameterSmClass)getClassOf()).getIsValueParameterAtt());
    }

    @objid ("a1691c33-02c7-4c4d-88f1-14e9068adc8e")
    @Override
    public void setIsValueParameter(boolean value) {
        setAttVal(((TemplateParameterSmClass)getClassOf()).getIsValueParameterAtt(), value);
    }

    @objid ("8f581ed9-4fc4-447c-9d31-3d2d576ab9dc")
    @Override
    public EList<TemplateParameterSubstitution> getParameterSubstitution() {
        return new SmList<>(this, ((TemplateParameterSmClass)getClassOf()).getParameterSubstitutionDep());
    }

    @objid ("5cbb5f49-8c41-49e8-a06c-2a41ddda9e8e")
    @Override
    public <T extends TemplateParameterSubstitution> List<T> getParameterSubstitution(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final TemplateParameterSubstitution element : getParameterSubstitution()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e4b330fc-741e-438b-b340-947f087c98fc")
    @Override
    public ModelElement getType() {
        Object obj = getDepVal(((TemplateParameterSmClass)getClassOf()).getTypeDep());
        return (obj instanceof ModelElement)? (ModelElement)obj : null;
    }

    @objid ("05827368-42d5-4830-9771-2c4ba1f11400")
    @Override
    public void setType(ModelElement value) {
        appendDepVal(((TemplateParameterSmClass)getClassOf()).getTypeDep(), (SmObjectImpl)value);
    }

    @objid ("93e97697-1749-4e5b-b11d-ef69192674ae")
    @Override
    public NameSpace getParameterized() {
        Object obj = getDepVal(((TemplateParameterSmClass)getClassOf()).getParameterizedDep());
        return (obj instanceof NameSpace)? (NameSpace)obj : null;
    }

    @objid ("97e5dc66-4426-495d-b054-8e23fdaea6a9")
    @Override
    public void setParameterized(NameSpace value) {
        appendDepVal(((TemplateParameterSmClass)getClassOf()).getParameterizedDep(), (SmObjectImpl)value);
    }

    @objid ("95635c1d-cd6b-4e39-bc49-423cb6add2db")
    @Override
    public ModelElement getOwnedParameterElement() {
        Object obj = getDepVal(((TemplateParameterSmClass)getClassOf()).getOwnedParameterElementDep());
        return (obj instanceof ModelElement)? (ModelElement)obj : null;
    }

    @objid ("a2580288-dc7b-463c-bd51-a99bda729318")
    @Override
    public void setOwnedParameterElement(ModelElement value) {
        appendDepVal(((TemplateParameterSmClass)getClassOf()).getOwnedParameterElementDep(), (SmObjectImpl)value);
    }

    @objid ("573385ac-e9a7-4be0-855a-4f466d2a126a")
    @Override
    public ModelElement getDefaultType() {
        Object obj = getDepVal(((TemplateParameterSmClass)getClassOf()).getDefaultTypeDep());
        return (obj instanceof ModelElement)? (ModelElement)obj : null;
    }

    @objid ("26c88129-d592-4184-8c6b-389a4084f833")
    @Override
    public void setDefaultType(ModelElement value) {
        appendDepVal(((TemplateParameterSmClass)getClassOf()).getDefaultTypeDep(), (SmObjectImpl)value);
    }

    @objid ("5a75c423-8c7a-448f-9228-fac436bfdb3f")
    @Override
    public Operation getParameterizedOperation() {
        Object obj = getDepVal(((TemplateParameterSmClass)getClassOf()).getParameterizedOperationDep());
        return (obj instanceof Operation)? (Operation)obj : null;
    }

    @objid ("64dab32c-48d6-4d5f-acef-26f34949649d")
    @Override
    public void setParameterizedOperation(Operation value) {
        appendDepVal(((TemplateParameterSmClass)getClassOf()).getParameterizedOperationDep(), (SmObjectImpl)value);
    }

    @objid ("0000331f-36fb-4dc7-acd8-b0e17e474f72")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Parameterized
        obj = (SmObjectImpl)this.getDepVal(((TemplateParameterSmClass)getClassOf()).getParameterizedDep());
        if (obj != null)
          return obj;
        // ParameterizedOperation
        obj = (SmObjectImpl)this.getDepVal(((TemplateParameterSmClass)getClassOf()).getParameterizedOperationDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("50cee98e-4993-46b2-aa8e-f825de714676")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Parameterized
        dep = ((TemplateParameterSmClass)getClassOf()).getParameterizedDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // ParameterizedOperation
        dep = ((TemplateParameterSmClass)getClassOf()).getParameterizedOperationDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("976af52e-0324-490e-ad8d-eb116dbdd206")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTemplateParameter(this);
        else
          return null;
    }

}
