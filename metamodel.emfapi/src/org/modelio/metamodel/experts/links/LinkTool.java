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
                                    

package org.modelio.metamodel.experts.links;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.experts.links.impl.AntonymCreationExpert;
import org.modelio.metamodel.experts.links.impl.AssignedCreationExpert;
import org.modelio.metamodel.experts.links.impl.BindingCreationExpert;
import org.modelio.metamodel.experts.links.impl.BpmnDataAssociationCreationExpert;
import org.modelio.metamodel.experts.links.impl.BpmnMessageFlowCreationExpert;
import org.modelio.metamodel.experts.links.impl.BpmnSequenceFlowCreationExpert;
import org.modelio.metamodel.experts.links.impl.ClassAssociationCreationExpert;
import org.modelio.metamodel.experts.links.impl.ContextCreationExpert;
import org.modelio.metamodel.experts.links.impl.DefaultLinkExpert;
import org.modelio.metamodel.experts.links.impl.DeriveCreationExpert;
import org.modelio.metamodel.experts.links.impl.GuaranteeCreationExpert;
import org.modelio.metamodel.experts.links.impl.HomonymCreationExpert;
import org.modelio.metamodel.experts.links.impl.ImplementCreationExpert;
import org.modelio.metamodel.experts.links.impl.KindOfCreationExpert;
import org.modelio.metamodel.experts.links.impl.MeasureCreationExpert;
import org.modelio.metamodel.experts.links.impl.NegativeInfluenceCreationExpert;
import org.modelio.metamodel.experts.links.impl.PartCreationExpert;
import org.modelio.metamodel.experts.links.impl.PositiveInfluenceCreationExpert;
import org.modelio.metamodel.experts.links.impl.RefersCreationExpert;
import org.modelio.metamodel.experts.links.impl.RefineCreationExpert;
import org.modelio.metamodel.experts.links.impl.RelatedCreationExpert;
import org.modelio.metamodel.experts.links.impl.SatisfyCreationExpert;
import org.modelio.metamodel.experts.links.impl.SynonymCreationExpert;
import org.modelio.metamodel.experts.links.impl.TemplateBindingCreationExpert;
import org.modelio.metamodel.experts.links.impl.VerifyCreationExpert;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.Binding;
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.metamodel.uml.statik.TemplateBinding;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("0000fac8-de02-1097-bcec-001ec947cd2a")
public class LinkTool implements ILinkTool {
    @objid ("005875aa-d07d-1098-bcec-001ec947cd2a")
    private final LinkExpertRegistry REGISTRY = new LinkExpertRegistry();

    @objid ("000103ce-de02-1097-bcec-001ec947cd2a")
    @Override
    public boolean canLink(MClass link, MClass from, MClass to, MClass owner) {
        return this.REGISTRY.getExpert(link).canLink(link, from, to, owner);
    }

    @objid ("0001bee0-de02-1097-bcec-001ec947cd2a")
    @Override
    public boolean canLink(MObject link, MObject from, MObject to, MObject owner) {
        for (ILinkExpert expert : this.REGISTRY.getExperts(link)) {
            if (expert.canLink(link, from, to, owner) == false) {
                return false;
            }
        }
        return true;
    }

    @objid ("0001f356-de02-1097-bcec-001ec947cd2a")
    @Override
    public boolean canSource(MClass link, MClass from) {
        return this.REGISTRY.getExpert(link).canSource(link, from);
    }

    @objid ("000227ae-de02-1097-bcec-001ec947cd2a")
    @Override
    public boolean canSource(MObject link, MObject from) {
        for (ILinkExpert expert : this.REGISTRY.getExperts(link)) {
            if (expert.canSource(link, from) == false) {
                return false;
            }
        }
        return true;
    }

    @objid ("00025698-de02-1097-bcec-001ec947cd2a")
    @Override
    public boolean canTarget(MClass link, MClass to) {
        return this.REGISTRY.getExpert(link).canTarget(link, to);
    }

