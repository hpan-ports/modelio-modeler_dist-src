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
import org.modelio.metamodel.diagrams.SequenceDiagram;
import org.modelio.metamodel.impl.diagrams.BehaviorDiagramSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("f758ab36-5b8b-41ca-b5d8-d649b4b16796")
public class SequenceDiagramSmClass extends BehaviorDiagramSmClass {
    @objid ("3c3f3e1e-dd00-4035-a667-ff1153fbbcb0")
    public SequenceDiagramSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("90212ad4-9dad-4857-83fa-c9050dd820e4")
    @Override
    public String getName() {
        return "SequenceDiagram";
    }

    @objid ("26382ac3-71c9-4de6-b990-0cb10f3fa3e7")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("d2db3049-bc9b-4d42-8636-5be5cdbc3375")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return SequenceDiagram.class;
    }

    @objid ("32cca940-ae29-430f-b694-8881d9997610")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("4076e134-f0fd-444f-a53a-1d17bb4ba0ec")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("86151dea-78d4-4d35-ab7d-2dbda354e6fe")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BehaviorDiagram");
        this.registerFactory(new SequenceDiagramObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("36448cf3-d784-49fa-9911-e46e130c9166")
    private static class SequenceDiagramObjectFactory implements ISmObjectFactory {
        @objid ("63ab1574-c6b0-4dc2-b116-b06620fddb6d")
        private SequenceDiagramSmClass smClass;

        @objid ("e9de9ac0-fce1-4446-9074-c550b948627b")
        public SequenceDiagramObjectFactory(SequenceDiagramSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("75a8a0e5-5fb8-482b-a2ca-fca2971f4d78")
        @Override
        public ISmObjectData createData() {
            return new SequenceDiagramData(this.smClass);
        }

        @objid ("9a77aa71-b87b-465a-8ca7-8d4cadb9f1f1")
        @Override
        public SmObjectImpl createImpl() {
            return new SequenceDiagramImpl();
        }

    }

}
