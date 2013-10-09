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
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
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
import org.modelio.metamodel.uml.statik.NaryAssociation;
import org.modelio.metamodel.uml.statik.NaryAssociationEnd;
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
@objid ("65755115-8c3a-4b4d-a44e-a58ede4928aa")
public abstract class ObjingModelNavigation {
    @objid ("3da634df-a3b7-407e-85e1-7e3490d7da50")
    public static final String OBJING_NULL_VALUE = "null";

    @objid ("e08db8db-6896-4403-8dae-60d5a96146c4")
    public static final String OBJING_UNLIMITED_VALUE = "*";

    @objid ("3a1ec330-84b7-4cc2-81c3-2c16e00c69c4")
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

    @objid ("a4ca84ee-1352-4f80-8996-62477072015d")
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

    @objid ("d53f9275-6758-4e26-8c0b-429a95af2c5f")
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

    @objid ("0c487eef-67dd-411e-9ce5-fb8df7a9752c")
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

    @objid ("ad944615-3674-434f-9c3a-573023c63e5d")
    private static String getSimpleName(String namespace) {
        int index = namespace.lastIndexOf(".");
        return namespace.substring(index + 1, namespace.length());
    }

    @objid ("9db30eb1-0476-494d-8106-2939fce1d200")
    public static boolean isCreate(Operation operation) {
        return isStereotyped(operation, Xmi.I18N
                .getString("objing.java.stereotype.constructor"));
    }

    @objid ("a6161e41-b529-41a2-b3e9-80f874488c10")
    public static boolean isDestroy(Operation operation) {
        return isStereotyped(operation, Xmi.I18N
                .getString("objing.java.stereotype.destructor"));
    }

    @objid ("62ea6179-0a0a-4335-81b6-f7e630ec562a")
    public static Operation getOwnerOperation(Parameter parameter) {
        Operation operation = parameter.getComposed();
        if (operation == null)
            operation = parameter.getReturned();
        return operation;
    }

    @objid ("9ab2b55f-42e9-472a-9274-2dfc7faffd74")
    public static boolean isReturnParameter(Parameter parameter) {
        if (parameter != null)
            if (parameter.getReturned() != null)
                return true;
        return false;
    }

    @objid ("d0ecbbb5-962f-44bb-831b-f8f5a94c03aa")
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

    @objid ("a8cf5268-e415-4b7f-8bf1-fcf2b2d3762a")
    public static boolean isIsClassAssociation(final Association assoc) {
        return  (assoc.getLinkToClass() != null);
    }

    @objid ("e6e37e08-6c08-4dfa-9bea-d8d1538e9040")
    public static boolean isIsClassAssociation(final NaryAssociation assoc) {
        return  (assoc.getLinkToClass() != null);
    }

    @objid ("bcb9ee3e-0630-4626-9e25-c28ca1ff9f16")
    public static boolean isIsClassAssociation(final Class classe) {
        return (classe.getLinkToAssociation() != null);
    }

    @objid ("e7659d10-8dd8-4b69-9a28-931b44279357")
    public static boolean isBinary(Association assoc) {
        if (assoc != null) {
            List<AssociationEnd> memberEnds = assoc.getEnd();
            if (memberEnds != null && memberEnds.size() == 2)
                return true;
        }
        return false;
    }

    @objid ("4848537f-c3de-4092-870b-3fe9378e03b8")
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

    @objid ("f1105ba7-aba0-4354-a680-e0ba072ce7bc")
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

    @objid ("f5e122f8-8e23-4d84-a2f5-82215b88eefc")
    public static void infoOfUnsupportedOwnedWithEMF(MObject objingOwner, ModelElement objingElement, org.eclipse.uml2.uml.Element ecoreElt) {
        infoOfUnsupportedOwnedWithEMF(objingOwner,objingElement);
        if (ecoreElt != null)
            ecoreElt.destroy();
    }

