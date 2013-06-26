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
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.Generalization;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.reverse.PartialImportMap;
import org.modelio.xmi.reverse.TotalImportMap;
import org.modelio.xmi.util.ObjingEAnnotation;
import org.modelio.xmi.util.PrimitiveTypeMapper;
import org.modelio.xmi.util.ReverseProperties;
import org.modelio.xmi.util.XMILogs;

/**
 * This class manages the import of Ecore org.eclipse.uml2.uml.Generalization
 * @author ebrosse
 */
@objid ("1aee77f3-3ec1-460d-aba3-c352962f43b5")
public class EGeneralization extends EElement implements IEElement {
    @objid ("f10d7377-c3a2-4f2a-b7a4-f7fe9abfcc3f")
    private org.eclipse.uml2.uml.Generalization ecoreElement;

    @objid ("0799e11a-57aa-4fc8-bb23-355eb5464c3b")
    @Override
    public Element createObjingElt() {
        org.eclipse.uml2.uml.Classifier ecoreGeneral = this.ecoreElement.getGeneral();
        org.eclipse.uml2.uml.Classifier ecoreSpecific = this.ecoreElement.getSpecific();
        if ((ecoreGeneral != null) && (ecoreSpecific != null)){
        
            if  ((ecoreGeneral instanceof org.eclipse.uml2.uml.Stereotype) && (ecoreSpecific instanceof org.eclipse.uml2.uml.Stereotype)){
                
                List<Stereotype> objingGenerals = new ArrayList<Stereotype>();
                List<Stereotype> objingSpecifics = new ArrayList<Stereotype>();
                
                Object objingGeneral = ReverseProperties.getInstance().getMappedElement(ecoreGeneral);
                if (objingGeneral instanceof Stereotype)
                    objingGenerals.add((Stereotype) objingGeneral);
                else 
                    objingGenerals = (ArrayList<Stereotype>) objingGeneral;
                
                Object objingSpecific = ReverseProperties.getInstance().getMappedElement(ecoreSpecific);
                if (objingSpecific instanceof Stereotype)
                    objingSpecifics.add((Stereotype) objingSpecific);
                else 
                    objingSpecifics = (ArrayList<Stereotype>) objingSpecific;
                
                for (Stereotype currentSpecific : objingSpecifics){
                    for (Stereotype currentGeneral : objingGenerals){
                        if (currentSpecific.getBaseClassName().equals(currentGeneral.getBaseClassName())
                                && currentSpecific.getStatus().isModifiable()){
                            currentSpecific.setParent(currentGeneral);
                            break;
                        }
                    }
                }
                
                return null;
            }else if (!(ecoreGeneral instanceof org.eclipse.uml2.uml.Stereotype) && !(ecoreSpecific instanceof org.eclipse.uml2.uml.Stereotype)){
        
                Element objingGeneral = (Element) ReverseProperties.getInstance().getMappedElement(ecoreGeneral);
                Element objingSpecific = (Element) ReverseProperties.getInstance().getMappedElement(ecoreSpecific);
                if (objingGeneral instanceof NameSpace && objingSpecific instanceof NameSpace 
                        && (!PrimitiveTypeMapper.isPredefinedType(ecoreSpecific))) {
                    Generalization objingGeneralization = Modelio.getInstance().getModelingSession().getModel().createGeneralization();
                    return objingGeneralization;
                }else{
                    
                    XMILogs xmilogs = XMILogs.getInstance();
                    String objingGeneralName = " ";
                    String objingSpecificName = " ";
                        
                    if (objingGeneral != null) 
                            objingGeneralName = objingGeneral.getClass().getSimpleName();
                    
                    if (objingSpecific != null)
                        objingSpecificName = objingSpecific.getClass().getSimpleName();
                    
                        xmilogs.writelnInLog(Xmi.I18N.getMessage("logFile.warning.unsupportedEnds", " "
                            , "Generalization", objingGeneralName, objingSpecificName));
                   
        
                    return null;
                }
            }else
                return null;
        }else
            return null;
    }

    /**
     * The EGeneralization constructor with the imported Ecore org.eclipse.uml2.uml.Generalization as parameter
     * @param element : the imported Ecore org.eclipse.uml2.uml.Generalization
     */
    @objid ("89655b78-47b1-43d3-9517-ec4da208023b")
    public EGeneralization(final org.eclipse.uml2.uml.Generalization element) {
        super(element);
        this.ecoreElement = element;
    }

    @objid ("4a1ed6cd-77af-40cb-a4bb-cf78a903f7c7")
    @Override
    public void attach(Element objingElt) {
        ReverseProperties revProp = ReverseProperties.getInstance();
        
        
        org.eclipse.uml2.uml.Classifier ecoreGeneral = this.ecoreElement.getGeneral();
        org.eclipse.uml2.uml.Classifier ecoreSpecific = this.ecoreElement.getSpecific();
        
        Element objingGeneral = (Element) revProp
        .getMappedElement(ecoreGeneral);
        Element objingSpecific = (Element) revProp
        .getMappedElement(ecoreSpecific);
        
        if (objingGeneral instanceof NameSpace
                && objingSpecific instanceof NameSpace
                && objingElt instanceof Generalization) {
            Generalization objingGen = (Generalization) objingElt;
            objingGen.setSuperType((NameSpace) objingGeneral);
            objingGen.setSubType((NameSpace) objingSpecific);
        } else {
            PartialImportMap.getInstance().remove(this.ecoreElement);
            TotalImportMap.getInstance().remove(this.ecoreElement);
            objingElt.delete();
        }
    }

    @objid ("c546d9c0-8746-4e02-b30e-75710e52f41d")
    @Override
    public void attach(List<Object> objingElts) {
    }

    @objid ("9ca5e39c-5ef4-4676-8d6f-67012a88a1de")
    @Override
    public void setProperties(Element objingElt) {
        ReverseProperties revProp = ReverseProperties.getInstance();
        
        if (revProp.isRoundtripEnabled())
            setDiscriminator((Generalization) objingElt);
        
        
        super.setProperties(objingElt);
    }

    @objid ("838bc89f-728a-4b1f-8142-c86216b37779")
    private void setDiscriminator(Generalization objingElt) {
        String discriminator = ObjingEAnnotation.getDiscriminator(this.ecoreElement);
        if (discriminator != null)
            objingElt.setDiscriminator(discriminator);
    }

}
