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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.statik.BindableInstanceSmClass;
import org.modelio.metamodel.impl.uml.statik.ProvidedInterfaceSmClass;
import org.modelio.metamodel.impl.uml.statik.RequiredInterfaceSmClass;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.PortOrientation;
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

@objid ("61204c97-45b7-4c84-92f4-7c2cd83be544")
public class PortSmClass extends BindableInstanceSmClass {
    @objid ("298e7dac-6dcd-4c36-93d9-3bea40cb8f3b")
    private SmAttribute isBehaviorAtt;

    @objid ("f9ac24bc-a4de-44ed-adaf-3070cb9db997")
    private SmAttribute isServiceAtt;

    @objid ("07f31407-eabb-4b53-b378-29cf36fa8596")
    private SmAttribute isConjugatedAtt;

    @objid ("64988eba-b195-4b73-8b5e-c3c6b196410c")
    private SmAttribute directionAtt;

    @objid ("c25d683b-6237-49d4-970b-35967d0bb56f")
    private SmDependency providedDep;

    @objid ("0902221e-6fa5-4eb8-9cbc-24c32fde1df9")
    private SmDependency requiredDep;

    @objid ("a93a3941-d18b-41b0-ac10-32177c6e398d")
    public PortSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("a11ac8e4-f9e3-450b-a733-34dabbe2c013")
    @Override
    public String getName() {
        return "Port";
    }

