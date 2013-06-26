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
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.StructuralFeature;
import org.modelio.api.modelio.Modelio;
import org.modelio.metamodel.factory.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.xmi.util.EcoreModelNavigation;
import org.modelio.xmi.util.IModelerModuleStereotypes;
import org.modelio.xmi.util.ObjingEAnnotation;
import org.modelio.xmi.util.PrimitiveTypeMapper;
import org.modelio.xmi.util.ReverseProperties;

@objid ("b679cdef-61f9-4b20-89be-45cac9ee4046")
public class ESlot extends EElement implements IEElement {
    @objid ("70513ec0-9479-4dd6-8bd7-d5ec504d42d3")
    private org.eclipse.uml2.uml.Slot ecoreElement;

    @objid ("53982298-f5b0-4cb6-8e33-4d2da4d745e2")
    @Override
    public Element createObjingElt() {
        InstanceSpecification ecoreOwner = this.ecoreElement.getOwningInstance();
        if (ReverseProperties.getInstance().isRoundtripEnabled()){
            if (ObjingEAnnotation.isPort(this.ecoreElement))
                return Modelio.getInstance().getModelingSession().getModel().createPort();
            else if (ObjingEAnnotation.isBindableInstance(this.ecoreElement))
                return Modelio.getInstance().getModelingSession().getModel().createBindableInstance();
            else if (ObjingEAnnotation.isConnector(ecoreOwner))
                return Modelio.getInstance().getModelingSession().getModel().createConnectorEnd();
            else if (ObjingEAnnotation.isLink(ecoreOwner))
                return Modelio.getInstance().getModelingSession().getModel().createLinkEnd();
            else if (ObjingEAnnotation.isAttributeLink(this.ecoreElement))
                return Modelio.getInstance().getModelingSession().getModel().createAttributeLink();
        }
        
        org.eclipse.uml2.uml.Element feature = this.ecoreElement.getDefiningFeature();
        
        if (feature != null){
        
            if  (feature instanceof org.eclipse.uml2.uml.Port)
                return Modelio.getInstance().getModelingSession().getModel().createPort();
        
            Object objFeature = ReverseProperties.getInstance().getMappedElement(feature);
            if (objFeature != null){
        
                if ((objFeature instanceof Attribute) || 
                        ((objFeature instanceof List<?>) && (((List<Element>) objFeature).size() == 1) && (((List<Element>) objFeature).get(0) instanceof Attribute))){
                    return Modelio.getInstance().getModelingSession().getModel().createAttributeLink();
                }else if (EcoreModelNavigation.isConnector(ecoreOwner) ){
                    return Modelio.getInstance().getModelingSession().getModel().createConnectorEnd();
                }else if (EcoreModelNavigation.isLink(ecoreOwner) ){
                    return Modelio.getInstance().getModelingSession().getModel().createLinkEnd();
                }else if ((feature instanceof Property ) && ((Property)feature).isComposite()){
                    return Modelio.getInstance().getModelingSession().getModel().createBindableInstance();
                }
            }
        }
        return Modelio.getInstance().getModelingSession().getModel().createBindableInstance();
    }

    @objid ("038681a8-570d-40bc-8980-8427462ea627")
    private String getValueSpecification() {
        org.eclipse.uml2.uml.Type type =  PrimitiveTypeMapper.getString();
        org.eclipse.uml2.uml.ValueSpecification result = this.ecoreElement.getValue("", type);
        if (result != null){
            return result.stringValue();
        }
        
        type =  PrimitiveTypeMapper.getBoolean();
        result = this.ecoreElement.getValue("", type);
        if (result != null){
            return result.stringValue();
        }
        
        type =  PrimitiveTypeMapper.getUnlimited();
        result = this.ecoreElement.getValue("", type);
        if (result != null){
            return result.stringValue();
        }
        
        type =  PrimitiveTypeMapper.getInteger();
        result = this.ecoreElement.getValue("", type);
        if (result != null){
            return result.stringValue();
        }
        
        EList<org.eclipse.uml2.uml.ValueSpecification> values = this.ecoreElement.getValues();
        String stringResult = "";
        for  (org.eclipse.uml2.uml.ValueSpecification value : values){
            stringResult += value.stringValue();
        }
        return stringResult;
    }

    @objid ("0d20f520-1eb6-4959-8e5f-42e4d566cdc0")
    public ESlot(org.eclipse.uml2.uml.Slot element) {
        super(element);
        this.ecoreElement = element;
    }

    @objid ("5af69084-d979-49c8-a80a-0caa32f29275")
    public List<String> getObjingClassName() {
        return new ArrayList<String>();
    }

