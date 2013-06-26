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

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.Modelio;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.xmi.util.IModelerModuleStereotypes;
import org.modelio.xmi.util.ReverseProperties;

@objid ("4fbfd4c1-49cd-40f5-878c-28a9c6fefa69")
public class EComponentRealization extends ERealization implements IEElement {
    @objid ("91fde119-abf5-4c41-9f94-b275eed41984")
    public List<Element> createObjingElt() {
        List<Element> result = new ArrayList<Element>();
        org.eclipse.uml2.uml.ComponentRealization ecoreElt = (org.eclipse.uml2.uml.ComponentRealization) getEcoreElement();
        
        if (ecoreElt.getRealizingClassifiers() != null){
        
            int size = ecoreElt.getRealizingClassifiers().size();
            for (int i =0; i < size; i++){
                Dependency dep = Modelio.getInstance().getModelingSession().getModel().createDependency();
        
                dep.getExtension().add(Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(
                        IModelerModuleStereotypes.UML2COMPONENTREALIZATION, dep.getMClass()));
        
                result.add(dep);
            }
        }
        return result;
    }

    @objid ("54c7a273-ec75-4b6c-bc50-5c14b5df785e")
    public EComponentRealization(org.eclipse.uml2.uml.ComponentRealization element) {
        super(element);
    }

    @objid ("ed9486cc-efd6-4946-87f1-8e5904b23d38")
    public void attach(Element objingElt) {
    }

    @objid ("49d3a3a4-1a63-4737-ba96-7dfe41903e14")
    public void attach(List<Object> objingElts) {
        org.eclipse.uml2.uml.ComponentRealization ecoreElt = (org.eclipse.uml2.uml.ComponentRealization) getEcoreElement();
        org.eclipse.uml2.uml.Element client = ecoreElt.getAbstraction();
        
        if (client != null){
            Object objClient = ReverseProperties.getInstance().getMappedElement(client);
            if (objClient instanceof ModelElement){
                int i = 0; 
                for (Object objingElt : objingElts){
                    org.eclipse.uml2.uml.Classifier classifier = ecoreElt.getRealizingClassifiers().get(i);
                    Object objClassifier = ReverseProperties.getInstance().getMappedElement(classifier);
                    if ((objingElt instanceof Dependency) && (objClassifier instanceof ModelElement)){
                        Dependency dep = (Dependency)objingElt;
                        dep.setDependsOn((ModelElement)objClient);
                        dep.setImpacted((ModelElement) objClassifier);
                    }
                    i++;
                }
            }
        }
    }

    @objid ("33a5d9d0-510a-4684-8a30-c4e057eb0b00")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
