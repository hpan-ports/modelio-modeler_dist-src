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
import org.modelio.metamodel.diagrams.BehaviorDiagram;
import org.modelio.metamodel.impl.diagrams.AbstractDiagramSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("3179c664-e485-47e8-aacc-ed2e277ea76b")
public class BehaviorDiagramSmClass extends AbstractDiagramSmClass {
    @objid ("e3832bc3-c23c-48bf-8597-65239b2573fe")
    public BehaviorDiagramSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("f241c839-800c-4eec-8320-78c69c465d9a")
    @Override
    public String getName() {
        return "BehaviorDiagram";
    }

    @objid ("e292f10b-a830-4acc-869c-033ae4dc0ee9")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("26c11b10-0158-4411-a3bc-bb136b66204f")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BehaviorDiagram.class;
    }

    @objid ("6b6f38ea-782e-42ce-a63a-ddd6f2ae6462")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("8c4f978f-1d90-49f0-bd44-26a672bdae07")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("b1b8ccfc-1469-4164-b2b1-6f62fd2249f9")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("AbstractDiagram");
        this.registerFactory(new BehaviorDiagramObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("b9545c03-fdee-4619-bbf8-35045292b97c")
    private static class BehaviorDiagramObjectFactory implements ISmObjectFactory {
        @objid ("d815af01-7372-4210-9f1c-992fba13c526")
        private BehaviorDiagramSmClass smClass;

        @objid ("f2ddbe86-c171-4e5d-b149-6961993b82e4")
        public BehaviorDiagramObjectFactory(BehaviorDiagramSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("26b2c2be-f995-421b-bd7e-a2639637712b")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("54b68e07-1826-4579-be92-a2c61826d4e1")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

}
