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
                                    

package org.modelio.app.model.imp.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Display;
import org.modelio.app.model.imp.plugin.AppModelImport;
import org.modelio.gproject.model.api.MTools;
import org.modelio.gproject.model.importer.defaultimporter.DefaultImporter;
import org.modelio.metamodel.analyst.AnalystElement;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.BusinessRule;
import org.modelio.metamodel.analyst.BusinessRuleContainer;
import org.modelio.metamodel.analyst.Dictionary;
import org.modelio.metamodel.analyst.Goal;
import org.modelio.metamodel.analyst.GoalContainer;
import org.modelio.metamodel.analyst.Requirement;
import org.modelio.metamodel.analyst.RequirementContainer;
import org.modelio.metamodel.analyst.Term;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.diagrams.DiagramSet;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Imports many elements from a project to the local project.
 */
@objid ("aa9a3209-13db-441b-8d4f-734320726209")
public class ModelImporter implements IRunnableWithProgress {
    @objid ("768b7ef2-cc2b-46c9-8c3a-c717356426e6")
    private ModelImportDataModel importedModel;

    @objid ("66b7978f-cb11-4277-94a3-416fa72a6819")
    private ICoreSession localSession;

    @objid ("41ecbda7-664b-4556-a518-55dbe3642aa6")
    private Project localTarget;

    /**
     * Initialize the model importer
     * @param localSession the model to import elements into
     * @param importedModel the model elements to import.
     */
    @objid ("8ab86f97-c77b-488c-b773-15625fadb57c")
    public ModelImporter(ICoreSession localSession, Project localTarget, ModelImportDataModel importedModel) {
        this.importedModel = importedModel;
        this.localTarget = localTarget;
        this.localSession = localSession;
    }

    @objid ("fb8e79cd-7aa1-4291-ad9a-17d9d2b624b8")
    @Override
    public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
        List<SmObjectImpl> importedUmlElements = new ArrayList<>();
        List<SmObjectImpl> importedDictionaries = new ArrayList<>();
        List<SmObjectImpl> importedRequirements = new ArrayList<>();
        List<SmObjectImpl> importedGoals = new ArrayList<>();
        List<SmObjectImpl> importedRules = new ArrayList<>();
        List<SmObjectImpl> importedDiagrams = new ArrayList<>();
        
        monitor.beginTask(AppModelImport.I18N.getString("ImportModelDialog.ImportProgressMessage"), IProgressMonitor.UNKNOWN);
        
        // Dispatch the elements to import in the appropriate lists
        for (SmObjectImpl elementToImport : this.importedModel.getElementsToImport()) {
            dispatchElementToImport(elementToImport,
                    elementToImport,
                    importedUmlElements,
                    importedRequirements,
                    importedGoals,
                    importedRules,
                    importedDictionaries,
                    importedDiagrams);
        }
        
        // Init local roots
        Package localUmlRoot = this.localTarget.getModel();
        DiagramSet localDiagramRoot = this.localTarget.getDiagramRoot();
        
        final AnalystProject requirementProject = null; // FIXME this.localTarget.getRootRequirement();
        
