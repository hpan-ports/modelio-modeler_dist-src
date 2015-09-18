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
                                    

package org.modelio.edition.dialogs.dialog;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.InvalidRegistryObjectException;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.modelio.api.module.propertiesPage.IModulePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyPanel;
import org.modelio.edition.dialogs.dialog.panels.WizardPanelFactory;
import org.modelio.edition.dialogs.dialog.panels.element.ElementEditPanel;
import org.modelio.edition.dialogs.plugin.EditionDialogs;
import org.modelio.mda.infra.service.IModuleService;
import org.modelio.mda.infra.service.IRTModule;
import org.modelio.module.propertytab.propertytab.ModulePanelProvider;
import org.modelio.ui.panel.IPanelProvider;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * This class is responsible for collecting the applicable edition panels for a given element.
 * <p>
 * Applicable panels come from:
 * <ul>
 * <li>contributions to the extension point</li>
 * <li> {@link WizardPanelFactory#getEditDialog(MObject)}</li>
 * <li> {@link ElementEditPanel}</li>
 * <li> {@link IRTModule#getPropertyPanels()}</li>
 * </ul>
 */
@objid ("015e02b9-a4ef-45b3-9e89-51ad6bce0757")
public class PanelContributions {
    @objid ("35b4fd20-cffa-4603-978c-44c231e06b25")
    private final IEclipseContext eclipseContext;

    @objid ("22f7ba91-97ec-439f-8e01-79ef2d197463")
    private List<PanelDescriptor> extensionPanels;

    /**
     * Get the edition panels for a model object
     * @param obj the element to edit
     * @return the panels to display
     */
    @objid ("fff4eb4b-86c1-4b56-ad8d-0f042487b8f3")
    public List<PanelDescriptor> getPanels(Object obj) {
        final List<PanelDescriptor> results = new ArrayList<>();
        
        // Specialized panel
        // TODO : these panels should be declared as "primary" extension panels so no more WizardPanelFactory is necessary.
        final Class<? extends IPanelProvider> panelClass = WizardPanelFactory.getEditDialog((MObject) obj);
        if (panelClass != null) {
            final IPanelProvider panel = ContextInjectionFactory.make(panelClass, this.eclipseContext);
            if (panel.isRelevantFor(obj)) {
                results.add(new PanelDescriptor("", ((MObject) obj).getMClass().getName(), true, panel));
            }
        }
        
        // Primary extension panels
        for (final PanelDescriptor ext : this.extensionPanels) {
            if (ext.isPrimary() && ext.getPanel().isRelevantFor(obj)) {
                results.add(ext);
            }
        }
        
        // Generic UML panel
        final IPanelProvider genericPanel = ContextInjectionFactory.make(ElementEditPanel.class, this.eclipseContext);
        if (genericPanel.isRelevantFor(obj)) {
            results.add(new PanelDescriptor("UML", "UML", true, genericPanel));
        }
        
        // Extension panels
        for (final PanelDescriptor ext : this.extensionPanels) {
            if (!ext.isPrimary() && ext.getPanel().isRelevantFor(obj)) {
                results.add(ext);
            }
        }
        
        // Modules panels
        
        // Build the contributing module panels
        final IModuleService moduleService = this.eclipseContext.get(IModuleService.class);
        
        for (final IRTModule module : moduleService.getModuleRegistry().getStartedModules()) {
            for (final IModulePropertyPanel modulePanel : module.getPropertyPanels()) {
        
                if (modulePanel instanceof IPanelProvider) {
                    final IPanelProvider pp = (IPanelProvider) modulePanel;
                    ContextInjectionFactory.inject(pp, this.eclipseContext);
                    if (pp.isRelevantFor(obj)) {
                        results.add(new PanelDescriptor(modulePanel.getName(), modulePanel.getLabel(), false, pp));
                    }
                }
        
                if (modulePanel instanceof IModulePropertyPage) {
                    final IPanelProvider pp = new ModulePanelProvider((IModulePropertyPage) modulePanel);
                    ContextInjectionFactory.inject(pp, this.eclipseContext);
                    if (pp.isRelevantFor(obj)) {
                        results.add(new PanelDescriptor(modulePanel.getName(), modulePanel.getLabel(), false, pp));
                    }
                }
            }
        }
        return results;
    }

    /**
     * @param ctx the Eclipse4 context to inject in panels.
     */
    @objid ("1fbe8d0b-107f-48e6-b172-72533bf1d135")
    public PanelContributions(IEclipseContext ctx) {
        this.eclipseContext = ctx;
        initializeExtensions(ctx);
    }

    @objid ("b4de7b39-9ff1-454e-8976-1950511cfe28")
    private void initializeExtensions(IEclipseContext ctx) {
        this.extensionPanels = new ArrayList<>();
        final IExtensionRegistry registry = ctx.get(IExtensionRegistry.class);
        for (final IConfigurationElement entry : registry.getConfigurationElementsFor("org.modelio.edition.dialogs.panels")) {
            try {
                final IPanelProvider panel = (IPanelProvider) entry.createExecutableExtension("class");
                ContextInjectionFactory.inject(panel, this.eclipseContext);
                this.extensionPanels.add(new PanelDescriptor(
                        entry.getAttribute("id"), 
                        entry.getAttribute("label"), 
                        Boolean.parseBoolean(entry.getAttribute("primary")),
                        panel));
            } catch (ClassCastException | InvalidRegistryObjectException | CoreException e) {
                EditionDialogs.LOG.error(e);
            }
        }
    }

}
