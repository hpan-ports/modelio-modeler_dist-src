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
import org.modelio.api.modelio.Modelio;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.reverse.PartialImportMap;
import org.modelio.xmi.reverse.TotalImportMap;
import org.modelio.xmi.util.IModelerModuleStereotypes;
import org.modelio.xmi.util.ReverseProperties;

@objid ("91361f3c-fce3-4cd8-9317-d7818ab0b38d")
public class EClassifierTemplateParameter extends EElement implements IEElement {
    @objid ("63e47653-bcdd-4279-8af7-30dff2bed48e")
    private org.eclipse.uml2.uml.ClassifierTemplateParameter ecoreElement = null;

    @objid ("a4b4f148-2607-4336-8938-d878f2b59369")
    public Element createObjingElt() {
        TemplateParameter result = Modelio.getInstance().getModelingSession().getModel().createTemplateParameter();
         
            result.getExtension().add(Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(
             IModelerModuleStereotypes.UML2CLASSIFIERTEMPLATEPARAMETER, result.getMClass()));
        return result;
    }

    @objid ("02ffe9ab-f6e9-4df7-bf6b-fc6cf465fd34")
    public EClassifierTemplateParameter(org.eclipse.uml2.uml.ClassifierTemplateParameter element) {
        super(element);
        this.ecoreElement = element;
    }

    @objid ("29b3c19b-6b8f-4844-b8de-b097eb1bbff7")
    public void attach(Element objingElt) {
        Element objingOperation  = (Element) ReverseProperties.getInstance()
        .getMappedElement(this.ecoreElement.getOwner());
        
        if ((objingOperation != null ) && (objingOperation instanceof Operation)) {
            ((Operation) objingOperation)
            .getTemplate().add((TemplateParameter) objingElt);
        }else if (this.ecoreElement.getOwner().getOwner() instanceof  org.eclipse.uml2.uml.Collaboration){
            Collaboration objCollaboration = (Collaboration) ReverseProperties.getInstance()
                    .getMappedElement(this.ecoreElement.getOwner().getOwner());
            objCollaboration.getTemplate().add((TemplateParameter) objingElt);
        } else {
            PartialImportMap.getInstance().remove(this.ecoreElement);
            TotalImportMap.getInstance().remove(this.ecoreElement);
            objingElt.delete();
        }
    }

    @objid ("e2ce972e-922d-4543-b7cd-df26f01427b4")
    public void attach(List<Object> objingElts) {
    }

    @objid ("48df79ca-0bbf-4404-8b93-156b68a9a3dd")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
