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


package org.modelio.app.project.conf.dialog.modules;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
import org.modelio.app.core.ModelioEnv;
import org.modelio.app.project.conf.dialog.ProjectModel;
import org.modelio.app.project.conf.dialog.modules.list.ModulesSection;
import org.modelio.app.project.conf.dialog.modules.parameters.ParameterSection;
import org.modelio.gproject.module.GModule;

/**
 * Modules page
 */
@objid ("a73dfbfb-33f6-11e2-a514-002564c97630")
public class ModulesPage {
    @objid ("a73dfbfd-33f6-11e2-a514-002564c97630")
    protected ModulesSection modulesSection;

    @objid ("a73dfbfe-33f6-11e2-a514-002564c97630")
    protected ParameterSection parameterSection;

    @objid ("420779fc-4a9f-477e-b584-ca069eb5fa27")
    protected IEclipseContext applicationContext;

    @objid ("0d6c89e4-d2fc-4a2e-bdc7-294d37969c1f")
     ProjectModel projectAdapter;

    /**
     * @param toolkit the form toolkit
     * @param application the application model
     * @param parent the parent composite
     * @param env Modelio env variables
     * @return the created page
     */
    @objid ("a73dfbff-33f6-11e2-a514-002564c97630")
    public Composite createControls(FormToolkit toolkit, MApplication application, final Composite parent, ModelioEnv env) {
        this.applicationContext = application.getContext();
        Composite mainComposite = toolkit.createComposite(parent, SWT.NONE);
        mainComposite.setLayout(new GridLayout());
        
        // The form
        ScrolledForm form = toolkit.createScrolledForm(mainComposite);
        form.getBody().setLayout(new TableWrapLayout());
        form.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        
        // Modules Section
        this.modulesSection = new ModulesSection(this.applicationContext, env);
        Section s1 = this.modulesSection.createControls(toolkit, form.getBody());
        s1.setLayoutData(new TableWrapData(TableWrapData.FILL));
        
        // Parameters Section
        this.parameterSection = new ParameterSection(this.applicationContext);
        final Section s3 = this.parameterSection.createControls(toolkit, form.getBody());
        s3.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB));
        
        // Parameter updater
        this.modulesSection.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                ISelection selection = event.getSelection();
                if (selection instanceof IStructuredSelection) {
                    IStructuredSelection structuredSelection = (IStructuredSelection) selection;
                    if (structuredSelection.isEmpty()) {
                        ModulesPage.this.parameterSection.setInput(null);
                        // force layout of the new zone
                        boolean expanded = s3.isExpanded();
                        s3.setExpanded(!expanded);
                        s3.setExpanded(expanded);
                    } else if (structuredSelection.size() == 1) {
                        Object obj = structuredSelection.getFirstElement();
                        if (obj instanceof GModule) {
                            GModule module = (GModule) obj;
                            ModulesPage.this.parameterSection.setInput(module);
                            // force layout of the new zone
                            boolean expanded = s3.isExpanded();
                            s3.setExpanded(!expanded);
                            s3.setExpanded(expanded);
                        }
                    }
                }
            }
        });
        return mainComposite;
    }

    /**
     * Set the data model.
     * @param projectAdapter the project data model.
     */
    @objid ("a73f82a3-33f6-11e2-a514-002564c97630")
    public void setInput(ProjectModel projectAdapter) {
        this.projectAdapter = projectAdapter;
        // update the different sections
        this.modulesSection.setInput(projectAdapter);
    }

    @objid ("367fb76d-b012-470c-9734-982b47947a4e")
    ProjectModel getProjectAdapter() {
        return this.projectAdapter;
    }

}
