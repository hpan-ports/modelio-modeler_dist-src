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
import org.modelio.metamodel.impl.uml.statik.GeneralClassSmClass;
import org.modelio.metamodel.impl.uml.statik.InterfaceRealizationSmClass;
import org.modelio.metamodel.impl.uml.statik.ProvidedInterfaceSmClass;
import org.modelio.metamodel.impl.uml.statik.RequiredInterfaceSmClass;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("c59234f4-eed7-4a54-9c04-69ac1b210ba1")
public class InterfaceSmClass extends GeneralClassSmClass {
    @objid ("cc7e4c81-e1f2-46c3-815c-60c53196e7a1")
    private SmDependency requiringDep;

    @objid ("6b768376-a104-4d6e-987d-0feeae9e9bd2")
    private SmDependency implementedLinkDep;

    @objid ("2c4facc0-0aee-4137-a0f7-97e97fb1cffe")
    private SmDependency providingDep;

    @objid ("2fcdc3a3-36cb-4347-98e2-235474dd34d9")
    public InterfaceSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("b578a949-4964-4c8e-bc94-b02ba125da8e")
    @Override
    public String getName() {
        return "Interface";
    }

    @objid ("575aac79-2b69-407b-8f30-e8e6066490d9")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("220bd758-a480-4666-bd0f-6cb5e1528615")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Interface.class;
    }

    @objid ("8ae01435-04a5-4ff0-930c-e233dc1326e1")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("de043a25-36ea-4471-beb8-90a5bcc0739b")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("98965bdf-4a90-4a68-b3ff-954845f61e92")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("GeneralClass");
        this.registerFactory(new InterfaceObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.requiringDep = new RequiringSmDependency();
        this.requiringDep.init("Requiring", this, metamodel.getMClass("RequiredInterface"), 0, -1 );
        registerDependency(this.requiringDep);
        
        this.implementedLinkDep = new ImplementedLinkSmDependency();
        this.implementedLinkDep.init("ImplementedLink", this, metamodel.getMClass("InterfaceRealization"), 0, -1 , SmDirective.SMCDDYNAMIC, SmDirective.SMCDTODELETE);
        registerDependency(this.implementedLinkDep);
        
        this.providingDep = new ProvidingSmDependency();
        this.providingDep.init("Providing", this, metamodel.getMClass("ProvidedInterface"), 0, -1 );
        registerDependency(this.providingDep);
    }

    @objid ("e16a608c-4e87-415f-813e-70870deb091d")
    public SmDependency getRequiringDep() {
        if (this.requiringDep == null) {
        	this.requiringDep = this.getDependencyDef("Requiring");
        }
        return this.requiringDep;
    }

    @objid ("1a5f350b-3f4f-49dd-a62c-b39cc6bd62bb")
    public SmDependency getImplementedLinkDep() {
        if (this.implementedLinkDep == null) {
        	this.implementedLinkDep = this.getDependencyDef("ImplementedLink");
        }
        return this.implementedLinkDep;
    }

    @objid ("5e3bef70-1ef5-4beb-b41c-4fafe659c345")
    public SmDependency getProvidingDep() {
        if (this.providingDep == null) {
        	this.providingDep = this.getDependencyDef("Providing");
        }
        return this.providingDep;
    }

    @objid ("b7022f49-d297-4ff8-92fb-668d58ebc1c8")
    private static class InterfaceObjectFactory implements ISmObjectFactory {
        @objid ("dbb2d25e-192a-447f-a1bb-e399eee88217")
        private InterfaceSmClass smClass;

        @objid ("b600d59d-a934-4648-91aa-3ec26f543b90")
        public InterfaceObjectFactory(InterfaceSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("d1d2a2f4-801a-4b27-ab30-ac8246cddec6")
        @Override
        public ISmObjectData createData() {
            return new InterfaceData(this.smClass);
        }

        @objid ("1e6dafcf-a350-423a-8cf2-d1296e2d97a3")
        @Override
        public SmObjectImpl createImpl() {
            return new InterfaceImpl();
        }

    }

    @objid ("0d0b1aba-1716-4cda-aa8d-26983a6edc91")
    public static class RequiringSmDependency extends SmMultipleDependency {
        @objid ("0b756791-c89f-420f-8637-9c6d5629bf18")
        private SmDependency symetricDep;

        @objid ("88c694a1-2397-4108-bca5-f62da4690f89")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InterfaceData)data).mRequiring != null)? ((InterfaceData)data).mRequiring:SmMultipleDependency.EMPTY;
        }

        @objid ("0b710a7b-c5ec-4835-bd5b-65dd73dedfbd")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InterfaceData) data).mRequiring = values;
        }

        @objid ("fa9d9454-38e5-4717-a51c-fdcf5b370760")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((RequiredInterfaceSmClass)this.getTarget()).getRequiredElementDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("bddc45b0-27f9-443f-a69b-cff3079556bf")
    public static class ImplementedLinkSmDependency extends SmMultipleDependency {
        @objid ("27ac3f4a-5cae-4d3b-873c-2f5fdaf4d914")
        private SmDependency symetricDep;

        @objid ("b2babb71-a1a2-4b73-8a3e-d353a0cf1df6")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InterfaceData)data).mImplementedLink != null)? ((InterfaceData)data).mImplementedLink:SmMultipleDependency.EMPTY;
        }

        @objid ("2684e13e-51fb-42ba-b89b-699da48f5ba6")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InterfaceData) data).mImplementedLink = values;
        }

        @objid ("d8881366-a2f8-4456-8f60-8fb4a520c2b1")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InterfaceRealizationSmClass)this.getTarget()).getImplementedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("34cc74c0-08ea-46e2-92ef-fee432d2abcd")
    public static class ProvidingSmDependency extends SmMultipleDependency {
        @objid ("2cdffe60-0d4d-4c63-9e01-0c54cc796bea")
        private SmDependency symetricDep;

        @objid ("e7f9b994-6abc-49fe-aef3-4cc3d2e62fd1")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InterfaceData)data).mProviding != null)? ((InterfaceData)data).mProviding:SmMultipleDependency.EMPTY;
        }

        @objid ("d68de3b4-e471-4aa1-bbd3-e798e90b6659")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InterfaceData) data).mProviding = values;
        }

        @objid ("46c35726-4429-4d75-bbad-4b6b96fe75e4")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ProvidedInterfaceSmClass)this.getTarget()).getProvidedElementDep();
            }
            return this.symetricDep;
        }

    }

}
