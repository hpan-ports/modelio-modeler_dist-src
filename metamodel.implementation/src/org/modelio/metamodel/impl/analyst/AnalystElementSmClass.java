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
package org.modelio.metamodel.impl.analyst;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.AnalystElement;
import org.modelio.metamodel.impl.analyst.AnalystItemSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("47b25691-28d6-439c-bdc9-cca94ded992c")
public class AnalystElementSmClass extends AnalystItemSmClass {
    @objid ("ceff0e1e-c475-45f5-9ecd-be6f5873cab3")
    private SmAttribute versionAtt;

    @objid ("dfb67513-ce30-4e55-b021-c08a70c7ab39")
    public AnalystElementSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("764fb74b-76d0-4415-bdbf-d6624c3b2c7f")
    @Override
    public String getName() {
        return "AnalystElement";
    }

    @objid ("a8fc843b-10b1-4b7a-bf54-e49f348517f1")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("85e64680-4901-46b4-9c7d-55a4fbe4804e")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return AnalystElement.class;
    }

    @objid ("9ab8be4e-4e5b-4736-a987-05f897d7baa7")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("fc8e4f28-09d9-4097-bca1-4a27396a0766")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("39e08c76-0210-4bd8-bc06-de9705c2095c")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("AnalystItem");
        this.registerFactory(new AnalystElementObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.versionAtt = new VersionSmAttribute();
        this.versionAtt.init("Version", this, Integer.class );
        registerAttribute(this.versionAtt);
        
        
        // Initialize and register the SmDependency
    }

    @objid ("4224e610-17cb-4282-9580-43a35f9d6067")
    public SmAttribute getVersionAtt() {
        if (this.versionAtt == null) {
        	this.versionAtt = this.getAttributeDef("Version");
        }
        return this.versionAtt;
    }

    @objid ("cbc68a1c-95b8-44e6-ac5c-578f0fee810a")
    private static class AnalystElementObjectFactory implements ISmObjectFactory {
        @objid ("6dd63447-7906-43a3-847d-de2b33229c17")
        private AnalystElementSmClass smClass;

        @objid ("f42e8946-e356-4839-b4fe-6f6a66b47521")
        public AnalystElementObjectFactory(AnalystElementSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("f4467c23-d9bb-4209-9383-4585df7baee0")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("3ce55788-4784-44e5-913d-2de5db9f3147")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("423dccac-8ad7-4c71-9af7-077de1c299d3")
    public static class VersionSmAttribute extends SmAttribute {
        @objid ("4cb4c2fc-4a77-43d3-bf10-14f8c17fc745")
        public Object getValue(ISmObjectData data) {
            return ((AnalystElementData) data).mVersion;
        }

        @objid ("851d7cdc-cffc-4cb2-a1bc-cd1ccd692146")
        public void setValue(ISmObjectData data, Object value) {
            ((AnalystElementData) data).mVersion = value;
        }

    }

}
