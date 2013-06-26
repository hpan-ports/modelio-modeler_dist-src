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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.modelio.api.modelio.Modelio;
import org.modelio.metamodel.factory.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.EnumerationLiteral;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.xmi.util.EcoreModelNavigation;
import org.modelio.xmi.util.IModelerModuleStereotypes;
import org.modelio.xmi.util.ObjingEAnnotation;
import org.modelio.xmi.util.ObjingModelNavigation;
import org.modelio.xmi.util.ReverseProperties;

@objid ("37e2e483-b0a7-43d3-84a4-87854e6e8afd")
public class EInstanceSpecification extends ENamedElement implements IEElement {
    @objid ("bbed962e-7c53-4c41-8438-1b76cbe59bf2")
    private Boolean isConnector = false;

    @objid ("cdf203c3-a553-4c4b-ab55-236c51ccc887")
    private Boolean isLink = false;

    @objid ("8cf69b30-d866-4e04-8fc6-8ab7e7365096")
    private InstanceSpecification ecoreElement;

    @objid ("7f121e45-bde8-4c52-bd85-18a939359351")
    @Override
    public Element createObjingElt() {
        ReverseProperties revProp = ReverseProperties.getInstance();
        if (revProp.isRoundtripEnabled()){
            if (ObjingEAnnotation.isConnector(this.ecoreElement)){
                this.isConnector = true;
                return Modelio.getInstance().getModelingSession().getModel().createConnector();
            }else if (ObjingEAnnotation.isLink(this.ecoreElement)){
                this.isLink = true;
                return Modelio.getInstance().getModelingSession().getModel().createLink();
            }
        }
        
        
        if (EcoreModelNavigation.isAssocInstance(this.ecoreElement)){
            if (EcoreModelNavigation.isConnector(this.ecoreElement)){
        
                this.isConnector = true;
                return Modelio.getInstance().getModelingSession().getModel().createConnector();
            }else  if (EcoreModelNavigation.isLink(this.ecoreElement)){
                this.isLink = true;
                return Modelio.getInstance().getModelingSession().getModel().createLink();
            }
        }
        return Modelio.getInstance().getModelingSession().getModel().createInstance();
    }

    @objid ("4e7bccd1-e03d-4393-8065-d243a4a3df44")
    public EInstanceSpecification(InstanceSpecification element) {
        super(element);
        this.ecoreElement = element;
    }

    @objid ("6689de36-87c9-4300-8cfb-0cdecc634a02")
    @Override
    public void attach(Element objingElt) {
        if (!(this.isConnector) && !(this.isLink))
            attachInstance(objingElt);
    }

    @objid ("6fabeef9-4702-4477-98f2-5f6465a0a3aa")
    private void attachInstance(Element objingElt) {
        if (!(objingElt instanceof EnumerationLiteral)){
            ReverseProperties revProp = ReverseProperties.getInstance();
        
            org.eclipse.uml2.uml.Element ecoreOwner = this.ecoreElement.getOwner();
        
            Element owner =  (Element) revProp.getMappedElement(ecoreOwner);
        
            if ((owner != null) &&  (owner instanceof NameSpace))
                ((Instance) objingElt).setOwner((NameSpace)owner);
        
        }
    }

    @objid ("5c1b149e-d18c-4e04-9d7c-bfcc6c223754")
    @Override
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
        if (objingElt instanceof Instance){
            setInstanceProperties((Instance) objingElt);    
        }
    }

    @objid ("b8423da9-6d78-49b0-90f7-631b0a5e6793")
    private void setType(Instance objingElt) {
        String typeName = ObjingEAnnotation.getType(this.ecoreElement);
        if ((typeName != null) && ( !typeName.equals(""))){
            NameSpace objType = ObjingModelNavigation.getPrimitiveType(typeName);
            objingElt.setBase(objType);
        }
    }

    @objid ("b1e8ec48-a309-4132-885b-9f0bd4ef6b7a")
    private void setInstanceProperties(Instance objingElt) {
        setClassifier( objingElt);
        setValue( objingElt);
        if (ReverseProperties.getInstance().isRoundtripEnabled()){
            setIsConstant( objingElt);           
            setMultiMax( objingElt);
            setMultiMin( objingElt);
            setType(objingElt);
        }
    }

    @objid ("a35931c5-8e3a-4ed6-b0ef-f9fdbf8e6f97")
    private void setClassifier(Instance objingElt) {
        if (this.ecoreElement.getClassifiers().size() > 0){
        
            org.eclipse.uml2.uml.Element ecoreClassifier = this.ecoreElement.getClassifiers().get(0);
        
            Element objClassifier = (Element) ReverseProperties.getInstance().getMappedElement(ecoreClassifier);
        
            if ((objClassifier != null) && (objClassifier instanceof NameSpace)){
                objingElt.setBase((NameSpace) objClassifier);
        
            }
        
        }
    }

    @objid ("cd6e12c7-3271-4001-82cb-c207882df3e7")
    private void setIsConstant(Instance objingElt) {
        objingElt.setIsConstant(ObjingEAnnotation.isConstant(this.ecoreElement));
    }

    @objid ("4ad3192d-081a-45d9-bea2-7c5006cedb82")
    private void setMultiMax(Instance objingElt) {
        String max =  ObjingEAnnotation.getMultiMax(this.ecoreElement);
        if (max != null)
            objingElt.setMultiplicityMax(max);
    }

    @objid ("4385ea91-8ac9-44d9-85f7-30aa64432ef1")
    private void setValue(Instance objingElt) {
        org.eclipse.uml2.uml.ValueSpecification defaultValue = this.ecoreElement.getSpecification();
        if ((defaultValue != null) && (defaultValue instanceof InstanceValue)){
            InstanceSpecification spec = ((InstanceValue) defaultValue).getInstance();
            if (spec != null){
                Object instance  = ReverseProperties.getInstance().getMappedElement(spec);
                if ((instance instanceof Instance) && (instance != null))
                    try {
                        Modelio.getInstance().getModelingSession().getModel().createDependency(
                                objingElt, (Instance) instance, "ModelerModule", IModelerModuleStereotypes.UML2INSTANCEVALUE);
                    } catch (ExtensionNotFoundException e) {
                        e.printStackTrace();
                    }
        
            }
        }else if (ReverseProperties.getInstance().isRoundtripEnabled()){
            String value =  ObjingEAnnotation.getValue(this.ecoreElement);
            if (value != null)
                objingElt.setValue(value);
        }
    }

    @objid ("cac906db-f748-4dde-b47c-710e77d6ee64")
    private void setMultiMin(Instance objingElt) {
        String min =  ObjingEAnnotation.getMultiMin(this.ecoreElement);
        if (min != null)
            objingElt.setMultiplicityMin(min);
    }

}
