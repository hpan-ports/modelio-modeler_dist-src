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
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.modelio.api.model.IModelingSession;
import org.modelio.api.modelio.Modelio;
import org.modelio.metamodel.factory.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.behavior.commonBehaviors.ParameterEffectKind;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.PassingMode;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.reverse.PartialImportMap;
import org.modelio.xmi.reverse.TotalImportMap;
import org.modelio.xmi.util.EcoreModelNavigation;
import org.modelio.xmi.util.IModelerModuleStereotypes;
import org.modelio.xmi.util.ObjingEAnnotation;
import org.modelio.xmi.util.ReverseProperties;
import org.modelio.xmi.util.XMILogs;

/**
 * This class manages the import of Ecore org.eclipse.uml2.uml.Parameter
 * @author ebrosse
 */
@objid ("7b318699-6419-4992-adf0-4688a549b63f")
public class EParameter extends ENamedElement implements IEElement {
    @objid ("cf7d02a0-d4d0-4a39-864e-c6e90133bc8e")
    private boolean isBehavior = false;

    @objid ("4b7ee972-478b-4413-9a15-7182f128938a")
    @Override
    public Element createObjingElt() {
        if (this.isBehavior)
            return Modelio.getInstance().getModelingSession().getModel().createBehaviorParameter();
        else 
            return Modelio.getInstance().getModelingSession().getModel().createParameter();
    }

    /**
     * Constructor of EParameter.
     * It takes the imported Ecore org.eclipse.uml2.uml.Parameter as parameter
     * @param element : the imported Ecore org.eclipse.uml2.uml.Parameter
     */
    @objid ("7317f0af-0d1c-4839-9c21-3867c7da209e")
    public EParameter(final org.eclipse.uml2.uml.Parameter element) {
        super(element);
        
        org.eclipse.uml2.uml.Element owner = element.getOwner();
        if (owner != null){
            this.isBehavior = !(ReverseProperties.getInstance().getMappedElement(owner) instanceof Operation);
        }
    }

    @objid ("9141f934-8c71-4a7c-9970-65e94bed4595")
    @Override
    public void attach(Element objingElt) {
        org.eclipse.uml2.uml.Parameter ecoreElement = ((org.eclipse.uml2.uml.Parameter)getEcoreElement());
        if (objingElt != null) {
            if (this.isBehavior){
                Object owner =  ReverseProperties.getInstance().getMappedElement(ecoreElement.getOwner());
                if ((owner != null) && (owner instanceof Behavior))
                    ((Behavior) owner).getParameter().add((BehaviorParameter)objingElt);
                else{ 
                    PartialImportMap.getInstance().remove(ecoreElement);
                    TotalImportMap.getInstance().remove(ecoreElement);
                    objingElt.delete();
                }
        
            }else{
        
                org.eclipse.uml2.uml.Element ecoreOwner = ecoreElement.getOwner();
                Element objingOperation = null;
                try{
                    objingOperation = (Element) ReverseProperties.getInstance()
                            .getMappedElement(ecoreOwner);
                }catch (RuntimeException e){
                    Xmi.LOG.error(Xmi.PLUGIN_ID, e);
                }
        
                if ((objingOperation instanceof Operation) && (objingOperation != null)){
                    org.eclipse.uml2.uml.ParameterDirectionKind direction = ecoreElement.getDirection();
        
                    // The same processing is applied for In, Out and InOut
                    // parameters. Only the return
                            // value is a specific case:
                                switch (direction.getValue()) {
                                case org.eclipse.uml2.uml.ParameterDirectionKind.IN:
                                    ((Operation) objingOperation)
                                    .getIO().add((Parameter) objingElt);
                                    ((Parameter) objingElt).setParameterPassing(PassingMode.IN);
                                    break;
                                case org.eclipse.uml2.uml.ParameterDirectionKind.OUT:
                                    ((Operation) objingOperation)
                                    .getIO().add((Parameter) objingElt);
                                    ((Parameter) objingElt).setParameterPassing(PassingMode.OUT);
                                    break;
                                case org.eclipse.uml2.uml.ParameterDirectionKind.INOUT:
                                    ((Operation) objingOperation)
                                    .getIO().add((Parameter) objingElt);
                                    ((Parameter) objingElt).setParameterPassing(PassingMode.INOUT);
                                    break;
                                case org.eclipse.uml2.uml.ParameterDirectionKind.RETURN:
                                    Parameter temp = ((Operation) objingOperation).getReturn();
                                    if (temp != null){
                                        temp.delete();
                                        XMILogs xmilogs = XMILogs.getInstance();
                                        xmilogs.writelnInLog(Xmi.I18N
                                                .getMessage("logFile.warning.multipleReturnParameter", ((org.eclipse.uml2.uml.BehavioralFeature) ecoreOwner).getName()));
                                    }
        
                                    ((Operation) objingOperation)
                                    .setReturn((Parameter) objingElt);
                                    break;
                                }
                } else {
                    PartialImportMap.getInstance().remove(ecoreElement);
                    TotalImportMap.getInstance().remove(ecoreElement);
                    objingElt.delete();
                }
            }
        }
    }

