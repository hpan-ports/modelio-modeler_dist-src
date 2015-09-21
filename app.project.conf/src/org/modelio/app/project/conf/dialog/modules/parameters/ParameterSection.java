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


package org.modelio.app.project.conf.dialog.modules.parameters;

import java.util.Arrays;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.modelio.api.module.IModule;
import org.modelio.app.project.conf.dialog.modules.parameters.standard.DefaultParameterPanelProvider;
import org.modelio.app.project.conf.plugin.AppProjectConf;
import org.modelio.gproject.module.GModule;
import org.modelio.mda.infra.service.IModuleManagementService;
import org.modelio.mda.infra.service.IRTModule.ModuleRuntimeState;
import org.modelio.mda.infra.service.IRTModule;
import org.modelio.ui.panel.IPanelProvider;

/**
 * Manage the modules parameters.
 */
@objid ("a741094c-33f6-11e2-a514-002564c97630")
public class ParameterSection {
    @objid ("a741094e-33f6-11e2-a514-002564c97630")
    protected IEclipseContext applicationContext;

    @objid ("3c6193b8-d69d-4e9c-9f38-9af207d1fb8c")
    private IPanelProvider parameterViewer;

    @objid ("0f824763-a536-44e5-89e9-200341766902")
    private Composite composite;

    @objid ("a7410950-33f6-11e2-a514-002564c97630")
    public ParameterSection(IEclipseContext application) {
        this.applicationContext = application;
        this.parameterViewer = null;
    }

    @objid ("a7410953-33f6-11e2-a514-002564c97630")
    public void setInput(GModule module) {
        if (this.parameterViewer != null) {
            this.parameterViewer.dispose();
            this.parameterViewer = null;
        }
        
        IModuleManagementService moduleService = this.applicationContext.get(IModuleManagementService.class);
        
        // Get the runtime module from the static one
        if (module != null && module.getModuleElement() != null) {
            IRTModule irtModule = moduleService.getIRTModule(module);
            if (irtModule != null && irtModule.getState() == ModuleRuntimeState.Started) {
                IModule iModule = irtModule.getIModule();
        
                final IPanelProvider customPanel = iModule.getParametersEditionPanel();
                this.parameterViewer = customPanel != null ? customPanel : new DefaultParameterPanelProvider();
                Control control = (Control) this.parameterViewer.createPanel(this.composite);
        
                GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true);
                gd.minimumHeight = 200;
                control.setLayoutData(gd);
        
                this.parameterViewer.setInput(Arrays.asList(iModule));
            }
        }
        
        this.composite.layout(true, true);
    }

    @objid ("a7410956-33f6-11e2-a514-002564c97630")
    public Section createControls(final FormToolkit toolkit, final Composite parent) {
        final Section section = toolkit.createSection(parent, ExpandableComposite.TITLE_BAR | ExpandableComposite.TWISTIE | Section.DESCRIPTION);
        section.setText(AppProjectConf.I18N.getString("ParameterSection.SectionText")); //$NON-NLS-1$
        section.setDescription(AppProjectConf.I18N.getString("ParameterSection.SectionDescription")); //$NON-NLS-1$
        section.setExpanded(true);
        
        this.composite = toolkit.createComposite(section, SWT.WRAP);
        GridLayout layout = new GridLayout();
        layout.numColumns = 1;
        this.composite.setLayout(layout);
        
        toolkit.paintBordersFor(this.composite);
        section.setClient(this.composite);
        return section;
    }

}
