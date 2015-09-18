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
    @objid ("acac9a24-bb83-414e-bc5c-81e93c4c5382")
    @SmaMetaAttribute(metaName="IsVertical", type=Boolean.class, smAttributeClass=Metadata.IsVerticalSmAttribute.class)
     Object mIsVertical = false;

    @objid ("c09fe182-1b4b-47fe-829f-24c0f59f174c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000befbe-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("5304dbc4-c27b-4411-8576-d52a7a05dd99")
        private static SmClass smClass = null;

        @objid ("b09774ec-6841-4e4f-b315-edf6017d8f0f")
        private static SmAttribute IsVerticalAtt = null;

        @objid ("9ffb0d07-78f0-45f0-aca6-1ff9191a7d05")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("3471793b-bc39-49d3-b7d6-623b3a611274")
        public static SmAttribute IsVerticalAtt() {
            if (IsVerticalAtt == null) {
            	IsVerticalAtt = classof().getAttributeDef("IsVertical");
            }
            return IsVerticalAtt;
        }

        @objid ("b3b4254f-ea10-4c86-90e7-96cfad4f6c1b")
        public static SmAttribute getIsVerticalAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsVerticalAtt;
        }

        @objid ("d0296f9e-5596-4b00-888f-5f65c564fac1")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("000c4810-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6a0f6cb7-2be2-4ac7-9026-7a055e4c6643")
            public ISmObjectData createData() {
                return new ActivityDiagramData();
            }

            @objid ("6b30deca-1c40-4526-853f-fc1fa9feeddb")
            public SmObjectImpl createImpl() {
                return new ActivityDiagramImpl();
            }

        }

        @objid ("000cbd18-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsVerticalSmAttribute extends SmAttribute {
            @objid ("ac5d412f-11e6-4c82-8208-4445b4c21563")
            public Object getValue(ISmObjectData data) {
                return ((ActivityDiagramData) data).mIsVertical;
            }

            @objid ("af1bb668-f363-4880-a2ff-c6a7da55a545")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityDiagramData) data).mIsVertical = value;
            }

        }

    }

}
