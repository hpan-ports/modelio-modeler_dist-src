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
    @objid ("21d029c9-1bbf-4323-ac7d-0639314f659f")
    @Override
    public String getDiscriminator() {
        return (String) getAttVal(GeneralizationData.Metadata.DiscriminatorAtt());
    }

    @objid ("1f6dfa14-1af0-4a4e-8939-12f72a778d39")
    @Override
    public void setDiscriminator(String value) {
        setAttVal(GeneralizationData.Metadata.DiscriminatorAtt(), value);
    }

    @objid ("195fba45-ae11-4c4e-adf1-6ade178dde13")
    @Override
    public NameSpace getSuperType() {
        return (NameSpace) getDepVal(GeneralizationData.Metadata.SuperTypeDep());
    }

    @objid ("abba07dc-6776-4453-8245-ddc006001a1e")
    @Override
    public void setSuperType(NameSpace value) {
        appendDepVal(GeneralizationData.Metadata.SuperTypeDep(), (SmObjectImpl)value);
    }

    @objid ("2324aebd-8dab-4b5c-b3e4-9a8a0beea733")
    @Override
    public NameSpace getSubType() {
        return (NameSpace) getDepVal(GeneralizationData.Metadata.SubTypeDep());
    }

    @objid ("3f9f0f74-a9d4-4db9-b19e-15f533a75314")
    @Override
    public void setSubType(NameSpace value) {
        appendDepVal(GeneralizationData.Metadata.SubTypeDep(), (SmObjectImpl)value);
    }

    @objid ("1834c833-0969-48bb-8c11-484019549874")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GeneralizationData.Metadata.SubTypeDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("0ae340ad-2d1b-4a3e-b97c-4fd990cec35e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GeneralizationData.Metadata.SubTypeDep());
        if (obj != null)
          return new SmDepVal(GeneralizationData.Metadata.SubTypeDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("86a298e3-db28-4d77-83be-5866789e399e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGeneralization(this);
        else
          return null;
    }

}
