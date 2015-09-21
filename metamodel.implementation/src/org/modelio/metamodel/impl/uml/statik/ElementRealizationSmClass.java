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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.AbstractionSmClass;
import org.modelio.metamodel.uml.statik.ElementRealization;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("5a66d517-b555-404b-b7f5-fbb06071a8be")
public class ElementRealizationSmClass extends AbstractionSmClass {
    @objid ("3a902e9e-7514-4281-8b83-b5c79c312552")
    public ElementRealizationSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("e45249c7-e337-4aa2-b602-10c32e3c5448")
    @Override
    public String getName() {
        return "ElementRealization";
    }

    @objid ("a3774e6c-28d0-4ac8-884d-3dfd4bb8227e")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("cd8045af-6179-4ac4-8458-bccb7ed38046")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ElementRealization.class;
    }

    @objid ("b0a01df0-7128-4f40-98d2-dc304895988b")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("48d1407f-06b7-4d9c-b39f-afb1ef806ee6")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("2efbdd21-547c-46ff-8026-9417b8b7fad4")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Abstraction");
        this.registerFactory(new ElementRealizationObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("5ad8250c-b974-42b1-bf2b-c88dea2f4f31")
    private static class ElementRealizationObjectFactory implements ISmObjectFactory {
        @objid ("857f6967-0c70-45a5-b0d9-3367d5aa63b6")
        private ElementRealizationSmClass smClass;

        @objid ("f39674a4-eb3a-4984-b433-8e238f6570c3")
        public ElementRealizationObjectFactory(ElementRealizationSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("63523422-999f-4463-99d3-abe5d4a78002")
        @Override
        public ISmObjectData createData() {
            return new ElementRealizationData(this.smClass);
        }

        @objid ("0868920b-63b4-457a-8f7a-12bf9d9ea037")
        @Override
        public SmObjectImpl createImpl() {
            return new ElementRealizationImpl();
        }

    }

}
