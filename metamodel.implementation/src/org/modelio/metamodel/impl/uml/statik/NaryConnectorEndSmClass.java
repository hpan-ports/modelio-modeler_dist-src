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
import org.modelio.metamodel.impl.uml.statik.NaryLinkEndSmClass;
import org.modelio.metamodel.uml.statik.NaryConnectorEnd;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("0658041f-9f8e-4044-a285-d0ab1d710f53")
public class NaryConnectorEndSmClass extends NaryLinkEndSmClass {
    @objid ("1f41a8c9-5cff-4589-9dfa-fff1713e17c4")
    public NaryConnectorEndSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("3c3f8792-bb94-45b0-a4eb-e1eebca12cd4")
    @Override
    public String getName() {
        return "NaryConnectorEnd";
    }

    @objid ("dfd3434b-3982-42e5-853a-df98c9b48a65")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("711fc9b3-2246-4c36-8b05-76fe08181676")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return NaryConnectorEnd.class;
    }

    @objid ("6990ce99-2e65-4d3c-a47f-c3a65d10ac6d")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("0bd8b9a4-a070-4be8-ac5c-e647ef5eb61d")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("06fe4481-6208-4601-97a0-0246695dc3ee")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("NaryLinkEnd");
        this.registerFactory(new NaryConnectorEndObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("cca16c9e-997a-4971-b34f-f44ddf9e2e09")
    private static class NaryConnectorEndObjectFactory implements ISmObjectFactory {
        @objid ("b0b0a079-791f-42a8-8694-c2cfce2ad7c1")
        private NaryConnectorEndSmClass smClass;

        @objid ("7305cd62-13fb-48a5-b35d-d76380bcb670")
        public NaryConnectorEndObjectFactory(NaryConnectorEndSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("3132d23a-91ab-4af0-86f3-18ee3dc3828c")
        @Override
        public ISmObjectData createData() {
            return new NaryConnectorEndData(this.smClass);
        }

        @objid ("50230e2b-5b3b-48c2-8e13-41eb9ef4e25e")
        @Override
        public SmObjectImpl createImpl() {
            return new NaryConnectorEndImpl();
        }

    }

}
