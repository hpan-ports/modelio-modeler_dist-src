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
    @objid ("a5046fa4-fff8-4f17-ba58-429dc23deec5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008f440e-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e10b0ae6-86db-4ac9-b94d-6a691f054b3c")
        private static SmClass smClass = null;

        @objid ("0816b082-a794-486f-ab19-0deac36f5f5c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StateMachineDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("fce28b2d-dcff-41a8-9558-aad11c19221e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008f84f0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9d630c26-4ce7-47af-bfbc-af19a880c053")
            public ISmObjectData createData() {
                return new StateMachineDiagramData();
            }

            @objid ("151a4282-4fb8-417b-9d6c-3682c42abff4")
            public SmObjectImpl createImpl() {
                return new StateMachineDiagramImpl();
            }

        }

    }

}