    @objid ("41c56516-2408-4845-bfe6-f98bb8656138")
    public void attach(Element objingElt) {
        if (objingElt instanceof ConnectorEnd){
            attachConnectorEnd((ConnectorEnd)objingElt);
        }else if (objingElt instanceof LinkEnd){
            attachLinkEnd((LinkEnd)objingElt);
        }else if (objingElt instanceof AttributeLink){
            attachAttributeLink((AttributeLink)objingElt);
        }else{
            attachBindableInstance((BindableInstance)objingElt);
        }
    }

    @objid ("04555ea1-a14d-45e5-bee4-c4cd1f346826")
    private void attachAttributeLink(AttributeLink objingElt) {
        InstanceSpecification ecoreOwner = (InstanceSpecification) this.ecoreElement.getOwner();
        Instance objRoot = (Instance) ReverseProperties.getInstance().getMappedElement(ecoreOwner);
        
        
        if (ReverseProperties.getInstance().isRoundtripEnabled() 
                && (ObjingEAnnotation.getOwner(this.ecoreElement) != null)
                && (!ObjingEAnnotation.getOwner(this.ecoreElement).equals(""))){
        
            String ownerId = ObjingEAnnotation.getOwner(this.ecoreElement);
            for (Object object : ecoreOwner.getSlots()){
                org.eclipse.uml2.uml.Slot slot = (org.eclipse.uml2.uml.Slot) object;
                List<String> ids = ObjingEAnnotation.getObjingIDs(slot);
                if (ids.size() > 0){
                    String id =  ids.get(0);
                    if (id.equals(ownerId)){
                        Object objOwner = ReverseProperties.getInstance().getMappedElement(slot);
                        if (objOwner instanceof BindableInstance){
                            objingElt.setAttributed((Instance)objOwner);
                            return;
                        }
        
                    }
                }
            }
        
            List<String> ids = ObjingEAnnotation.getObjingIDs(ecoreOwner);
            if (ids.size() > 0){
                String id =  ids.get(0);
                if (id.equals(ownerId)){
                    Object objOwner = ReverseProperties.getInstance().getMappedElement(ecoreOwner);
                    if (objOwner instanceof Instance){
                        objingElt.setAttributed((Instance)objOwner);    
                        return;
                    }
                }
            }
        }
        
        objingElt.setAttributed(objRoot);
    }

    @objid ("49180147-de0e-4520-86f3-8228408384a0")
    private void attachConnectorEnd(ConnectorEnd objingElt) {
        org.eclipse.uml2.uml.ValueSpecification inst = this.ecoreElement.getValue("", null);
        if (inst != null){
            InstanceSpecification ecoreOwner = ((InstanceValue)inst).getInstance();
            if ((ecoreOwner != null) && (ReverseProperties.getInstance().isRoundtripEnabled())
                    && (ObjingEAnnotation.getOwner(this.ecoreElement) != null)){
                String ownerId = ObjingEAnnotation.getOwner(this.ecoreElement);
                for (Object object : ecoreOwner.getSlots()){
                    org.eclipse.uml2.uml.Slot slot = (org.eclipse.uml2.uml.Slot) object;
                    List<String> ids  = ObjingEAnnotation.getObjingIDs(slot);
                    if (ids.size() > 0){
                        String id =  ids.get(0);
                        if (id.equals(ownerId)){
                            Object objOwner = ReverseProperties.getInstance().getMappedElement(slot);
                            if (objOwner instanceof BindableInstance){
                                objingElt.setSource((BindableInstance) objOwner);
                                break;
                            }
                        }
                    }
                }
        
            }
        
        }
    }

    @objid ("f309d757-490d-431b-ab00-4d301f60bf42")
    private void attachLinkEnd(LinkEnd objingElt) {
        InstanceSpecification ecoreOwner = (InstanceSpecification) this.ecoreElement.getOwner();
        
        Object obj =  ReverseProperties.getInstance().getMappedElement(ecoreOwner);
        
        if (obj instanceof Link){
        
            Link link = (Link) obj;
        
            objingElt.setLink(link);
        
            for (  org.eclipse.uml2.uml.ValueSpecification inst : this.ecoreElement.getValues()) {
                if (inst instanceof InstanceValue){
                    InstanceSpecification instSpe = ((InstanceValue)inst).getInstance();
                    if (instSpe != null){
                        Element objOwner = (Element) ReverseProperties.getInstance().getMappedElement(instSpe);
                        if (objOwner instanceof Instance){
                            Instance objInstance = (Instance) objOwner;
        //                            StructuralFeature structFeat = this.ecoreElement.getDefiningFeature();
        //                            if ((structFeat != null) && (structFeat instanceof Property)){
        //                                Property strucProp = (Property) structFeat;
        //                                strucProp.isNavigable()
                           
                            objingElt.setSource(objInstance);
                            
                        }
                    }
                }
            }
        }else{
            objingElt.delete();
        }
    }

