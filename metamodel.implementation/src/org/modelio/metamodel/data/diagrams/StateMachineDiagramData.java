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
/*   Metamodel version: 9019              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.data.diagrams;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.diagrams.StateMachineDiagram;
import org.modelio.metamodel.impl.diagrams.StateMachineDiagramImpl;
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

@objid ("00705882-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=StateMachineDiagram.class, factory=StateMachineDiagramData.Metadata.ObjectFactory.class, cmsnode=true)
public class StateMachineDiagramData extends BehaviorDiagramData {
    @objid ("9321a2c9-77f9-4709-a66f-bff83c3da061")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008f440e-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("397fd9ce-71a0-4afc-822d-dcbd1c05e6f2")
        private static SmClass smClass = null;

        @objid ("0c381c45-d175-4e77-a907-b84cba18229f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StateMachineDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("95bdd81e-6257-47ee-a8a1-ce57b32067e5")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008f84f0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("adc55169-455c-4c2f-bc6e-f0ac709e3d74")
            public ISmObjectData createData() {
                return new StateMachineDiagramData();
            }

            @objid ("96fd731e-de91-48c9-9aa6-30a912fd4e99")
            public SmObjectImpl createImpl() {
                return new StateMachineDiagramImpl();
            }

        }

    }

}
