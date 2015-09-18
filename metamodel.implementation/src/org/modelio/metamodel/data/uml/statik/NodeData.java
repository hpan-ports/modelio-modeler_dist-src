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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.statik.ArtifactData;
import org.modelio.metamodel.impl.uml.statik.NodeImpl;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAssociation;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAttribute;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaClass;

@objid ("0013d4f4-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Node.class, factory=NodeData.Metadata.ObjectFactory.class, cmsnode=true)
public class NodeData extends ClassifierData {
    @objid ("9c48f28e-3756-4f35-bfbc-af457c2725cd")
    @SmaMetaAssociation(metaName="Resident", typeDataClass=ArtifactData.class, min=0, max=-1, smAssociationClass=Metadata.ResidentSmDependency.class, partof = true)
     List<SmObjectImpl> mResident = null;

    @objid ("f2f24021-9e9e-481a-b2eb-3c0f702a3930")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0087b2c0-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c785e310-4279-4fb4-935f-7d82aaa73e5a")
        private static SmClass smClass = null;

        @objid ("875ac59e-4f6c-4054-b5a2-350d353b3a75")
        private static SmDependency ResidentDep = null;

        @objid ("6fe01f86-3b2c-405b-a612-f2de227e6ba9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("965940dc-fbea-4a70-964e-d7eecb4bf4f1")
        public static SmDependency ResidentDep() {
            if (ResidentDep == null) {
            	ResidentDep = classof().getDependencyDef("Resident");
            }
            return ResidentDep;
        }

        @objid ("302d17e4-1d93-4808-9cb4-31b0a4e3b963")
        public static SmDependency getResidentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResidentDep;
        }

        @objid ("8b4f2630-c17d-4b6b-9ab8-e333904dcb7a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0087f492-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6b14c5b1-5585-4530-82a6-5bd6e4fd77a3")
            public ISmObjectData createData() {
                return new NodeData();
            }

            @objid ("4e0d862b-653d-49fe-ba99-fad32bbb2612")
            public SmObjectImpl createImpl() {
                return new NodeImpl();
            }

        }

        @objid ("00885766-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ResidentSmDependency extends SmMultipleDependency {
            @objid ("0196dd30-c697-4715-9a5b-20bf9307585e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NodeData)data).mResident != null)? ((NodeData)data).mResident:SmMultipleDependency.EMPTY;
            }

            @objid ("5ca4cdca-079d-4b0b-b232-00ce85eb01f0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NodeData) data).mResident = new ArrayList<>(initialCapacity);
                return ((NodeData) data).mResident;
            }

            @objid ("b1677cc5-7a94-4392-8210-4da466202d54")
            @Override
            public SmDependency getSymetric() {
                return ArtifactData.Metadata.DeploymentLocationDep();
            }

        }

    }

}
