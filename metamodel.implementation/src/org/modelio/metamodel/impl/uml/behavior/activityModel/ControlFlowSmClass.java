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
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityEdgeSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.ControlFlow;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("bcf8c7a8-f5f2-4aa2-8d40-afaac0e29e40")
public class ControlFlowSmClass extends ActivityEdgeSmClass {
    @objid ("a0ee7fb6-0259-439c-84be-c13f347d7b43")
    public ControlFlowSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("f1ca14b3-3887-4362-ad2c-993a2aad727f")
    @Override
    public String getName() {
        return "ControlFlow";
    }

    @objid ("d0ab31ce-2654-4d30-96fd-451500d586aa")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("52adfb31-540a-4065-b98f-efc99935b473")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ControlFlow.class;
    }

    @objid ("1e871179-8f1d-4bc8-b7b1-fbd58d953962")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("0e673e7e-b0c5-4829-acf1-e1758f947d33")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("2b946745-a665-419f-aed4-7d3cf5bb9039")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ActivityEdge");
        this.registerFactory(new ControlFlowObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("83dbcac1-7f08-493a-a5ae-2be58d5e3603")
    private static class ControlFlowObjectFactory implements ISmObjectFactory {
        @objid ("bc1b3189-c931-4e47-9f91-761cd865bcd6")
        private ControlFlowSmClass smClass;

        @objid ("a936ca14-9b53-44b9-9cdb-341dc4f5f8a3")
        public ControlFlowObjectFactory(ControlFlowSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("da435bc7-8852-4941-8082-82bce5542ce2")
        @Override
        public ISmObjectData createData() {
            return new ControlFlowData(this.smClass);
        }

        @objid ("c34a473e-6ec5-4db1-a9ef-8141c04c48da")
        @Override
        public SmObjectImpl createImpl() {
            return new ControlFlowImpl();
        }

    }

}
