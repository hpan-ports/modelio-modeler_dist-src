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
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.AbstractPseudoStateSmClass;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ShallowHistoryPseudoState;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("754f8010-1042-4044-860e-56a58ad680d5")
public class ShallowHistoryPseudoStateSmClass extends AbstractPseudoStateSmClass {
    @objid ("b4884b7c-7ce8-4ee6-a13f-fb9ac2f4c028")
    public ShallowHistoryPseudoStateSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("cb65c540-f50c-4d5c-bc05-5ce8e35e3f32")
    @Override
    public String getName() {
        return "ShallowHistoryPseudoState";
    }

    @objid ("5b072321-c8e9-4fff-87f6-8361488a5228")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("f224ce5b-84bf-4292-8dc1-fea1cae5bd7d")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ShallowHistoryPseudoState.class;
    }

    @objid ("f8f912d6-4dcb-4e31-b196-77ce0e87f3e4")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("46a95057-541d-4b4e-a1af-c4d42de41839")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("32aa795e-db6a-4589-82e8-c3adbab9d67c")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("AbstractPseudoState");
        this.registerFactory(new ShallowHistoryPseudoStateObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("4b1c18ec-5693-45b7-baa3-367178f9d2a3")
    private static class ShallowHistoryPseudoStateObjectFactory implements ISmObjectFactory {
        @objid ("fdd56ccb-7d07-423c-ac4e-5d44ca989617")
        private ShallowHistoryPseudoStateSmClass smClass;

        @objid ("d7874c96-1599-49eb-acb1-d762457da4b0")
        public ShallowHistoryPseudoStateObjectFactory(ShallowHistoryPseudoStateSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("5492030b-1a51-4da9-a92d-6f68afa096b8")
        @Override
        public ISmObjectData createData() {
            return new ShallowHistoryPseudoStateData(this.smClass);
        }

        @objid ("cdbdc7f6-7dca-44f8-8e63-0de2db04e340")
        @Override
        public SmObjectImpl createImpl() {
            return new ShallowHistoryPseudoStateImpl();
        }

    }

}