    @objid ("6c0861af-c1d8-4f71-a963-b1a990b13f51")
    public void attach(List<Object> objingElts) {
    }

    @objid ("1f0f4ffc-6033-4fe4-af1c-429ac59c0b92")
    @Override
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
        
        if (objingElt instanceof AttributeLink){
            setAttributeProperties((AttributeLink)objingElt);
        }else if (objingElt instanceof Port){
            setPortProperties((Port) objingElt);
            setBIProperties((Port) objingElt);
        }else if (objingElt instanceof LinkEnd){
            setLinkEndProperties((LinkEnd) objingElt);
        }else{
            setBIProperties((BindableInstance) objingElt);
        }
    }

    @objid ("52b503d2-91b1-4529-bb64-2bfe301029c1")
    private void setLinkEndProperties(LinkEnd objingElt) {
        objingElt.setIsUnique(ObjingEAnnotation.isIsUnique(this.ecoreElement));
        objingElt.setIsOrdered(ObjingEAnnotation.isIsOrdered(this.ecoreElement));
        objingElt.setNavigable(ObjingEAnnotation.isNavigable(this.ecoreElement));
        setMultiMax(objingElt);
        setMultiMin(objingElt);
        setName(objingElt);
        setLink(objingElt);
        setOppositeEnd(objingElt);
    }

    @objid ("ee7549ab-cd27-4320-b3fe-410969227607")
    private void setLink(LinkEnd objingElt) {
        Object link = ReverseProperties.getInstance().getMappedElement(this.ecoreElement.getOwningInstance());
        if (link instanceof Link)
            objingElt.setLink((Link) link);
    }

    @objid ("453af1d1-66db-4fb0-83d1-28e82ada9e92")
    private void setMultiMax(LinkEnd objingElt) {
        String temp = ObjingEAnnotation.getMultiMax(this.ecoreElement);
        if (temp != null)
            objingElt.setMultiplicityMax(temp);
    }

    @objid ("7c456bfa-b149-4863-b182-87d46e987b78")
    private void setMultiMin(LinkEnd objingElt) {
        String temp = ObjingEAnnotation.getMultiMin(this.ecoreElement);
        if (temp != null)
            objingElt.setMultiplicityMin(temp);
    }

    @objid ("87fa151d-f62a-44dd-8b37-8626df7892db")
    private void setName(LinkEnd objingElt) {
        String temp = ObjingEAnnotation.getName(this.ecoreElement);
        if (temp != null)
            objingElt.setName(temp);
    }

    @objid ("c1acae4b-9ff4-4e70-8d49-c4ca71380299")
    private void setAttributeProperties(AttributeLink objingElt) {
        setAttributed((AttributeLink)objingElt);
        
        ((AttributeLink)objingElt).setName("AttributeLink");
        
        String value = getValueSpecification();
        if (value != null)
            objingElt.setValue(value);
        
        if (ReverseProperties.getInstance().isRoundtripEnabled()){
            setEAnnotationValue((AttributeLink)objingElt);
            setEAnnotationName((AttributeLink)objingElt);
        }
    }

    @objid ("1c37bca9-12ed-4151-b620-cd2894994225")
    private void setBIProperties(BindableInstance objingElt) {
        setName(objingElt);
        setValue(objingElt);
        setMultiplicityMax(objingElt);
        setMultiplicityMin(objingElt);
        
        objingElt.setIsConstant(ObjingEAnnotation.isConstant(this.ecoreElement));
    }

    @objid ("247e85e3-61ce-48e8-95e5-b0339b4d45b5")
    private void setName(BindableInstance objingElt) {
        String temp = ObjingEAnnotation.getName(ecoreElement);
        if (temp != null)
            objingElt.setName(temp);
    }

    @objid ("4d3af7b5-2157-4b43-83e1-1474682416e4")
    private void setValue(BindableInstance objingElt) {
        EList<org.eclipse.uml2.uml.ValueSpecification> values = this.ecoreElement.getValues();
        if (values.size() > 0){
            for (org.eclipse.uml2.uml.ValueSpecification defaultValue: values){
                if (defaultValue instanceof InstanceValue){
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
                }
            }
        }else{
            String temp = getValueSpecification();
            if (temp != null)
                objingElt.setValue(temp);
        }
    }

    @objid ("d0e974bc-45a4-4f54-a208-bcd6fd17c0b6")
    private void setMultiplicityMax(BindableInstance objingElt) {
        String temp = ObjingEAnnotation.getMultiMax(this.ecoreElement);
        if (temp != null)
            objingElt.setMultiplicityMax(temp);
    }

    @objid ("ef918005-da53-4233-bf2c-073d11f0591e")
    private void setMultiplicityMin(BindableInstance objingElt) {
        String temp = ObjingEAnnotation.getMultiMin(this.ecoreElement);
        if (temp != null)
            objingElt.setMultiplicityMin(temp);
    }

    @objid ("ff1f360d-1e8f-4ab0-bf47-b8ef1175a352")
    private void setPortProperties(Port objPort) {
        objPort.setIsBehavior(ObjingEAnnotation.isBehavior(this.ecoreElement));
        objPort.setIsService(ObjingEAnnotation.isService(this.ecoreElement));
    }

    @objid ("56320ddc-4baa-4c48-ae71-531f6494295f")
    private void setAttributed(AttributeLink objingElt) {
        org.eclipse.uml2.uml.StructuralFeature ecoreFeature = this.ecoreElement.getDefiningFeature();
        
        if (ecoreFeature != null ) {
        
            Object objingFeature =  ReverseProperties.getInstance().getMappedElement(ecoreFeature);
        
            if (objingFeature instanceof Attribute) {
                objingElt.setBase((Attribute) objingFeature);
            }else if (objingFeature instanceof List<?>){               
                for (Object elt : ((List<Element>) objingFeature)){
                    if (elt instanceof Attribute) {
                        objingElt.setBase((Attribute) elt);
                        break;
                    }
                }
            }
        }
    }

    @objid ("b1530d9b-d6f1-4559-af19-28759851f499")
    private void setEAnnotationValue(AttributeLink objingElt) {
        String value = ObjingEAnnotation.getValue(this.ecoreElement);
        
        if (value != null)
            objingElt.setValue(value);
    }

    @objid ("a8f9b9b5-5df2-4193-8f05-2ddea4223630")
    private void setEAnnotationName(AttributeLink objingElt) {
        String value = ObjingEAnnotation.getName(this.ecoreElement);
        
        if (value != null)
            objingElt.setName(value);
    }

    @objid ("154ba420-9fd5-4e3b-961e-ac69839185aa")
    private void attachBindableInstance(final BindableInstance objingElt) {
        InstanceSpecification ecoreOwner = (InstanceSpecification) this.ecoreElement.getOwner();
        Instance objRoot = (Instance) ReverseProperties.getInstance().getMappedElement(ecoreOwner);
        
        if (ReverseProperties.getInstance().isRoundtripEnabled() 
                && (ObjingEAnnotation.getOwner(this.ecoreElement) != null)
                && (!ObjingEAnnotation.getOwner(this.ecoreElement).equals(""))){
        
            String ownerId = ObjingEAnnotation.getOwner(this.ecoreElement);
            for (Object object : ecoreOwner.getSlots()){
                org.eclipse.uml2.uml.Slot slot = (org.eclipse.uml2.uml.Slot) object;
                List<String> ids = ObjingEAnnotation.getObjingIDs(slot);
                if (ids.size() > 0){
                    String id = ids.get(0);
                    if (id.equals(ownerId)){
                        Object objOwner = ReverseProperties.getInstance().getMappedElement(slot);
                        if (objOwner instanceof Instance){
                            objingElt.setCluster((Instance)objOwner);
                            return;
                        }
                    }
                }
            }
            List<String> ids = ObjingEAnnotation.getObjingIDs(ecoreOwner);
            if (ids.size() >0){
                String id =  ids.get(0);
        
                if (id.equals(ownerId)){
                    Object objOwner = ReverseProperties.getInstance().getMappedElement(ecoreOwner);
                    if (objOwner instanceof Instance){
                        objingElt.setCluster((Instance)objOwner);
                        return;
                    }
                }
            }
        
        }
        
        objingElt.setCluster(objRoot);
    }

    @objid ("59cca5e1-be46-4a3a-99f4-87c8c635bc36")
    private void setOppositeEnd(LinkEnd objingElt) {
        Link link = objingElt.getLink();
        if (link.getLinkEnd().size() == 2){
          link.getLinkEnd().get(0).setOpposite(link.getLinkEnd().get(1));
          link.getLinkEnd().get(1).setOpposite(link.getLinkEnd().get(0));
        }
    }

}