    @objid ("000287bc-de02-1097-bcec-001ec947cd2a")
    @Override
    public boolean canTarget(MObject link, MObject to) {
        for (ILinkExpert expert : this.REGISTRY.getExperts(link)) {
            if (expert.canTarget(link, to) == false) {
                return false;
            }
        }
        return true;
    }

    @objid ("0002b732-de02-1097-bcec-001ec947cd2a")
    @Override
    public boolean isLink(MClass metaclass) {
        switch (metaclass.getName()) {
        case "ActivityEdge":
            return true;
        case "AssociationEnd":
            return true;
        case "Association":
            return true;
        case "Binding":
            return true;
        case "BpmnDataAssociation":
            return true;
        case "BpmnMessageFlow":
            return true;
        case "BpmnSequenceFlow":
            return true;
        case "CommunicationChannel":
            return true;
        case "ControlFlow":
            return true;
        case "DataFlow":
            return true;
        case "Dependency":
            return true;
        case "ElementImport":
            return true;
        case "ExceptionHandler":
            return true;
        case "Generalization":
            return true;
        case "InformationFlow":
            return true;
        case "InterfaceRealization":
            return true;
        case "Link":
            return true;
        case "LinkEnd":
            return true;
        case "Manifestation":
            return true;
        case "Message":
            return true;
        case "NamespaceUse":
            return true;
        case "PackageImport":
            return true;
        case "PackageMerge":
            return true;
        case "RaisedException":
            return true;
        case "TemplateBinding":
            return true;
        case "Transition":
            return true;
        case "UseCaseDependency":
            return true;
        default:
            return false;
        }
    }

    /**
     * Register a stereotyped element creation expert.
     * @param ste The stereotype
     * @param expert The creation expert.
     */
    @objid ("0a547943-a681-489b-a318-0d9f71225c98")
    @Override
    public void registerExpert(final Stereotype ste, final ILinkExpert expert) {
        this.REGISTRY.registerExpert(ste, expert);
    }

    /**
     * Remove the creation expert registered for the given stereotype.
     * @param ste The stereotype to forget.
     */
    @objid ("cfae5a3f-dd86-490c-b46e-da9c31f11f99")
    @Override
    public void unregisterExpert(final Stereotype ste) {
        this.REGISTRY.unregisterExpert(ste);
    }