    @objid ("142221e0-99bc-49e3-ab16-49ef9d759957")
    public static Stereotype getStereotype(MClass metaclass, String stereotypeName) {
        return Modelio.getInstance().getModelingSession()
                .getMetamodelExtensions().getStereotype( stereotypeName, metaclass);
    }

    @objid ("a11b676e-4511-4f46-af0b-3b33b4650ac4")
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

    @objid ("5746e791-a246-4ce0-a760-6951f6f2de51")
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

    @objid ("7fce7eb1-879b-4d09-83f2-2b22ec9e5b81")
    public static Message getMessage(MessageEnd end) {
        Message message = end.getSentMessage();
        if (message == null)
            message = end.getReceivedMessage();
        return message;
    }

    @objid ("74dc7d7f-877d-4e79-88de-0f8bd5eb29a8")
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

    @objid ("babd0b71-ed3b-40a5-9ddd-c212970adbc1")
    public static Boolean IsInstanceOwner(BindableInstance bindableInstance) {
        MObject owner = bindableInstance.getCompositionOwner();
        while ((owner != null) && (owner instanceof BindableInstance)){    
            bindableInstance = (BindableInstance) owner;
            owner = bindableInstance.getCompositionOwner();
        }
        return (owner instanceof Instance);
    }

    @objid ("6cf3ba23-35ed-4492-beee-16a1fdbc106b")
    public static MObject getBindableInstanceOwner(Element instance) {
        MObject owner = instance.getCompositionOwner();
        while ((owner != null) && (owner instanceof BindableInstance)){    
            owner = owner.getCompositionOwner();
        }
        return owner;
    }

    @objid ("b4f6e982-1e22-4912-a621-19be82bcabd7")
    public static MObject getLinkEndOwner(LinkEnd linkEnd) {
        return getBindableInstanceOwner(linkEnd.getLink());
    }

    @objid ("59aa4181-7a28-41e9-941a-6922b3db8089")
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

    @objid ("e93dc2cf-1384-47b2-8d60-bb98c42731e1")
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

    @objid ("65bcdd3d-365b-4de4-9f50-01b9de9ced87")
    public static boolean isMergeNode(DecisionMergeNode node) {
        int incomings = node.getIncoming().size();
        int outgoings = node.getOutgoing().size();
        
        if (incomings > 1 && outgoings <= 1)
            return true;
        else
            return false;
    }

    @objid ("42bdbb93-fa54-4329-b292-207300cd9e2e")
    public static boolean isDecisionNode(DecisionMergeNode node) {
        if (node.getIncoming().size() <= 1)
            return true;
        else
            return false;
    }

    @objid ("a01050de-8865-425a-88c5-bd72a8cf2d70")
    public static boolean isJoinNode(ForkJoinNode node) {
        int incomings = node.getIncoming().size();
        int outgoings = node.getOutgoing().size();
        
        if (incomings > 1 && outgoings <= 1)
            return true;
        else
            return false;
    }

    @objid ("e6fcdbc5-533e-4091-963b-3f033fcf7136")
    public static boolean isForkNode(ForkJoinNode node) {
        if (node.getIncoming().size() <= 1)
            return true;
        else
            return false;
    }

    @objid ("46474681-b47c-43c9-af5b-eb2095ef60cb")
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

    @objid ("96d74415-7e5c-4b8d-835e-dbb8c312e59e")
    public static boolean isJunctionState(StateVertex state) {
        int incomings = state.getIncoming().size();
        int outgoings = state.getOutGoing().size();
        
        if (incomings > 1 && outgoings <= 1)
            return true;
        return false;
    }

    @objid ("ad531f63-31fd-4e2e-93d4-8fea4b3dc01a")
    public static boolean isChoiceState(StateVertex state) {
        if (state.getIncoming().size() <= 1)
            return true;
        return false;
    }

    @objid ("ef279376-3127-45fe-ac4b-fc7f17d1632f")
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

