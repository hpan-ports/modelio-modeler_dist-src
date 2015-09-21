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


package org.modelio.creation.wizard.handler;

import javax.inject.Inject;
import javax.inject.Named;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.InjectionException;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.menu.MItem;
import org.eclipse.e4.ui.model.application.ui.menu.MToolItem;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.modelio.api.ui.contributor.IWizardContributor;
import org.modelio.app.core.IModelioEventService;
import org.modelio.app.core.IModelioService;
import org.modelio.app.core.events.ModelioEvent;
import org.modelio.app.core.navigate.IModelioNavigationService;
import org.modelio.app.core.picking.IModelioPickingService;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.core.ui.SelectionHelper;
import org.modelio.creation.wizard.dialog.CreationContributorManager;
import org.modelio.creation.wizard.dialog.CreationWizardDialog;
import org.modelio.creation.wizard.dialog.CreationWizardModel;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.session.api.transactions.ITransaction;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * E4 handler to open creation wizard.
 * 
 * @see org.eclipse.core.commands.IHandler
 */
@objid ("9ea3ba75-b099-4a9f-9ec6-c3652862fe05")
public class CreationHandler {
    @objid ("2003d1ee-1dea-40d3-a8ef-91c53b7a8a15")
    @Inject
    protected IProjectService projectService;

    @objid ("0e1205a7-4c89-4b40-873e-60bab9e6e788")
    @Inject
    protected IModelioEventService eventService;

    @objid ("e417604b-bb2f-44c2-ad2f-61b344f97775")
    @Inject
    protected IModelioPickingService pickingService;

    @objid ("251f98e3-e51b-46a1-a362-6fb12cdcbe54")
    private CreationWizardDialog dialog = null;

    @objid ("8ef7ce11-6b63-4af7-9e45-d585a1e3b4e6")
    @Inject
    private IEclipseContext context;

    @objid ("a381a15a-59e5-4c51-98cb-7688d5631b2c")
    @Inject
    protected IModelioNavigationService selectionService;

    /**
     * The command has been executed, so extract extract the needed information from the application context.
     * @param context the E4 context, not used for the moment
     * @param selection the E4 selection
     * @param contributorName the asked "contributor" name
     */
    @objid ("aa773628-c456-4c2f-8d24-2bd8e6fd0899")
    @Execute
    public void execute(@Named(IServiceConstants.ACTIVE_SELECTION) final Object selection, @Optional @Named("contributor") final String contributorName, @Named(IServiceConstants.ACTIVE_SHELL) final Shell activeShell) {
        ModelElement selectedElement = getSelectedElement(selection);
        
        // As the dialog box is NOT modal because it supports picking, this handler might be called while the dialog is opened
        if (this.dialog != null && this.dialog.getShell() != null) {
            // dialog already opened
            this.dialog.getShell().setFocus();
            return;
        }
        
        // Open dialog
        if (this.dialog == null || this.dialog.getShell() == null) {
            CreationWizardModel resultModel = null;
            IWizardContributor selectedContributor = null;
            CreationContributorManager contributorManager = CreationContributorManager.getInstance();
            for (IWizardContributor contributor : contributorManager.getAllContributorsList()) {
                injectDependencies(contributor);
                if (contributor.getClass().getSimpleName().equals(contributorName)) {
                    selectedContributor = contributor;
                    break;
                }
            }
        
            if (selectedContributor == null) {
                CreationWizardModel dataModel = new CreationWizardModel();
                dataModel.setContext(selectedElement);
                dataModel.setShowInvalid(false);
        
                this.dialog = new CreationWizardDialog(activeShell, contributorManager, dataModel, this.projectService, this.pickingService);
                if (this.dialog.open() == IDialogConstants.OK_ID) {
                    resultModel = this.dialog.getResultModel();
                    if (resultModel != null) {
                        selectedContributor = resultModel.getSelectedContributor();
                    }
                }
            } else {
                resultModel = new CreationWizardModel();
                resultModel.setContext(selectedElement);
                resultModel.setName(selectedContributor.getLabel());
                resultModel.setSelectedContributor(selectedContributor);
            }
        
            if (resultModel != null && selectedContributor != null) {
                ICoreSession session = this.projectService.getSession();
        
                try (ITransaction t = session.getTransactionSupport().createTransaction("Create element");) {
                    MObject elt = selectedContributor.actionPerformed(resultModel.getContext(), resultModel.getName(),
                            resultModel.getDescription());
        
                    t.commit();
                    if (elt != null) {
                        openEditor(elt);
        
                        this.selectionService.fireNavigate(elt);
                    }
                }
            }
            this.dialog = null;
        } else {
            this.dialog.getShell().setFocus();
        }
    }

