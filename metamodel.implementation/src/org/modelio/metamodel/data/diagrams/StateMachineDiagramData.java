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
    @objid ("f18efe0e-f8f1-4a30-9cf0-cbaea716bb81")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008f440e-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c93565ba-3741-4df8-86a7-327a121ffecd")
        private static SmClass smClass = null;

        @objid ("35a26773-aed5-4284-b215-e33ec9a84804")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StateMachineDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("83942aba-0862-4a53-93f0-04c6ab046655")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008f84f0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6cfe66b3-d24b-4f96-9aa3-a27f57f4c80c")
            public ISmObjectData createData() {
                return new StateMachineDiagramData();
            }

            @objid ("162919a1-eb7d-4cc4-9768-6e9a743c7b01")
            public SmObjectImpl createImpl() {
                return new StateMachineDiagramImpl();
            }

        }

    }

}
