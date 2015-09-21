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
package org.modelio.metamodel.impl.bpmn.events;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.events.BpmnLinkEventDefinition;
import org.modelio.metamodel.impl.bpmn.events.BpmnEventDefinitionSmClass;
import org.modelio.metamodel.impl.bpmn.events.BpmnLinkEventDefinitionSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("7350b35c-294e-4083-ad55-23949813f2c1")
public class BpmnLinkEventDefinitionSmClass extends BpmnEventDefinitionSmClass {
    @objid ("3c91db04-42ad-4d6c-ae37-ec72348770f6")
    private SmDependency sourceDep;

    @objid ("37c800c9-612c-451b-b9cc-cf20c8b65c18")
    private SmDependency targetDep;

    @objid ("1f7a8f8b-a952-4afd-8c85-c97ea367aa41")
    public BpmnLinkEventDefinitionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("d6c5e837-3e4e-4315-be88-ffbe0832990a")
    @Override
    public String getName() {
        return "BpmnLinkEventDefinition";
    }

    @objid ("2c1274cb-90dd-44e4-a9ed-157cf6767323")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("eb522c38-7b6c-4a37-8863-9a34290c911c")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnLinkEventDefinition.class;
    }

    @objid ("98d1b4da-5390-46e3-b6fe-afd9f95e1f48")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("f3e76046-5b9f-4d7a-929e-a41db65e5dbc")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("3d39fe2b-94b9-422e-b1b6-4c836f37bcfa")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnEventDefinition");
        this.registerFactory(new BpmnLinkEventDefinitionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.sourceDep = new SourceSmDependency();
        this.sourceDep.init("Source", this, metamodel.getMClass("BpmnLinkEventDefinition"), 1, -1 );
        registerDependency(this.sourceDep);
        
        this.targetDep = new TargetSmDependency();
        this.targetDep.init("Target", this, metamodel.getMClass("BpmnLinkEventDefinition"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.targetDep);
    }

    @objid ("21954ede-6c00-472c-b627-c17687b33ed8")
    public SmDependency getSourceDep() {
        if (this.sourceDep == null) {
        	this.sourceDep = this.getDependencyDef("Source");
        }
        return this.sourceDep;
    }

    @objid ("882a4108-32c5-4834-97f8-59f9a4d2be30")
    public SmDependency getTargetDep() {
        if (this.targetDep == null) {
        	this.targetDep = this.getDependencyDef("Target");
        }
        return this.targetDep;
    }

    @objid ("2984d9ce-9929-494c-82a4-d5e011773a43")
    private static class BpmnLinkEventDefinitionObjectFactory implements ISmObjectFactory {
        @objid ("12ab2696-9c86-47c7-b8fb-8867fe2e61ba")
        private BpmnLinkEventDefinitionSmClass smClass;

        @objid ("10549f60-76ea-4805-8074-f6ab101e5dc8")
        public BpmnLinkEventDefinitionObjectFactory(BpmnLinkEventDefinitionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("3fea61d4-c5d4-40d2-8849-659db44dede8")
        @Override
        public ISmObjectData createData() {
            return new BpmnLinkEventDefinitionData(this.smClass);
        }

        @objid ("8552b154-08f2-4f70-ae61-621320b668de")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnLinkEventDefinitionImpl();
        }

    }

    @objid ("06f81026-07e9-4e23-babe-1b7fec243623")
    public static class SourceSmDependency extends SmMultipleDependency {
        @objid ("9c731ad6-cdf5-4c3c-8b53-ef4109b42ec4")
        private SmDependency symetricDep;

        @objid ("c7464024-19fe-4a56-b620-52f06cfc8bb5")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnLinkEventDefinitionData)data).mSource != null)? ((BpmnLinkEventDefinitionData)data).mSource:SmMultipleDependency.EMPTY;
        }

        @objid ("79d0379e-9d2d-4420-ba1a-6d2e0e1b1040")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnLinkEventDefinitionData) data).mSource = values;
        }

        @objid ("3e2d2912-f4ec-4969-9a30-24d2d2b44cf9")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnLinkEventDefinitionSmClass)this.getTarget()).getTargetDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("9a5ee9b0-3aae-4989-8f68-e9c700d04d4a")
    public static class TargetSmDependency extends SmSingleDependency {
        @objid ("b3e8de01-61bc-4f9a-932b-1a1befcf093c")
        private SmDependency symetricDep;

        @objid ("ef21ec7b-7a3d-4ebc-99d1-4507141a6511")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnLinkEventDefinitionData) data).mTarget;
        }

        @objid ("9c9379d0-a34c-4500-851b-8fc61e76976f")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnLinkEventDefinitionData) data).mTarget = value;
        }

        @objid ("3d2791e6-8b63-4e8a-8a54-06e9cbbed579")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnLinkEventDefinitionSmClass)this.getTarget()).getSourceDep();
            }
            return this.symetricDep;
        }

    }

}
