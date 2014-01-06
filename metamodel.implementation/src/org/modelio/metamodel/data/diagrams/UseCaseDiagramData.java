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
import org.modelio.metamodel.diagrams.UseCaseDiagram;
import org.modelio.metamodel.impl.diagrams.UseCaseDiagramImpl;
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

@objid ("0071f0fc-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=UseCaseDiagram.class, factory=UseCaseDiagramData.Metadata.ObjectFactory.class, cmsnode=true)
public class UseCaseDiagramData extends StaticDiagramData {
    @objid ("540096ab-73b3-42c1-af3f-ecc782b87b91")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002c6442-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("5fa4160c-4926-4c93-90d8-ef43813d012b")
        private static SmClass smClass = null;

        @objid ("60cf7025-6261-49c6-84e8-7f4dd9c2efc1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(UseCaseDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d1739205-86b4-4ebc-a22d-1718ca41837c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("002ca4b6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9955df56-bb86-4e20-a2f2-7384f38bab7c")
            public ISmObjectData createData() {
                return new UseCaseDiagramData();
            }

            @objid ("3c65bb3e-07ee-4774-a399-bba49c7f655f")
            public SmObjectImpl createImpl() {
                return new UseCaseDiagramImpl();
            }

        }

    }

}
