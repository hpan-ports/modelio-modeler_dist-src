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
import org.modelio.metamodel.diagrams.CompositeStructureDiagram;
import org.modelio.metamodel.impl.diagrams.StaticDiagramSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("96f7f998-24f2-4040-be32-3fdb756e6161")
public class CompositeStructureDiagramSmClass extends StaticDiagramSmClass {
    @objid ("bb24c703-8910-43b3-8c5f-b318f8bda997")
    public CompositeStructureDiagramSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("30d0346f-9f09-4973-846b-5e18524d6d9e")
    @Override
    public String getName() {
        return "CompositeStructureDiagram";
    }

    @objid ("27429f81-b511-41e3-987f-b2ce96199f4a")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("3e867208-0bdf-44a1-89a5-5b9612187610")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return CompositeStructureDiagram.class;
    }

    @objid ("97f6c909-56c7-4f30-b155-35ba9fcc066f")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("1925ea5a-8833-4081-a118-e5bacc730857")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("c4210102-cb99-4a06-9ead-681f8998afb6")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("StaticDiagram");
        this.registerFactory(new CompositeStructureDiagramObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("3c53961f-0b92-44bb-9557-039be8e5ddf9")
    private static class CompositeStructureDiagramObjectFactory implements ISmObjectFactory {
        @objid ("c7f126fd-7855-4335-9b4b-bcec280c5040")
        private CompositeStructureDiagramSmClass smClass;

        @objid ("b1c0c6f5-4f36-4c35-98b1-d0cc66e8afad")
        public CompositeStructureDiagramObjectFactory(CompositeStructureDiagramSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("0ad7eff4-92a6-4321-b281-b121e8e7b14a")
        @Override
        public ISmObjectData createData() {
            return new CompositeStructureDiagramData(this.smClass);
        }

        @objid ("89142079-de54-47af-8dca-834d6d5c9313")
        @Override
        public SmObjectImpl createImpl() {
            return new CompositeStructureDiagramImpl();
        }

    }

}
