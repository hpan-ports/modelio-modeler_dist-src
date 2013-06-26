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
package org.modelio.metamodel.impl.uml.infrastructure.properties;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Properties;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTableData;
import org.modelio.metamodel.impl.uml.infrastructure.ElementImpl;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTable;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00691798-ec87-1098-b22e-001ec947cd2a")
public class PropertyTableImpl extends ElementImpl implements PropertyTable {
    @objid ("71fabe31-282d-11e2-bf07-001ec947ccaf")
    @Override
    public String getProperty(String key) {
        Properties props = toProperties();
        return props.getProperty(key);
    }

    @objid ("71fabe37-282d-11e2-bf07-001ec947ccaf")
    @Override
    public final Properties toProperties() throws IllegalStateException {
        Properties props = new Properties();
        try {
            props.load(new StringReader(getContent()));
        } catch (IOException e) {
            throw new IllegalStateException("The 'Content' attribute has not the java.util.Properties format:"+e.getLocalizedMessage(),e); 
        }
        return props;
    }

    @objid ("71fabe3c-282d-11e2-bf07-001ec947ccaf")
    @Override
    public final void setContent(Properties newContent) {
        StringWriter s = new StringWriter();
        try {
            newContent.store(s, null);
        } catch (IOException e) {
            throw new Error(e); // cannot happen
        }
        setContent(s.toString());
    }

    @objid ("71fabe40-282d-11e2-bf07-001ec947ccaf")
    @Override
    public void setProperty(String key, String value) {
        Properties props = toProperties();
        
        props.setProperty(key, value);
        
        setContent(props);
    }

    @objid ("4d1a1c62-a2ec-4465-a2e4-9b334288c4a0")
    @Override
    public String getName() {
        return (String) getAttVal(PropertyTableData.Metadata.nameAtt());
    }

    @objid ("685b3a00-73a6-463d-a187-5c9dfe41dc27")
    @Override
    public void setName(String value) {
        setAttVal(PropertyTableData.Metadata.nameAtt(), value);
    }

    @objid ("9e5fd56c-8872-44c8-833e-966a2c1482c2")
    @Override
    public String getContent() {
        return (String) getAttVal(PropertyTableData.Metadata.contentAtt());
    }

    @objid ("94b683b8-8c6a-4535-894e-1096c5a35cf8")
    @Override
    public void setContent(String value) {
        setAttVal(PropertyTableData.Metadata.contentAtt(), value);
    }

    @objid ("eee21f8c-9983-4e15-abda-dea7eb8964c4")
    @Override
    public ModelElement getOwner() {
        return (ModelElement) getDepVal(PropertyTableData.Metadata.OwnerDep());
    }

    @objid ("c0ac281b-9f67-4b06-a6dc-13d3f4d324b9")
    @Override
    public void setOwner(ModelElement value) {
        appendDepVal(PropertyTableData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("afd1bdc5-1730-44cc-bb4d-1c97f84b3c3c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyTableData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("ee7d55b6-ae11-4e75-87bf-ef462cf3678e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyTableData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(PropertyTableData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("ef8d6698-4833-40dd-b8ca-fc058a5725e1")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPropertyTable(this);
        else
          return null;
    }

}
