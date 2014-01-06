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
    @objid ("5bcc8dec-7107-4caa-8e32-cbcf85d8b8ac")
    @SmaMetaAttribute(metaName="IsVertical", type=Boolean.class, smAttributeClass=Metadata.IsVerticalSmAttribute.class)
     Object mIsVertical = false;

    @objid ("c4dea92c-ec78-468b-8253-b2ba466afd35")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000befbe-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("682d7125-1a03-4cc1-a7d5-318f90d25ad2")
        private static SmClass smClass = null;

        @objid ("a7aeb569-6b68-463d-9189-3c839512eec3")
        private static SmAttribute IsVerticalAtt = null;

        @objid ("9b0fe5b9-fc66-4289-9a57-cb7cc386907f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("aefa6d2c-5a78-4419-8ec1-ec4a7d576e90")
        public static SmAttribute IsVerticalAtt() {
            if (IsVerticalAtt == null) {
            	IsVerticalAtt = classof().getAttributeDef("IsVertical");
            }
            return IsVerticalAtt;
        }

        @objid ("2008f297-3aeb-44f7-946b-7fe5e3de48ce")
        public static SmAttribute getIsVerticalAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsVerticalAtt;
        }

        @objid ("f49e35e3-bd53-4f7b-915e-e9a146bc1df9")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("000c4810-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d0604e86-772a-4813-a658-e11c88a75a1b")
            public ISmObjectData createData() {
                return new ActivityDiagramData();
            }

            @objid ("7af0dfe3-5464-4530-a186-42035e132d2e")
            public SmObjectImpl createImpl() {
                return new ActivityDiagramImpl();
            }

        }

        @objid ("000cbd18-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsVerticalSmAttribute extends SmAttribute {
            @objid ("0517c836-fb0a-4b5b-9097-71aa42a3ae48")
            public Object getValue(ISmObjectData data) {
                return ((ActivityDiagramData) data).mIsVertical;
            }

            @objid ("379aa4b2-b449-43d5-884c-7ae6e42acd90")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityDiagramData) data).mIsVertical = value;
            }

        }

    }

}
