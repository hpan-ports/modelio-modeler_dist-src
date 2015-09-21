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
import org.modelio.metamodel.diagrams.StaticDiagram;
import org.modelio.metamodel.impl.diagrams.AbstractDiagramSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("cfdce8a3-a136-4b46-ab5e-4b3c7dea4698")
public class StaticDiagramSmClass extends AbstractDiagramSmClass {
    @objid ("eb00b5a5-2d46-4963-b3eb-eb9f1be58284")
    public StaticDiagramSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("c79109ca-28f5-4ede-a78f-715808318470")
    @Override
    public String getName() {
        return "StaticDiagram";
    }

    @objid ("a6861163-0b64-4e27-92c7-6a357764983f")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("cb42c836-2383-4d7f-895f-ec9246f10824")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return StaticDiagram.class;
    }

    @objid ("2a09df2f-f24a-49e2-803a-4828eea73ca9")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("d57c0eee-f805-4a93-9ab9-2785012bc4a7")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("091bf135-0c39-4bc7-8449-081bdced7032")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("AbstractDiagram");
        this.registerFactory(new StaticDiagramObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("96e96572-f594-408e-b75c-52c0f4d2c9d5")
    private static class StaticDiagramObjectFactory implements ISmObjectFactory {
        @objid ("994f0290-686c-4732-99ac-6bb8ec2e6350")
        private StaticDiagramSmClass smClass;

        @objid ("c659580f-cf93-4f93-8313-b5cba2f9df5a")
        public StaticDiagramObjectFactory(StaticDiagramSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("b631a39d-fb3d-42b8-9995-dc7c25d82dfe")
        @Override
        public ISmObjectData createData() {
            return new StaticDiagramData(this.smClass);
        }

        @objid ("ceb23969-4426-47d2-93d0-3556eaef0686")
        @Override
        public SmObjectImpl createImpl() {
            return new StaticDiagramImpl();
        }

    }

}