    @objid ("094599c0-120b-4dd9-9875-b2aaa2d0687f")
    @Override
    public void attach(List<Object> objingElts) {
    }

    @objid ("7187731d-1eb7-4d67-87e5-9abb5d357094")
    @Override
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
        if (objingElt != null) {
            ReverseProperties revProp = ReverseProperties.getInstance();
        
            setType((Parameter) objingElt);
            setDefaultValue((Parameter) objingElt);
            setDirection((Parameter) objingElt);
            setMultiplicity((Parameter) objingElt);
            setUnique((Parameter) objingElt);
            setOrdered((Parameter) objingElt);
        
            if (revProp.isRoundtripEnabled()) {
                setTypeConstraint((Parameter) objingElt);
            }
        
            if (this.isBehavior){
                setEffect((BehaviorParameter) objingElt);
                setIsException((BehaviorParameter) objingElt);
                setIsStream((BehaviorParameter) objingElt);
            }
        }
    }

    @objid ("d2fe5d26-f243-4086-812c-cd865a0d60f1")
    private void setDefaultValue(Parameter objingElt) {
        org.eclipse.uml2.uml.Parameter ecoreElement = ((org.eclipse.uml2.uml.Parameter)getEcoreElement());
         org.eclipse.uml2.uml.ValueSpecification defaultValue = ecoreElement.getDefaultValue();
        if (defaultValue != null) {
            if (defaultValue instanceof InstanceValue){
                InstanceSpecification spec = ((InstanceValue) defaultValue).getInstance();
                if (spec != null){
                    Object instance  = ReverseProperties.getInstance().getMappedElement(spec);
                    if ((instance != null) && (instance instanceof Instance)) {
                        IModelingSession session = Modelio.getInstance().getModelingSession();
                        try {
                            session.getModel().createDependency(objingElt, (Instance) instance, "ModelerModule", IModelerModuleStereotypes.UML2INSTANCEVALUE);
                        } catch (ExtensionNotFoundException e) {                          
                            e.printStackTrace();
                        }                          
                    }
                }
            }else{
                String defaultValueStr = defaultValue.stringValue();
                if (defaultValueStr != null)
                    objingElt.setDefaultValue(defaultValueStr);
            }
        }else{
        
            String value = ecoreElement.getDefault();
            if (value != null)
                objingElt.setDefaultValue(value);
        }
    }

    @objid ("1af1b0c6-3072-4d79-9799-7bda02e9a92f")
    private void setDirection(Parameter objingElt) {
        org.eclipse.uml2.uml.Parameter ecoreElement = ((org.eclipse.uml2.uml.Parameter)getEcoreElement());
        org.eclipse.uml2.uml.ParameterDirectionKind direction = ecoreElement.getDirection();
        
        switch (direction.getValue()) {
        case org.eclipse.uml2.uml.ParameterDirectionKind.IN:
            objingElt.setParameterPassing(PassingMode.IN);
            break;
        case org.eclipse.uml2.uml.ParameterDirectionKind.OUT:
            objingElt.setParameterPassing(PassingMode.OUT);
            break;
        case org.eclipse.uml2.uml.ParameterDirectionKind.INOUT:
            objingElt.setParameterPassing(PassingMode.INOUT);
            break;
        case org.eclipse.uml2.uml.ParameterDirectionKind.RETURN:
            break;
        }
    }

    @objid ("8df8b299-3de2-439c-8372-b6ef97e16ae2")
    private void setMultiplicity(Parameter objingElt) {
        objingElt.setMultiplicityMin(EcoreModelNavigation.getMultiplicityMin((org.eclipse.uml2.uml.Parameter) this.getEcoreElement()));
        
        
        objingElt.setMultiplicityMax(EcoreModelNavigation.getMultiplicityMax((org.eclipse.uml2.uml.Parameter)this.getEcoreElement()));
    }

    @objid ("4e3ab1fc-c488-48a7-b90a-b9f4409282a3")
    private void setType(Parameter objingElt) {
        ReverseProperties revProp = ReverseProperties.getInstance();
        
        org.eclipse.uml2.uml.Parameter ecoreElement = ((org.eclipse.uml2.uml.Parameter)getEcoreElement());
        
        org.eclipse.uml2.uml.Type ecoreType = ecoreElement.getType();
        
        if (ecoreType != null) {
            Element objingType = (Element) revProp
                    .getMappedElement(ecoreType);
        
            if (objingType != null) {
                if (objingType instanceof GeneralClass) {
                    objingElt.setType((GeneralClass) objingType);
                }else{
                    XMILogs xmiLogs = XMILogs.getInstance();
                    xmiLogs.writelnInLog(Xmi.I18N.getMessage("logFile.warning.unsupportedRelationBetweenTypeImported", 
                            "Type", ecoreElement.getName(), "EParameter",ecoreType.getName(), ecoreType.getClass().getSimpleName()));
                }
            } 
        }
        else {
            if (!(( ReverseProperties.getInstance().isRoundtripEnabled()) 
                    && (ObjingEAnnotation.isNoType(ecoreElement))))
        
                objingElt.setType(Modelio.getInstance().getModelingSession()
                        .getModel().getUmlTypes().getUNDEFINED());
        
        }
    }

    @objid ("14641a50-f708-47e6-adc2-1c29c8620fe8")
    private void setTypeConstraint(Parameter objingElt) {
        String typeConstraint = ObjingEAnnotation
                .getTypeConstraint((getEcoreElement()));
        if (typeConstraint != null)
            objingElt.setTypeConstraint(typeConstraint);
    }

    @objid ("570edac3-0145-4e79-86eb-8fdaaef7e8dd")
    private void setIsStream(BehaviorParameter objingElt) {
        objingElt.setIsStream(((org.eclipse.uml2.uml.Parameter)getEcoreElement()).isStream());
    }

    @objid ("067c88e9-9b20-4e42-a08b-5c76124eb22b")
    private void setIsException(BehaviorParameter objingElt) {
        objingElt.setIsException(((org.eclipse.uml2.uml.Parameter)getEcoreElement()).isException());
    }

    @objid ("5727a915-58c9-4847-a973-21d7a10d4b94")
    private void setEffect(BehaviorParameter objingElt) {
        org.eclipse.uml2.uml.Parameter ecoreElement = ((org.eclipse.uml2.uml.Parameter)getEcoreElement());
        switch (ecoreElement.getEffect()){
        case CREATE_LITERAL : 
            objingElt.setEffect(ParameterEffectKind.CREATEEFFECT);
            break;
        case DELETE_LITERAL : 
            objingElt.setEffect(ParameterEffectKind.DELETEEFFECT);
            break;
        case READ_LITERAL : 
            objingElt.setEffect(ParameterEffectKind.READEFFECT);
            break;
        case UPDATE_LITERAL : 
            objingElt.setEffect(ParameterEffectKind.UPDATEEFFECT);
            break;
        
        }
    }

    @objid ("4e01aaae-cdc6-4da4-8e33-324f17084b86")
    private void setOrdered(final Parameter objingElt) {
        objingElt.setIsOrdered(((org.eclipse.uml2.uml.Parameter)getEcoreElement()).isOrdered());
    }

    @objid ("1554021d-17c9-4092-abcb-d3c2ecabf658")
    private void setUnique(final Parameter objingElt) {
        objingElt.setIsUnique(((org.eclipse.uml2.uml.Parameter)getEcoreElement()).isUnique());
    }

}
