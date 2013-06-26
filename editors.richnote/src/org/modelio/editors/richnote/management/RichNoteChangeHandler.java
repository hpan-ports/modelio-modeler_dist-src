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
                                    

package org.modelio.editors.richnote.management;

import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.statushandlers.IStatusAdapterConstants;
import org.eclipse.ui.statushandlers.StatusAdapter;
import org.eclipse.ui.statushandlers.StatusManager;
import org.modelio.editors.richnote.api.RichNoteFormatRegistry;
import org.modelio.editors.richnote.editor.IRichNoteEditor;
import org.modelio.editors.richnote.editor.IRichNoteFileRepository;
import org.modelio.editors.richnote.plugin.EditorsRichNote;
import org.modelio.gproject.gproject.GProject;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.vbasic.files.FileUtils;
import org.modelio.vcore.model.CompositionGetter;
import org.modelio.vcore.session.api.model.change.IElementDeletedEvent;
import org.modelio.vcore.session.api.model.change.IModelChangeEvent;
import org.modelio.vcore.session.api.model.change.IModelChangeHandler;
import org.modelio.vcore.session.api.model.change.IModelChangeListener;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Model change event handler that:<ul>
 * <li> Move files of deleted rich notes in a temporary directory.
 * <li> Move deleted rich note files back to original place if deletion is undone.
 * <li> Delete deleted elements moved files on save
 * <li> Copy the files on copy/paste
 * </ul>
 * 
 * On session open:<ol>
 * <li>Delete spare files in model directory
 * <li>Clean the recycled bean: <ul>
 * <li> Move back files for still alive elements
 * <li> Delete files whose element does not exist anymore.
 * </ul></ol>
 * 
 * 
 * @author cmarin
 */
@objid ("e5aa4acf-55ed-423e-b917-29ea528d8e1b")
class RichNoteChangeHandler implements IModelChangeHandler, IModelChangeListener {
    /**
     * To enable some debug traces in the console.
     */
    @objid ("cefbce02-78c5-47fb-b71f-5cf30c9ded7d")
    private static final boolean TRACE = false;

    @objid ("3658eb56-abb5-42b9-ade6-4b149b057b85")
    private MultiStatus status;

    /**
     * To avoid handling an event 2 times : before and after the commit.
     */
    @objid ("5eb445e2-2f4f-4676-bbb4-9ab0d62122dd")
    private IModelChangeEvent lastHandledEvent = null;

    @objid ("1ae1e490-0cb6-4e54-93a2-6c821ba55416")
    private GProject project;

    @objid ("28a114ec-2ce4-4a7a-a17f-72bac63cb52d")
    private IRichNoteFileRepository fileManager;

    @objid ("e9017b4c-8209-44d6-a2bc-cdbe412e3751")
    private EditorsRegistry editorRegistry;

    /**
     * Initialize the rich notes handler.
     * @param session the modeling session to handle.
     */
    @objid ("ce5a559d-aede-4b4b-a30f-fa5cb234d56a")
    public RichNoteChangeHandler(final GProject session) {
        this.project = session;
        this.editorRegistry = RichNotesSession.get(session).getEditorRegistry();
    }

