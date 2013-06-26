/*
 * Copyright 2013 Modeliosoft
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *       http://www.apache.org/licenses/LICENSE-2.0
 *        
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */  
                                    

package org.modelio.api.editor;

import java.io.File;
import java.io.IOException;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Artifact;

/**
 * This interface defines services to open, close and select Modelio editors.<p>
 * A text editor is bound to a model element and a file, and must have one of those types:<br>
 * <li>"com.modeliosoft.modelio.edition.TXTEditorID" - Standard text editor</li>
 * <li>"com.modeliosoft.modelio.edition.MDDEditorID" - Model Driven editor, edition is only available between markers.</li>
 * <li>"com.modeliosoft.modelio.edition.RTEditorID" - Round Trip editor, only annotations bounds to Modelio can't be edited.</li>
 * <p>
 * Each editor can be set to read-only mode.
 * @see IMDAEditorListener
 */
@objid ("71f2e307-6c24-11e0-b589-002564c97630")
public interface IEditionService {
    /**
     * Close the given text editor.
     * @param editor The text editor to close.
     */
    @objid ("ab3f7747-6c24-11e0-b589-002564c97630")
    void closeEditor(final IMDATextEditor editor);

    /**
     * Set the focus on a specific editor.
     * @param editor the editor to focus.
     */
    @objid ("ab3f9e59-6c24-11e0-b589-002564c97630")
    void activateEditor(final IMDATextEditor editor);

    /**
     * Indicates which mime type are supported in the current instance of Modelio.
     * @return the supported mime type list.
     * @since 2.1
     */
    @objid ("a46397bc-1c25-11e1-a04f-002564c97630")
    List<String> getSupportedMimeTypes();

    /**
     * Open a new text editor, making the correspondence between a model element and a file.
     * @param modelElement the model element to edit.
     * @param file the file to display in the editor.
     * @param editorTypeID the type of the editor to open.
     * @param readonly <code>true</code> if the editor is in read only mode.
     * @return the opened editor.
     */
    @objid ("a4078774-0ecc-11e2-96c4-002564c97630")
    IMDATextEditor openEditor(final ModelElement modelElement, final File file, final EditorType editorTypeID, final boolean readonly);

    /**
     * Open a diagram editor from an absract diagram.
     * @param diagram the diagram to edit.
     * @since 2.1
     */
    @objid ("a407d596-0ecc-11e2-96c4-002564c97630")
    void openEditor(final AbstractDiagram diagram);

    /**
     * Open an editor from an artifact.<br>
     * The file declared by the artifact must be part of the supported mime type list.
     * @param artifact the artifact to edit.
     * @since 2.1
     */
    @objid ("a407fca7-0ecc-11e2-96c4-002564c97630")
    void openEditor(final Artifact artifact);

    /**
     * Open an editor from an extern document.<br>
     * The type of the document's file must be part of the supported mime type list.
     * @param document the extern document to edit.
     * @since 2.1
     */
    @objid ("a40823b8-0ecc-11e2-96c4-002564c97630")
    void openEditor(final ExternDocument document);

    /**
     * Create a document content for the given document.
     * <p>
     * A default content is found by 2 ways: <ol>
     * <li> Look for a document named "default" under the {@link ExternDocumentType} with the same MIME type.
     * <li> Look in <i>.projectdata/admin/documents</i> for a file named:
     * <ol>
     * <li> <code>role_name.mime_type.dat</code>  like file
     * <li> <code>role_name.dat</code>  like file.
     * </ol>
     * All invalid characters for a file name in the document type and MIME type
     * are replaced by '_' when looked for the file.
     * <li> If everything failed then an empty content valid for the MIME type is created.
     * </ol>
     * @param doc The document to initialize
     * @return <code>true</code> if the file was created, false if no default content could be found.
     * @throws java.io.IOException in case of error trying to create the file.
     * @since 2.1
     */
    @objid ("a4084ac9-0ecc-11e2-96c4-002564c97630")
    boolean createDocumentContent(final ExternDocument doc) throws IOException;

}
