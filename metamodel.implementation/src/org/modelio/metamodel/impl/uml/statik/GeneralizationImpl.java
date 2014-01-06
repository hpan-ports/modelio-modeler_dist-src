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
/*   Metamodel version: 9019              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.GeneralizationData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.statik.Generalization;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("000cb930-c4bf-1fd8-97fe-001ec947cd2a")
public class GeneralizationImpl extends ModelElementImpl implements Generalization {
    @objid ("73a0f506-7015-4594-adc7-fa32b932add8")
    @Override
    public String getDiscriminator() {
        return (String) getAttVal(GeneralizationData.Metadata.DiscriminatorAtt());
    }

    @objid ("91c94802-7a78-45f9-95f1-33a713bb84be")
    @Override
    public void setDiscriminator(String value) {
        setAttVal(GeneralizationData.Metadata.DiscriminatorAtt(), value);
    }

    @objid ("36b92d72-0a37-44a4-a055-d2a869d448dd")
    @Override
    public NameSpace getSuperType() {
        return (NameSpace) getDepVal(GeneralizationData.Metadata.SuperTypeDep());
    }

    @objid ("cce28065-d192-4660-8e84-b9a417ba0db6")
    @Override
    public void setSuperType(NameSpace value) {
        appendDepVal(GeneralizationData.Metadata.SuperTypeDep(), (SmObjectImpl)value);
    }

    @objid ("b40f155a-d21d-4994-bb4d-5c72ba27f3ba")
    @Override
    public NameSpace getSubType() {
        return (NameSpace) getDepVal(GeneralizationData.Metadata.SubTypeDep());
    }

    @objid ("96dcc850-6922-431b-a318-92b698a394fa")
    @Override
    public void setSubType(NameSpace value) {
        appendDepVal(GeneralizationData.Metadata.SubTypeDep(), (SmObjectImpl)value);
    }

    @objid ("317986a7-9a0c-4d55-ba24-b9860aa7b773")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GeneralizationData.Metadata.SubTypeDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("e77e4321-e3d2-4d45-a800-ccfee6abfea8")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GeneralizationData.Metadata.SubTypeDep());
        if (obj != null)
          return new SmDepVal(GeneralizationData.Metadata.SubTypeDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("b9ca5be9-eacb-4e56-b3fb-1571a3fe775e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGeneralization(this);
        else
          return null;
    }

}