    @objid ("362a7edf-8d17-4f2c-990a-25d90faa45d9")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("db52ce66-37a9-4d04-a982-5c155b7bf70b")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Port.class;
    }

    @objid ("8319cd24-4e38-4d1a-8b96-c2a58610ed3b")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("d013c443-a815-4a09-9085-b4342a3afde6")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("b746280f-c772-4da5-bd0d-2e43c07b772e")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BindableInstance");
        this.registerFactory(new PortObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isBehaviorAtt = new IsBehaviorSmAttribute();
        this.isBehaviorAtt.init("IsBehavior", this, Boolean.class );
        registerAttribute(this.isBehaviorAtt);
        
        this.isServiceAtt = new IsServiceSmAttribute();
        this.isServiceAtt.init("IsService", this, Boolean.class );
        registerAttribute(this.isServiceAtt);
        
        this.isConjugatedAtt = new IsConjugatedSmAttribute();
        this.isConjugatedAtt.init("IsConjugated", this, Boolean.class );
        registerAttribute(this.isConjugatedAtt);
        
        this.directionAtt = new DirectionSmAttribute();
        this.directionAtt.init("Direction", this, PortOrientation.class );
        registerAttribute(this.directionAtt);
        
        
        // Initialize and register the SmDependency
        this.providedDep = new ProvidedSmDependency();
        this.providedDep.init("Provided", this, metamodel.getMClass("ProvidedInterface"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.providedDep);
        
        this.requiredDep = new RequiredSmDependency();
        this.requiredDep.init("Required", this, metamodel.getMClass("RequiredInterface"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.requiredDep);
    }

    @objid ("4c67c6f7-0b2b-4a43-95ca-3b9a4288b102")
    public SmAttribute getIsBehaviorAtt() {
        if (this.isBehaviorAtt == null) {
        	this.isBehaviorAtt = this.getAttributeDef("IsBehavior");
        }
        return this.isBehaviorAtt;
    }

    @objid ("85e0c1de-55fa-4df5-8f0a-5784362b45f9")
    public SmAttribute getIsServiceAtt() {
        if (this.isServiceAtt == null) {
        	this.isServiceAtt = this.getAttributeDef("IsService");
        }
        return this.isServiceAtt;
    }

    @objid ("9e39e5c4-b545-4d22-bba3-b3a6d312eda3")
    public SmAttribute getIsConjugatedAtt() {
        if (this.isConjugatedAtt == null) {
        	this.isConjugatedAtt = this.getAttributeDef("IsConjugated");
        }
        return this.isConjugatedAtt;
    }

    @objid ("8f7bb5ca-f70e-4560-a35c-06678eebeb29")
    public SmAttribute getDirectionAtt() {
        if (this.directionAtt == null) {
        	this.directionAtt = this.getAttributeDef("Direction");
        }
        return this.directionAtt;
    }

    @objid ("a6575667-27de-4790-a092-759a1a4f7223")
    public SmDependency getProvidedDep() {
        if (this.providedDep == null) {
        	this.providedDep = this.getDependencyDef("Provided");
        }
        return this.providedDep;
    }

    @objid ("8ab9ec41-86b0-4849-8d6c-4de3eff3d13c")
    public SmDependency getRequiredDep() {
        if (this.requiredDep == null) {
        	this.requiredDep = this.getDependencyDef("Required");
        }
        return this.requiredDep;
    }

    @objid ("4f5b1dae-8f0e-42f2-949d-8a1869fa689d")
    private static class PortObjectFactory implements ISmObjectFactory {
        @objid ("ec528fbf-4abe-46da-9e91-e5d4b68fcfc6")
        private PortSmClass smClass;

        @objid ("c74b3de3-0d4f-414b-a315-734469ba6203")
        public PortObjectFactory(PortSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("9ec7596a-085e-420e-8f7b-bc616171cfc0")
        @Override
        public ISmObjectData createData() {
            return new PortData(this.smClass);
        }

        @objid ("711daa53-58b4-4e53-98d1-61481fcfff70")
        @Override
        public SmObjectImpl createImpl() {
            return new PortImpl();
        }

    }

    @objid ("89e4f58b-1d3f-48ef-a653-fd43b3654303")
    public static class IsBehaviorSmAttribute extends SmAttribute {
        @objid ("8203f886-6222-4d7d-8d3d-f17f09f1c3b9")
        public Object getValue(ISmObjectData data) {
            return ((PortData) data).mIsBehavior;
        }

        @objid ("bcda591f-4756-451e-b2ff-550990e7986e")
        public void setValue(ISmObjectData data, Object value) {
            ((PortData) data).mIsBehavior = value;
        }

    }

    @objid ("5404504a-edec-4e39-9578-d1a8a702b514")
    public static class IsServiceSmAttribute extends SmAttribute {
        @objid ("ac819306-3488-49e9-9b8d-bb7de7fa9575")
        public Object getValue(ISmObjectData data) {
            return ((PortData) data).mIsService;
        }

        @objid ("79364517-caeb-4ce2-9fff-2f853e26346c")
        public void setValue(ISmObjectData data, Object value) {
            ((PortData) data).mIsService = value;
        }

    }

    @objid ("22ee3622-21e3-454b-bf8e-201210f3c3ee")
    public static class IsConjugatedSmAttribute extends SmAttribute {
        @objid ("575d1640-c775-4611-8f5b-36f0222cbd0c")
        public Object getValue(ISmObjectData data) {
            return ((PortData) data).mIsConjugated;
        }

        @objid ("c19ff729-ee61-4986-b441-12dc2dd266bf")
        public void setValue(ISmObjectData data, Object value) {
            ((PortData) data).mIsConjugated = value;
        }

    }

    @objid ("709519d4-655b-4610-b0e0-019d8fe2ad5a")
    public static class DirectionSmAttribute extends SmAttribute {
        @objid ("cfac2a56-cae4-495f-a1d9-abe0b5277e9e")
        public Object getValue(ISmObjectData data) {
            return ((PortData) data).mDirection;
        }

        @objid ("c118c9c0-b869-4719-8a1f-1da1ead9b370")
        public void setValue(ISmObjectData data, Object value) {
            ((PortData) data).mDirection = value;
        }

    }

    @objid ("cd5f2cbb-d429-4c37-a30a-c607bacee4f7")
    public static class ProvidedSmDependency extends SmMultipleDependency {
        @objid ("5a3cd03a-93a4-4885-aaba-91663b870865")
        private SmDependency symetricDep;

        @objid ("5a86996a-e1d4-4ac3-a460-c10b2cf8b499")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((PortData)data).mProvided != null)? ((PortData)data).mProvided:SmMultipleDependency.EMPTY;
        }

        @objid ("10a3dadd-5a2d-493e-8a19-ffc2ccaab4d6")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((PortData) data).mProvided = values;
        }

        @objid ("e926c10f-6bea-4238-85ab-7035b66be3b9")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ProvidedInterfaceSmClass)this.getTarget()).getProvidingDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("0c275976-ea0c-491a-ab30-f8ab1cb9482b")
    public static class RequiredSmDependency extends SmMultipleDependency {
        @objid ("03726f11-a402-431f-87b3-d22a9da4f094")
        private SmDependency symetricDep;

        @objid ("fd7e6b10-d583-4461-9d84-3286ab6f42de")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((PortData)data).mRequired != null)? ((PortData)data).mRequired:SmMultipleDependency.EMPTY;
        }

        @objid ("5033ed2a-68be-4e69-8051-08cd8fa8db1a")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((PortData) data).mRequired = values;
        }

        @objid ("5caa41d7-4b66-484b-a768-66a2f4071e09")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((RequiredInterfaceSmClass)this.getTarget()).getRequiringDep();
            }
            return this.symetricDep;
        }

    }

}
