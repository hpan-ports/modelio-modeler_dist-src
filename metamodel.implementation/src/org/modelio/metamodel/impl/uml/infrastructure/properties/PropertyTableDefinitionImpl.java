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
 Metamodel: Standard, version 0.0.9024, by Modeliosoft
 Generator version: 3.2.10.9023
 Generated on: Mar 19, 2015
 */
/* WARNING: GENERATED FILE -  DO NOT EDIT
 Metamodel: Standard, version 0.0.9025, by Modeliosoft
 Generator version: 3.3.00
 Generated on: Jun 10, 2015
 */
/* WARNING: GENERATED FILE -  DO NOT EDIT
 Metamodel: Standard, version 0.0.9025, by Modeliosoft
 Generator version: 3.3.01
 Generated on: Jun 10, 2015
 */
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.uml.infrastructure.properties;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.PropertyContainer;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyTableDefinitionData;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.TypedPropertyTable;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0067251e-ec87-1098-b22e-001ec947cd2a")
public class PropertyTableDefinitionImpl extends ModelElementImpl implements PropertyTableDefinition {
    @objid ("3c15be4c-a379-4451-bbb3-d2fd764d4819")
    private Map<String, PropertyDefinition> pDefsCache = new HashMap<>();

    @objid ("53e1d3c8-db3c-41a7-bd71-983865f30672")
    @Override
    public PropertyDefinition getOwned(String propName) {
        PropertyDefinition pDef = this.pDefsCache.get(propName);
        if (pDef == null) {
            for (PropertyDefinition p : getOwned()) {
                if (p.getName().equals(propName)) {
                    pDef = p;
                    this.pDefsCache.put(propName, p);
                }
            }
        }
        return pDef;
    }

    @objid ("f2617622-c5ee-4f53-8176-b00dfc4895e1")
    @Override
    public PropertyContainer getOwner() {
        Object obj = getDepVal(((PropertyTableDefinitionSmClass)getClassOf()).getOwnerDep());
        return (obj instanceof PropertyContainer)? (PropertyContainer)obj : null;
    }

    @objid ("c631aa0b-0ac4-4b70-80d2-deb5bee15398")
    @Override
    public void setOwner(PropertyContainer value) {
        appendDepVal(((PropertyTableDefinitionSmClass)getClassOf()).getOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("d600de64-5c65-4e4f-8f3f-ec9ec8b1f571")
    @Override
    public EList<TypedPropertyTable> getTypedTable() {
        return new SmList<>(this, ((PropertyTableDefinitionSmClass)getClassOf()).getTypedTableDep());
    }

    @objid ("772baf98-b078-44e0-a576-658e89bc0550")
    @Override
    public <T extends TypedPropertyTable> List<T> getTypedTable(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final TypedPropertyTable element : getTypedTable()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("03b00de1-9968-4211-a28a-b4c3f1035743")
    @Override
    public MetaclassReference getOwnerReference() {
        Object obj = getDepVal(((PropertyTableDefinitionSmClass)getClassOf()).getOwnerReferenceDep());
        return (obj instanceof MetaclassReference)? (MetaclassReference)obj : null;
    }

    @objid ("c0fab002-01fb-46f6-a1ef-3512696e0916")
    @Override
    public void setOwnerReference(MetaclassReference value) {
        appendDepVal(((PropertyTableDefinitionSmClass)getClassOf()).getOwnerReferenceDep(), (SmObjectImpl)value);
    }

    @objid ("96facd90-5629-41bd-bd88-1c7ca642b30d")
    @Override
    public Stereotype getOwnerStereotype() {
        Object obj = getDepVal(((PropertyTableDefinitionSmClass)getClassOf()).getOwnerStereotypeDep());
        return (obj instanceof Stereotype)? (Stereotype)obj : null;
    }

    @objid ("3fdc25b5-634f-495a-9a7d-10693f235186")
    @Override
    public void setOwnerStereotype(Stereotype value) {
        appendDepVal(((PropertyTableDefinitionSmClass)getClassOf()).getOwnerStereotypeDep(), (SmObjectImpl)value);
    }

    @objid ("e68facb3-ad01-4537-aaaa-2c0085f9d0b0")
    @Override
    public EList<PropertyDefinition> getOwned() {
        return new SmList<>(this, ((PropertyTableDefinitionSmClass)getClassOf()).getOwnedDep());
    }

    @objid ("39ea14c4-6f42-44a8-85d4-f06a9ef7e1d3")
    @Override
    public <T extends PropertyDefinition> List<T> getOwned(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final PropertyDefinition element : getOwned()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("7e62f3ed-f509-4294-902f-6db6ab106eb2")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Owner
        obj = (SmObjectImpl)this.getDepVal(((PropertyTableDefinitionSmClass)getClassOf()).getOwnerDep());
        if (obj != null)
          return obj;
        // OwnerReference
        obj = (SmObjectImpl)this.getDepVal(((PropertyTableDefinitionSmClass)getClassOf()).getOwnerReferenceDep());
        if (obj != null)
          return obj;
        // OwnerStereotype
        obj = (SmObjectImpl)this.getDepVal(((PropertyTableDefinitionSmClass)getClassOf()).getOwnerStereotypeDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("69504468-0041-4cb7-b40f-73c48b08508e")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Owner
        dep = ((PropertyTableDefinitionSmClass)getClassOf()).getOwnerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // OwnerReference
        dep = ((PropertyTableDefinitionSmClass)getClassOf()).getOwnerReferenceDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // OwnerStereotype
        dep = ((PropertyTableDefinitionSmClass)getClassOf()).getOwnerStereotypeDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("99933121-e60e-43b3-b42c-b2eb9efa9478")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPropertyTableDefinition(this);
        else
          return null;
    }

}
