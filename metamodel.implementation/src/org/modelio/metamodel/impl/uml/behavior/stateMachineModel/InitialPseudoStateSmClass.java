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
import org.modelio.metamodel.uml.behavior.stateMachineModel.InitialPseudoState;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("644df315-fea1-40b6-95e5-cc683ce071c7")
public class InitialPseudoStateSmClass extends AbstractPseudoStateSmClass {
    @objid ("25548cab-fa86-433a-85d8-f0343f6a4088")
    public InitialPseudoStateSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("1a3704c1-b0cf-44c6-86ec-8fa0e7985b3c")
    @Override
    public String getName() {
        return "InitialPseudoState";
    }

    @objid ("098c2361-b5c1-4059-bf07-9588b9f32a15")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("54730535-66e9-44d8-90a6-df55c1adf8c6")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return InitialPseudoState.class;
    }

    @objid ("977b5d40-42cf-4b97-af54-903c5743c4d5")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("d32ed5cb-9602-4abf-be83-1853127368be")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("c3f25c42-e982-471c-8511-ac42427ad235")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("AbstractPseudoState");
        this.registerFactory(new InitialPseudoStateObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("b3ee80d5-d9ed-4891-8f0c-678bca93db4d")
    private static class InitialPseudoStateObjectFactory implements ISmObjectFactory {
        @objid ("47019254-7bb2-4757-89b4-a6a1a52dfb49")
        private InitialPseudoStateSmClass smClass;

        @objid ("1fe40f68-03ed-4397-ad57-a2e64704bac3")
        public InitialPseudoStateObjectFactory(InitialPseudoStateSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("99290d8b-3a3d-404e-982c-1656f4eb8102")
        @Override
        public ISmObjectData createData() {
            return new InitialPseudoStateData(this.smClass);
        }

        @objid ("252be5c7-1984-4d61-8c0c-7eb4106fc1da")
        @Override
        public SmObjectImpl createImpl() {
            return new InitialPseudoStateImpl();
        }

    }

}
