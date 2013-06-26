package org.modelio.api.impl.editor;

import java.io.File;
import java.io.IOException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.editor.EditorType;
import org.modelio.api.editor.IEditionService;
import org.modelio.api.editor.IMDATextEditor;
import org.modelio.app.core.IModelioEventService;
import org.modelio.app.core.IModelioService;
import org.modelio.app.core.events.ModelioEvent;
import org.modelio.editors.richnote.api.RichNoteCreator;
import org.modelio.editors.richnote.api.RichNoteFormat;
import org.modelio.editors.richnote.api.RichNoteFormatRegistry;
import org.modelio.editors.richnote.api.SupportLevel;
import org.modelio.editors.service.EditionManager;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Artifact;

/**
 * Implementation of {@link IEditionService}
 */
@objid ("9b047d60-f973-4bec-a496-0667720f08b8")
public class EditionService implements IEditionService {
    @objid ("3228e593-d8d7-4787-af2c-1d8357b40952")
    private IModelioEventService eventService;

    @objid ("63d697bb-bd59-4ef0-be04-315baf24008b")
    @Override
    public void closeEditor(IMDATextEditor editor) {
        EditionManager.services().closeEditor(editor);
    }

    @objid ("15b6eb9c-dce2-41fa-ab3e-156bc250f617")
    @Override
    public IMDATextEditor openEditor(ModelElement modelElement, File file, EditorType editorTypeID, boolean readonly) {
        return EditionManager.services().openEditor(modelElement, file, editorTypeID, readonly);
    }

    @objid ("775aa980-fcae-4a9a-934c-5f05762c412f")
    @Override
    public void activateEditor(IMDATextEditor editor) {
        EditionManager.services().activateEditor(editor);
    }

    @objid ("11cb29de-b0d5-41cb-bafe-977b0152d1f9")
    @Override
    public void openEditor(final AbstractDiagram diagram) {
        this.eventService.postAsyncEvent(new IModelioService() {
            @Override
            public String getName() {
                return "openEditor : AbstractDiagram";
            }
        }, ModelioEvent.EDIT_ELEMENT, diagram);
    }

    @objid ("a36eec9b-ce6d-4891-a27c-5feca10158e8")
    @Override
    public void openEditor(final Artifact artifact) {
        this.eventService.postAsyncEvent(new IModelioService() {
            @Override
            public String getName() {
                return "openEditor : Artifact";
            }
        }, ModelioEvent.EDIT_ELEMENT, artifact);
    }

    @objid ("9e8ed4f1-69e0-42c4-952e-343f44036857")
    @Override
    public void openEditor(final ExternDocument document) {
        this.eventService.postAsyncEvent(new IModelioService() {
            @Override
            public String getName() {
                return "openEditor : ExternDocument";
            }
        }, ModelioEvent.EDIT_ELEMENT, document);
    }

    @objid ("0f1883de-d93e-4bb5-8f34-0bd39a384dc7")
    @Override
    public List<String> getSupportedMimeTypes() {
        Collection<RichNoteFormat> formats = RichNoteFormatRegistry.getInstance().getAllFormats();
        List<String> ret = new ArrayList<>(formats.size());
        
        for (RichNoteFormat f : formats) {
            if (f.getSupportLevel() == SupportLevel.Primary)
                ret.add(f.getMimeType());
        }
        return ret;
    }

    @objid ("45d7d726-654e-406d-95e7-38312682375c")
    @Override
    public boolean createDocumentContent(final ExternDocument doc) throws IOException, UnknownServiceException {
        RichNoteCreator.createRichNote(doc);
        return true;
    }

    /**
     * Initialize the edition service.
     * @param eventService the Modelio event service
     */
    @objid ("83aae504-98c5-4e05-aa25-24ca50ff57ae")
    public EditionService(IModelioEventService eventService) {
        this.eventService = eventService;
    }

}
