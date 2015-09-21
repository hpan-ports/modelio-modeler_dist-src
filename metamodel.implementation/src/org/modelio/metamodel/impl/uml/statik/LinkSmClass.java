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
import org.modelio.metamodel.impl.uml.behavior.communicationModel.CommunicationChannelSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.AssociationSmClass;
import org.modelio.metamodel.impl.uml.statik.LinkEndSmClass;
import org.modelio.metamodel.uml.statik.Link;
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

@objid ("d2454b12-e12b-41af-b5aa-cc2f011ab2ab")
public class LinkSmClass extends ModelElementSmClass {
    @objid ("a6e3ed7b-8e8f-457d-8c97-a2020ac68d5f")
    private SmDependency modelDep;

    @objid ("7dba9560-b2d9-41a3-831b-1d8552689b33")
    private SmDependency linkEndDep;

    @objid ("95cbfd70-f0fd-4546-b2f3-e712440df3e2")
    private SmDependency sentDep;

    @objid ("9849652b-dc8d-4223-b9b9-8b50c4574bf3")
    public LinkSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("28e1a346-63f4-4810-bffb-fdc4a1ab2f7b")
    @Override
    public String getName() {
        return "Link";
    }

    @objid ("f84eaf09-dc1e-4693-af37-783e87c05692")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("38c2950f-e97c-426b-8f79-5b58f15d10ef")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Link.class;
    }

    @objid ("e95afd64-5541-42ad-9221-2fa17491a4ab")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("c66eaefd-a72b-4347-bc08-a50076626628")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("fccc0eb8-5adc-4ae8-bd33-db6cf899ad62")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new LinkObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.modelDep = new ModelSmDependency();
        this.modelDep.init("Model", this, metamodel.getMClass("Association"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.modelDep);
        
        this.linkEndDep = new LinkEndSmDependency();
        this.linkEndDep.init("LinkEnd", this, metamodel.getMClass("LinkEnd"), 2, 2 );
        registerDependency(this.linkEndDep);
        
        this.sentDep = new SentSmDependency();
        this.sentDep.init("Sent", this, metamodel.getMClass("CommunicationChannel"), 0, 1 );
        registerDependency(this.sentDep);
    }

    @objid ("d4d8f287-b0e5-4efc-a73e-826c61a35fea")
    public SmDependency getModelDep() {
        if (this.modelDep == null) {
        	this.modelDep = this.getDependencyDef("Model");
        }
        return this.modelDep;
    }

    @objid ("c561181f-ed56-453c-a99d-8027c39e7f4d")
    public SmDependency getLinkEndDep() {
        if (this.linkEndDep == null) {
        	this.linkEndDep = this.getDependencyDef("LinkEnd");
        }
        return this.linkEndDep;
    }

    @objid ("695516db-320f-4fd1-9d19-11110734a068")
    public SmDependency getSentDep() {
        if (this.sentDep == null) {
        	this.sentDep = this.getDependencyDef("Sent");
        }
        return this.sentDep;
    }

    @objid ("90869de8-a9d5-46e6-b71c-b1336b3a7c4b")
    private static class LinkObjectFactory implements ISmObjectFactory {
        @objid ("52d2c0bb-66dd-4e38-9686-244eff66c7ea")
        private LinkSmClass smClass;

        @objid ("65ff6947-1757-4008-b795-226c5182ac01")
        public LinkObjectFactory(LinkSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("83f77944-cb72-4a14-8889-5cf8237f0fe1")
        @Override
        public ISmObjectData createData() {
            return new LinkData(this.smClass);
        }

        @objid ("c7ccebd0-ca7b-4b08-b9de-7e19d4686e74")
        @Override
        public SmObjectImpl createImpl() {
            return new LinkImpl();
        }

    }

    @objid ("2da73c95-e825-4b46-aca0-d59a5aad6855")
    public static class ModelSmDependency extends SmSingleDependency {
        @objid ("57f1e8f5-0c9f-4e1c-a201-2242756b7862")
        private SmDependency symetricDep;

        @objid ("d7e51dee-05a5-483d-b3bd-7a6d8218bf1e")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((LinkData) data).mModel;
        }

        @objid ("8cdb35bf-47fc-44cd-be9d-c512e277a12e")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((LinkData) data).mModel = value;
        }

        @objid ("3be78a05-7dba-42f0-9d4a-f204bd3fcc42")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AssociationSmClass)this.getTarget()).getOccurenceDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("c4e050ff-667f-47bd-a04f-b106f38bf542")
    public static class LinkEndSmDependency extends SmMultipleDependency {
        @objid ("835caa95-1a25-4356-a2d2-d1666651bb1a")
        private SmDependency symetricDep;

        @objid ("51545cce-3009-4501-af50-bd6f99757e5c")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((LinkData)data).mLinkEnd != null)? ((LinkData)data).mLinkEnd:SmMultipleDependency.EMPTY;
        }

        @objid ("aa92e522-253c-4e75-9d53-f1823a32a903")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((LinkData) data).mLinkEnd = values;
        }

        @objid ("5cbde8d3-6ed0-45b4-81c3-6d3c167fcd69")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((LinkEndSmClass)this.getTarget()).getLinkDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("076f8357-043e-44c9-9937-10611de22f94")
    public static class SentSmDependency extends SmSingleDependency {
        @objid ("c68bf6e8-127f-48b0-b6be-e3551ba2755b")
        private SmDependency symetricDep;

        @objid ("d07e6736-e759-4379-867d-193a523d1f24")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((LinkData) data).mSent;
        }

        @objid ("b48304b9-af66-4227-be17-d36e58757190")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((LinkData) data).mSent = value;
        }

        @objid ("622eec65-05ce-44a1-9caa-099d49cc5eb5")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((CommunicationChannelSmClass)this.getTarget()).getChannelDep();
            }
            return this.symetricDep;
        }

    }

}
