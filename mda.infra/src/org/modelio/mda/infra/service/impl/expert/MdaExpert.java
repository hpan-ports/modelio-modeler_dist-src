/* 
 * Copyright 2013-2015 Modeliosoft
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


package org.modelio.mda.infra.service.impl.expert;

import java.util.HashMap;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IMdaExpert;
import org.modelio.mda.infra.service.IModuleRegistry;
import org.modelio.mda.infra.service.IRTModule;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MExpert;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("4352eb8a-a9e9-4aa5-bbbf-7c46202a7484")
public class MdaExpert implements IMdaExpert {
    @objid ("d02ea203-7cad-4a3f-9406-fa4ee4aed996")
    private final MdaExpertRegistry LINK_REGISTRY;

    @objid ("00964c31-d071-4f34-9457-45b11a1e0b0f")
    public MdaExpert(IModuleRegistry iModuleRegistry) {
        this.LINK_REGISTRY = new MdaExpertRegistry(iModuleRegistry);
    }

    @objid ("4ef540ef-e23c-4b4b-82ae-79d35e673d10")
    public boolean canSource(Stereotype linkStereotype, MClass linkMetaclass, MClass from) {
        IMdaExpert stereotypeExpert = this.LINK_REGISTRY.getExpert(linkStereotype);
        MExpert linkExpert = linkMetaclass.getMetamodel().getMExpert();
        return (stereotypeExpert == null || stereotypeExpert.canSource(linkStereotype, linkMetaclass, from)) && linkExpert.canSource(linkMetaclass, from);
    }

    @objid ("d8ceb6b6-aa9c-435b-a4f7-99ea00f6c83f")
    @Override
    public boolean canSource(Stereotype linkStereotype, MObject linkMetaclass, MObject from) {
        IMdaExpert stereotypeExpert = this.LINK_REGISTRY.getExpert(linkStereotype);
        MExpert linkExpert = linkMetaclass.getMClass().getMetamodel().getMExpert();
        return (stereotypeExpert == null || stereotypeExpert.canSource(linkStereotype, linkMetaclass, from)) && linkExpert.canSource(linkMetaclass, from);
    }

    @objid ("19dc97d1-d1f8-4bbd-99fb-8d3311be2d55")
    public boolean canTarget(Stereotype linkStereotype, MClass linkMetaclass, MClass to) {
        IMdaExpert stereotypeExpert = this.LINK_REGISTRY.getExpert(linkStereotype);
        MExpert linkExpert = linkMetaclass.getMetamodel().getMExpert();
        return (stereotypeExpert == null || stereotypeExpert.canTarget(linkStereotype, linkMetaclass, to)) && linkExpert.canTarget(linkMetaclass, to);
    }

    @objid ("49267cd8-47bb-4161-b1fb-f941c66325b1")
    @Override
    public boolean canTarget(Stereotype linkStereotype, MObject linkMetaclass, MObject to) {
        IMdaExpert stereotypeExpert = this.LINK_REGISTRY.getExpert(linkStereotype);
        MExpert linkExpert = linkMetaclass.getMClass().getMetamodel().getMExpert();
        return (stereotypeExpert == null || stereotypeExpert.canTarget(linkStereotype, linkMetaclass, to)) && linkExpert.canTarget(linkMetaclass, to);
    }

    @objid ("b37cca6d-5273-4626-9fb8-a7da9037531c")
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, MObject from, MObject to) {
        // Check MDA expert
        IMdaExpert expert = this.LINK_REGISTRY.getExpert(linkStereotype);
        if (expert != null && !expert.canLink(linkStereotype, linkMetaclass, from, to)) {
            return false;
        }
        
                // Check metaclass expert
                MExpert linkExpert = linkMetaclass.getMetamodel().getMExpert();
        return linkExpert.canLink(linkMetaclass, from, to);
    }

    @objid ("38815507-470d-4b2c-8499-cea3b40fdcb5")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, MClass fromMetaclass, MClass toMetaclass) {
        if (linkStereotype != null) {
            // Check MDA expert
            IMdaExpert expert = this.LINK_REGISTRY.getExpert(linkStereotype);
            if (expert != null && !expert.canLink(linkStereotype, linkMetaclass, fromMetaclass, toMetaclass)) {
                return false;
            }
        }
        
        // Check metaclass expert
        MExpert linkExpert = linkMetaclass.getMetamodel().getMExpert();
        return linkExpert.canLink(linkMetaclass, fromMetaclass, toMetaclass);
    }

    /**
     * Registry to get the expert for a given:
     * <ul>
     * <li>parent element metaclass.</li>
     * <li>link metaclass.</li>
     * <li>stereotype.</li>
     * <li>mobject</li>
     * </ul>
     * Custom experts must implements IMdaExpert and be registered in the <tt>initialize()</tt> method.
     * <p>
     * Stereotype creation experts can be added with {@linkplain #registerExpert(Stereotype, IMdaExpert)} and removed with
     * {@linkplain #unregisterExpert(Stereotype)}.
     */
    @objid ("524b6f32-7225-4ea7-9cef-2aec207cf0fa")
    class MdaExpertRegistry {
        @objid ("1aa7ee72-46df-493a-8a80-5813ae222c3a")
        private final Map<String, IMdaExpert> EXPERTS = new HashMap<>();

        @objid ("54b098d7-5af4-4c53-bf23-c864837320f5")
        private IModuleRegistry moduleRegistry;

        /**
         * Get the creation expert for the given stereotype.
         * @param el a stereotype.
         * @return the matching creation expert or <code>null</code>
         */
        @objid ("02b3342e-f6e4-4fb4-8442-8c52e702c2a9")
        public IMdaExpert getExpert(final Stereotype el) {
            if (el == null) {
                return null;
            }
            
            // Go for the cache
            String key = el.getBaseClassName() + "." + el.getName();
            IMdaExpert expert = this.EXPERTS.get(key);
            if (expert == null) {
                // Look for an expert in the module registry
                ModuleComponent moduleComponent = el.getModule();
                if (moduleComponent != null) {
                    for (IRTModule module : this.moduleRegistry.getStartedModules()) {
                        if (moduleComponent.equals(module.getModel())) {
                            expert = module.getIModule().getMdaExpert(el);
                            if (expert != null) {
                                break;
                            }
                        }
                    }
                }
            
                // Store expert in cache
                this.EXPERTS.put(key, expert);
            }
            return expert;
        }

        /**
         * Register a stereotyped element creation expert.
         * @param ste The stereotype
         * @param expert The creation expert.
         */
        @objid ("5b9a2d3b-f596-4a36-bb9d-92829df6dd9f")
        public void registerLinkExpert(final Stereotype ste, final IMdaExpert expert) {
            this.EXPERTS.put(ste.getBaseClassName() + "." + ste.getName(), expert);
        }

        /**
         * Remove the creation expert registered for the given stereotype.
         * @param ste The stereotype to forget.
         */
        @objid ("3211a091-b5a7-4343-b7bc-842e35d5539c")
        public void unregisterLinkExpert(final Stereotype ste) {
            this.EXPERTS.remove(ste);
        }

        /**
         * This class has no instances.
         * @param metamodel
         * @param iModuleRegistry
         */
        @objid ("cf802fb8-6abd-49d5-bdab-4e58b4057b51")
        public MdaExpertRegistry(IModuleRegistry moduleRegistry) {
            this.moduleRegistry = moduleRegistry;
            
            this.EXPERTS.put(Dependency.MNAME + "." + "+influence", new PositiveInfluenceCreationExpert());
            this.EXPERTS.put(Dependency.MNAME + "." + "-influence", new NegativeInfluenceCreationExpert());
            this.EXPERTS.put(Dependency.MNAME + "." + "antonym", new AntonymCreationExpert());
            this.EXPERTS.put(Dependency.MNAME + "." + "assigned", new AssignedCreationExpert());
            this.EXPERTS.put(Dependency.MNAME + "." + "context", new ContextCreationExpert());
            this.EXPERTS.put(Dependency.MNAME + "." + "derive", new DeriveCreationExpert());
            this.EXPERTS.put(Dependency.MNAME + "." + "guarantee", new GuaranteeCreationExpert());
            this.EXPERTS.put(Dependency.MNAME + "." + "homonym", new HomonymCreationExpert());
            this.EXPERTS.put(Dependency.MNAME + "." + "implement", new ImplementCreationExpert());
            this.EXPERTS.put(Dependency.MNAME + "." + "kind-of", new KindOfCreationExpert());
            this.EXPERTS.put(Dependency.MNAME + "." + "measure", new MeasureCreationExpert());
            this.EXPERTS.put(Dependency.MNAME + "." + "part", new PartCreationExpert());
            this.EXPERTS.put(Dependency.MNAME + "." + "refers", new RefersCreationExpert());
            this.EXPERTS.put(Dependency.MNAME + "." + "refine", new RefineCreationExpert());
            this.EXPERTS.put(Dependency.MNAME + "." + "related", new RelatedCreationExpert());
            this.EXPERTS.put(Dependency.MNAME + "." + "satisfy", new SatisfyCreationExpert());
            this.EXPERTS.put(Dependency.MNAME + "." + "synonym", new SynonymCreationExpert());
            this.EXPERTS.put(Dependency.MNAME + "." + "verify", new VerifyCreationExpert());
        }

    }

}
