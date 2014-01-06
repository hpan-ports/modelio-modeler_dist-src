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
import org.modelio.metamodel.diagrams.StaticDiagram;
import org.modelio.metamodel.impl.diagrams.StaticDiagramImpl;
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

@objid ("00710426-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=StaticDiagram.class, factory=StaticDiagramData.Metadata.ObjectFactory.class, cmsnode=true)
public class StaticDiagramData extends AbstractDiagramData {
    @objid ("17a228e2-492f-49a3-bdb4-c75db91a0fbe")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008d3560-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f851f69c-7796-4448-a81b-f932e6ae2f1a")
        private static SmClass smClass = null;

        @objid ("8c677bc2-3f0f-4681-b036-6aaf26db836b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StaticDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5297d8ef-b507-4c94-8974-f3eda5f70f8a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008d746c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ae070723-5c26-4196-ac48-d1664adb4502")
            public ISmObjectData createData() {
                return new StaticDiagramData();
            }

            @objid ("eadf72dc-077f-47cd-87a3-2644692bd740")
            public SmObjectImpl createImpl() {
                return new StaticDiagramImpl();
            }

        }

    }

}
