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
import org.modelio.metamodel.impl.uml.infrastructure.ElementImpl;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyTableData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

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

    @objid ("ce9d65b7-907c-494b-8b3e-92a23428144a")
    @Override
    public String getName() {
        return (String) getAttVal(((PropertyTableSmClass)getClassOf()).getNameAtt());
    }

    @objid ("ce11f50a-174d-4267-a509-9392c7c153fa")
    @Override
    public void setName(String value) {
        setAttVal(((PropertyTableSmClass)getClassOf()).getNameAtt(), value);
    }

    @objid ("68339012-7c9d-430b-8fd3-e7aa8f435377")
    @Override
    public String getContent() {
        return (String) getAttVal(((PropertyTableSmClass)getClassOf()).getContentAtt());
    }

    @objid ("b5ef0d29-e407-49cb-8094-f7d11cc03d5b")
    @Override
    public void setContent(String value) {
        setAttVal(((PropertyTableSmClass)getClassOf()).getContentAtt(), value);
    }

    @objid ("1f7cb3ba-95ad-4b96-8ae8-2385b17b18fa")
    @Override
    public ModelElement getOwner() {
        Object obj = getDepVal(((PropertyTableSmClass)getClassOf()).getOwnerDep());
        return (obj instanceof ModelElement)? (ModelElement)obj : null;
    }

    @objid ("8c141a16-1151-4f52-b5f5-a3e24f234731")
    @Override
    public void setOwner(ModelElement value) {
        appendDepVal(((PropertyTableSmClass)getClassOf()).getOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("a7e0c7c6-35e9-4782-a49b-ac43f7cf9cf8")
    @Override
    public MatrixValueDefinition getOwnerValDef() {
        Object obj = getDepVal(((PropertyTableSmClass)getClassOf()).getOwnerValDefDep());
        return (obj instanceof MatrixValueDefinition)? (MatrixValueDefinition)obj : null;
    }

    @objid ("be9499fd-7cf4-4572-ada6-68f98e4c54a5")
    @Override
    public void setOwnerValDef(MatrixValueDefinition value) {
        appendDepVal(((PropertyTableSmClass)getClassOf()).getOwnerValDefDep(), (SmObjectImpl)value);
    }

    @objid ("d3fbd9bd-cab3-4e75-90da-b9e2be708d0f")
    @Override
    public QueryDefinition getOwnerQuery() {
        Object obj = getDepVal(((PropertyTableSmClass)getClassOf()).getOwnerQueryDep());
        return (obj instanceof QueryDefinition)? (QueryDefinition)obj : null;
    }

    @objid ("e5e80d52-4a72-4a28-b9cb-402f337ed8a1")
    @Override
    public void setOwnerQuery(QueryDefinition value) {
        appendDepVal(((PropertyTableSmClass)getClassOf()).getOwnerQueryDep(), (SmObjectImpl)value);
    }

    @objid ("7c0052a5-3bd8-4508-b825-d2247d0e5055")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Owner
        obj = (SmObjectImpl)this.getDepVal(((PropertyTableSmClass)getClassOf()).getOwnerDep());
        if (obj != null)
          return obj;
        // OwnerValDef
        obj = (SmObjectImpl)this.getDepVal(((PropertyTableSmClass)getClassOf()).getOwnerValDefDep());
        if (obj != null)
          return obj;
        // OwnerQuery
        obj = (SmObjectImpl)this.getDepVal(((PropertyTableSmClass)getClassOf()).getOwnerQueryDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("21b24d5d-a35e-4f03-b87e-ae60dfea099e")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Owner
        dep = ((PropertyTableSmClass)getClassOf()).getOwnerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // OwnerValDef
        dep = ((PropertyTableSmClass)getClassOf()).getOwnerValDefDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // OwnerQuery
        dep = ((PropertyTableSmClass)getClassOf()).getOwnerQueryDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("702772c4-143f-4e01-a36d-267f70c86462")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPropertyTable(this);
        else
          return null;
    }

}
