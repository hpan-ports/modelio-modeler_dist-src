/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.diagrams;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.diagrams.ActivityDiagram;
import org.modelio.metamodel.impl.diagrams.BehaviorDiagramSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("61ba724d-091b-4b0f-91b3-0545ad0201cc")
public class ActivityDiagramSmClass extends BehaviorDiagramSmClass {
    @objid ("d47627a8-7395-4f31-a871-283488837155")
    private SmAttribute isVerticalAtt;

    @objid ("b16128ca-b9b0-4293-b44e-d89f5e9486ac")
    public ActivityDiagramSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("53b1f338-97ae-4f37-9a82-2aa6fb6cf3c9")
    @Override
    public String getName() {
        return "ActivityDiagram";
    }

    @objid ("5cdf73c6-327c-418b-a993-ba905c8cae9d")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("a82a7ff9-0327-49d9-a1b7-1f1778a15e93")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ActivityDiagram.class;
    }

    @objid ("a135b730-8328-44c3-8ad0-9fdf11ea7673")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("d0f0f470-50e8-43d7-a245-a2d3ecb434d0")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("6cb6ee36-1838-4194-8bab-b92047d2eb96")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BehaviorDiagram");
        this.registerFactory(new ActivityDiagramObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isVerticalAtt = new IsVerticalSmAttribute();
        this.isVerticalAtt.init("IsVertical", this, Boolean.class );
        registerAttribute(this.isVerticalAtt);
        
        
        // Initialize and register the SmDependency
    }

    @objid ("dd03519c-b765-4018-b574-4938892475b7")
    public SmAttribute getIsVerticalAtt() {
        if (this.isVerticalAtt == null) {
        	this.isVerticalAtt = this.getAttributeDef("IsVertical");
        }
        return this.isVerticalAtt;
    }

    @objid ("15e38510-f2ac-4326-a618-1f60aa598150")
    private static class ActivityDiagramObjectFactory implements ISmObjectFactory {
        @objid ("78b88455-bcd4-49de-a034-c818330cc442")
        private ActivityDiagramSmClass smClass;

        @objid ("89418da7-6b49-48c7-b57e-e9579de462a6")
        public ActivityDiagramObjectFactory(ActivityDiagramSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("ad8d0448-5d6a-4f7f-a431-831f95ce1ad3")
        @Override
        public ISmObjectData createData() {
            return new ActivityDiagramData(this.smClass);
        }

        @objid ("9445975e-2223-42b6-a369-a779bce9b334")
        @Override
        public SmObjectImpl createImpl() {
            return new ActivityDiagramImpl();
        }

    }

    @objid ("4cdf11f0-1549-45df-8f5e-4cedfb5f04d3")
    public static class IsVerticalSmAttribute extends SmAttribute {
        @objid ("f23c80ed-6096-420f-a5b2-c60c6121cc38")
        public Object getValue(ISmObjectData data) {
            return ((ActivityDiagramData) data).mIsVertical;
        }

        @objid ("7f3d4d11-18cf-411d-af91-4137235f6140")
        public void setValue(ISmObjectData data, Object value) {
            ((ActivityDiagramData) data).mIsVertical = value;
        }

    }

}
