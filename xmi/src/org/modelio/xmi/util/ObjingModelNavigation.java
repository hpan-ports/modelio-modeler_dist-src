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
                                    

package org.modelio.xmi.util;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.modelio.api.model.IMetamodelExtensions;
import org.modelio.api.model.IUMLTypes;
import org.modelio.api.modelio.Modelio;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.CallBehaviorAction;
import org.modelio.metamodel.uml.behavior.activityModel.CallOperationAction;
import org.modelio.metamodel.uml.behavior.activityModel.DecisionMergeNode;
import org.modelio.metamodel.uml.behavior.activityModel.ForkJoinNode;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionOccurenceSpecification;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageEnd;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageSort;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InternalTransition;
import org.modelio.metamodel.uml.behavior.stateMachineModel.KindOfStateMachine;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.behavior.usecaseModel.Actor;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.metamodel.uml.infrastructure.Usage;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.ElementImport;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.EnumerationLiteral;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Generalization;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.InterfaceRealization;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.Manifestation;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.reverse.TotalImportMap;

/**
 * Services for the Modelio model navigation
 * @author ebrosse
 */
@objid ("dc13ce8e-c33f-4601-b887-13dbba50e788")
public abstract class ObjingModelNavigation {
    @objid ("e4685f19-8a78-4b90-861f-9697e95e14a0")
    public static final String OBJING_NULL_VALUE = "null";

    @objid ("40bfd28c-063b-4189-ab85-c3cfd75d7301")
    public static final String OBJING_UNLIMITED_VALUE = "*";

    @objid ("82a77144-9341-425e-a30f-2fb9cdedcb17")
    public static DataType getPrimitiveType(String ecoreTypeName) {
        if (ecoreTypeName != null) {
        
            IUMLTypes umlTypes = Modelio.getInstance().getModelingSession()
                    .getModel().getUmlTypes();
            DataType obBOOLEAN, obBYTE, obCHAR, obDATE, obDOUBLE, obFLOAT, obSHORT, obINTEGER, obLONG, obSTRING, obUNDEFINED;
        
            obBOOLEAN = umlTypes.getBOOLEAN();
            obBYTE = umlTypes.getBYTE();
            obCHAR = umlTypes.getCHAR();
            obINTEGER = umlTypes.getINTEGER();
            obDATE = umlTypes.getDATE();
            obDOUBLE = umlTypes.getDOUBLE();
            obFLOAT = umlTypes.getFLOAT();
            obLONG = umlTypes.getLONG();
            obSHORT = umlTypes.getSHORT();
            obSTRING = umlTypes.getSTRING();
            obUNDEFINED = umlTypes.getUNDEFINED();
        
            if ((obBOOLEAN != null) && (ecoreTypeName.equals(obBOOLEAN.getName())))
                return obBOOLEAN;
            else if  ((obCHAR != null) &&(ecoreTypeName.equals(obCHAR.getName())))
                return obCHAR;
            else if ((obINTEGER != null) && (ecoreTypeName.equals(obINTEGER.getName())))
                return obINTEGER;
            else if ((obBYTE != null) &&(ecoreTypeName.equals(obBYTE.getName())))
                return obBYTE;
            else if ((obDATE != null) &&(ecoreTypeName.equals(obDATE.getName())))
                return obDATE;
            else if ((obDOUBLE != null) &&(ecoreTypeName.equals(obDOUBLE.getName())))
                return obDOUBLE;
            else if ((obFLOAT != null) &&(ecoreTypeName.equals(obFLOAT.getName())))
                return obFLOAT;
            else if ((obFLOAT != null) &&(ecoreTypeName.equals("real")))
                return obFLOAT;
            else if ((obLONG != null) &&(ecoreTypeName.equals(obLONG.getName())))
                return obLONG;
            else if ((obSHORT != null) &&(ecoreTypeName.equals(obSHORT.getName())))
                return obSHORT;
            else if ((obSTRING != null) &&(ecoreTypeName.equals(obSTRING.getName())))
                return obSTRING;
            else if ((obUNDEFINED != null) &&(ecoreTypeName.equals(obUNDEFINED.getName())))
                return obUNDEFINED;
        }
        return null;
    }

