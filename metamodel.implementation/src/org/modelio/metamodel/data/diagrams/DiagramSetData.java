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
package org.modelio.metamodel.data.diagrams;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.diagrams.AbstractDiagramData;
import org.modelio.metamodel.data.mda.ProjectData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.diagrams.DiagramSet;
import org.modelio.metamodel.impl.diagrams.DiagramSetImpl;
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

@objid ("006e66a8-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=DiagramSet.class, factory=DiagramSetData.Metadata.ObjectFactory.class, cmsnode=true)
public class DiagramSetData extends ModelElementData {
    @objid ("ad9dfecb-e5a7-4190-821e-d390ca3c88ba")
    @SmaMetaAssociation(metaName="Sub", typeDataClass=DiagramSetData.class, min=0, max=-1, smAssociationClass=Metadata.SubSmDependency.class, component = true)
     List<SmObjectImpl> mSub = null;

    @objid ("d8fa357b-8685-4618-b6d4-770a12a74e7e")
    @SmaMetaAssociation(metaName="Parent", typeDataClass=DiagramSetData.class, min=0, max=1, smAssociationClass=Metadata.ParentSmDependency.class)
     SmObjectImpl mParent;

    @objid ("708e0600-a851-4aef-a4de-2a4a2aed0959")
    @SmaMetaAssociation(metaName="ReferencedDiagram", typeDataClass=AbstractDiagramData.class, min=0, max=-1, smAssociationClass=Metadata.ReferencedDiagramSmDependency.class, partof = true)
     List<SmObjectImpl> mReferencedDiagram = null;

    @objid ("01782697-e4dd-4667-bdcf-156fa72705cc")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ProjectData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("5aee0678-4738-4c93-be81-fe4e53cdd405")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001f4e88-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("66468f23-20db-49be-affc-2ca7681848e0")
        private static SmClass smClass = null;

        @objid ("cb07931a-c682-42e4-bc03-d171afcd3e53")
        private static SmDependency SubDep = null;

        @objid ("0ef14f0a-2abc-4e0d-b1dc-54cfe33f5282")
        private static SmDependency ParentDep = null;

        @objid ("41b3a53f-c51c-4118-a0a4-0db0e8e376cc")
        private static SmDependency ReferencedDiagramDep = null;

        @objid ("099f3f4d-675d-40e1-a269-876b4d790dfc")
        private static SmDependency OwnerDep = null;

        @objid ("3bebb379-73aa-411e-96f4-1554eb45e2c5")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DiagramSetData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("bf55cb34-d1cd-47dd-bfbc-83706e62322f")
        public static SmDependency SubDep() {
            if (SubDep == null) {
            	SubDep = classof().getDependencyDef("Sub");
            }
            return SubDep;
        }

        @objid ("0068cb64-da09-4871-9e2e-d3fe8cfdcb3b")
        public static SmDependency ParentDep() {
            if (ParentDep == null) {
            	ParentDep = classof().getDependencyDef("Parent");
            }
            return ParentDep;
        }

        @objid ("ec25fb75-b12b-4ac4-a850-426b3450bbd3")
        public static SmDependency ReferencedDiagramDep() {
            if (ReferencedDiagramDep == null) {
            	ReferencedDiagramDep = classof().getDependencyDef("ReferencedDiagram");
            }
            return ReferencedDiagramDep;
        }

        @objid ("6a29c5cf-5e24-450c-bab9-85598ce1eade")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("af138da0-a08c-45d4-85c7-dd5b283fa5e9")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c30be64d-884b-43fc-8efa-f4fa38d27b65")
        public static SmDependency getParentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentDep;
        }

        @objid ("e37e545c-06a9-40ac-ade7-ac217bebe85a")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("55806bd7-2252-4991-94dd-1bb92441e369")
        public static SmDependency getSubDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubDep;
        }

        @objid ("433579f5-e10a-4f63-9a0d-76ce9019e88f")
        public static SmDependency getReferencedDiagramDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReferencedDiagramDep;
        }

        @objid ("001f8cb8-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e50be7be-50ba-4538-8523-f96b5f65b6de")
            public ISmObjectData createData() {
                return new DiagramSetData();
            }

            @objid ("37d02883-e859-439a-9352-453d33437eaf")
            public SmObjectImpl createImpl() {
                return new DiagramSetImpl();
            }

        }

        @objid ("0020643a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SubSmDependency extends SmMultipleDependency {
            @objid ("c5ea719b-a597-4b5a-9856-766788fc1d1e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((DiagramSetData)data).mSub != null)? ((DiagramSetData)data).mSub:SmMultipleDependency.EMPTY;
            }

            @objid ("7149ae13-9246-4794-ba6c-7a3727e48b3d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((DiagramSetData) data).mSub = new ArrayList<>(initialCapacity);
                return ((DiagramSetData) data).mSub;
            }

            @objid ("074531c9-7d95-4e64-901c-c4cebb20f9db")
            @Override
            public SmDependency getSymetric() {
                return DiagramSetData.Metadata.ParentDep();
            }

        }

        @objid ("0020c542-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ParentSmDependency extends SmSingleDependency {
            @objid ("64c09154-9d38-4b48-94e2-7e0890912aac")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DiagramSetData) data).mParent;
            }

            @objid ("2c7fbf15-d4a9-4fdf-a012-77fb363c5abb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DiagramSetData) data).mParent = value;
            }

            @objid ("ca59c6e6-bc27-45a3-ae9d-40b03ff3f337")
            @Override
            public SmDependency getSymetric() {
                return DiagramSetData.Metadata.SubDep();
            }

        }

        @objid ("00213c8e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ReferencedDiagramSmDependency extends SmMultipleDependency {
            @objid ("2cd2308d-796f-45b0-b09d-4381656cc911")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((DiagramSetData)data).mReferencedDiagram != null)? ((DiagramSetData)data).mReferencedDiagram:SmMultipleDependency.EMPTY;
            }

            @objid ("14211d7b-29e5-4d94-baab-d6d5c0db360b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((DiagramSetData) data).mReferencedDiagram = new ArrayList<>(initialCapacity);
                return ((DiagramSetData) data).mReferencedDiagram;
            }

            @objid ("77945992-c339-4962-9f02-e67a07a0d659")
            @Override
            public SmDependency getSymetric() {
                return AbstractDiagramData.Metadata.ReferencingSetDep();
            }

        }

        @objid ("005cd410-70e0-1048-a9ad-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("f4af8069-e535-494b-a2ac-a315737940a4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DiagramSetData) data).mOwner;
            }

            @objid ("89e1e6b2-0ada-46d1-b2cf-7c6ab0b590ee")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DiagramSetData) data).mOwner = value;
            }

            @objid ("934088a3-1101-4459-b2ca-e76ff53f5ce6")
            @Override
            public SmDependency getSymetric() {
                return ProjectData.Metadata.DiagramRootDep();
            }

        }

    }

}
