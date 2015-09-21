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
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.impl.diagrams.StaticDiagramSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("9c163ab9-ebb8-4cba-afa9-cc99ba5c68b0")
public class ClassDiagramSmClass extends StaticDiagramSmClass {
    @objid ("53ed9e86-2a92-4460-8b2f-66d1e3ace859")
    public ClassDiagramSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("1ad5f646-2621-42ce-9a18-4c30a627078d")
    @Override
    public String getName() {
        return "ClassDiagram";
    }

    @objid ("d06ce50e-225b-441a-b87c-63e1c13ab384")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("f1d79211-f5e0-420f-b661-5b0edb88bf46")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ClassDiagram.class;
    }

    @objid ("546b7006-3807-49b6-80b2-3db8d14ec5ef")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("f82b210b-36ca-4785-acdf-baf69509a361")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("9a4ff49b-15eb-4829-b57e-edaea7a58c5a")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("StaticDiagram");
        this.registerFactory(new ClassDiagramObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("e1635804-3f3f-4885-a1f6-915634deac2d")
    private static class ClassDiagramObjectFactory implements ISmObjectFactory {
        @objid ("219aa9da-68a5-4470-b1ef-d033b7514058")
        private ClassDiagramSmClass smClass;

        @objid ("4e625346-d095-4017-944b-0f6fb5ac2980")
        public ClassDiagramObjectFactory(ClassDiagramSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("04f97621-8227-48d8-846c-7323d96d5dd8")
        @Override
        public ISmObjectData createData() {
            return new ClassDiagramData(this.smClass);
        }

        @objid ("3846768f-5f32-4f1f-93f2-41bf61f3b6f0")
        @Override
        public SmObjectImpl createImpl() {
            return new ClassDiagramImpl();
        }

    }

}
