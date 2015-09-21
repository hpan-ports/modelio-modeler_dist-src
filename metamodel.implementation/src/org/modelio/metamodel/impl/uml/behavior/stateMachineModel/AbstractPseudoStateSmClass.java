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
package org.modelio.metamodel.impl.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateVertexSmClass;
import org.modelio.metamodel.uml.behavior.stateMachineModel.AbstractPseudoState;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("7c2c07e6-b241-4c59-aab8-908f4095c5cf")
public class AbstractPseudoStateSmClass extends StateVertexSmClass {
    @objid ("532ce8ca-fb33-4968-8ff4-438dda5af73f")
    public AbstractPseudoStateSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("c9b94ecc-1586-40dd-b797-912ad5dfc0f5")
    @Override
    public String getName() {
        return "AbstractPseudoState";
    }

    @objid ("485057f6-3b99-4d81-828e-5ae746f038b0")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("b03c946a-f0dc-49d1-bebf-0e01950dd352")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return AbstractPseudoState.class;
    }

    @objid ("d95bb38f-04c9-49dc-93ca-bf0cd4b268f2")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("f10792bf-bab6-4ef4-90f9-7d923e584879")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("b9f33397-bd97-471a-87e0-a2b058074603")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("StateVertex");
        this.registerFactory(new AbstractPseudoStateObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("ce6f57d3-ebfd-41fe-a34f-4283338167e1")
    private static class AbstractPseudoStateObjectFactory implements ISmObjectFactory {
        @objid ("a8eb0ff9-40e3-495c-8034-8e5c8329d6cf")
        private AbstractPseudoStateSmClass smClass;

        @objid ("32be463a-d9d9-49c1-b5a3-82652c3b09e5")
        public AbstractPseudoStateObjectFactory(AbstractPseudoStateSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("0aed98f3-4693-4b5f-830f-4d5de72b37df")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("d83868b7-29ea-4e20-9fbb-467e582a3204")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

}
