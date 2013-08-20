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
                                    

package org.modelio.diagram.api.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.modelio.api.diagram.IDiagramGraphic;
import org.modelio.api.diagram.IDiagramHandle;
import org.modelio.api.diagram.dg.IDiagramDG;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.diagram.api.dg.DGFactory;
import org.modelio.diagram.api.dg.common.DiagramDG;
import org.modelio.diagram.editor.DiagramCommandStack;
import org.modelio.diagram.editor.DiagramEditorInput;
import org.modelio.diagram.editor.IDiagramEditor;
import org.modelio.diagram.editor.ScalableFreeformRootEditPart2;
import org.modelio.diagram.editor.activity.editor.ActivityDiagramEditorInput;
import org.modelio.diagram.editor.bpmn.editor.BpmnDiagramEditorInput;
import org.modelio.diagram.editor.communication.editor.CommunicationDiagramEditorInput;
import org.modelio.diagram.editor.deployment.editor.DeploymentDiagramEditorInput;
import org.modelio.diagram.editor.handlers.ImageBuilder;
import org.modelio.diagram.editor.object.editor.ObjectDiagramEditorInput;
import org.modelio.diagram.editor.plugin.DiagramEditorsManager;
import org.modelio.diagram.editor.sequence.editor.SequenceDiagramEditorInput;
import org.modelio.diagram.editor.silent.SilentDiagramEditor;
import org.modelio.diagram.editor.state.editor.StateDiagramEditorInput;
import org.modelio.diagram.editor.statik.editor.StaticDiagramEditorInput;
import org.modelio.diagram.elements.common.abstractdiagram.DiagramPersistence;
import org.modelio.diagram.elements.core.model.GmModel;
import org.modelio.diagram.elements.core.model.IGmObject;
import org.modelio.diagram.elements.core.model.ModelManager;
import org.modelio.diagram.elements.core.node.GmNodeModel;
import org.modelio.diagram.elements.core.requests.ModelElementDropRequest;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * A handle on the content of a Diagram, allowing interactions like navigating nodes and links, masking and unmasking elements,
 * saving the content of the diagram into a file, etc.
 * 
 * The static method {@link #create(AbstractDiagram)} should be use to get one handle, and the handle should be {@link #close()
 * closed} when it isn't needed anymore.
 * 
 * @since 2.0
 */
@objid ("fb247494-88ea-4dd8-a65f-e58d53a983e2")
public class DiagramHandle implements IDiagramHandle {
    @objid ("02065e98-05fa-4ac7-94da-48748f7c833d")
    private DiagramEditorInput diagramEditorInput;

    @objid ("ea2f31f2-5240-4ed8-9e9e-a53bfaa40bb1")
    private IDiagramEditor editor;

    @objid ("869afd7e-eee8-40cf-87f8-cc9785c2b4c0")
    private DiagramHandle(final IDiagramEditor editor, DiagramEditorInput diagramEditorInput) {
        this.editor = editor;
        this.diagramEditorInput = diagramEditorInput;
    }

    /**
     * Creates and returns a DiagramHandle for the given diagram. It is the caller's responsibility to call {@link #close()} on the
     * handle once it isn't needed anymore.
     */
    @objid ("392e5957-d5dd-4caf-abf2-87a798299e50")
    public static DiagramHandle create(ModelManager manager, AbstractDiagram abstractDiagram, IProjectService projectService, DiagramEditorsManager editorManager) {
        MPart editorPart = editorManager.get(abstractDiagram);
        
        if (editorPart != null) {
            return create((IDiagramEditor) editorPart.getObject());
        } else {
            DiagramEditorInput input = createEditorInput(manager, abstractDiagram);
            SilentDiagramEditor editor = new SilentDiagramEditor(input, projectService);
            return create(editor);
        }
    }