    @objid ("d479cb92-576a-489b-b384-560cd4928888")
    @Override
    public void handleModelChange(IModelChangeEvent event) {
        this.lastHandledEvent = event;
        this.status = null;
        
        for (IElementDeletedEvent  del: event.getDeleteEvents()) {
            MObject deletedObj = del.getDeletedElement();
            if (deletedObj instanceof ExternDocument) {
                IRichNoteEditor editor = this.editorRegistry.getEditor(deletedObj);
                if (editor != null) {
                    editor.onOriginalDeleted(deletedObj);
                }
            }
        }
        
        for (MObject el :event.getCreationEvents()) {
            for (ExternDocument doc : getDocuments(el)) {
                String docPath = doc.getPath();
                if ( !docPath.isEmpty()) {
                    try {
                        if (docPath.contains(doc.getUuid().toString())) {
                            // It is a creation or an undelete
                            
                        } else {
                            // It is a copy/paste
                            // TODO unable to get the original rich note content !!
                            Path f = null;
        
                            if (f!= null && Files.isRegularFile(f)) {
                                // Copy the found file to the new file name
                                
                                final Path newFile = this.fileManager.getNewRichNotePath(doc, RichNoteFormatRegistry.getInstance().getFormat(doc));
        
                                Files.copy(f, newFile, StandardCopyOption.REPLACE_EXISTING);
                                
                                this.fileManager.saveRichNote(doc, newFile);
                                
                                if (TRACE)
                                    System.out.println("trace: copied "+f+" to "+newFile);
                                
                            } else {
                                EditorsRichNote.LOG.info("copy/pasted '"+doc.getName()+"' {"+doc.getUuid()+"} rich note has no file.");
                            }
                        }
                    } catch (IOException e) {
                        handleError(e);
                    }
                } 
            }
        }
        
        reportErrors();
    }

    /**
     * Report failures to the user.
     */
    @objid ("70e2d3eb-87d2-4bd5-be6f-056781e7c878")
    private void reportErrors() {
        if (this.status!= null && !this.status.isOK()) {
            StatusAdapter a = new StatusAdapter(this.status);
            a.setProperty(IStatusAdapterConstants.HINT_PROPERTY, EditorsRichNote.I18N.getString("RichNoteChangeHandler.failures.hint"));
            a.setProperty(IStatusAdapterConstants.TITLE_PROPERTY, EditorsRichNote.I18N.getString("RichNoteChangeHandler.failures.title"));
            a.setProperty(IStatusAdapterConstants.EXPLANATION_PROPERTY, EditorsRichNote.I18N.getString("RichNoteChangeHandler.failures.explanation"));
            
            StatusManager.getManager().handle(a, StatusManager.SHOW);
        }
    }

    /**
     * Store the exception in a {@link IStatus}.
     * @param e the exception to handle.
     */
    @objid ("13ebe1ad-f8a7-4cc8-ac01-900548010b27")
    private void handleError(final IOException e) {
        EditorsRichNote.LOG.error(e);
        
        if (this.status == null)
            this.status = new MultiStatus(EditorsRichNote.PLUGIN_ID, 1, 
                    EditorsRichNote.I18N.getString("RichNoteChangeHandler.failures"),
                    null);
        
        
        final Status status2 = new Status(IStatus.ERROR, 
                EditorsRichNote.PLUGIN_ID, 1, 
                getLocalizedMessage(e), 
                null);
        this.status.add(status2);
    }

    /**
     * Compute a user friendly error message.
     * @param e the exception
     * @return the message
     */
    @objid ("498af1c1-3deb-475c-9002-cdb29aeb9240")
    private String getLocalizedMessage(final IOException e) {
        if (e instanceof FileSystemException) {
            FileSystemException fe = (FileSystemException) e;
            return FileUtils.getLocalizedMessage(fe);
        } else {
            return e.getLocalizedMessage();
        }
    }

    @objid ("e3a51cb6-8f65-4267-b68d-e3dc31e2e77b")
    @Override
    public void modelChanged(IModelChangeEvent event) {
        // Handle the event if not already done before the commit.
        // It occurs on undo/redo.
        if (event != this.lastHandledEvent)
            handleModelChange( event);
    }

    /**
     * Get all rich notes in the given element.
     * <p>
     * includes the given element if it is itself a rich note.
     * @param el @return
     */
    @objid ("0a75d556-df57-4949-8b77-a896562893a1")
    private List<ExternDocument> getDocuments(final MObject el) {
        List<ExternDocument> ret = new ArrayList<>();
        
        if (el instanceof ExternDocument)
            ret.add((ExternDocument) el);
        
        
        Set<SmObjectImpl> l = CompositionGetter.getAllChildren(Collections.singleton((SmObjectImpl)el));
        for (MObject child : l) {
            if (child instanceof ExternDocument)
                ret.add((ExternDocument) child);
        }
        return ret;
    }

}
