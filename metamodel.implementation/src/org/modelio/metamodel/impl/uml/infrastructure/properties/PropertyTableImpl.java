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
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.impl.uml.infrastructure.properties;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Properties;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTableData;
import org.modelio.metamodel.impl.uml.infrastructure.ElementImpl;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixValueDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;
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
        Properties props = new Properties();
        props.putAll(getSyncProperties());
        return props;
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
            throw new IllegalStateException("The 'Content' attribute has not the java.util.Properties format:"
                    + e.getLocalizedMessage(), e);
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
     * Return the cached properties if the Properties is up to date with the string content.
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

    @objid ("3c219d18-0fe6-42af-b28d-d4bed98e7331")
    @Override
    public String getName() {
        return (String) getAttVal(PropertyTableData.Metadata.nameAtt());
    }

    @objid ("ea22c767-d6ee-45ac-8842-121a07c155b7")
    @Override
    public void setName(String value) {
        setAttVal(PropertyTableData.Metadata.nameAtt(), value);
    }

    @objid ("c5cc9709-47ac-4e8b-9787-09f08cc32ad1")
    @Override
    public String getContent() {
        return (String) getAttVal(PropertyTableData.Metadata.contentAtt());
    }

    @objid ("7b593910-8b89-472d-97fa-03ff36b210d6")
    @Override
    public void setContent(String value) {
        setAttVal(PropertyTableData.Metadata.contentAtt(), value);
    }

    @objid ("86bcbb59-2059-459a-87d9-0dd1292b4e0b")
    @Override
    public ModelElement getOwner() {
        return (ModelElement) getDepVal(PropertyTableData.Metadata.OwnerDep());
    }

    @objid ("e8c23bf6-cfa6-45c5-8b02-119e07808dc3")
    @Override
    public void setOwner(ModelElement value) {
        appendDepVal(PropertyTableData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("6b10ab0b-065d-4866-8a57-fbe1ca007fdf")
    @Override
    public MatrixValueDefinition getOwnerValDef() {
        return (MatrixValueDefinition) getDepVal(PropertyTableData.Metadata.OwnerValDefDep());
    }

    @objid ("9fc8209b-110c-44cd-9090-e2d7baec0e26")
    @Override
    public void setOwnerValDef(MatrixValueDefinition value) {
        appendDepVal(PropertyTableData.Metadata.OwnerValDefDep(), (SmObjectImpl)value);
    }

    @objid ("facac0d9-5d5d-451a-b2d4-783f574e9f5f")
    @Override
    public QueryDefinition getOwnerQuery() {
        return (QueryDefinition) getDepVal(PropertyTableData.Metadata.OwnerQueryDep());
    }

    @objid ("84600269-a7a4-4c3e-b89a-bd0e97f854eb")
    @Override
    public void setOwnerQuery(QueryDefinition value) {
        appendDepVal(PropertyTableData.Metadata.OwnerQueryDep(), (SmObjectImpl)value);
    }

    @objid ("bdecd2ac-d4bc-45e6-8bf2-920d0a2d1f62")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyTableData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyTableData.Metadata.OwnerValDefDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyTableData.Metadata.OwnerQueryDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("1fcce3b9-6220-4638-8c7f-004fdc59ffbb")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyTableData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(PropertyTableData.Metadata.OwnerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(PropertyTableData.Metadata.OwnerValDefDep());
        if (obj != null)
          return new SmDepVal(PropertyTableData.Metadata.OwnerValDefDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(PropertyTableData.Metadata.OwnerQueryDep());
        if (obj != null)
          return new SmDepVal(PropertyTableData.Metadata.OwnerQueryDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("1186563f-4b00-4c69-b37d-a15b1d8d4d3a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPropertyTable(this);
        else
          return null;
    }

}