    @objid ("505a3dc7-dd6e-4d7e-81e9-c57dae5095bd")
    private static String getJarPath(String pkgName) {
        File file = null;
        try {
            file = getFileFromPackage(pkgName);
        } catch  (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        if (file != null) {
            String path = file.getPath();
        
            int index = path.indexOf(".jar!");
            String jarPath = path.substring(0, index + 4);
            if (jarPath.startsWith("file:/") || jarPath.startsWith("file:\\"))
                jarPath = jarPath.substring(6);
        
            return jarPath;
        }
        return null;
    }

    @objid ("d8fb03b6-b0d3-4862-87f0-d85a93386978")
    private static File getFileFromPackage(String pckgname) throws ClassNotFoundException {
        File directory = null;
        try {
            ClassLoader cld = Thread.currentThread().getContextClassLoader();
            if (cld == null) {
                throw new ClassNotFoundException("Can't get class loader.");
            }
            String path = pckgname.replace('.', '/');
            URL resource = cld.getResource(path);
        
            if (resource == null) {
                throw new ClassNotFoundException("No resource for " + path);
            }
            directory = new File(resource.getFile());
            return directory;
        } catch (NullPointerException x) {
            throw new ClassNotFoundException(pckgname + " (" + directory
                    + ") does not appear to be a valid package");
        }
    }

    @objid ("6cc95338-e2b5-4bc8-a160-83c61c1e7614")
    private static String getNamespace(String jarEntryName) {
        String namespace = jarEntryName;
        namespace = namespace.replaceAll("/", "\\.");
        String separator = "/";
        
        int index = namespace.lastIndexOf(separator);
        namespace = namespace.substring(index + 1);
        
        if (namespace.endsWith(".class"))
            namespace = namespace.substring(0, namespace.length() - 6);
        return namespace;
    }

    @objid ("35d929fb-a746-490c-806b-6581f4c745b8")
    private static String getSimpleName(String namespace) {
        int index = namespace.lastIndexOf(".");
        return namespace.substring(index + 1, namespace.length());
    }

    @objid ("7aa0ea2b-6ae4-48bd-9dc2-0240126bfaba")
    public static boolean isCreate(Operation operation) {
        return isStereotyped(operation, Xmi.I18N
                .getString("objing.java.stereotype.constructor"));
    }

    @objid ("28139952-4655-40da-9b80-599cc5bda582")
    public static boolean isDestroy(Operation operation) {
        return isStereotyped(operation, Xmi.I18N
                .getString("objing.java.stereotype.destructor"));
    }

    @objid ("67cbb487-54a1-4f39-be4a-754bc77dd27d")
    public static Operation getOwnerOperation(Parameter parameter) {
        Operation operation = parameter.getComposed();
        if (operation == null)
            operation = parameter.getReturned();
        return operation;
    }

    @objid ("56284578-36f7-4c0c-8c1c-1cac5a8b4f31")
    public static boolean isReturnParameter(Parameter parameter) {
        if (parameter != null)
            if (parameter.getReturned() != null)
                return true;
        return false;
    }

    @objid ("d8fa19d5-b103-4276-b4d9-51df292157a6")
    public static ModelElement getImportingElement(ModelElement mdlEltImport) {
        ModelElement importingElt = null;
        if (mdlEltImport != null) {
            if (mdlEltImport instanceof ElementImport) {
                ElementImport eltImport = (ElementImport) mdlEltImport;
                importingElt = eltImport.getImportingOperation();
                if (importingElt == null)
                    importingElt = eltImport.getImportingNameSpace();
            } else if (mdlEltImport instanceof PackageImport) {
                PackageImport pkgImport = (PackageImport) mdlEltImport;
                importingElt = pkgImport.getImportingOperation();
                if (importingElt == null)
                    importingElt = pkgImport.getImportingNameSpace();
            }
        }
        return importingElt;
    }

    @objid ("f1cb7563-450e-45de-af2a-4b8ad2a9816f")
    public static boolean isIsClassAssociation(Association assoc) {
        if (assoc != null)
            if (assoc.getLinkToClass() != null)
                return true;
        return false;
    }

    @objid ("a8e04ee2-5097-42d4-ac1d-899f293fd768")
    public static boolean isIsClassAssociation(Class _class) {
        if (_class != null) {
            return (_class.getLinkToAssociation() != null);                
        }
        return false;
    }

    @objid ("617e9150-cb10-4515-b070-4ef4ec1bc849")
    public static boolean isIsClassAssociation(AssociationEnd assocEnd) {
        if (assocEnd != null)
            return (assocEnd.getAssociation().getLinkToClass() != null);
        return false;
    }

    @objid ("38a155d9-fa4f-4d8d-b5cf-e7d181c7e42c")
    public static boolean isBinary(Association assoc) {
        if (assoc != null) {
            List<AssociationEnd> memberEnds = assoc.getEnd();
            if (memberEnds != null && memberEnds.size() == 2)
                return true;
        }
        return false;
    }

    @objid ("b92f85a9-5dc2-4ff9-9dcf-2dc54d7ec6cb")
    public static boolean isRepresentedByAUniqueClass(ClassAssociation classAssoc) {
        Class objingClass = classAssoc.getClassPart();
        if (objingClass != null) {
            ClassAssociation classAssocList = objingClass
                    .getLinkToAssociation();
            if (classAssocList != null)
                return true;
        }
        return false;
    }

    @objid ("1d8f9705-eb67-4405-ac7d-8461d42d0ad0")
    public static Package getNearestPackage(ModelTree modelTreeElt) {
        if (modelTreeElt != null) {
            ModelTree owner = modelTreeElt.getOwner();
            if (owner instanceof Package)
                return (Package) owner;
            else
                return getNearestPackage(owner);
        }
        return null;
    }

    @objid ("a09eee09-3eb1-4004-a3ca-482148f4e585")
    public static void infoOfUnsupportedOwnedWithEMF(MObject objingOwner, ModelElement objingElement, org.eclipse.uml2.uml.Element ecoreElt) {
        infoOfUnsupportedOwnedWithEMF(objingOwner,objingElement);
        if (ecoreElt != null)
            ecoreElt.destroy();
    }

    @objid ("283daf38-03a6-4ac3-90ff-ac784138124b")
    public static Stereotype getStereotype(MClass metaclass, String stereotypeName) {
        return Modelio.getInstance().getModelingSession()
                .getMetamodelExtensions().getStereotype( stereotypeName, metaclass);
    }

    @objid ("250dd0c5-6925-47b4-9fb3-c7397b69c10b")
    public static boolean isManifestationMappable(Manifestation manif) {
        ModelElement objingUtilizedElt = manif.getUtilizedElement();
        if (objingUtilizedElt != null) {
        
            // Gets the ecore utilized element:
            org.eclipse.uml2.uml.Element ecoreUtilizedElt = GenerationProperties.getInstance()
                    .getMappedElement(objingUtilizedElt);
        
            return ecoreUtilizedElt instanceof PackageableElement;
        }
        return false;
    }

    @objid ("0b4280b1-66a3-4e84-8a8b-bf49182beb27")
    public static Message getReplyMessage(Message message) {
        boolean isSynchronous = false;
        MessageSort msgSort = message.getSortOfMessage();
        if (msgSort == MessageSort.SYNCCALL)
            isSynchronous = true;
        
        if (isSynchronous) {
            MessageEnd receiveEnd = message.getReceiveEvent();
            Lifeline coveredLL = receiveEnd.getCovered().get(0);
        
            List<InteractionFragment> coveringFragments = coveredLL
                    .getCoveredBy();
            int index = coveringFragments.indexOf(receiveEnd);
            int fragmentsNumber = coveringFragments.size();
            int indexOfEOS = index + 1;
            InteractionFragment next = coveringFragments.get(indexOfEOS);
            while (indexOfEOS < fragmentsNumber - 1
                    && !(next instanceof ExecutionSpecification)) {
                next = coveringFragments.get(++indexOfEOS);
            }
        
            if (next instanceof ExecutionSpecification) {
                ExecutionOccurenceSpecification finishEnd = ((ExecutionSpecification) next)
                        .getFinish();
                return getMessage(finishEnd);
            }
        }
        return null;
    }

    @objid ("5bb9e2d1-fb32-4690-959d-1d2daaa46ee2")
    public static Message getMessage(MessageEnd end) {
        Message message = end.getSentMessage();
        if (message == null)
            message = end.getReceivedMessage();
        return message;
    }

    @objid ("b039ef50-661f-43ae-bd34-1e04657d0be9")
    public static InteractionFragment getConnectedFragment(ModelElement sequenceElt) {
        InteractionFragment connectedFragment = null;
        if (sequenceElt instanceof Message) {
            MessageEnd end = ((Message) sequenceElt).getReceiveEvent();
            if (end == null)
                end = ((Message) sequenceElt).getSendEvent();
        
            if (end != null)
                connectedFragment = end;
        }
        return connectedFragment;
    }

    @objid ("45498fe4-d5bb-48f7-bd28-c0bcbc8cf320")
    public static Boolean IsInstanceOwner(BindableInstance bindableInstance) {
        MObject owner = bindableInstance.getCompositionOwner();
        while ((owner != null) && (owner instanceof BindableInstance)){    
            bindableInstance = (BindableInstance) owner;
            owner = bindableInstance.getCompositionOwner();
        }
        return (owner instanceof Instance);
    }

    @objid ("0724d8e8-a8d0-4fc1-9b25-5c95e47bdbe7")
    public static MObject getBindableInstanceOwner(Element instance) {
        MObject owner = instance.getCompositionOwner();
        while ((owner != null) && (owner instanceof BindableInstance)){    
            owner = owner.getCompositionOwner();
        }
        return owner;
    }

    @objid ("c7281822-a164-49b0-ae8b-e50a26cfeaf9")
    public static MObject getLinkEndOwner(LinkEnd linkEnd) {
        return getBindableInstanceOwner(linkEnd.getLink());
    }

    @objid ("b8292470-86fc-413d-b1f3-84da0d70371e")
    public static <T extends MObject> MObject getEnclosingElement(MObject child, MClass typeOfEnclosing) {
        MObject owner = child.getCompositionOwner();
        
        while (owner != null) {
            if ((typeOfEnclosing.getSub(true).contains(owner.getMClass()) ||
                    typeOfEnclosing.equals(owner.getMClass()) ))
                return owner;
            else
                owner = owner.getCompositionOwner();
        }
        return null;
    }

    @objid ("8aed7b3e-4c5c-4fd4-99e0-d34649f06cef")
    public static List<Parameter> getRelatedParameters(ActivityAction objingOwner) {
        List<Parameter> paramList = new ArrayList<Parameter>();
        
        if (objingOwner instanceof CallOperationAction) {
            Operation operation = ((CallOperationAction) objingOwner)
                    .getCalled();
            if (operation != null){
                paramList.addAll(operation.getIO());
                if (operation.getReturn() != null)
                    paramList.add(operation.getReturn());
            }
        
        } else if (objingOwner instanceof CallBehaviorAction) {
            Behavior behavior = ((CallBehaviorAction) objingOwner)
                    .getCalled();
            if (behavior != null) {
                paramList.addAll(behavior.getParameter());
        
            }
        }
        return paramList;
    }

    @objid ("f681f309-08e7-4207-9ca4-f7bcb3f85051")
    public static boolean isMergeNode(DecisionMergeNode node) {
        int incomings = node.getIncoming().size();
        int outgoings = node.getOutgoing().size();
        
        if (incomings > 1 && outgoings <= 1)
            return true;
        else
            return false;
    }

    @objid ("151a7bd6-be74-488c-bddf-eace649fc980")
    public static boolean isDecisionNode(DecisionMergeNode node) {
        if (node.getIncoming().size() <= 1)
            return true;
        else
            return false;
    }

    @objid ("fa07abaf-02a2-4c2a-9336-f6f99c83044d")
    public static boolean isJoinNode(ForkJoinNode node) {
        int incomings = node.getIncoming().size();
        int outgoings = node.getOutgoing().size();
        
        if (incomings > 1 && outgoings <= 1)
            return true;
        else
            return false;
    }

    @objid ("290fb251-fcdd-41eb-9dfa-215c1d992b9b")
    public static boolean isForkNode(ForkJoinNode node) {
        if (node.getIncoming().size() <= 1)
            return true;
        else
            return false;
    }

    @objid ("adfa40fc-f65c-43a7-b146-0441474360c2")
    public static boolean isProtocolStateMachine(StateMachine element) {
        boolean isProtocol = false;
        switch (element.getKind()) {
        case PROTOCOL:
            isProtocol = true;
            break;
        default:
            isProtocol = false;
            break;
        }
        return isProtocol;
    }

    @objid ("aed017c4-8fa7-489e-aa5e-57ec1cc4ab0d")
    public static boolean isJunctionState(StateVertex state) {
        int incomings = state.getIncoming().size();
        int outgoings = state.getOutGoing().size();
        
        if (incomings > 1 && outgoings <= 1)
            return true;
        return false;
    }

    @objid ("786589cf-1795-44a4-b724-dfcc3d6a2363")
    public static boolean isChoiceState(StateVertex state) {
        if (state.getIncoming().size() <= 1)
            return true;
        return false;
    }

    @objid ("1a7df2cd-2728-487b-9c70-2e50a0a89a8c")
    public static boolean isProtocolTransition(Transition transition) {
        if (transition instanceof InternalTransition)
            return false;
        
        StateMachine sm =  (StateMachine) ObjingModelNavigation
                .getEnclosingElement(transition, SmClass.getClass("StateMachine"));
        return ((!(transition instanceof InternalTransition)) 
                && (transition.getProcessed() != null)
                && (sm != null)
                && (sm.getKind().equals(KindOfStateMachine.PROTOCOL)));
    }

    @objid ("b3031f20-ce28-4bcf-a7f1-76a082639baf")
    public static StateMachine getOwnerStateMachine(State state) {
        StateMachine sm = state.getSubMachine();
        if (sm == null)
            sm = getOwnerStateMachine(state.getParent());
        return sm;
    }

    @objid ("c06a0ae1-f9ad-4794-8dff-8e680a1f905d")
    public static StateMachine getOwnerStateMachine(Region region) {
        StateMachine sm = region.getRepresented();
        if (sm == null)
            sm = getOwnerStateMachine(region.getParent());
        return sm;
    }

    @objid ("4541fbc5-b8de-45ab-abb9-23cccc6371fe")
    public static Package getNearestPackage(Element element) {
        MObject newOwner = element.getCompositionOwner();
        while (!(newOwner instanceof Package) ){
            newOwner = newOwner.getCompositionOwner();
        }
        return (Package) newOwner;
    }

    @objid ("63856705-14da-4b3d-95bf-cea1e8a0f4c7")
    public static int countNumberOfLocalProfile() {
        int i= 0;
        
        //        for (IModule module : Modelio.getInstance().getModelingSession().getModel().getProject().getInstalled()){
        //            for(Profile profile : module.getOwnedProfile()){
        //                if (profile.getName().equals("LocalProfile")){
        //                    i++;
        //                }
        //            }
        //        }
        return i;
    }

    @objid ("c00e6af2-1a33-478d-a791-6c517ca62437")
    public static boolean isOwnedByActor(Association assoc) {
        int nbNoActor = 0;
        for (AssociationEnd assocEnd : assoc.getEnd()){
            if (assocEnd.getOwner() instanceof Actor)
                nbNoActor++;
        }
        return nbNoActor >=2 ;
    }

    @objid ("2c67771c-16a7-4a60-aa9f-12846d32b20f")
    public static boolean mustBeExported(Stereotype obStereotype) {
        Profile profile =  obStereotype.getOwner();
        
        
        if (profile.getOwnerModule().getName().equals("ModelerModule")  && profile.getName().equals("default") 
                && ((obStereotype.getName().equals(IModelerModuleStereotypes.EXTEND)) 
                        || (obStereotype.getName().equals(IModelerModuleStereotypes.INCLUDE) 
                        || (obStereotype.getName().equals(IModelerModuleStereotypes.REQUIREMENT))
                        || (obStereotype.getName().equals(IModelerModuleStereotypes.REQUIREMENT_CONTAINER))
                        || (obStereotype.getName().equals(IModelerModuleStereotypes.DERIVE)) 
                        || (obStereotype.getName().equals(IModelerModuleStereotypes.SATISFY))
                        || (obStereotype.getName().equals(IModelerModuleStereotypes.PART))
                        || (obStereotype.getName().equals(IModelerModuleStereotypes.VERIFY)))))
            return false;
        return !(profile.getUuid().toString().equals("01ec045c-0000-3739-0000-000000000000"));
    }

    @objid ("0f2a931d-28d2-40c4-9fe6-61b70285cd1c")
    public static boolean mustBeExported(MetaclassReference metaclass) {
        Profile profile =  metaclass.getOwnerProfile();
        return !(profile.getUuid().toString().equals("01ec045c-0000-3739-0000-000000000000"));
    }

    @objid ("31503299-de86-45e9-ac45-867fe0dbcd30")
    public static boolean mustBeExported(TagType tagType) {
        if (tagType.getOwnerStereotype() != null){
            return mustBeExported(tagType.getOwnerStereotype());
        }else
            return mustBeExported(tagType.getOwnerReference());
    }

    @objid ("ca2bbeb4-75a9-48b6-aead-385e76d6d80f")
    public static boolean mustBeExported(TaggedValue taggedValue) {
        return mustBeExported(taggedValue.getDefinition());
    }

    @objid ("fa28f598-782b-4ed7-adff-4dae9ccb88b3")
    public static String getTaggedValue(ModelElement owner, String tagType) {
        String result = "";
        for (TaggedValue tagged : owner.getTag()){
            if (tagged.getDefinition().getName().equals(tagType)){
                if (tagged.getActual().size() > 0){
                    return tagged.getActual().get(0).getValue();
                }
            }
        }
        return result;
    }

    @objid ("aa1582b2-1044-4596-8349-e1571c75b6d9")
    public static void attachAssociationEnd(AssociationEnd objingEnd, Property ecoreElement) {
        try {
            List<Property> ownedEnds = ecoreElement.getAssociation().getOwnedEnds();
            List<Property> oppositeEnds = EcoreModelNavigation.getOppositeAssociationEnds(ecoreElement);
        
            int nbEnds = ownedEnds.size();
        
            if (!((nbEnds == 1 ) &&  (ecoreElement.getOwner() instanceof org.eclipse.uml2.uml.Association))){
                // Case of a binary Association
                attachToAssoc(objingEnd, oppositeEnds.get(0).getType());
            } else if (nbEnds > 1) {// (in Ecore, an association may have only
                // one member end (which does
                // not have any sense ...)
                // Case of a N ary association
                attachToAssoc(objingEnd, ecoreElement.getType());
            }
        } catch (AssociationNotFoundException e) {
            String msg = "The Property \"" + ecoreElement.getName()
                    + "\" is not connected to an Association.";
            Xmi.LOG.error(Xmi.PLUGIN_ID, msg);
            XMILogs.getInstance().writelnInLog(msg);
        }
    }

    @objid ("c16c6bb5-c10f-4e97-996d-61634c6392b1")
    private static void attachToAssoc(AssociationEnd objingEnd, Type ecoreType) {
        if (ecoreType != null) {
            Object objingOwner = ReverseProperties.getInstance().getMappedElement(ecoreType);
            if (objingOwner != null){
                //Rule Core R22
                if ((objingOwner instanceof Class) || (objingOwner instanceof Interface) || (objingOwner instanceof Component)
                        || (objingOwner instanceof Actor) || (objingOwner instanceof DataType) || (objingOwner instanceof Node) 
                        || (objingOwner instanceof Signal)|| (objingOwner instanceof UseCase)){
                    objingEnd.setSource((Classifier) objingOwner);
                    
                }else{      
                    XMILogs xmilogs = XMILogs.getInstance();
                    xmilogs.writelnInLog(Xmi.I18N.getMessage(
                            "logFile.warning.unsupportedOwnerImport", objingEnd.getName(), 
                            objingEnd.getClass().getName(), objingOwner.getClass().getName()));       
                }
            }
        }
    }

    @objid ("1c1ada7f-6fbe-4958-acd6-c10f5b3c6a15")
    public static Type getType(AttributeLink attributeLink) {
        Type result = null;
        Attribute attribute  = attributeLink.getBase();
        if (attribute != null){
            attribute.getType();
        }
        return result;
    }

    @objid ("d5b27fe5-c485-41e4-867a-9624bf7f38f1")
    public static BindableInstance copyAssocEndToBindableInstance(AssociationEnd initial, Property ecoreElt) {
        BindableInstance copy = Modelio.getInstance().getModelingSession().getModel().createBindableInstance();
        setInstance(copy, ecoreElt);
        copy.setOwner(initial.getOwner());
        copy.setRepresentedFeature(initial);
        return copy;
    }

    @objid ("105b709d-3ca6-44ea-895f-067f5ce2114a")
    public static void attachPort(Element objingElt, org.eclipse.uml2.uml.Port ecoreElement) {
        ReverseProperties revProp = ReverseProperties.getInstance();
        
        org.eclipse.uml2.uml.Element ecoreOwner = ecoreElement.getOwner();  
        
        if (revProp.isRoundtripEnabled() && (ObjingEAnnotation.getOwner(ecoreElement) != null)){
            String ownerId = ObjingEAnnotation.getOwner(ecoreElement);
            for (Object object : ( (org.eclipse.uml2.uml.Classifier)ecoreOwner).getAllAttributes()){
                Property property = (Property) object;
                List<String> ids = ObjingEAnnotation.getObjingIDs(property);
                if (ids.size() > 0){
                    String id =  ids.get(0);
                    if (id.equals(ownerId)){
                        Object objOwner = revProp.getMappedElement(property);
                        if (objOwner instanceof BindableInstance)
                            if (objingElt instanceof BindableInstance){
                                if (((BindableInstance) objingElt).getInternalOwner()== null)
                                    ((BindableInstance) objingElt).setCluster((Instance)objOwner);
                                break;
                            }else{
                                ((AttributeLink) objingElt).setAttributed((Instance)objOwner);
                                break;
                            }
                    }
                }
            }
        } 
        
        if (ecoreOwner != null) {
            Object objOwner = ReverseProperties.getInstance().getMappedElement(ecoreOwner);
            if (objOwner instanceof Classifier){
                if (((BindableInstance) objingElt).getCluster()== null)
                    ((Port) objingElt).setInternalOwner(((Classifier) objOwner));
            }else if (objOwner instanceof BindableInstance){
                if (((BindableInstance) objingElt).getInternalOwner()== null)
                    ((Port) objingElt).setCluster((BindableInstance) objOwner);
                else if  (objOwner instanceof AssociationEnd){
                    objOwner = ObjingModelNavigation.copyAssocEndToBindableInstance(
                            (AssociationEnd) objOwner, (Property) ecoreOwner);
                    if (((BindableInstance) objingElt).getInternalOwner()== null)
                        ((Port) objingElt).setCluster((BindableInstance) objOwner);
        
                }
            }else{
                objingElt.delete();
            }
        
        }
    }

    @objid ("145f76c1-be04-49af-82d3-e95a8935799c")
    private static void setBase(Instance objingElt, Property ecoreElt) {
        Type type =  ecoreElt.getType();
        if (type != null){
            Element base = (Element) ReverseProperties.getInstance().getMappedElement(type);
            if (base instanceof NameSpace)
                objingElt.setBase((NameSpace) base);
        }
    }

    @objid ("02ecdf94-6b10-46da-8a91-3a031bec9e6b")
    public static void setRepresentedFeature(Instance objingElt, Property ecoreElt) {
        if (objingElt instanceof BindableInstance){
        
            EList<?> listProperty =  ecoreElt.getRedefinedProperties();
        
            if ((listProperty != null) && (listProperty.size() > 0) ){
                Property represented = (Property) listProperty.get(0);
                Object base = ReverseProperties.getInstance().getMappedElement(represented);
        
                if ((base instanceof ModelElement) && (!base.equals(objingElt)))
                    ((BindableInstance) objingElt).setRepresentedFeature((ModelElement) base);
                else if (base instanceof List ){
                    ((BindableInstance) objingElt).setRepresentedFeature(((List<ModelElement>) base).get(0));
                }
            }
        }
    }

    @objid ("4517333a-4357-435e-a890-3d73358b57a5")
    private static void setIsConstant(Instance objingElt, Property ecoreElt) {
        objingElt.setIsConstant(ObjingEAnnotation.isConstant(ecoreElt));
    }

    @objid ("706001b8-8aff-4b81-b035-5a261de59557")
    public static void setMultiMax(Instance objingElt, Property ecoreElt) {
        String value =  ObjingEAnnotation.getMultiMax(ecoreElt);
        if (value != null)
            objingElt.setMultiplicityMax(value);
    }

    @objid ("449150e3-080c-4541-bcbe-166e73844760")
    private static void setValue(Instance objingElt, Property ecoreElt) {
        String value =  ObjingEAnnotation.getValue(ecoreElt);
        if (value != null)
            objingElt.setValue(value);
    }

    @objid ("8209588f-7b5f-4483-b72a-6ae01de4a26a")
    public static void setMultiMin(Instance objingElt, Property ecoreElt) {
        String value =  ObjingEAnnotation.getMultiMin(ecoreElt);
        if (value != null)
            objingElt.setMultiplicityMin(value);
    }

    @objid ("0493ae6e-e05a-41de-9964-c7383f3105f9")
    private static void setMultiplicity(Instance objingElt, Property ecoreElt) {
        String multMin = EcoreModelNavigation.getMultiplicityMin(ecoreElt);
        String multMax = EcoreModelNavigation.getMultiplicityMax(ecoreElt);
        if (!("".equals(multMin)))
            objingElt.setMultiplicityMin(multMin);
        if (!("".equals(multMax)))
            objingElt.setMultiplicityMax(multMax);
    }

    @objid ("d696adf9-2b5c-43cf-9a6d-48b82a80fe31")
    public static void setInstance(Instance objingElt, Property ecoreElt) {
        setBase(objingElt, ecoreElt);
        setRepresentedFeature(objingElt, ecoreElt);
        setMultiplicity((Instance) objingElt, ecoreElt);
        
        if (ReverseProperties.getInstance().isRoundtripEnabled()){
        
            setIsConstant((Instance) objingElt, ecoreElt);
            setValue((Instance) objingElt, ecoreElt);
            setMultiMax((Instance) objingElt, ecoreElt);
            setMultiMin((Instance) objingElt, ecoreElt);
        }
    }

    @objid ("f48a10ce-c1a8-4f16-a37e-b1ccba77fe6e")
    public static void infoOfUnsupportedOwnedWithEMF(MObject objingOwner, ModelElement objingElement) {
        String eltName = objingElement.getName();
        String eltClassName = objingElement.getClass().getSimpleName()
                .substring(2);
        String ownerClassName = objingOwner.getClass().getSimpleName()
                .substring(2);
        XMILogs.getInstance().writelnInLog(
                Xmi.I18N.getMessage("logFile.warning.unsupportedOwnerExport",
                        eltClassName, eltName, ownerClassName));
    }

    @objid ("08f23bab-50b7-4fa4-8333-56ebdf3c5574")
    public static List<Interface> getAllProvidedInterface(final Port port) {
        List<Interface> result = new ArrayList<Interface>();
        
        NameSpace type = port.getBase();
        
        if (type != null){
            if (type instanceof Interface)
                result.add((Interface)type);
            else 
                result.addAll(getAllProvidedInterfaces(type));
        }
        return result;
    }

    @objid ("81f27378-46aa-4e80-b8c9-376f2b531f67")
    public static EnumerationLiteral getEnumerationliteral(final Enumeration enumeration, final String stringToTest) {
        for (EnumerationLiteral literal : enumeration.getValue()){
            if (literal.getName().equals(stringToTest))
                return literal;
        }
        return null;
    }

    @objid ("30c176b1-9b66-484d-94ac-544bc9a7b82e")
    public static boolean haveInterfaceRealization(final NameSpace eltToTest, final Interface inter) {
        for (InterfaceRealization realization : eltToTest.getRealized() ){
            if (realization.getImplemented().equals(inter))
                return true;
        }
        return false;
    }

    @objid ("115a042a-c566-4d8c-bb16-7263c6e54e48")
    public static boolean haveInterfaceRealizationParent(final NameSpace eltToTest, final Interface inter) {
        if (haveInterfaceRealization(eltToTest, inter))
            return true;
        else{
            for (Generalization generalization : eltToTest.getParent()){
                if (haveInterfaceRealizationParent(generalization.getSuperType(), inter))
                    return true;
            }
        }
        return false;
    }

    @objid ("62ea7048-ef57-4e26-a990-d154c51963bf")
    public static boolean isEnumerationliteral(final Enumeration enumeration, final String stringToTest) {
        for (EnumerationLiteral literal : enumeration.getValue()){
            if (literal.getName().equals(stringToTest))
                return true;
        }
        return false;
    }

    @objid ("5637fcca-04dd-4123-ba02-4c986efe5e64")
    public static boolean isNotNullOrEmpty(final String toTest) {
        return ((toTest != null) &&  (!toTest.equals("")));
    }

    @objid ("69369b48-19f7-458c-b043-7efc10813ba9")
    public static boolean isStereotyped(final ModelElement elt, final String stereotypeName) {
        for (Stereotype stereo : elt.getExtension()) {
            if (stereo.getName().equals(stereotypeName))
                return true;
        }
        return false;
    }

    @objid ("f83c3256-92c8-4da6-8b12-9a700e20d706")
    private static List<Interface> getAllProvidedInterfaces(final NameSpace parent) {
        List<Interface> result = new ArrayList<Interface>();
        
        result.addAll(getProvidedInterfaces(parent));
        
        for (Generalization generalization : parent.getParent()){
            result.addAll(getAllProvidedInterfaces( generalization.getSuperType()));
        }
        return result;
    }

    @objid ("4691dedf-0d80-4996-a001-957a0a965328")
    private static List<Interface> getAllRequiredInterfaces(final NameSpace parent) {
        List<Interface> result = new ArrayList<Interface>();
        
        result.addAll(getRequiredInterfaces(parent));
        
        for (Generalization generalization : parent.getParent()){
            result.addAll(getAllRequiredInterfaces( generalization.getSuperType()));
        }
        return result;
    }

    @objid ("2bb97df0-eefb-49fe-acf2-c461d3f94c67")
    private static List<Interface> getProvidedInterfaces(final NameSpace parent) {
        List<Interface> result = new ArrayList<Interface>();
        
        for (InterfaceRealization interfaceRealization : parent.getRealized()){
            result.add(interfaceRealization.getImplemented());
        }
        return result;
    }

    @objid ("ff6cb27f-08ed-4b62-a673-7e9a22c3d06f")
    private static List<Interface> getRequiredInterfaces(final NameSpace parent) {
        List<Interface> result = new ArrayList<Interface>();
        
        for (Dependency dependency : parent.getDependsOnDependency()){
            if ((dependency instanceof Usage)
                    && (dependency.getDependsOn() instanceof Interface))
                result.add((Interface)dependency.getDependsOn());
        }
        return result;
    }

    @objid ("82195737-e4a2-45c3-bcab-114f0228042a")
    public static ModelElement searchElement(org.eclipse.uml2.uml.Element ecoreElt) {
        String ecoreId = ObjingEAnnotation.getEcoreId(ecoreElt);
        if ((ecoreId != null) && (!ecoreId.equals(""))){
            List<ModelElement> modelElts =  new ArrayList<>();
            modelElts.addAll(Modelio.getInstance().getModelingSession().findByClass(ModelElement.class));
            for (ModelElement modelElt : modelElts){
                for (TaggedValue tag : modelElt.getTag()){
                    if (tag.getDefinition().getName().equals(IModelerModuleTagTypes.MODELELEMENT_ECOREID) &&
                            (tag.getQualifier() != null ) &&
                            tag.getQualifier().getValue().equals(ecoreId)){
        
                        TotalImportMap.getInstance().put(ecoreElt, modelElt);
                        return modelElt;
        
                    }
        
                }
            }
        
        }
        return null;
    }

    @objid ("52b765df-bc08-4781-8e94-d931e33cb7f5")
    public static boolean haveInstanceValue(ModelElement elt) {
        for (Dependency dep: elt.getDependsOnDependency()){
            if (dep.isStereotyped("ModelerModule", IModelerModuleStereotypes.UML2INSTANCEVALUE))
                return true;
        }
        return false;
    }

    @objid ("7ce22ed6-7592-4ce2-8ccd-38a4981a7818")
    public static Instance getInstanceValue(ModelElement elt) {
        for (Dependency dep: elt.getDependsOnDependency()){
            if (dep.isStereotyped("ModelerModule", IModelerModuleStereotypes.UML2INSTANCEVALUE) 
                    && (dep.getDependsOn() instanceof Instance))
                return (Instance) dep.getDependsOn();
        }
        return null;
    }

    @objid ("eac3a8b9-304b-4879-bcdd-fbea1f4f0101")
    public static boolean isValidConnector(Link link) {
        MObject firstOwner = null;
        
        for (LinkEnd connectorEnd : link.getLinkEnd()){
            MObject temp = getBindableInstanceOwner(connectorEnd.getOwner());
        
            if (firstOwner == null){
                firstOwner = temp;
            }else {
                if (firstOwner.equals(temp)){
                    return (firstOwner instanceof GeneralClass) 
                            || (firstOwner instanceof Collaboration);
                }
                else
                    return false;
            }
        }
        return false;
    }

    @objid ("7afde775-5c38-402a-b4e0-768540db16b7")
    public static boolean isValidLink(Link link) {
        for (LinkEnd connectorEnd : link.getLinkEnd()){
            MObject temp = getBindableInstanceOwner(connectorEnd.getOwner());
        
            if ((temp != null) && (temp instanceof Package)){
                return true;
            }
        }
        return false;
    }

    @objid ("cc895c58-c0fb-491d-aa53-6318503fddb5")
    public static MObject getConnectorOwner(Link connector) {
        MObject firstOwner = null;
        MObject secondOwner = null;
        
        for (LinkEnd connectorEnd : connector.getLinkEnd()){
            secondOwner = getBindableInstanceOwner(connectorEnd.getOwner());
        
            if (firstOwner == null){
                firstOwner = secondOwner;
            }else {
                if (!(firstOwner.equals(secondOwner)) 
                        || ((!(secondOwner instanceof GeneralClass) )
                                && (!(secondOwner instanceof Collaboration)))){
        
                    return null;
                }
            }
        }
        return secondOwner;
    }

    @objid ("2459231b-515e-42fa-a243-58fbda9563c3")
    public static Package getLinkOwner(Link link) {
        MObject owner = null;
        for (LinkEnd connectorEnd : link.getLinkEnd()){
            owner = connectorEnd.getOwner().getCompositionOwner();
        
            if ((owner == null) || (!(owner instanceof Package))){
                return null;
            }
        }
        return (Package) owner;
    }

    @objid ("3fc0a343-58d2-4d8d-93aa-bfbf8dd87af0")
    public static List<InteractionFragment> getOrderedFragments(Interaction param) {
        List<InteractionFragment> unsorted = new ArrayList<InteractionFragment>(param.getFragment());
        List<InteractionFragment> result = new ArrayList<InteractionFragment>();
        InteractionFragment temp = null;
        
        while (unsorted.size() > 0){
            temp = unsorted.get(0);
            
            for (InteractionFragment tested : unsorted){
                if (temp.getLineNumber() > tested.getLineNumber()) {
                    temp = tested;
                }
            }
           
            unsorted.remove(temp);
            result.add(temp);
        }
        return result;
    }

}
