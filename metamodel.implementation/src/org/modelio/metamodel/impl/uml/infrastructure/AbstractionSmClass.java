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
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.DependencySmClass;
import org.modelio.metamodel.uml.infrastructure.Abstraction;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("71cbc9ba-e43d-4661-b852-efce11af5417")
public class AbstractionSmClass extends DependencySmClass {
    @objid ("83aa6973-7eff-409f-8884-bf026dc6d4ed")
    private SmAttribute mappingAtt;

    @objid ("d3af220d-b94a-4021-b9e9-b929289e510e")
    public AbstractionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("f308cf97-f842-4a71-b891-7940cc1ef705")
    @Override
    public String getName() {
        return "Abstraction";
    }

    @objid ("9fe962f8-c320-4d7f-91a1-a9cc167bfd81")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("f559b5d1-270e-4c6c-9300-62e267836958")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Abstraction.class;
    }

    @objid ("ab96a699-6ed2-4932-a2ef-c0c56e880534")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("aa49c943-0a91-4089-b49b-4af29b23b5ac")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("cb596ced-929b-46c4-8dcc-076709a9b71e")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Dependency");
        this.registerFactory(new AbstractionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.mappingAtt = new MappingSmAttribute();
        this.mappingAtt.init("Mapping", this, String.class );
        registerAttribute(this.mappingAtt);
        
        
        // Initialize and register the SmDependency
    }

    @objid ("5d820c7a-2a8d-4231-a2c1-a0325716cbc4")
    public SmAttribute getMappingAtt() {
        if (this.mappingAtt == null) {
        	this.mappingAtt = this.getAttributeDef("Mapping");
        }
        return this.mappingAtt;
    }

    @objid ("ca9de19f-cb65-4222-b23d-dc3388e3e03a")
    private static class AbstractionObjectFactory implements ISmObjectFactory {
        @objid ("bbd5eb11-b9ec-4f00-b7f6-445ca2a1c734")
        private AbstractionSmClass smClass;

        @objid ("5f324ced-f95a-4a83-b046-384a4253d22f")
        public AbstractionObjectFactory(AbstractionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("31ef4764-0a43-4b0a-991c-f9814b4194fb")
        @Override
        public ISmObjectData createData() {
            return new AbstractionData(this.smClass);
        }

        @objid ("ebb2a48c-b63a-4156-b80e-5df2f8620ae2")
        @Override
        public SmObjectImpl createImpl() {
            return new AbstractionImpl();
        }

    }

    @objid ("e9b956ec-99d6-4859-809a-15a2cf97f3fc")
    public static class MappingSmAttribute extends SmAttribute {
        @objid ("05ca6e0a-71b8-4cdc-bf75-9a5c46cdd0b2")
        public Object getValue(ISmObjectData data) {
            return ((AbstractionData) data).mMapping;
        }

        @objid ("7528609a-8918-46d3-8eb3-7ba6e6a60b35")
        public void setValue(ISmObjectData data, Object value) {
            ((AbstractionData) data).mMapping = value;
        }

    }

}
