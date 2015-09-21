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
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityActionSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityNodeSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.StructuredActivityNode;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("5c8fac83-8d4d-4440-9e52-317a1ecc923d")
public class StructuredActivityNodeSmClass extends ActivityActionSmClass {
    @objid ("5ffbd4ee-c7cb-47a5-bfd2-42145de0d90c")
    private SmAttribute mustIsolateAtt;

    @objid ("1da85483-ecf1-4d35-8fe2-0dd379890d85")
    private SmDependency bodyDep;

    @objid ("a7107b3b-cdf9-4a0e-b480-38f2ed88bcce")
    public StructuredActivityNodeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("43f01eb0-4ef5-4c32-9786-f9cd75bc66fb")
    @Override
    public String getName() {
        return "StructuredActivityNode";
    }

    @objid ("3893dfb8-47d5-46ec-a113-756d0d901711")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("55ebcbb2-91bb-4078-9b49-9e9b55957526")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return StructuredActivityNode.class;
    }

    @objid ("b941d388-adad-4d83-8139-20e060633054")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("5564887e-d403-4c29-8f18-258498556e69")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("73b5f319-c330-4fe8-b072-08b904807cdf")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ActivityAction");
        this.registerFactory(new StructuredActivityNodeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.mustIsolateAtt = new MustIsolateSmAttribute();
        this.mustIsolateAtt.init("MustIsolate", this, Boolean.class );
        registerAttribute(this.mustIsolateAtt);
        
        
        // Initialize and register the SmDependency
        this.bodyDep = new BodySmDependency();
        this.bodyDep.init("Body", this, metamodel.getMClass("ActivityNode"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.bodyDep);
    }

    @objid ("9cd139dd-dc8f-43b3-922c-cb1728dee3f2")
    public SmAttribute getMustIsolateAtt() {
        if (this.mustIsolateAtt == null) {
        	this.mustIsolateAtt = this.getAttributeDef("MustIsolate");
        }
        return this.mustIsolateAtt;
    }

    @objid ("2139b2de-6dd3-4a08-b411-5ef4e7b4e2ae")
    public SmDependency getBodyDep() {
        if (this.bodyDep == null) {
        	this.bodyDep = this.getDependencyDef("Body");
        }
        return this.bodyDep;
    }

    @objid ("e686de7c-5b8d-48a0-9eb1-9853f00bcfa8")
    private static class StructuredActivityNodeObjectFactory implements ISmObjectFactory {
        @objid ("890068b3-0b17-4b5f-83b4-198384954059")
        private StructuredActivityNodeSmClass smClass;

        @objid ("b3c8367b-6e06-4a62-aeee-8f300b3e235d")
        public StructuredActivityNodeObjectFactory(StructuredActivityNodeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("8729339e-8e55-4ccb-a5c5-066fac5f71b3")
        @Override
        public ISmObjectData createData() {
            return new StructuredActivityNodeData(this.smClass);
        }

        @objid ("d9bda163-246c-4bf4-bbe9-f3240d3c0593")
        @Override
        public SmObjectImpl createImpl() {
            return new StructuredActivityNodeImpl();
        }

    }

    @objid ("02b12338-1100-47c8-ba89-dbc8ec326361")
    public static class MustIsolateSmAttribute extends SmAttribute {
        @objid ("03f1f3fb-b27c-42aa-b3a5-2e6dd39c4456")
        public Object getValue(ISmObjectData data) {
            return ((StructuredActivityNodeData) data).mMustIsolate;
        }

        @objid ("ebe3c7b4-1e83-4df9-910b-6d5ec7fe8d60")
        public void setValue(ISmObjectData data, Object value) {
            ((StructuredActivityNodeData) data).mMustIsolate = value;
        }

    }

    @objid ("e176c42b-f45f-4543-8319-3b9c74fdd231")
    public static class BodySmDependency extends SmMultipleDependency {
        @objid ("c3f8e871-ada5-4f79-bca4-b40770dcb952")
        private SmDependency symetricDep;

        @objid ("02d3138c-b605-4a19-9d4e-516e1a2b8816")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((StructuredActivityNodeData)data).mBody != null)? ((StructuredActivityNodeData)data).mBody:SmMultipleDependency.EMPTY;
        }

        @objid ("affd8e5f-94e9-4ae7-b6b9-69abc3cba616")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((StructuredActivityNodeData) data).mBody = values;
        }

        @objid ("63b55a0f-2482-428c-8738-09be356c2fe8")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ActivityNodeSmClass)this.getTarget()).getOwnerNodeDep();
            }
            return this.symetricDep;
        }

    }

}
