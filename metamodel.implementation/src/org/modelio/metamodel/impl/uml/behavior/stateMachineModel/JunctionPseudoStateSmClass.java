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
import org.modelio.metamodel.uml.behavior.stateMachineModel.JunctionPseudoState;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("4b1536d5-b513-4b9d-a47b-8fd194150113")
public class JunctionPseudoStateSmClass extends AbstractPseudoStateSmClass {
    @objid ("5d1f4d45-3b84-4518-92f8-4f6c2ae00458")
    public JunctionPseudoStateSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("65def4ec-31b7-4a22-ab76-c37cae69961d")
    @Override
    public String getName() {
        return "JunctionPseudoState";
    }

    @objid ("c9c42085-e580-4c3e-9b41-8db06c348856")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("3319705f-7daa-48f6-aba3-e38cf8f98c7a")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return JunctionPseudoState.class;
    }

    @objid ("acbb93c6-91b6-406c-96ad-7fd13ee18a6c")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("7610cd18-9548-4a67-9698-3dd3b1396535")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("8517eed9-db1d-4c24-a39c-f8ccbd8fe99a")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("AbstractPseudoState");
        this.registerFactory(new JunctionPseudoStateObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("4ec10ffe-d763-4cc3-b0f4-5d86133a05dd")
    private static class JunctionPseudoStateObjectFactory implements ISmObjectFactory {
        @objid ("2c576b9c-759d-48a7-bb86-c3e3f2301173")
        private JunctionPseudoStateSmClass smClass;

        @objid ("c147043f-290b-41b3-a129-f7a7541affd0")
        public JunctionPseudoStateObjectFactory(JunctionPseudoStateSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("2fcc6346-8691-49a2-86a9-7ff0bb61c1da")
        @Override
        public ISmObjectData createData() {
            return new JunctionPseudoStateData(this.smClass);
        }

        @objid ("21bf65e5-63b1-48f0-90af-03afc78b47c7")
        @Override
        public SmObjectImpl createImpl() {
            return new JunctionPseudoStateImpl();
        }

    }

}
