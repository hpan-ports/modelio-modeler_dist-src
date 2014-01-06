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
    @objid ("05e85281-4df3-4681-bbbc-daa7501738d2")
    @SmaMetaAssociation(metaName="Resident", typeDataClass=ArtifactData.class, min=0, max=-1, smAssociationClass=Metadata.ResidentSmDependency.class, partof = true)
     List<SmObjectImpl> mResident = null;

    @objid ("9001f6ca-f87e-4bd5-ac72-86531e1f4418")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0087b2c0-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8c8a129b-2076-4b77-a779-5a0aedbcbe6f")
        private static SmClass smClass = null;

        @objid ("c5600439-8ea0-41ef-93ce-03abf593bc92")
        private static SmDependency ResidentDep = null;

        @objid ("b3bdbd46-7ab2-4127-83f7-85c06d831db7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("069c0a02-479a-4fea-9dca-9d7127479384")
        public static SmDependency ResidentDep() {
            if (ResidentDep == null) {
            	ResidentDep = classof().getDependencyDef("Resident");
            }
            return ResidentDep;
        }

        @objid ("6c00b13b-c1d1-45b1-bc4b-33f044bacc65")
        public static SmDependency getResidentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResidentDep;
        }

        @objid ("221734ab-7046-4654-9766-eafbe5c418df")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0087f492-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9938a9b9-100e-42e5-8284-a5963e9f81d7")
            public ISmObjectData createData() {
                return new NodeData();
            }

            @objid ("6a821d39-221e-4213-adba-c646bd47c458")
            public SmObjectImpl createImpl() {
                return new NodeImpl();
            }

        }

        @objid ("00885766-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ResidentSmDependency extends SmMultipleDependency {
            @objid ("451d0261-70dd-47ab-802b-d106615b2018")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NodeData)data).mResident != null)? ((NodeData)data).mResident:SmMultipleDependency.EMPTY;
            }

            @objid ("3106d503-0df3-4a89-8698-9022caa2b27a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NodeData) data).mResident = new ArrayList<>(initialCapacity);
                return ((NodeData) data).mResident;
            }

            @objid ("3af5fac8-dab6-4d5e-a53d-b949d31f07cd")
            @Override
            public SmDependency getSymetric() {
                return ArtifactData.Metadata.DeploymentLocationDep();
            }

        }

    }

}
