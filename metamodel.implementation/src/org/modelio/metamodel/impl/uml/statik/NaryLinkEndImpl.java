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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.impl.uml.statik.NaryLinkEndData;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NaryLink;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;
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

@objid ("0075d726-17e8-10a1-88a0-001ec947cd2a")
public class NaryLinkEndImpl extends ModelElementImpl implements NaryLinkEnd {
    @objid ("d0d6f4d4-0bfb-4893-a7ed-af91ad760217")
    @Override
    public boolean isIsOrdered() {
        return (Boolean) getAttVal(((NaryLinkEndSmClass)getClassOf()).getIsOrderedAtt());
    }

    @objid ("1726cb29-f709-42a3-8100-da9c9ca36971")
    @Override
    public void setIsOrdered(boolean value) {
        setAttVal(((NaryLinkEndSmClass)getClassOf()).getIsOrderedAtt(), value);
    }

    @objid ("3515c7dc-975d-4fa9-92a6-b90222cda108")
    @Override
    public boolean isIsUnique() {
        return (Boolean) getAttVal(((NaryLinkEndSmClass)getClassOf()).getIsUniqueAtt());
    }

    @objid ("2b4fae63-3698-46be-96d6-1d9f26ae021e")
    @Override
    public void setIsUnique(boolean value) {
        setAttVal(((NaryLinkEndSmClass)getClassOf()).getIsUniqueAtt(), value);
    }

    @objid ("cc80aa3c-41c1-4d01-891e-c54df49091d5")
    @Override
    public String getMultiplicityMax() {
        return (String) getAttVal(((NaryLinkEndSmClass)getClassOf()).getMultiplicityMaxAtt());
    }

    @objid ("6b8ca3f7-07de-4a6c-9d13-2dc9c3391f4e")
    @Override
    public void setMultiplicityMax(String value) {
        setAttVal(((NaryLinkEndSmClass)getClassOf()).getMultiplicityMaxAtt(), value);
    }

    @objid ("54a78d20-60b2-4b76-901b-ae635728219b")
    @Override
    public String getMultiplicityMin() {
        return (String) getAttVal(((NaryLinkEndSmClass)getClassOf()).getMultiplicityMinAtt());
    }

    @objid ("3397bf75-6840-4609-92e6-2cd0716fe94f")
    @Override
    public void setMultiplicityMin(String value) {
        setAttVal(((NaryLinkEndSmClass)getClassOf()).getMultiplicityMinAtt(), value);
    }

    @objid ("9e64b891-65c8-4d03-a977-c325e1cc9ee5")
    @Override
    public Instance getSource() {
        Object obj = getDepVal(((NaryLinkEndSmClass)getClassOf()).getSourceDep());
        return (obj instanceof Instance)? (Instance)obj : null;
    }

    @objid ("e89d550d-c175-4e4b-9da8-e4a015e4d973")
    @Override
    public void setSource(Instance value) {
        appendDepVal(((NaryLinkEndSmClass)getClassOf()).getSourceDep(), (SmObjectImpl)value);
    }

    @objid ("c0f22786-da13-4581-860a-c29619ad357d")
    @Override
    public NaryLink getNaryLink() {
        Object obj = getDepVal(((NaryLinkEndSmClass)getClassOf()).getNaryLinkDep());
        return (obj instanceof NaryLink)? (NaryLink)obj : null;
    }

    @objid ("0c67d138-e42a-4cd7-8b66-41ca0b984e11")
    @Override
    public void setNaryLink(NaryLink value) {
        appendDepVal(((NaryLinkEndSmClass)getClassOf()).getNaryLinkDep(), (SmObjectImpl)value);
    }

    @objid ("17ae1f08-da6c-4717-9102-f13c92974ff7")
    @Override
    public RequiredInterface getConsumer() {
        Object obj = getDepVal(((NaryLinkEndSmClass)getClassOf()).getConsumerDep());
        return (obj instanceof RequiredInterface)? (RequiredInterface)obj : null;
    }

    @objid ("724f6cfd-c9b9-455c-bfa6-c6fc14e449b2")
    @Override
    public void setConsumer(RequiredInterface value) {
        appendDepVal(((NaryLinkEndSmClass)getClassOf()).getConsumerDep(), (SmObjectImpl)value);
    }

    @objid ("e08a5207-8b65-4fff-8bec-252b0c2d400b")
    @Override
    public ProvidedInterface getProvider() {
        Object obj = getDepVal(((NaryLinkEndSmClass)getClassOf()).getProviderDep());
        return (obj instanceof ProvidedInterface)? (ProvidedInterface)obj : null;
    }

    @objid ("7b938b78-20a7-43a0-a4a7-db8ac16b7fad")
    @Override
    public void setProvider(ProvidedInterface value) {
        appendDepVal(((NaryLinkEndSmClass)getClassOf()).getProviderDep(), (SmObjectImpl)value);
    }

    @objid ("f3fde6e0-e664-4e21-a6e7-dd398448e662")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Source
        obj = (SmObjectImpl)this.getDepVal(((NaryLinkEndSmClass)getClassOf()).getSourceDep());
        if (obj != null)
          return obj;
        // NaryLink
        obj = (SmObjectImpl)this.getDepVal(((NaryLinkEndSmClass)getClassOf()).getNaryLinkDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("85f87767-ec73-4b72-b2d6-27e0987a5f8e")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Source
        dep = ((NaryLinkEndSmClass)getClassOf()).getSourceDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // NaryLink
        dep = ((NaryLinkEndSmClass)getClassOf()).getNaryLinkDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("f3c1d409-e225-48f0-9b6d-15116735f682")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNaryLinkEnd(this);
        else
          return null;
    }

}