        if (this.importedModel.isReidentify()) {
            // Import by copy
            try {
                if (localUmlRoot != null && !importedUmlElements.isEmpty()) {
                    MTools.getModelTool().copyElements(importedUmlElements, localUmlRoot);
                }
                if (!importedRequirements.isEmpty()) {
                    MTools.getModelTool().copyElements(importedRequirements, requirementProject);
                }
                if (!importedRules.isEmpty()) {
                    MTools.getModelTool().copyElements(importedRules, requirementProject);
                }
                if (!importedGoals.isEmpty()) {
                    MTools.getModelTool().copyElements(importedGoals, requirementProject);
                }
                if (!importedDictionaries.isEmpty()) {
                    MTools.getModelTool().copyElements(importedDictionaries, requirementProject);
                }
                if (localDiagramRoot != null && !importedDiagrams.isEmpty()) {
                    MTools.getModelTool().copyElements(importedDiagrams, localDiagramRoot);
                }
            } catch (RuntimeException e) {
                displayError(e);
                throw new InvocationTargetException(e);
            } catch (Exception e) {
                displayError(e);
                InterruptedException e2 = new InterruptedException();
                e2.initCause(e);
                throw e2;
            }
        } else {
            // Standard import
            try {
                ICoreSession importedSession = this.importedModel.getImportedProject().getSession();
                DefaultImporter importer = new DefaultImporter();
        
                if (localUmlRoot != null && ! importedUmlElements.isEmpty()) {
                    importer.execute(this.localSession,
                            (SmObjectImpl) localUmlRoot, 
                            importedSession,
                            importedUmlElements);
                }
                if (! importedRequirements.isEmpty()) {
                    importer.execute(this.localSession,
                            (SmObjectImpl) requirementProject,
                            importedSession,
                            importedRequirements);
                }
                if (! importedDictionaries.isEmpty()) {
                    importer.execute(this.localSession,
                            (SmObjectImpl) requirementProject,
                            importedSession,
                            importedDictionaries);
                }
                if (! importedRules.isEmpty()) {
                    importer.execute(this.localSession,
                            (SmObjectImpl) requirementProject,
                            importedSession,
                            importedRules);
                }
                if (importedGoals.isEmpty()) {
                    importer.execute(this.localSession,
                            (SmObjectImpl) requirementProject, 
                            importedSession,
                            importedGoals);
                }
                if (localDiagramRoot != null && ! importedDiagrams.isEmpty()) {
                    importer.execute(this.localSession,
                            (SmObjectImpl) localDiagramRoot,
                            importedSession,
                            importedDiagrams);
                }
            } catch (RuntimeException e) {
                displayError(e);
                throw new InvocationTargetException(e);
            } catch (Exception e) {
                displayError(e);
                InterruptedException e2 = new InterruptedException();
                e2.initCause(e);
                throw e2;
            }
        }
        
        monitor.done();
    }

    @objid ("6b65d253-6ec4-4a7d-b3fa-d78f7113a43c")
    private boolean isAnalystRoot(AnalystElement c) {
        return c.getCompositionOwner() == null;
    }

    @objid ("b7a84aed-5e77-4f62-8e71-0fa912ec0e2c")
    private void dispatchElementToImport(SmObjectImpl elementToImport, MObject dispatchKey, List<SmObjectImpl> umlsToImport, List<SmObjectImpl> requirementsToImport, List<SmObjectImpl> goalsToImport, List<SmObjectImpl> rulesToImport, List<SmObjectImpl> dictionariesToImport, final List<SmObjectImpl> diagramsToImport) throws IllegalArgumentException {
        if (dispatchKey instanceof NameSpace) {
            umlsToImport.add(elementToImport);
        } else if ((dispatchKey instanceof Requirement) || (dispatchKey instanceof RequirementContainer)) {
            AnalystElement reqSortKey = (AnalystElement) dispatchKey;
            if (!(isAnalystRoot(reqSortKey) && reqSortKey == elementToImport)) {
                requirementsToImport.add(elementToImport);
            }
        } else if ((dispatchKey instanceof Goal) || (dispatchKey instanceof GoalContainer)) {
            AnalystElement reqSortKey = (AnalystElement) dispatchKey;
            if (!(isAnalystRoot(reqSortKey) && reqSortKey == elementToImport)) {
                goalsToImport.add(elementToImport);
            }
        } else if ((dispatchKey instanceof BusinessRule) || (dispatchKey instanceof BusinessRuleContainer)) {
            AnalystElement reqSortKey = (AnalystElement) dispatchKey;
            if (!(isAnalystRoot(reqSortKey) && reqSortKey == elementToImport)) {
                rulesToImport.add(elementToImport);
            }
        } else if ((dispatchKey instanceof Dictionary) || (dispatchKey instanceof Term)) {
            dictionariesToImport.add(elementToImport);
        } else if (dispatchKey instanceof DiagramSet || dispatchKey instanceof AbstractDiagram) {
            diagramsToImport.add(elementToImport);
        } else {
            final MObject parent = dispatchKey.getCompositionOwner();
            if (parent == null) {
                throw new IllegalArgumentException(dispatchKey.toString() + " dispatch key is not handled.");
            } else {
                dispatchElementToImport(elementToImport,
                        parent,
                        umlsToImport,
                        requirementsToImport,
                        goalsToImport,
                        rulesToImport,
                        dictionariesToImport,
                        diagramsToImport);
            }
        }
    }

    @objid ("6f29a48f-2550-4ab6-8714-fae2fa3ea0dc")
    private void displayError(final Exception e) {
        Display.getDefault().syncExec(new Runnable() {
            @Override
            public void run() {
                MessageDialog.openError(Display.getDefault().getActiveShell(), "Error", e.getLocalizedMessage());
            }
        });
    }

}
