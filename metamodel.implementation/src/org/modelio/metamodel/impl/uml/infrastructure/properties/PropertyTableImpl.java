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

    @objid ("519bd90c-3ad7-4b59-9c9a-e95d8117fa3e")
    @Override
    public String getName() {
        return (String) getAttVal(PropertyTableData.Metadata.nameAtt());
    }

    @objid ("a866ae32-cb62-4d97-913f-ab278de87a26")
    @Override
    public void setName(String value) {
        setAttVal(PropertyTableData.Metadata.nameAtt(), value);
    }

    @objid ("74a08c48-c14a-4426-b52b-d5412eef3223")
    @Override
    public String getContent() {
        return (String) getAttVal(PropertyTableData.Metadata.contentAtt());
    }

    @objid ("e0c12f31-d3f5-4ab5-bba0-c468b7f6f8a0")
    @Override
    public void setContent(String value) {
        setAttVal(PropertyTableData.Metadata.contentAtt(), value);
    }

    @objid ("66727dd9-6d86-4d3a-b24d-e235a2056540")
    @Override
    public ModelElement getOwner() {
        return (ModelElement) getDepVal(PropertyTableData.Metadata.OwnerDep());
    }

    @objid ("839a38a5-7358-4423-9336-6f82eddb08a0")
    @Override
    public void setOwner(ModelElement value) {
        appendDepVal(PropertyTableData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("89895273-4888-4b55-a960-fbdda5660ccb")
    @Override
    public MatrixValueDefinition getOwnerValDef() {
        return (MatrixValueDefinition) getDepVal(PropertyTableData.Metadata.OwnerValDefDep());
    }

    @objid ("65003711-adb0-405e-a94b-c6775bf635e9")
    @Override
    public void setOwnerValDef(MatrixValueDefinition value) {
        appendDepVal(PropertyTableData.Metadata.OwnerValDefDep(), (SmObjectImpl)value);
    }

    @objid ("20f240a5-0d53-45aa-9dc1-0bcaec682559")
    @Override
    public QueryDefinition getOwnerQuery() {
        return (QueryDefinition) getDepVal(PropertyTableData.Metadata.OwnerQueryDep());
    }

    @objid ("990e9fe1-7520-47fe-adce-3f417ec8806c")
    @Override
    public void setOwnerQuery(QueryDefinition value) {
        appendDepVal(PropertyTableData.Metadata.OwnerQueryDep(), (SmObjectImpl)value);
    }

    @objid ("be1473f7-ce55-4e76-9e05-37a87a6ee162")
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

    @objid ("6987c443-4487-489e-ab51-5381b871c3b4")
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

    @objid ("462fd0a0-f321-4624-b1bb-24962fc3f768")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPropertyTable(this);
        else
          return null;
    }

}
