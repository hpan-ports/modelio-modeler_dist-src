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
import java.lang.ref.SoftReference;
import java.util.Properties;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTableData;
import org.modelio.metamodel.impl.uml.infrastructure.ElementImpl;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTable;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MVisitor;

@objid ("00691798-ec87-1098-b22e-001ec947cd2a")
public class PropertyTableImpl extends ElementImpl implements PropertyTable {
    @objid ("45603d41-d582-4fc0-83ff-a25543c4c6f2")
    private int tableHash;

    @objid ("c8640425-848f-4d88-a567-c5c74b734412")
    private SoftReference<Properties> table;

    @objid ("71fabe31-282d-11e2-bf07-001ec947ccaf")
    @Override
    public String getProperty(String key) {
        Properties props = getSyncProperties();
        return props.getProperty(key);
    }

    @objid ("71fabe37-282d-11e2-bf07-001ec947ccaf")
    @Override
    public final Properties toProperties() throws IllegalStateException {
        return new Properties(getSyncProperties());
    }

    @objid ("71fabe3c-282d-11e2-bf07-001ec947ccaf")
    @Override
    public final void setContent(Properties newContent) {
        StringWriter sw = new StringWriter();
        try {
            newContent.store(sw, null);
            final String s = sw.toString();
            setContent(s);
            
            // Update the cache
            this.table = new SoftReference<>(newContent);
            this.tableHash = s.hashCode();
        } catch (IOException e) {
            throw new Error(e); // cannot happen
        }
    }

    @objid ("71fabe40-282d-11e2-bf07-001ec947ccaf")
    @Override
    public void setProperty(String key, String value) {
        Properties props = getSyncProperties();
        
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
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPropertyTable(this);
        else
          return null;
    }

    /**
     * Update the cached Properties from the string content.
     * @return the new cached Properties.
     */
    @objid ("b5b0b9f3-8d2c-44a1-8173-3c97f0a44fe1")
    private Properties computeTable() {
        Properties props = new Properties();
        try {
            final String strContent = getContent();
            props.load(new StringReader(strContent));
            this.table = new SoftReference<>(props);
            this.tableHash = strContent.hashCode();
        } catch (IOException e) {
            throw new IllegalStateException("The 'Content' attribute has not the java.util.Properties format:"+e.getLocalizedMessage(),e); 
        }
        return props;
    }

    /**
     * Get the internal property table.
     * <p>
     * The internal property table reflects the string content at the moment it is computed.
     * @return the internal property table.
     */
    @objid ("0ab19bd3-e3e4-41f5-be52-5cee16a1623e")
    private Properties getSyncProperties() {
        final Properties syncTable = isTableSync();
        
        if (syncTable == null)
            return computeTable();
        else
            return syncTable;
    }

    /**
     * Return the cached properties if the Properties is up to date
     * with the string content.
     * @return the cached property table or <code>null</code>.
     */
    @objid ("07ffcaec-5a48-4ecb-ba9d-767191ca6ac7")
    private Properties isTableSync() {
        if (this.table == null)
            return null;
        
        Properties props = this.table.get();
        if (props == null)
            return null;
        
        if (this.tableHash != getContent().hashCode())
            return null;
        return props;
    }

}