    @objid ("c1b7243d-6140-4912-9c51-b0aaa0bd68fe")
    public static StateMachine getOwnerStateMachine(State state) {
        StateMachine sm = state.getSubMachine();
        if (sm == null)
            sm = getOwnerStateMachine(state.getParent());
        return sm;
    }

    @objid ("7132f070-fc1d-4b45-b186-8bfc8f10eeb0")
    public static StateMachine getOwnerStateMachine(Region region) {
        StateMachine sm = region.getRepresented();
        if (sm == null)
            sm = getOwnerStateMachine(region.getParent());
        return sm;
    }

    @objid ("d10cdc3a-183d-487f-af7b-45d61a92f9b3")
    public static Package getNearestPackage(Element element) {
        MObject newOwner = element.getCompositionOwner();
        while (!(newOwner instanceof Package) ){
            newOwner = newOwner.getCompositionOwner();
        }
        return (Package) newOwner;
    }

    @objid ("c6f31a9a-42b1-459b-a027-8fb3322e62a8")
    public static boolean isOwnedByActor(final Association assoc) {
        for (AssociationEnd assocEnd : assoc.getEnd()){
            if (!(assocEnd.getOwner() instanceof Actor)){
                return false;
            }
        }
        return true;
    }

    @objid ("2ac25a63-bee7-484c-b408-0162dd96c07b")
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

    @objid ("52e800da-dabc-471a-83ab-9e052b456650")
    public static boolean mustBeExported(MetaclassReference metaclass) {
        Profile profile =  metaclass.getOwnerProfile();
        return !(profile.getUuid().toString().equals("01ec045c-0000-3739-0000-000000000000"));
    }

    @objid ("438c1bbf-a6f3-42a3-b834-a4ec6455b0f6")
    public static boolean mustBeExported(TagType tagType) {
        if (tagType.getOwnerStereotype() != null){
            return mustBeExported(tagType.getOwnerStereotype());
        }else
            return mustBeExported(tagType.getOwnerReference());
    }

    @objid ("0c98ce56-d97f-4a0d-ba50-86edcf0f01fd")
    public static boolean mustBeExported(TaggedValue taggedValue) {
        return mustBeExported(taggedValue.getDefinition());
    }

    @objid ("0b543283-904e-4b13-9f11-2ca695003b7d")
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

    @objid ("e72bcb9e-ff01-49c5-8a3f-2e73c96db8f1")
    public static Type getType(AttributeLink attributeLink) {
        Type result = null;
        Attribute attribute  = attributeLink.getBase();
        if (attribute != null){
            attribute.getType();
        }
        return result;
    }

    @objid ("5965d833-0c3b-4821-9f88-8db31b3d06e6")
    public static BindableInstance copyAssocEndToBindableInstance(AssociationEnd initial, Property ecoreElt) {
        BindableInstance copy = Modelio.getInstance().getModelingSession().getModel().createBindableInstance();
        setInstance(copy, ecoreElt);
        copy.setOwner(initial.getOwner());
        copy.setRepresentedFeature(initial);
        return copy;
    }

    @objid ("6d5c838c-58a5-443e-b816-1b8576019a4e")
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

    @objid ("2f99517f-dedf-4073-b6fb-faba5220a5ee")
    private static void setBase(Instance objingElt, Property ecoreElt) {
        Type type =  ecoreElt.getType();
        if (type != null){
            Element base = (Element) ReverseProperties.getInstance().getMappedElement(type);
            if (base instanceof NameSpace)
                objingElt.setBase((NameSpace) base);
        }
    }

    @objid ("92b4e5b0-3551-4bed-82a3-65600b817732")
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

    @objid ("42eb4d3b-f3ef-4b9b-9ab0-cd78c83f8fab")
    private static void setIsConstant(Instance objingElt, Property ecoreElt) {
        objingElt.setIsConstant(ObjingEAnnotation.isConstant(ecoreElt));
    }

