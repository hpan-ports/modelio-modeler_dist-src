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
import org.modelio.metamodel.impl.uml.statik.LinkSmClass;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("d3b7192d-019b-42f0-81c8-5dc12c1e6414")
public class ConnectorSmClass extends LinkSmClass {
    @objid ("ee800a26-7aed-4582-b120-ef7090e55f6a")
    public ConnectorSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("e7d109d8-006a-4e28-9583-4d41262782b3")
    @Override
    public String getName() {
        return "Connector";
    }

    @objid ("21086957-4f7e-40fd-837b-228e2a05b307")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("c27cd85b-cf28-4405-9660-8efcc1fe35c2")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Connector.class;
    }

    @objid ("c6e578d6-2be1-467b-9193-fc3ec7865cad")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("d7552d88-7a25-4388-bc20-0d4bb6820ac8")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("e69af038-1d02-493a-8b0a-4159e08a218c")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Link");
        this.registerFactory(new ConnectorObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("f1c949a2-c8b3-4ec3-ab6d-ba1a6ce49150")
    private static class ConnectorObjectFactory implements ISmObjectFactory {
        @objid ("b87716fa-cb9a-4c83-bd23-a1a2c46b7d69")
        private ConnectorSmClass smClass;

        @objid ("347969ca-ff60-4c06-83b6-572777712501")
        public ConnectorObjectFactory(ConnectorSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("21d0dede-5e6f-4d20-b7ad-4f9be02a9c2a")
        @Override
        public ISmObjectData createData() {
            return new ConnectorData(this.smClass);
        }

        @objid ("6f6c5720-44bc-41fe-a809-1d1e943b376e")
        @Override
        public SmObjectImpl createImpl() {
            return new ConnectorImpl();
        }

    }

}