    @objid ("889323b1-0bd4-43da-adec-249a2846de30")
    @Override
    public boolean canLink(Stereotype stereotypedLink, MClass link, MClass from, MClass to, MClass owner) {
        for (ILinkExpert expert : this.REGISTRY.getExperts(stereotypedLink)) {
            if (!expert.canLink(link, from, to, owner)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Registry to get the expert for a given:
     * <ul>
     * <li>parent element metaclass.</li>
     * <li>link metaclass.</li>
     * <li>stereotype.</li>
     * <li>mobject</li>
     * </ul>
     * Custom experts must implements ILinkExpert and be registered in the <tt>initialize()</tt> method.
     * <p>
     * Stereotype creation experts can be added with {@linkplain #registerExpert(Stereotype, ILinkExpert)} and removed with
     * {@linkplain #removeStereotypeExpert(Stereotype)}.
     */
    @objid ("0002d58c-de02-1097-bcec-001ec947cd2a")
    public class LinkExpertRegistry {
        @objid ("000311fa-de02-1097-bcec-001ec947cd2a")
        private final Map<String, ILinkExpert> STEREOTYPE_EXPERTS = new HashMap<>();

        @objid ("0002e7e8-de02-1097-bcec-001ec947cd2a")
        private final Map<MClass, ILinkExpert> EXPERTS = new HashMap<>();

        @objid ("0059ee76-d07d-1098-bcec-001ec947cd2a")
        private final ILinkExpert DEFAULT_EXPERT = new DefaultLinkExpert();

        /**
         * Get the creation expert for the given element.
         * @param metaclass a metamodel class.
         * @return the matching creation expert (never returns <code>null</code>)
         */
        @objid ("00033572-de02-1097-bcec-001ec947cd2a")
        public ILinkExpert getExpert(final MClass metaclass) {
            ILinkExpert ret = this.EXPERTS.get(metaclass);
            if (ret == null) {
                // No specific expert, return the default one
                ret = this.DEFAULT_EXPERT;
            }
            return ret;
        }

        /**
         * Get the creation expert for the given stereotype.
         * @param el a stereotype.
         * @return the matching creation expert or <code>null</code>
         */
        @objid ("00036ea2-de02-1097-bcec-001ec947cd2a")
        public ILinkExpert getExpert(final Stereotype el) {
            return this.STEREOTYPE_EXPERTS.get(el);
        }

        @objid ("0003a20a-de02-1097-bcec-001ec947cd2a")
        public List<ILinkExpert> getExperts(final MObject mObject) {
            List<ILinkExpert> results = new ArrayList<>();
            
            if (mObject instanceof Stereotype) {
                Stereotype ste = (Stereotype) mObject;
            
                // base expert
                MClass metaclass = Metamodel.getMClass(ste.getBaseClassName());
                results.add(getExpert(metaclass));
            
                final ILinkExpert steExpert = this.getExpert(ste);
                if (steExpert != null) {
                    results.add(steExpert);
                }
            } else {
                // base expert
                MClass metaclass = mObject.getMClass();
                results.add(getExpert(metaclass));
            
                // stereotype expert
                // TODO: view points might later filter this list
                if (mObject instanceof ModelElement) {
                    final ModelElement modelElement = (ModelElement) mObject;
                    for (Stereotype ste : modelElement.getExtension()) {
                        final ILinkExpert steExpert = this.getExpert(ste);
                        if (steExpert != null) {
                            results.add(steExpert);
                        }
                    }
                }
            }
            return results;
        }

        /**
         * Register a stereotyped element creation expert.
         * @param ste The stereotype
         * @param expert The creation expert.
         */
        @objid ("0003d798-de02-1097-bcec-001ec947cd2a")
        public void registerExpert(final Stereotype ste, final ILinkExpert expert) {
            this.STEREOTYPE_EXPERTS.put(ste.getBaseClassName() + "." + ste.getName(), expert);
        }

        /**
         * Remove the creation expert registered for the given stereotype.
         * @param ste The stereotype to forget.
         */
        @objid ("00040d80-de02-1097-bcec-001ec947cd2a")
        public void unregisterExpert(final Stereotype ste) {
            this.STEREOTYPE_EXPERTS.remove(ste);
        }

        /**
         * This class has no instances.
         */
        @objid ("00043486-de02-1097-bcec-001ec947cd2a")
        public LinkExpertRegistry() {
            // Init experts
            this.EXPERTS.put(Metamodel.getMClass(Binding.class), new BindingCreationExpert());
            this.EXPERTS.put(Metamodel.getMClass(BpmnDataAssociation.class), new BpmnDataAssociationCreationExpert());
            this.EXPERTS.put(Metamodel.getMClass(BpmnMessageFlow.class), new BpmnMessageFlowCreationExpert());
            this.EXPERTS.put(Metamodel.getMClass(BpmnSequenceFlow.class), new BpmnSequenceFlowCreationExpert());
            this.EXPERTS.put(Metamodel.getMClass(TemplateBinding.class), new TemplateBindingCreationExpert());
            this.EXPERTS.put(Metamodel.getMClass(ClassAssociation.class), new ClassAssociationCreationExpert());
            
            MClass dependency = Metamodel.getMClass(Dependency.class);
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "+influence", new PositiveInfluenceCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "-influence", new NegativeInfluenceCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "antonym",    new AntonymCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "assigned",   new AssignedCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "context",    new ContextCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "derive",     new DeriveCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "guarantee",  new GuaranteeCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "homonym",    new HomonymCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "implement",  new ImplementCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "kind-of",    new KindOfCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "measure",    new MeasureCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "part",       new PartCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "refers",     new RefersCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "refine",     new RefineCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "related",    new RelatedCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "satisfy",    new SatisfyCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "synonym",    new SynonymCreationExpert());
            this.STEREOTYPE_EXPERTS.put(dependency.getName() + "." + "verify",     new VerifyCreationExpert());
        }

    }

}
