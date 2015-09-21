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
package org.modelio.metamodel.impl.analyst;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.AnalystContainer;
import org.modelio.metamodel.impl.analyst.AnalystItemSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("594faf9d-85f2-4dbf-8fc1-fd33e878363b")
public class AnalystContainerSmClass extends AnalystItemSmClass {
    @objid ("fa343954-410d-4122-993b-9aadec085897")
    public AnalystContainerSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("466fa77e-dd53-438b-a411-6753f17d9d26")
    @Override
    public String getName() {
        return "AnalystContainer";
    }

    @objid ("e3f729f1-7fba-4df8-8da7-dbe67252ceee")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("d785e040-4004-4e4f-bb48-b42c3937c9df")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return AnalystContainer.class;
    }

    @objid ("f0c7c7f0-ef8e-45fe-8591-5cdd6528d67d")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("6a99157e-a861-4d5b-b34d-d59c20dbeaa5")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("f1903df8-2685-4938-8ae8-6ba867cb820f")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("AnalystItem");
        this.registerFactory(new AnalystContainerObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("4293e430-849e-48f0-aa5c-f07ed17d203c")
    private static class AnalystContainerObjectFactory implements ISmObjectFactory {
        @objid ("e4dae591-b72d-4936-8eca-769307d49103")
        private AnalystContainerSmClass smClass;

        @objid ("f632dd49-64d8-4907-beec-8eaf13b1c897")
        public AnalystContainerObjectFactory(AnalystContainerSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("4ac6c079-3eaa-42b8-8732-05dfb5a4f616")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("03d5de4d-5c91-4ede-a8d9-dfab951059d9")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

}
