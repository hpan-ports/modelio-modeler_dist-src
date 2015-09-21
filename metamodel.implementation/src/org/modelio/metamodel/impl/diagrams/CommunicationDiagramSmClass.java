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
package org.modelio.metamodel.impl.diagrams;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.diagrams.CommunicationDiagram;
import org.modelio.metamodel.impl.diagrams.BehaviorDiagramSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("17789ac7-cdee-470b-bfec-fca419117bb1")
public class CommunicationDiagramSmClass extends BehaviorDiagramSmClass {
    @objid ("997d74ca-a885-4309-bc5c-77c52530a5b9")
    public CommunicationDiagramSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("f2260089-e816-4b44-9af9-4871fe89437e")
    @Override
    public String getName() {
        return "CommunicationDiagram";
    }

    @objid ("1664e025-a53d-449b-b98c-55c38074526b")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("18ebb01d-c4a0-49a0-8e10-9c043ed46483")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return CommunicationDiagram.class;
    }

    @objid ("4d6553ea-d8f3-4dc3-8306-4852fad45b4d")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("4e0131e0-971f-4346-aa92-c85a42d43d37")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("711ffa59-0484-436a-bb23-6e2d14713e68")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BehaviorDiagram");
        this.registerFactory(new CommunicationDiagramObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("d182e40c-0c68-4c6d-99a1-794a697cc9a4")
    private static class CommunicationDiagramObjectFactory implements ISmObjectFactory {
        @objid ("4247578e-ab65-4e1c-823c-74285bbda206")
        private CommunicationDiagramSmClass smClass;

        @objid ("f5bd324a-265c-42e3-960a-ba5db5d2fe37")
        public CommunicationDiagramObjectFactory(CommunicationDiagramSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("8bf4f627-90b7-43d1-bbe8-541f6bd221f2")
        @Override
        public ISmObjectData createData() {
            return new CommunicationDiagramData(this.smClass);
        }

        @objid ("2a30b41d-9031-4531-8daf-c34fbc4b4b44")
        @Override
        public SmObjectImpl createImpl() {
            return new CommunicationDiagramImpl();
        }

    }

}
