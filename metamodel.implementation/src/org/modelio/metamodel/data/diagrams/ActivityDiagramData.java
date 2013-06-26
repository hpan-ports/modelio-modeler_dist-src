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
import org.modelio.metamodel.diagrams.ActivityDiagram;
import org.modelio.metamodel.impl.diagrams.ActivityDiagramImpl;
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

@objid ("00682d06-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ActivityDiagram.class, factory=ActivityDiagramData.Metadata.ObjectFactory.class, cmsnode=true)
public class ActivityDiagramData extends BehaviorDiagramData {
    @objid ("36e9cfe8-05bc-4d26-b615-53bbb2eb1702")
    @SmaMetaAttribute(metaName="IsVertical", type=Boolean.class, smAttributeClass=Metadata.IsVerticalSmAttribute.class)
     Object mIsVertical = false;

    @objid ("d42457f5-10a1-4af4-81b4-7d087bd32c1f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000befbe-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("535bd592-bd99-42f2-a1b3-9f4a6fce9795")
        private static SmClass smClass = null;

        @objid ("bdbdbd60-f1ff-4727-b95b-d42dd5a46621")
        private static SmAttribute IsVerticalAtt = null;

        @objid ("53276a65-9714-47e2-8374-f32b8d2b887c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ba288963-57cd-489c-8227-613ee63e6a43")
        public static SmAttribute IsVerticalAtt() {
            if (IsVerticalAtt == null) {
            	IsVerticalAtt = classof().getAttributeDef("IsVertical");
            }
            return IsVerticalAtt;
        }

        @objid ("ecc5c78a-eb84-4205-bf7b-c870cea16322")
        public static SmAttribute getIsVerticalAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsVerticalAtt;
        }

        @objid ("f38dbbcb-2885-4cd3-9b16-c82f0574a9d1")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("000c4810-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("fdcf7f9a-07d1-4d3b-97e7-e71436fc0184")
            public ISmObjectData createData() {
                return new ActivityDiagramData();
            }

            @objid ("5beea9bf-9283-47ed-8372-a287f591856f")
            public SmObjectImpl createImpl() {
                return new ActivityDiagramImpl();
            }

        }

        @objid ("000cbd18-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsVerticalSmAttribute extends SmAttribute {
            @objid ("72562e60-4057-4be4-9963-2dff83069489")
            public Object getValue(ISmObjectData data) {
                return ((ActivityDiagramData) data).mIsVertical;
            }

            @objid ("6cdfb583-18e1-4864-a489-672f5c270e7c")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityDiagramData) data).mIsVertical = value;
            }

        }

    }

}