    @objid ("079ac237-622a-4515-bc5a-6b5e46904d44")
    protected void openEditor(final MObject elt) {
        Display.getDefault().asyncExec(new Runnable() {
            @Override
            public void run() {
                CreationHandler.this.eventService.postAsyncEvent(new IModelioService() {
                    @Override
                    public String getName() {
                        return "openEditor";
                    }
                }, ModelioEvent.EDIT_ELEMENT, elt);
            }
        });
    }

    /**
     * @param selection the E4 selection
     * @param contributorName asked contributor name
     * @param guiItem the E4 menu/toolbar item
     * @return true to allow execution else false.
     */
    @objid ("3a2dad2c-f22a-444d-84ae-5020b1749e4f")
    @CanExecute
    public boolean canExecute(@Named(IServiceConstants.ACTIVE_SELECTION) final Object selection, @Optional @Named("contributor") final String contributorName, MItem guiItem) {
        boolean accept = accept(selection, contributorName);
        
        // http://stackoverflow.com/questions/23567917/eclipse-e4-rcp-core-expressions-something-less-xml-hell
        
        setVisible(guiItem, accept);
        return accept;
    }

    @objid ("a9ba8768-c7ea-4389-b546-2fa4be32553c")
    private static ModelElement getSelectedElement(final Object selection) {
        if (selection instanceof ModelElement) {
            return (ModelElement) selection;
        } else if (selection instanceof IStructuredSelection) {
            return SelectionHelper.getFirst((IStructuredSelection) selection, ModelElement.class);
        } else {
            return null;
        }
    }

    @objid ("c493b891-8be9-4638-bcdd-c38a029438c0")
    private void injectDependencies(IWizardContributor contributor) {
        try {
        ContextInjectionFactory.inject(contributor, this.context);
        } catch (InjectionException e) {
            e.printStackTrace();
        }
    }

    /**
     * Set the menu item visible or not.
     * @param guiItem
     * @param accept
     * @see <a href="http://stackoverflow.com/questions/23567917/eclipse-e4-rcp-core-expressions-something-less-xml-hell">Eclipse e4 RCP: Core Expressions - Something less XML-hell?</a>
     */
    @objid ("feb21493-1db4-470a-ae4b-0c1cbc84e9fc")
    private void setVisible(final MItem guiItem, boolean accept) {
        if (guiItem instanceof MToolItem) {
            /*
             * This makes the tool item definitively invisible
            Display.getDefault().asyncExec(new Runnable() {
                @Override
                public void run() {
                    guiItem.setVisible(accept);
                }
            });*/
        } else {
            guiItem.setVisible(accept);
        }
    }

    @objid ("9c92b64f-e6b4-4198-b5e4-eb59e3d75bbe")
    private boolean accept(final Object selection, final String contributorName) {
        // Sanity checks
        if (this.projectService.getSession() == null) {
            return false;
        }
        ModelElement selectedElement = getSelectedElement(selection);
        if (selectedElement == null) {
            return false;
        }
        if (!selectedElement.getStatus().isRamc()) {
            CreationContributorManager contributorManager = CreationContributorManager.getInstance();
            if (contributorName == null) {
                for (IWizardContributor contributor : contributorManager.getAllContributorsList()) {
                    injectDependencies(contributor);
        
                    if (contributor.accept(selectedElement)) {
                        return true;
                    }
                }
            } else {
                for (IWizardContributor contributor : contributorManager.getAllContributorsList()) {
                    if (contributor.getClass().getSimpleName().equals(contributorName)) {
                        injectDependencies(contributor);
        
                        return contributor.accept(selectedElement);
                    }
                }
            }
        }
        return false;
    }

}
