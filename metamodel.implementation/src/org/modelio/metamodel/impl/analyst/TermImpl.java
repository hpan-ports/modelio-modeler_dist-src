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
package org.modelio.metamodel.impl.analyst;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.Dictionary;
import org.modelio.metamodel.analyst.Term;
import org.modelio.metamodel.data.analyst.TermData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00626cea-c4bf-1fd8-97fe-001ec947cd2a")
public class TermImpl extends AnalystElementImpl implements Term {
    @objid ("2f924d43-c5e9-4c87-9ac3-75689328ab89")
    @Override
    public Dictionary getOwnerDictionary() {
        return (Dictionary) getDepVal(TermData.Metadata.OwnerDictionaryDep());
    }

    @objid ("c6712be1-3253-40da-8040-092b1ac436db")
    @Override
    public void setOwnerDictionary(Dictionary value) {
        appendDepVal(TermData.Metadata.OwnerDictionaryDep(), (SmObjectImpl)value);
    }

    @objid ("0ef79898-40bf-48ae-b0fc-221e833874bf")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TermData.Metadata.OwnerDictionaryDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("46babce7-c715-4f9e-9e33-e810add0aeeb")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TermData.Metadata.OwnerDictionaryDep());
        if (obj != null)
          return new SmDepVal(TermData.Metadata.OwnerDictionaryDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("bc01d230-b481-494c-abf1-9a3d6dcb36e6")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTerm(this);
        else
          return null;
    }

}
