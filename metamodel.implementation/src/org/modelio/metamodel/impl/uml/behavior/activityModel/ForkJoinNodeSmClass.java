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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ControlNodeSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.ForkJoinNode;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("1ebe4134-991e-4e1c-8bb0-d1db7d1d2e79")
public class ForkJoinNodeSmClass extends ControlNodeSmClass {
    @objid ("754f9a85-52a4-4210-ac54-de26a8680736")
    private SmAttribute isCombineDuplicateAtt;

    @objid ("51baeacb-3a33-459d-88ed-d0d02692413c")
    private SmAttribute joinSpecAtt;

    @objid ("76763ae6-6919-4711-bb8b-c795f97d5d90")
    public ForkJoinNodeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("0b43e772-be43-41ad-94c5-5be4e327afa4")
    @Override
    public String getName() {
        return "ForkJoinNode";
    }

    @objid ("d8b772c6-f990-4205-9148-6aacf0c4290a")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("35fdfc16-4600-4ffe-883e-9d195adf51d9")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ForkJoinNode.class;
    }

    @objid ("8684ce8d-7384-4885-92dc-35deb964674e")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("ec115d98-2ad3-4c3f-86ba-b7ab01272f20")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("3780127a-db0e-4d19-ba6f-9f322a8566f3")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ControlNode");
        this.registerFactory(new ForkJoinNodeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isCombineDuplicateAtt = new IsCombineDuplicateSmAttribute();
        this.isCombineDuplicateAtt.init("IsCombineDuplicate", this, Boolean.class );
        registerAttribute(this.isCombineDuplicateAtt);
        
        this.joinSpecAtt = new JoinSpecSmAttribute();
        this.joinSpecAtt.init("JoinSpec", this, String.class );
        registerAttribute(this.joinSpecAtt);
        
        
        // Initialize and register the SmDependency
    }

    @objid ("2ea9b27b-7e11-47b4-9a90-d19bbbabeb98")
    public SmAttribute getIsCombineDuplicateAtt() {
        if (this.isCombineDuplicateAtt == null) {
        	this.isCombineDuplicateAtt = this.getAttributeDef("IsCombineDuplicate");
        }
        return this.isCombineDuplicateAtt;
    }

    @objid ("2728039b-f6db-4557-848f-4567aeb66b85")
    public SmAttribute getJoinSpecAtt() {
        if (this.joinSpecAtt == null) {
        	this.joinSpecAtt = this.getAttributeDef("JoinSpec");
        }
        return this.joinSpecAtt;
    }

    @objid ("2abe1725-11fe-4426-80c4-2f7804f748dd")
    private static class ForkJoinNodeObjectFactory implements ISmObjectFactory {
        @objid ("7271567f-e610-41b6-bb62-590e26e8583c")
        private ForkJoinNodeSmClass smClass;

        @objid ("167d04aa-b1b6-4f07-9c4b-781785a49425")
        public ForkJoinNodeObjectFactory(ForkJoinNodeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("5db6b587-8a45-4a07-90e1-193c4f839dcf")
        @Override
        public ISmObjectData createData() {
            return new ForkJoinNodeData(this.smClass);
        }

        @objid ("333d3562-ad29-49d6-baf1-b05aca5a28bd")
        @Override
        public SmObjectImpl createImpl() {
            return new ForkJoinNodeImpl();
        }

    }

    @objid ("c65f1c3b-216f-48ba-a531-e30bfd6d71c8")
    public static class IsCombineDuplicateSmAttribute extends SmAttribute {
        @objid ("8af3f8d6-b74b-4f50-9b82-3c263e34f034")
        public Object getValue(ISmObjectData data) {
            return ((ForkJoinNodeData) data).mIsCombineDuplicate;
        }

        @objid ("138f49aa-1c41-48c9-a694-bf9b794b65c5")
        public void setValue(ISmObjectData data, Object value) {
            ((ForkJoinNodeData) data).mIsCombineDuplicate = value;
        }

    }

    @objid ("ff335d32-f4a6-4955-8206-4f8f073c6edd")
    public static class JoinSpecSmAttribute extends SmAttribute {
        @objid ("da54745b-fa50-4cec-a9c7-f731c882c8b9")
        public Object getValue(ISmObjectData data) {
            return ((ForkJoinNodeData) data).mJoinSpec;
        }

        @objid ("aa6340e7-9ac1-4358-965c-ff20a40cbe76")
        public void setValue(ISmObjectData data, Object value) {
            ((ForkJoinNodeData) data).mJoinSpec = value;
        }

    }

}
