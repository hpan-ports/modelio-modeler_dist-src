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
import org.modelio.metamodel.diagrams.DeploymentDiagram;
import org.modelio.metamodel.impl.diagrams.StaticDiagramSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("102f51de-ac14-432f-9fbf-c09f03c0fdb2")
public class DeploymentDiagramSmClass extends StaticDiagramSmClass {
    @objid ("fb0a4ef9-336a-430a-a58f-b64b74b24efc")
    public DeploymentDiagramSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("d029a8a4-2b21-4619-a902-99ebf15019b5")
    @Override
    public String getName() {
        return "DeploymentDiagram";
    }

    @objid ("9f2c434a-2739-4c96-9d28-a58396ed1cb1")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("147d6b9d-9a20-40ff-a240-cf6df2f70215")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return DeploymentDiagram.class;
    }

    @objid ("8dd60d18-f80d-4f17-b9ec-7dc38f3723dd")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("a2f43f41-bfa8-4045-b1c0-7f7967fb7226")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("2e31e813-cffe-4be3-956d-102127974383")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("StaticDiagram");
        this.registerFactory(new DeploymentDiagramObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("a5bb3789-5433-450c-b4ff-21513f1fdf9e")
    private static class DeploymentDiagramObjectFactory implements ISmObjectFactory {
        @objid ("4ce606fe-ac66-4463-8dbf-4e4cb329f8dc")
        private DeploymentDiagramSmClass smClass;

        @objid ("b2953bfb-178f-4e27-8542-e11ae7f4425f")
        public DeploymentDiagramObjectFactory(DeploymentDiagramSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("db4f884f-b885-4dc4-8ad5-7f98364300bc")
        @Override
        public ISmObjectData createData() {
            return new DeploymentDiagramData(this.smClass);
        }

        @objid ("c32eb84b-fa45-47a4-a3cf-e2cf302098ef")
        @Override
        public SmObjectImpl createImpl() {
            return new DeploymentDiagramImpl();
        }

    }

}