    @objid ("ce1bc0d4-1d37-4273-a227-1898e02c3ca6")
    public static void setMultiMax(Instance objingElt, Property ecoreElt) {
        String value =  ObjingEAnnotation.getMultiMax(ecoreElt);
        if (value != null)
            objingElt.setMultiplicityMax(value);
    }

    @objid ("b81064d2-0319-426f-ae17-0645682d9d12")
    private static void setValue(Instance objingElt, Property ecoreElt) {
        String value =  ObjingEAnnotation.getValue(ecoreElt);
        if (value != null)
            objingElt.setValue(value);
    }

    @objid ("45c5a827-6585-4510-b5ec-996ccb31bf12")
    public static void setMultiMin(Instance objingElt, Property ecoreElt) {
        String value =  ObjingEAnnotation.getMultiMin(ecoreElt);
        if (value != null)
            objingElt.setMultiplicityMin(value);
    }

    @objid ("111dd8c3-e7f9-4f37-9de0-b0115e8d5d57")
    private static void setMultiplicity(Instance objingElt, Property ecoreElt) {
        String multMin = EcoreModelNavigation.getMultiplicityMin(ecoreElt);
        String multMax = EcoreModelNavigation.getMultiplicityMax(ecoreElt);
        if (!("".equals(multMin)))
            objingElt.setMultiplicityMin(multMin);
        if (!("".equals(multMax)))
            objingElt.setMultiplicityMax(multMax);
    }

    @objid ("58976123-68f1-40ac-96dd-009209506006")
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

    @objid ("aefc46eb-4312-4120-8a8d-07b4067731f1")
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

    @objid ("8273dbb0-b45c-4705-bc38-59758ba2bf1f")
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

    @objid ("a7a7b698-e099-4c8d-a793-64feb35bfded")
    public static EnumerationLiteral getEnumerationliteral(final Enumeration enumeration, final String stringToTest) {
        for (EnumerationLiteral literal : enumeration.getValue()){
            if (literal.getName().equals(stringToTest))
                return literal;
        }
        return null;
    }

    @objid ("aa84ec28-d9f6-4c86-8025-455867db784d")
    public static boolean haveInterfaceRealization(final NameSpace eltToTest, final Interface inter) {
        for (InterfaceRealization realization : eltToTest.getRealized() ){
            if (realization.getImplemented().equals(inter))
                return true;
        }
        return false;
    }

    @objid ("447f9416-8dbd-4854-838a-53b718699f1b")
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

    @objid ("f5be6d39-d034-4b52-88d4-8521a4cbc42d")
    public static boolean isEnumerationliteral(final Enumeration enumeration, final String stringToTest) {
        for (EnumerationLiteral literal : enumeration.getValue()){
            if (literal.getName().equals(stringToTest))
                return true;
        }
        return false;
    }

    @objid ("6a597712-8a23-4435-acbc-69770c293134")
    public static boolean isNotNullOrEmpty(final String toTest) {
        return ((toTest != null) &&  (!toTest.equals("")));
    }

    @objid ("f4171c11-3d04-41be-b28a-b1c0933d662c")
    public static boolean isStereotyped(final ModelElement elt, final String stereotypeName) {
        for (Stereotype stereo : elt.getExtension()) {
            if (stereo.getName().equals(stereotypeName))
                return true;
        }
        return false;
    }

    @objid ("008ab18d-be0c-45f4-b639-696e17dbb6ed")
    private static List<Interface> getAllProvidedInterfaces(final NameSpace parent) {
        List<Interface> result = new ArrayList<Interface>();
        
        result.addAll(getProvidedInterfaces(parent));
        
        for (Generalization generalization : parent.getParent()){
            result.addAll(getAllProvidedInterfaces( generalization.getSuperType()));
        }
        return result;
    }