    @objid ("4c395f09-5c18-43d6-83f5-cbccb98c39f4")
    private static DiagramEditorInput createEditorInput(ModelManager manager, AbstractDiagram abstractDiagram) {
        switch (abstractDiagram.getMClass().getName()) {
        case "ActivityDiagram":
            return new ActivityDiagramEditorInput(manager, abstractDiagram);
            /*case "ScopeDiagram":
            return new ScopeDiagramEditorInput(projectService.getSession(), abstractDiagram, modelServices);*/
        case "BpmnCollaborationDiagram":
            return new BpmnDiagramEditorInput(manager, abstractDiagram);
        case "CommunicationDiagram":
            return new CommunicationDiagramEditorInput(manager, abstractDiagram);
        case "DeploymentDiagram":
            return new DeploymentDiagramEditorInput(manager, abstractDiagram);
        case "ObjectDiagram":
            return new ObjectDiagramEditorInput(manager, abstractDiagram);
        case "SequenceDiagram":
            return new SequenceDiagramEditorInput(manager, abstractDiagram);
        case "StateMachineDiagram":
            return new StateDiagramEditorInput(manager, abstractDiagram);
        case "StaticDiagram":
            return new StaticDiagramEditorInput(manager, abstractDiagram);
        default :
            return new StaticDiagramEditorInput(manager, abstractDiagram);
        }
    }

    @objid ("cc80b29d-d5d3-4c0f-be5b-01cc12308fbd")
    @Override
    public AbstractDiagram getDiagram() {
        return getDiagramEditorInput().getDiagram();
    }

    @objid ("3957aa20-22eb-473f-827f-f38a81cae7a5")
    @Override
    public List<IDiagramGraphic> getDiagramGraphics(MObject element) {
        return DGFactory.getInstance().getDiagramGraphics(this, getDiagramGraphicModels(element));
    }

    @objid ("48c7ee41-f49e-4f37-8fed-7668b7294dc8")
    @Override
    public IDiagramDG getDiagramNode() {
        IDiagramDG diagramDG = (DiagramDG) DGFactory.getInstance().getDiagramNode(this, getDiagramEditorInput().getGmDiagram());
        return diagramDG;
    }

    /**
     * Returns the edit part for the passed object.
     */
    @objid ("36a43f0b-0ba1-48cb-82ea-2f1ece213b92")
    public GraphicalEditPart getEditPart(IGmObject gmObject) {
        GraphicalViewer viewer = (GraphicalViewer) this.editor.getAdapter(GraphicalViewer.class);
        return (GraphicalEditPart) viewer.getEditPartRegistry().get(gmObject);
    }

    @objid ("6ccbf987-3a62-4d8f-be3f-1ddf7bf58a28")
    @Override
    public void mask(final IDiagramGraphic graphic) {
        graphic.mask();
    }

    @objid ("73f12b9a-b791-4fef-9510-0474f59f00b5")
    @Override
    public void save() {
        DiagramPersistence.saveDiagram(getDiagramEditorInput().getGmDiagram());
    }

    @objid ("e2db9e35-dd39-4a1e-9791-b585a3e501fa")
    @Override
    public List<IDiagramGraphic> unmask(MObject element, int x, int y) {
        List<IDiagramGraphic> existingGraphics = getDiagramGraphics(element);
        List<GmModel> existingGMs = getDiagramGraphicModels(element);
        
        GraphicalEditPart diagramEditPart = getEditPart(getDiagramEditorInput().getGmDiagram());
        GraphicalViewer viewer = (GraphicalViewer) diagramEditPart.getViewer();
        Point dropLocation = new Point(x, y);
        
        // Adapt the given coordinates if necessary
        ((ScalableFreeformRootEditPart2) diagramEditPart.getViewer().getRootEditPart()).getFigure().translateToParent(dropLocation);
        
        final ModelElementDropRequest req = new ModelElementDropRequest();
        req.setDroppedElements(new MObject[] { element });
        req.setLocation(dropLocation);
        req.isSmart(false);
        
        EditPart targetEditPart = viewer.findObjectAtExcluding(dropLocation, Collections.EMPTY_LIST, new Conditional(req));
        
        targetEditPart = targetEditPart.getTargetEditPart(req);
        if (targetEditPart != null) {
        
            Command com = targetEditPart.getCommand(req);
            if (com != null && com.canExecute()) {
                targetEditPart.getViewer().getEditDomain().getCommandStack().execute(com);
        
                List<IDiagramGraphic> allGraphics = getDiagramGraphics(element);
                List<IDiagramGraphic> results = new ArrayList<>();
                for (IDiagramGraphic dg : allGraphics) {
                    if (!existingGraphics.contains(dg)) {
                        results.add(dg);
                    }
                }
        
                List<GmModel> allGMs = getDiagramGraphicModels(element);
                for (GmModel dg : allGMs) {
                    if (!existingGMs.contains(dg)) {
                        EditPart newEP = getEditPart(dg);
                        if (newEP != null) {
                            ((GraphicalEditPart) newEP).getFigure().getUpdateManager().performValidation();
                        }
                    }
                }
        
                return results;
            }
        }
        return null;
    }

