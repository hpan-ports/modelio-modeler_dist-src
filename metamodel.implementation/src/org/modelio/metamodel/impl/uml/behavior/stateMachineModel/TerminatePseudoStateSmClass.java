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
import org.modelio.metamodel.uml.behavior.stateMachineModel.TerminatePseudoState;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("1427429a-2d1c-400a-81f2-36a8036426ab")
public class TerminatePseudoStateSmClass extends AbstractPseudoStateSmClass {
    @objid ("24cc3d76-b41e-4b30-8e5e-3f6e6735bc8d")
    public TerminatePseudoStateSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("70b6fc4d-d8f3-4d1c-8b15-c256bb59d7ea")
    @Override
    public String getName() {
        return "TerminatePseudoState";
    }

    @objid ("7fc274c0-6ecf-4b2e-af1e-6882d3552ecf")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("f6af6ce3-2894-46b8-a345-84e2d58908f2")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return TerminatePseudoState.class;
    }

    @objid ("f50477a5-2d31-4684-894c-b25f53324909")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("a34e66b9-a416-4691-b1e3-8f20642bcea5")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("a66e52dc-ad62-4e70-a110-f98b81335051")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("AbstractPseudoState");
        this.registerFactory(new TerminatePseudoStateObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("e6172cee-a00c-43c9-96ac-da383c0c3c41")
    private static class TerminatePseudoStateObjectFactory implements ISmObjectFactory {
        @objid ("e68e3d13-bb1d-4ed9-822a-3a4ff139a6eb")
        private TerminatePseudoStateSmClass smClass;

        @objid ("c2a2d8d3-a011-48f7-8182-a82a09b5899f")
        public TerminatePseudoStateObjectFactory(TerminatePseudoStateSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("319c8101-68c9-408d-aecb-b0703e7ce02b")
        @Override
        public ISmObjectData createData() {
            return new TerminatePseudoStateData(this.smClass);
        }

        @objid ("64e3d38f-eb54-44fe-92eb-553bb1c61eab")
        @Override
        public SmObjectImpl createImpl() {
            return new TerminatePseudoStateImpl();
        }

    }

}
