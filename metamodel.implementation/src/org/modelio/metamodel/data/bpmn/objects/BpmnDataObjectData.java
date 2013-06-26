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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
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
    @objid ("09cc34e3-1b07-4865-935b-4a12fd44edd6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008467f0-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ad30ee2d-9dd7-46a3-8482-482bd2821715")
        private static SmClass smClass = null;

        @objid ("1f5556e6-0805-492d-96a9-165ae8afe766")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnDataObjectData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8625bc6e-3a8b-4d37-bc14-b8cfdc4b81b2")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0084a800-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("da16042d-3e6c-41dd-87cf-0a6210c0571a")
            public ISmObjectData createData() {
                return new BpmnDataObjectData();
            }

            @objid ("05ebe48a-baeb-418d-9f61-e5d7f44aa6f3")
            public SmObjectImpl createImpl() {
                return new BpmnDataObjectImpl();
            }

        }

    }

}