    @objid ("c647d4b0-8573-4e7b-8b13-7bcc6332c7cd")
    private static List<Interface> getAllRequiredInterfaces(final NameSpace parent) {
        List<Interface> result = new ArrayList<Interface>();
        
        result.addAll(getRequiredInterfaces(parent));
        
        for (Generalization generalization : parent.getParent()){
            result.addAll(getAllRequiredInterfaces( generalization.getSuperType()));
        }
        return result;
    }

    @objid ("ca33c5b2-53fd-4960-9710-ed4b938fc2ac")
    private static List<Interface> getProvidedInterfaces(final NameSpace parent) {
        List<Interface> result = new ArrayList<Interface>();
        
        for (InterfaceRealization interfaceRealization : parent.getRealized()){
            result.add(interfaceRealization.getImplemented());
        }
        return result;
    }

    @objid ("65ffb285-e496-469c-9571-4613e0e54cd8")
    private static List<Interface> getRequiredInterfaces(final NameSpace parent) {
        List<Interface> result = new ArrayList<Interface>();
        
        for (Dependency dependency : parent.getDependsOnDependency()){
            if ((dependency instanceof Usage)
                    && (dependency.getDependsOn() instanceof Interface))
                result.add((Interface)dependency.getDependsOn());
        }
        return result;
    }

    @objid ("6751e014-cc0e-4015-b411-cbc7fb94873d")
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

    @objid ("a6d5b58e-dc77-4c08-8949-da231cfde345")
    public static boolean haveInstanceValue(ModelElement elt) {
        for (Dependency dep: elt.getDependsOnDependency()){
            if (dep.isStereotyped("ModelerModule", IModelerModuleStereotypes.UML2INSTANCEVALUE))
                return true;
        }
        return false;
    }

    @objid ("b358c717-e6b2-48bc-9c06-b5f75ea2d1fc")
    public static Instance getInstanceValue(ModelElement elt) {
        for (Dependency dep: elt.getDependsOnDependency()){
            if (dep.isStereotyped("ModelerModule", IModelerModuleStereotypes.UML2INSTANCEVALUE) 
                    && (dep.getDependsOn() instanceof Instance))
                return (Instance) dep.getDependsOn();
        }
        return null;
    }

    @objid ("ec5c8047-8e90-4c37-8c02-346d92917624")
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

    @objid ("c4708203-df4e-4a0e-acf7-759b437fc042")
    public static boolean isValidLink(Link link) {
        for (LinkEnd connectorEnd : link.getLinkEnd()){
            MObject temp = getBindableInstanceOwner(connectorEnd.getOwner());
        
            if ((temp != null) && (temp instanceof Package)){
                return true;
            }
        }
        return false;
    }

    @objid ("f3336837-57f3-46de-8702-d6a067b309de")
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

    @objid ("d0ecba6b-51fd-47d4-bdf7-35978be1d3ff")
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

    @objid ("c3c612d0-323d-4f50-8304-40bdeddbc25d")
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

    @objid ("13678e21-6093-4b85-bed8-7a8076f553b5")
    public static boolean isIsClassAssociation(final NaryAssociationEnd assocEnd) {
        return ((assocEnd != null) && (assocEnd.getNaryAssociation().getLinkToClass() != null));
    }

    @objid ("18812e2a-fc10-4f41-a78f-e9c5b4205789")
    public static boolean isOwnedByActor(final NaryAssociation assoc) {
        int nbNoActor = 0;
        for (NaryAssociationEnd assocEnd : assoc.getNaryEnd()){
            if (assocEnd.getOwner() instanceof Actor)
                nbNoActor++;
        }
        return nbNoActor >=2 ;
    }

    @objid ("e6bc5d90-3456-4d5d-bccf-d5faf0f12e1b")
    public static boolean isIsClassAssociation(final AssociationEnd assocEnd) {
        return ((assocEnd != null) && (assocEnd.getAssociation().getLinkToClass() != null));
    }

}
