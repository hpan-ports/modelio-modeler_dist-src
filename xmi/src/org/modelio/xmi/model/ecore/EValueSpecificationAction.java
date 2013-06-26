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
                                    

package org.modelio.xmi.model.ecore;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.model.IUmlModel;
import org.modelio.api.modelio.Modelio;
import org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagParameter;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.xmi.util.IModelerModuleStereotypes;
import org.modelio.xmi.util.ObjingEAnnotation;
import org.modelio.xmi.util.ReverseProperties;

@objid ("a5cef32e-3322-4726-858f-f2c880024b39")
public class EValueSpecificationAction extends EActivityNode implements IEElement {
    @objid ("8228382d-7c4a-4e9f-af14-ccbc73844c3b")
    private org.eclipse.uml2.uml.ValueSpecificationAction ecoreElement;

    @objid ("8bf5718c-6644-4045-befb-306669ebe8d5")
    public Element createObjingElt() {
        if (ReverseProperties.getInstance().isRoundtripEnabled()){
            if(ObjingEAnnotation.isDeleted(ecoreElement))
                return null;
        }
        
        OpaqueAction element = Modelio.getInstance().getModelingSession().getModel()
                .createOpaqueAction();
        
        Stereotype stereo = Modelio.getInstance().getModelingSession().getMetamodelExtensions()
                .getStereotype(IModelerModuleStereotypes.UML2VALUESPECIFICATIONACTION, element.getMClass());
        element.getExtension().add(stereo);
        return element;
    }

    @objid ("d82583ae-51ac-4c6a-9a02-4f1a83394b69")
    public EValueSpecificationAction(org.eclipse.uml2.uml.ValueSpecificationAction element) {
        super(element);
        ecoreElement = element;
    }

    @objid ("4e294af0-fae6-44a5-909a-2a20260a4066")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("3ae2748a-bc20-46d8-ba3b-a66ddf2782c5")
    public void attach(List<Object> objingElts) {
    }

    @objid ("61dfd7e4-696d-40ff-b4db-862728d05d35")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
        setValue((OpaqueAction) objingElt);
    }

    @objid ("75131771-5310-419a-a5bc-6e3d57a67eeb")
    private void setValue(OpaqueAction objingElt) {
        TagType value =  null;
        
        IUmlModel model = Modelio.getInstance().getModelingSession().getModel();
        
        
        Stereotype stereo = Modelio.getInstance().getModelingSession().getMetamodelExtensions()
                .getStereotype(IModelerModuleStereotypes.UML2VALUESPECIFICATIONACTION, objingElt.getMClass());
        
        for (TagType tagType : stereo.getDefinedTagType()){
            if (tagType.getName().equals("Value"))
                value = tagType;
        }
        
        TaggedValue taggedValue = model.createTaggedValue();
        
        taggedValue.setDefinition(value);
        taggedValue.setAnnoted(objingElt);
        
        TagParameter actual = model.createTagParameter();
        actual.setValue(this.ecoreElement.getValue().stringValue());
        taggedValue.getActual().add(actual);
    }

}
