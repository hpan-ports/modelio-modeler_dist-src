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
package org.modelio.metamodel.impl.bpmn.gateways;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.gateways.BpmnParallelGateway;
import org.modelio.metamodel.impl.bpmn.gateways.BpmnGatewaySmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("231f222a-7f41-42fd-bde0-c4ecba43f073")
public class BpmnParallelGatewaySmClass extends BpmnGatewaySmClass {
    @objid ("43292a42-53cf-47c3-a715-2b2eb10d6ac6")
    public BpmnParallelGatewaySmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("92aacc07-e48f-4ed9-944c-380aa2f176b1")
    @Override
    public String getName() {
        return "BpmnParallelGateway";
    }

    @objid ("fc9ea884-82ea-423a-9395-4440fdf7b4d4")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("c03e975b-9ed8-49f9-9038-ce6ce333a11d")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnParallelGateway.class;
    }

    @objid ("cde66ad7-957d-4375-ad67-8e034d03231a")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("ff506abf-c779-4624-876e-90b66642b1c1")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("bd7195c5-82d5-4758-b663-b5ff40478746")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnGateway");
        this.registerFactory(new BpmnParallelGatewayObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("739b0b6b-b811-4cb0-bf27-df884bc64dbc")
    private static class BpmnParallelGatewayObjectFactory implements ISmObjectFactory {
        @objid ("eb9e3d9c-3fc3-4421-b976-ca01da3bad1d")
        private BpmnParallelGatewaySmClass smClass;

        @objid ("01c8701e-9769-4913-9bfa-aa41f45b838e")
        public BpmnParallelGatewayObjectFactory(BpmnParallelGatewaySmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("33a6b18d-8d75-45a6-802d-3a58e889d510")
        @Override
        public ISmObjectData createData() {
            return new BpmnParallelGatewayData(this.smClass);
        }

        @objid ("cea6096f-92a3-43c9-9e5e-449891298664")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnParallelGatewayImpl();
        }

    }

}
