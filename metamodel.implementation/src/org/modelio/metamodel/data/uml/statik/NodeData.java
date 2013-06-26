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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
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
    @objid ("5bbeb07f-0bc5-468f-9c97-667501a3b231")
    @SmaMetaAssociation(metaName="Resident", typeDataClass=ArtifactData.class, min=0, max=-1, smAssociationClass=Metadata.ResidentSmDependency.class, partof = true)
     List<SmObjectImpl> mResident = null;

    @objid ("f56368d5-4b19-455a-b865-a35c17044387")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0087b2c0-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("58c41bbd-4c41-4021-a203-f741a4679668")
        private static SmClass smClass = null;

        @objid ("441b8284-2bdf-41e6-bea0-f402f171e234")
        private static SmDependency ResidentDep = null;

        @objid ("95335261-ab3d-467d-a8fe-e22687586ed3")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("23c26379-6f66-4a98-a815-a0ab29bb6781")
        public static SmDependency ResidentDep() {
            if (ResidentDep == null) {
            	ResidentDep = classof().getDependencyDef("Resident");
            }
            return ResidentDep;
        }

        @objid ("a4716c17-dc91-447b-a34c-85d3fc73687f")
        public static SmDependency getResidentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResidentDep;
        }

        @objid ("85500866-1ddf-499d-935c-ee8eaa8b3a84")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0087f492-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("72cea934-4879-411b-b69c-3d99e75a474f")
            public ISmObjectData createData() {
                return new NodeData();
            }

            @objid ("40f61468-0e2d-4086-9847-b7d5c3f60b9a")
            public SmObjectImpl createImpl() {
                return new NodeImpl();
            }

        }

        @objid ("00885766-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ResidentSmDependency extends SmMultipleDependency {
            @objid ("f4d5ad3a-290e-47be-b37d-af3a8a6ec776")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NodeData)data).mResident != null)? ((NodeData)data).mResident:SmMultipleDependency.EMPTY;
            }

            @objid ("bb6a522e-156f-481d-b204-4b906e7fc27d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NodeData) data).mResident = new ArrayList<>(initialCapacity);
                return ((NodeData) data).mResident;
            }

            @objid ("9a965699-3d46-40a9-9ab6-4a74e00e01e5")
            @Override
            public SmDependency getSymetric() {
                return ArtifactData.Metadata.DeploymentLocationDep();
            }

        }

    }

}
