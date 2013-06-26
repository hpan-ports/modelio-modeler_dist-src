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
                                    

package org.modelio.app.project.conf.dialog.modules.catalog;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.modelio.app.core.ModelioEnv;
import org.modelio.app.project.conf.dialog.ProjectModel;
import org.modelio.app.project.conf.plugin.AppProjectConf;
import org.modelio.gproject.module.IModuleHandle;
import org.modelio.mda.infra.catalog.ModuleCatalogPanel;

/**
 * Manage the modules catalog.
 */
@objid ("9e6c466b-8b53-4e66-8bed-bb13ce97aa3d")
public class CatalogSection {
    @objid ("a200335c-90f6-49df-943f-fed85a72f582")
    private Section section;

    @objid ("58ba889b-810e-4dcf-a36f-6bc9742ada46")
    private ModelioEnv env;

    @objid ("772d2523-b7af-45fe-81a7-e66392dbc9c5")
    private FormToolkit toolkit;

    @objid ("5ecd2499-a7c4-4370-a7ad-a39ca7e69a37")
    private Composite panelComposite;

    @objid ("3705cfbc-d866-48f6-a304-997d5077cd70")
    protected Controller controller;

    @objid ("8d206b91-ec84-458b-b5a6-e4c01090af12")
    protected IEclipseContext applicationContext;

    @objid ("3280ae96-1a1b-464f-a95f-7b7f1f0d413d")
    private ProjectModel projectAdapter;

    @objid ("bd7a47b1-f277-448a-a4e3-6a83a341640e")
     ModuleCatalogPanel panel = null;

    @objid ("afb7f032-19c9-464a-8582-cfde782ffa66")
    private IModuleHandle selectedModule;

    @objid ("cd42df6c-b458-4a36-8893-bfbb69897ade")
    public CatalogSection(ModelioEnv env, IEclipseContext application) {
        this.env = env;
        this.controller = new Controller(this);
        this.applicationContext = application;
    }

    @objid ("2fdc618d-53f8-45da-a95a-9840d8d64ce6")
    public Section createControls(final FormToolkit theToolkit, final Composite parent) {
        this.toolkit = theToolkit;
        this.section = theToolkit.createSection(parent, ExpandableComposite.TITLE_BAR | ExpandableComposite.TWISTIE | Section.DESCRIPTION);
        
        this.section.setText(AppProjectConf.I18N.getString("CatalogSection.SectionText")); //$NON-NLS-1$
        this.section.setDescription(AppProjectConf.I18N.getString("CatalogSection.SectionDescription")); //$NON-NLS-1$
        this.section.setExpanded(true);
        
        this.panelComposite = theToolkit.createComposite(this.section, SWT.WRAP);
        GridLayout layout = new GridLayout();
        layout.numColumns = 1;
        this.panelComposite.setLayout(layout);      
        createModuleCatalogPanel();
        
        this.section.setClient(this.panelComposite);
        return this.section;
    }

    @objid ("f7fb8999-05bd-49dc-b557-c7d652c03639")
    void createModuleCatalogPanel() {
        this.panel = new ModuleCatalogPanel(this.env);
        this.panel.create(this.panelComposite);
        
        this.panel.getViewer().addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                IStructuredSelection selection = (IStructuredSelection) event.getSelection();
                CatalogSection.this.controller.onModuleSelection(selection);
            }
        });
        
        this.controller.init();
    }

    @objid ("6e189680-fbcc-4b8e-8b9b-b2eb960a81fa")
    public void setInput(ProjectModel projectAdapter) {
        this.projectAdapter = projectAdapter;
    }

    @objid ("e75ccd42-9428-4a29-94bc-3ef44b3b315c")
    ProjectModel getProjectAdapter() {
        return CatalogSection.this.projectAdapter;
    }

    @objid ("f463300b-05c3-4947-b715-6afe586a8264")
    public void addSelectionChangedListener(ISelectionChangedListener listener) {
        this.panel.getViewer().addSelectionChangedListener(listener);
    }

    @objid ("b553557c-340d-4a9e-95dc-daef7a5fcd84")
    public IModuleHandle getSelectedModule() {
        return this.selectedModule;
    }

    @objid ("64a07069-a133-4def-832e-0aa4dde949ff")
    private class Controller {
        @objid ("dfba75e1-943a-4e2b-b690-3719990a2084")
        private final CatalogSection catalogSection;

        @objid ("c6215702-5b38-433f-a397-663a678a241c")
        public Controller(CatalogSection section) {
            this.catalogSection = section;
        }

        @objid ("1cff2e3d-0f95-4c42-a320-10df24a3211d")
        public void init() {
            //
        }

        @objid ("adde38f6-265a-4c9f-831b-cc64b5632f55")
        public void onModuleSelection(IStructuredSelection selection) {
            List<IModuleHandle> selectedModules = new ArrayList<>();
            for (Object obj : selection.toList()) {
                if (obj instanceof IModuleHandle) {
                    selectedModules.add((IModuleHandle) obj);
                }
            }
        }

    }

}
