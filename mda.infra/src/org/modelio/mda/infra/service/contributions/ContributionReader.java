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


package org.modelio.mda.infra.service.contributions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.modelio.api.module.commands.CommandScope;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Handler.Jxbv2HParameter;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Scope;
import org.modelio.mda.infra.plugin.MdaInfra;
import org.modelio.mda.infra.service.IRTModule;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MMetamodel;

/**
 * Module GUI contributions read helper.
 */
@objid ("092e5da3-4271-416c-b6f8-e7da11049b8c")
public class ContributionReader {
    @objid ("439d3394-436f-446e-9595-03e67df00d30")
    public static final String CONTRIB_COMMAND = "command-handler";

    @objid ("379236c8-a5b4-436e-887f-5f2bb9d53784")
    public static final String CONTRIB_WIZARD = "wizard-contributor";

    @objid ("eef4ef72-151d-4f75-bd33-0c47d58b96c0")
    public static final String CONTRIB_DIAGRAMTOOL = "diagram-tool";

    @objid ("ccf1bca8-df15-43cb-bd18-709e3d50a224")
    public static final String CONTRIB_DIAGRAMCUSTOMIZER = "diagram-customizer";

    @objid ("4db4cfdc-4be3-4fc8-af4e-40e22eb44f3b")
    private static final String HANDLER_PROVIDER_EXTENSION_ID = "org.modelio.api.module.handlercontributor";

    @objid ("4cd12673-d3c0-4405-b39e-99a0646549af")
    private static final String HANDLER_PROVIDER_VERB = "verb";

    @objid ("84bfd6d5-4d6a-4bbf-a105-5323a43ba1d6")
    private static final String HANDLER_PROVIDER_CLASS = "class";

    @objid ("e6553363-8ea2-40a9-ac2a-73e59abc773d")
    private IRTModule module;

    /**
     * @param module the module being loaded.
     */
    @objid ("c05fee6a-cbac-4f81-a2ce-42b2bc598a42")
    public ContributionReader(IRTModule module) {
        this.module = module;
    }

    /**
     * Reads {@link Jxbv2Scope} as {@link CommandScope}.
     * @param scopes the scopes to read
     * @return the read scopes.
     */
    @objid ("7ea43973-8210-470a-b429-aec6f852c33b")
    public List<CommandScope> readScopes(List<Jxbv2Scope> scopes) {
        MMetamodel metamodel = this.module.getGModule().getProject().getSession().getMetamodel();
        
        List<CommandScope> targetScopes = new ArrayList<>();
        for (Jxbv2Scope scope : scopes) {
            MClass mClass = metamodel.getMClass(scope.getMetaclass());
            if (mClass != null) {
                Stereotype st = readStereotypeSpec(mClass, scope.getStereotype());
                targetScopes.add(new CommandScope(mClass, st));
            }
        
        }
        return targetScopes;
    }

    /**
     * Read and find the stereotype from its specification.
     * <p>
     * The stereotype specification may have the following formats:<ul>
     * <li> <i>stereotype name</i>
     * <li> <i>module name<b>#</b>stereotype name</i>
     * <li> <i>module regex<b>#</b>stereotype name</i>
     * <li> <i>module regex<b>#</b>stereotype regex</i>
     * </ul>
     * @param metaclass the metaclass to look from
     * @param stereotypeSpec the stereotype specification
     * @return the found stereotype or null.
     */
    @objid ("7d404cd8-1f50-44ab-a82d-4a4dede6e422")
    public Stereotype readStereotypeSpec(MClass metaclass, String stereotypeSpec) {
        if (stereotypeSpec == null) {
            return null;
        }
        if (stereotypeSpec.contains("#")) {
            String moduleName = stereotypeSpec.substring(0, stereotypeSpec.indexOf("#"));
            String stereotypeName = stereotypeSpec.substring(stereotypeSpec.indexOf("#") + 1, stereotypeSpec.length());
        
            return this.module.getIModule().getModelingSession().getMetamodelExtensions().getStereotype(moduleName, stereotypeName, metaclass);
        } else {
            return this.module.getIModule().getModelingSession().getMetamodelExtensions().getStereotype(stereotypeSpec, metaclass);
        }
    }