    @objid ("54450799-3ffe-4b7a-a299-8bc07dbea76e")
    private void saveAsImage(final RootEditPart rootEditPart, final String location, final int format, final int margin) {
        ImageBuilder imageBuilder = new ImageBuilder(margin);
        Image img = imageBuilder.makeImage(rootEditPart);
        
        if (img != null) {
            try {
                ImageLoader imgLoader = new ImageLoader();
                imgLoader.data = new ImageData[] { img.getImageData() };
                imgLoader.save(location, format);
            } finally {
                img.dispose();
            }
        }
    }

    @objid ("2e2a63ec-e538-4df8-b152-1972694006c4")
    @Override
    public void close() {
        setBatchMode(false);
        this.editor.disposeHandle();
        this.diagramEditorInput = null;
    }

    @objid ("f3870c49-f586-409e-a99b-6b2c7c91ed31")
    private List<GmModel> getDiagramGraphicModels(final MObject element) {
        List<GmModel> ret = new ArrayList<>();
        for (GmModel gm : getDiagramEditorInput().getGmDiagram().getAllGMRepresenting(new MRef(element))) {
            if ((gm instanceof GmNodeModel) && !((GmNodeModel) gm).isVisible()) {
                continue;
            }
            ret.add(gm);
        }
        return ret;
    }

    @objid ("0ac50eb5-b841-4c14-81e2-a213a221030f")
    @Override
    public void saveInFile(final String format, final String targetFile, final int margin) {
        int intFormat;
        
        if (format.equalsIgnoreCase("PNG")) {
            intFormat = SWT.IMAGE_PNG;
        } else if (format.equalsIgnoreCase("BMP")) {
            intFormat = SWT.IMAGE_BMP;
        } else if (format.equalsIgnoreCase("JPEG")) {
            intFormat = SWT.IMAGE_JPEG;
        } else if (format.equalsIgnoreCase("GIF")) {
            intFormat = SWT.IMAGE_GIF;
        } else {
            intFormat = SWT.IMAGE_PNG;
        }
        
        saveAsImage(this.editor.getRootEditPart(), targetFile, intFormat, margin);
    }

    /**
     * Creates and returns a DiagramHandle for the given diagram editor. It is the caller's responsibility to call {@link #close()}
     * on the handle once it isn't needed anymore.
     */
    @objid ("b536f45b-38b6-423c-ba07-f253a2085b5b")
    public static DiagramHandle create(final IDiagramEditor editor) {
        return new DiagramHandle(editor, editor.getEditorInput());
    }

    @objid ("e61c1fa7-ec5e-475f-98a8-83cd1019c2e1")
    private DiagramEditorInput getDiagramEditorInput() {
        if (this.diagramEditorInput == null || this.diagramEditorInput.getGmDiagram() == null) {
            throw new IllegalStateException("editor disposed");
        }
        return this.diagramEditorInput;
    }

    @objid ("510b917d-4b3f-48c4-9df8-07bd36ec7029")
    @Override
    public void setBatchMode(boolean batchMode) {
        CommandStack stack = ((CommandStack) this.editor.getAdapter(CommandStack.class));
        if (stack instanceof DiagramCommandStack) {
            ((DiagramCommandStack) stack).setBatchMode(batchMode);
        }
    }

    @objid ("747c03ab-c2ff-4297-b4dc-30a7d391f3b1")
    private class Conditional implements org.eclipse.gef.EditPartViewer.Conditional {
        @objid ("f16d4ae3-5d65-4b42-8797-637b7977bcdb")
        private final ModelElementDropRequest req;

        @objid ("9a7b81dd-4cfc-4524-8bc8-6ca003a55c60")
        public Conditional(final ModelElementDropRequest req) {
            this.req = req;
        }

        @objid ("ea8c0c67-5793-4505-b2ec-b1f562944e51")
        @Override
        public boolean evaluate(final EditPart editpart) {
            return editpart.getTargetEditPart(this.req) != null;
        }

    }

}
