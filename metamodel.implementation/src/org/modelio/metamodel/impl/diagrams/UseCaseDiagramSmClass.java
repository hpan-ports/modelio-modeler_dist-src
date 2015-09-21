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
import org.modelio.metamodel.diagrams.UseCaseDiagram;
import org.modelio.metamodel.impl.diagrams.StaticDiagramSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("1ec2bda1-fb94-4a5c-a85c-452bd832a8fc")
public class UseCaseDiagramSmClass extends StaticDiagramSmClass {
    @objid ("f9c8c0ef-b788-4c65-aadd-44b0d095c023")
    public UseCaseDiagramSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("d1947c3a-fab3-4373-83ad-0a2833e3133a")
    @Override
    public String getName() {
        return "UseCaseDiagram";
    }

    @objid ("6ea3ce95-60c5-418a-af8f-ff19eced3254")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("faf734d6-4270-495a-97df-441799445bcd")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return UseCaseDiagram.class;
    }

    @objid ("99fec16f-7ee8-4154-b609-97e0dc4a2674")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("fde5bad7-6d98-4315-890f-52ee4822fef5")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("20e3d22a-3f2a-4040-b49e-6e2153eb0f32")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("StaticDiagram");
        this.registerFactory(new UseCaseDiagramObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("23072bda-4999-439a-be1e-cba4e1cf9fc3")
    private static class UseCaseDiagramObjectFactory implements ISmObjectFactory {
        @objid ("8d016aba-e8bc-4a8b-9f4e-2fd602ae53d9")
        private UseCaseDiagramSmClass smClass;

        @objid ("c87d0c67-b145-4880-af24-a6e8ed00e473")
        public UseCaseDiagramObjectFactory(UseCaseDiagramSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("2ae7a276-65c6-46fa-a408-a25989f57140")
        @Override
        public ISmObjectData createData() {
            return new UseCaseDiagramData(this.smClass);
        }

        @objid ("d4537d38-7ac2-4533-b04c-08a73d553867")
        @Override
        public SmObjectImpl createImpl() {
            return new UseCaseDiagramImpl();
        }

    }

}
