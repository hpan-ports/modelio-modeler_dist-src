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
import org.modelio.metamodel.diagrams.ObjectDiagram;
import org.modelio.metamodel.impl.diagrams.StaticDiagramSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("8ed0684b-53ee-4f59-8535-e31ca2634c95")
public class ObjectDiagramSmClass extends StaticDiagramSmClass {
    @objid ("cdc8226b-2de6-418d-821c-e6f5186fe1a8")
    public ObjectDiagramSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("49733f31-4577-4c02-9119-94564a5d3814")
    @Override
    public String getName() {
        return "ObjectDiagram";
    }

    @objid ("a123abca-cb8a-4e53-b447-081c15e94b56")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("862ed4c9-1299-4e7d-88a1-dead1ade5bc2")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ObjectDiagram.class;
    }

    @objid ("87f1f885-4ee2-437a-b9fd-42e2f1373b60")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("c2fb40d5-ddab-410d-9448-c55fbfcbc8d6")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("bdf271a7-c98d-4584-9cce-6c1e4d847d2d")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("StaticDiagram");
        this.registerFactory(new ObjectDiagramObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("72997637-a501-485b-b345-3b7629fd0e3d")
    private static class ObjectDiagramObjectFactory implements ISmObjectFactory {
        @objid ("88b2bdf1-dc38-4757-ada5-304246927078")
        private ObjectDiagramSmClass smClass;

        @objid ("8c1548e2-adf8-40fc-84ca-b2d56dccde84")
        public ObjectDiagramObjectFactory(ObjectDiagramSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("5dcab9af-cde6-44c7-bc08-9833bf0c7dc2")
        @Override
        public ISmObjectData createData() {
            return new ObjectDiagramData(this.smClass);
        }

        @objid ("091c7eb5-6111-4296-98f4-1fc88fb16683")
        @Override
        public SmObjectImpl createImpl() {
            return new ObjectDiagramImpl();
        }

    }

}