    /**
     * Instantiate a handler from a verb or a class name.
     * @param contributionType the contribution element type to look for in the extensions registry.
     * See the {@value #HANDLER_PROVIDER_EXTENSION_ID} extension point schema for valid values.
     * @param verb the verb or the class name
     * @param handlerInterface the interface the handler is expected to implement.
     * @return the found handler
     * @throws java.io.IOException if instantiation failed.
     */
    @objid ("9b7da7a4-402c-4995-b52c-9de997990b8f")
    public <T> T createHandler(String contributionType, String verb, Class<T> handlerInterface) throws IOException {
        assert (verb != null);
        
        // Look for known verbs
        IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(HANDLER_PROVIDER_EXTENSION_ID);
        for (IConfigurationElement elt : config) {
            if (elt.getName().equals(contributionType) &&
                    elt.getAttribute(HANDLER_PROVIDER_VERB).equals(verb)) {
                try {
                    @SuppressWarnings("unchecked")
                    T obj = (T)elt.createExecutableExtension(HANDLER_PROVIDER_CLASS);
        
                    if (! handlerInterface.isInstance(obj)) {
                        // should not happen
                        throw new IOException(MdaInfra.I18N.getMessage("CommandBuilder.BadVerbHandlerClass",
                                obj.getClass(),
                                handlerInterface,
                                contributionType,
                                verb));
                    }
        
                    return obj;
                } catch (CoreException e) {
                    throw new IOException(e.getLocalizedMessage(), e);
                }
            }
        }
        
        // 'verb' is not a known verb, handle it as a java class name
        try {
            return createCustomHandler(contributionType, verb, handlerInterface);
        } catch (ClassNotFoundException  e) {
            // verb is not a class name either.
            // dump all verbs and throw another exception
            if (MdaInfra.LOG.isDebugEnabled()) {
                MdaInfra.LOG.debug("'%s' verb for '%s' contribution not found. Known verbs are:", verb, contributionType );
                for (IConfigurationElement elt : config) {
                    MdaInfra.LOG.debug(" - %s '%s'", elt.getName(), elt.getAttribute(HANDLER_PROVIDER_VERB));
                }
            }
        
            String msg = MdaInfra.I18N.getMessage("CommandBuilder.ClassNotFoundException",
                    verb,
                    e.toString(),
                    contributionType
                    );
        
            throw new IOException(msg, e);
        }
    }

    @objid ("e89777c7-59ad-47d1-b9e0-81df3ee64da2")
    private <T> T createCustomHandler(String contributionType, String className, Class<T> type) throws ClassNotFoundException, IOException {
        try {
            // Load and instantiate the handler class in the same class loader
            // as the module.
            ClassLoader loader = this.module.getIModule().getClass().getClassLoader();
            Class<?> handlerClass = loader.loadClass(className);
        
            @SuppressWarnings("unchecked")
            T handler = (T) handlerClass.newInstance();
        
            if (! type.isInstance(handler)) {
                throw new IOException(MdaInfra.I18N.getMessage("CommandBuilder.BadHandlerClass",
                        handler.getClass(),
                        type,
                        contributionType));
            }
        
            return handler;
        } catch (InstantiationException | IllegalAccessException | LinkageError e) {
            throw new IOException(MdaInfra.I18N.getMessage("CommandBuilder.InvalidHandler",
                    className,
                    e.toString(),
                    contributionType
                    ), e);
        } catch (RuntimeException e) {
            throw new IOException(e.toString(), e);
        }
    }

    /**
     * Converts a list of {@link Jxbv2HParameter} to a String map.
     * @param hParameter the JAXB handler parameters
     * @return the string parameters map.
     */
    @objid ("b79ee31f-e775-4b19-8380-7caded02d870")
    public Map<String, String> readParameters(List<Jxbv2HParameter> hParameter) {
        Map<String, String> hParameters = new HashMap<>(hParameter.size());
        for (Jxbv2HParameter param : hParameter) {
            hParameters.put(param.getName(), param.getValue());
        }
        return hParameters;
    }

}
