/*
 * Copyright 2013 Modeliosoft
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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.data.bpmn.objects;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.objects.BpmnDataObject;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataObjectImpl;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAssociation;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAttribute;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaClass;

@objid ("0003a7fa-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnDataObject.class, factory=BpmnDataObjectData.Metadata.ObjectFactory.class)
public class BpmnDataObjectData extends BpmnItemAwareElementData {
    @objid ("fda9102e-9986-4583-9f12-87f6d2970c40")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008467f0-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("242bce93-278f-4399-b8f3-c90a32f9b9c8")
        private static SmClass smClass = null;

        @objid ("bef3b4d6-5ec3-455a-92cf-373118dbe133")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnDataObjectData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2be25423-2939-4c4f-93f9-2dbd5b818420")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0084a800-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f914c605-5bc3-43b7-aadf-06f1f9cf8c3f")
            public ISmObjectData createData() {
                return new BpmnDataObjectData();
            }

            @objid ("e19e0834-8361-4177-9111-f56e257ffef5")
            public SmObjectImpl createImpl() {
                return new BpmnDataObjectImpl();
            }

        }

    }

}
