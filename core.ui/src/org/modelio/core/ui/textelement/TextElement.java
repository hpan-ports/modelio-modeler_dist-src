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
                                    

package org.modelio.core.ui.textelement;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.modelio.app.core.picking.IModelioPickingService;
import org.modelio.app.core.picking.IPickingClient;
import org.modelio.app.core.picking.IPickingSession;
import org.modelio.core.ui.plugin.CoreUi;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.model.search.engine.searchers.model.ModelSearchCriteria;
import org.modelio.model.search.engine.searchers.model.ModelSearchEngine;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.session.api.model.IMObjectFilter;
import org.modelio.vcore.session.impl.CoreSession;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.osgi.framework.Bundle;

/**
 * TextElement is a reusable component wrapping an SWT Text widget that can be used to edit/select a model element. The following
 * features are provided:
 * <ul>
 * <li>auto-completion by name with selection in a popup list when several elements are matching</li>
 * <li>picking of an element in the model</li>
 * <li>dropping of an element from the model</li>
 * </ul>
 * 
 * Note: TextElement wraps a SWT Text because inheriting from Text is not possible. Therefore the getTextControl() method is
 * available to reach the inner Text field, typically for layout purposes.
 */
@objid ("e70f8eef-9420-4153-b86e-1743b583273c")
public class TextElement {
// private PickingDriver pickingDriver;
// private DndDriver dndDriver;
    @objid ("6fb3cc5f-ef1e-4821-91d2-55ad79ad0c47")
    private boolean acceptNullValue;

// end class CompletionDriver
    @objid ("590f4dbf-b019-4fed-9957-b9fcfe09c547")
    public static Image indicatorImage;

    @objid ("70af68a9-be09-495e-83cc-eb9a78e8736b")
    private CompletionDriver completionDriver;

    @objid ("4b03fa46-5e62-4702-9641-554c53dec312")
     final List<MClass> metaclasses = new ArrayList<>();

    /**
     * Current value of the editor, ie either the initial value or the lastly validated one
     */
    @objid ("cf814748-e3f0-4cce-8735-8454f317661e")
    private MObject value;

    /**
     * Chosen value for the editor. This element was chosen by the end-user and will become the editor value on validate(true)
     */
    @objid ("924299b0-22a4-4292-a6e5-b35dc5407d2a")
    private MObject selected;

    /**
     * The wrapped Text widget
     */
    @objid ("722565b9-052e-412e-b2f3-ce6d4f4aea3d")
    private final Text text;

    @objid ("2c04c138-63d3-4eac-a29f-2dcd52bf8e45")
    private final List<ITextElementSelectionListener> listeners = new ArrayList<>(1);

    @objid ("7f74a529-fdc9-4289-9ff7-6a0f1d834050")
    private PickingDriver pickingDriver;

    @objid ("bd3e8559-a0cb-42e8-8abb-16bbc13a6b47")
     IMObjectFilter filter;

    @objid ("ac31aa48-ea31-407c-88c2-78c181314718")
    public TextElement(Composite parent, int style) {
        this.text = createControl(parent, style);
        this.acceptNullValue = true;
    }

    @objid ("d222c576-59c6-4cb3-a081-b541b2a8c41e")
    public boolean acceptNullValue() {
        return this.acceptNullValue;
    }

    @objid ("2a8ae7f7-6ac5-4c3e-bd18-9e112a3e5dc1")
    public void addListener(final ITextElementSelectionListener listener) {
        this.listeners.add(listener);
    }

    @objid ("88354ad8-9533-4506-9939-15cc6c4196f6")
    public void configureCompletion(CoreSession session) {
        this.completionDriver = new CompletionDriver(this, session);
    }

    @objid ("40e35022-8e04-4e24-8070-55645c40638b")
    public List<MClass> getAcceptedMetaclasses() {
        return this.metaclasses;
    }

    @objid ("0066a4b1-e368-4ae0-80b4-ea7b53b2ec64")
    public Text getTextControl() {
        return this.text;
    }

    @objid ("e410f900-cf06-4a82-8572-e0879126d1f4")
    public void removeListener(final ITextElementSelectionListener listener) {
        this.listeners.remove(listener);
    }

    @objid ("6a997806-b01c-4b3c-b421-fc2737566547")
    public void setFilter(IMObjectFilter filter) {
        this.filter = filter;
    }

    @objid ("7a337993-4c4e-498b-951e-ee559d7a38ef")
    public void setValue(MObject value) {
        this.value = value;
        this.text.setText((value != null) ? value.getName() : "");
    }

    @objid ("14b7ac79-01f0-496d-942c-eb508f6eb16e")
    public MObject getValue() {
        return this.value;
    }

    /**
     * Create and configure the wrapped text control
     * @param parent
     * @param style
     * @return the configured Text control
     */
    @objid ("410d2704-bee0-49ea-946f-187b050fcfe1")
    private Text createControl(Composite parent, int style) {
        final Text wrappedText = new Text(parent, style);
        wrappedText.addPaintListener(new TextElementPaintListener());
        return wrappedText;
    }

    @objid ("bfbd7a6b-f3c9-4af8-9db8-244ff28ce279")
    private void fireSelectedElementChanged(final MObject oldElement, final MObject newElement) {
        for (final ITextElementSelectionListener listener : this.listeners) {
            listener.selectedElementChanged(oldElement, newElement);
        }
    }

    /**
     * @return
     */
    @objid ("3abf6d3c-598d-4fd4-9df6-0c0184c0e5e4")
    private String getToolTipText() {
        // TODO the tooltip text should details the accepted values, ie the search criteria
        return "TextElement tooltip";
    }

    @objid ("7995de33-581d-4d81-990d-204e08813663")
    public void setSelectedElement(MObject element) {
        this.selected = element;
        
        // If the element is not null, display its name in the text field
        if (element != null) {
            String textString = element.getName();
            if (element.getCompositionOwner() != null) {
                textString = textString + "  (from " + element.getCompositionOwner().getName() + ")";
            }
            // update text and data
            if (!this.text.isDisposed()) {                
                this.text.setText(textString);
            }
        
        }
        validate(true);
    }

    @objid ("b3760393-31e1-4d15-979b-850072a78afa")
    void validate(boolean save) {
        if (save) {
            // Update the data model from the content of the text field.
            final MObject oldElement = this.value;
            this.value = this.selected;
            fireSelectedElementChanged(oldElement, this.value);       
        }
    }

    @objid ("9f8b07b7-1fe4-42ec-9148-4840ef8c9039")
    public IMObjectFilter getFilter() {
        return this.filter;
    }

    /**
     * Activate completion.
     * @param session
     */
    @objid ("5ac28252-ae38-4ab5-a31f-42f731aecc58")
    public void activateCompletion(ICoreSession session) {
        if (session != null) {
            this.completionDriver = new CompletionDriver(this, (CoreSession) session);
        } else {
            if (this.completionDriver != null) {
                this.completionDriver.terminate();
                this.completionDriver = null;
            }
        
        }
    }

    /**
     * Activate picking.
     * @param pickingService
     */
    @objid ("8cbef902-e2aa-453d-a92e-df6203e2c565")
    public void activatePicking(IModelioPickingService pickingService) {
        if (pickingService != null) {
            this.pickingDriver = new PickingDriver(this, pickingService);
        } else {
            if (this.pickingDriver != null) {
                this.pickingDriver.terminate();
                this.pickingDriver = null;
            }
        }
    }

    @objid ("4e8ae29d-bd3d-48ec-b302-cf11dac4eb6c")
    public void setAcceptNullValue(boolean value) {
        this.acceptNullValue =  value;
    }


static {
        final Bundle imageBundle = Platform.getBundle(CoreUi.PLUGIN_ID);
        final IPath bitmapPath = new Path("icons/indicator.png");
        final URL bitmapUrl = FileLocator.find(imageBundle, bitmapPath, null);
        final ImageDescriptor imageDescriptor = ImageDescriptor.createFromURL(bitmapUrl);
        if (imageDescriptor != null) {
            indicatorImage = imageDescriptor.createImage();
        } else {
            // Image not found
            indicatorImage = null;
        }
    }
    /**
     * Wrapped text decorator. Paints a blue border around the text along with an 'field assist' icon.
     * 
     * @author phv
     */
    @objid ("1c74315a-50f5-4586-9fd2-8cf6f11c48b3")
    private static class TextElementPaintListener implements PaintListener {
        @objid ("269a0ffe-f20e-4e37-97d4-75a61a7feb92")
        @Override
        public void paintControl(PaintEvent e) {
            final GC gc = e.gc;
            final Rectangle oldClip = gc.getClipping();
            final Rectangle clip = new Rectangle(e.x, e.y, e.width, e.height);
            final Rectangle textBounds = ((Text) e.getSource()).getBounds();
            textBounds.x = 1;
            textBounds.y = 1;
            textBounds.height = textBounds.height - 2;
            textBounds.width = textBounds.width - 2;
            
            if (((Text) e.getSource()).isFocusControl()) {
                final Color color = Display.getCurrent().getSystemColor(SWT.COLOR_BLUE);
                gc.setForeground(color);
                gc.setClipping(clip);
                gc.drawRectangle(textBounds);
                gc.setClipping(oldClip);
            }
            
            if (indicatorImage != null) {
                final Rectangle imageRect = indicatorImage.getBounds();
                gc.drawImage(indicatorImage, textBounds.x + textBounds.width - imageRect.width, textBounds.y);
            }
        }

        @objid ("cb8668ea-e904-44d4-919c-175e313a18d3")
        public TextElementPaintListener() {
            // nothing to do
        }

    }

    /**
     * Completion driver. Search model elements matching the current text and the configured completion criteria and propose them to
     * user's choice.
     * 
     * @author phv
     */
    @objid ("5906d77a-b077-4b9e-a4b8-a4b9036c419b")
    static class CompletionDriver {
        @objid ("b4abca67-1fbc-40e0-abb3-eb49b3e1dc82")
        private final ModelSearchCriteria searchCriteria;

        @objid ("8bb5362e-4837-44af-ab3e-67abae244139")
        private final ModelSearchEngine searcher;

        @objid ("1b4d896f-f22a-4fec-b96c-e3835ddf33e2")
        private CoreSession session;

        @objid ("0a11e616-5465-40cc-b1b8-3203a8339391")
        private Text text;

        @objid ("74164e24-0cdf-47ab-b099-9618f61e66fa")
        private TextElement textElement;

        @objid ("447021c5-8b29-46b4-807c-9b87c9efe4cb")
        private KeyListener keyListener;

        @objid ("65285751-2e8e-44fb-b0cf-20276c910abe")
        public CompletionDriver(final TextElement textElement, CoreSession session) {
            this.searchCriteria = new ModelSearchCriteria();
            this.searcher = new ModelSearchEngine();
            this.textElement = textElement;
            this.text = textElement.getTextControl();
            connect(session);
        }

        @objid ("dbc534c3-b241-43ce-9954-62ab692ed8ec")
        private void onCtrlSpace() {
            // Reconfigure search criteria
            this.searchCriteria.reset();
            for (final MClass mc : this.textElement.getAcceptedMetaclasses()) {
                this.searchCriteria.addMetaclass(mc);
            }
            this.searchCriteria.setFilter(this.textElement.getFilter());
            
            final String expression = this.textElement.getTextControl().getText() + ".*";
            
            this.searchCriteria.setExpression(expression);
            
            final List<Element> elements = this.searcher.search(this.session, this.searchCriteria);
            
            if (elements.isEmpty()) {
                // MessageDialog.openInformation(text.getShell(), CoreUi.I18N.getString("KTable.HybridNotFoundTitle"),
                // CoreUi.I18N.getString("KTable.HybridNotFoundMessage"));
                this.textElement.validate(false);
            } else if (elements.size() == 1 && !this.textElement.acceptNullValue()) {
                this.textElement.setSelectedElement(elements.get(0));
            } else {
                // We have several found elements
                final PopupChooser rp = new PopupChooser(this.textElement.getTextControl(), elements,
                        this.textElement.acceptNullValue());
                final ModelElement selected = (ModelElement) rp.getChoice();
            
                this.textElement.setSelectedElement(selected);
            }
        }

        @objid ("2eb32355-fa64-4d05-9c87-bd30b6f9ae7d")
        private void onEnter() {
            // Reconfigure search criteria
            this.searchCriteria.reset();
            for (final MClass mc : this.textElement.getAcceptedMetaclasses()) {
                this.searchCriteria.addMetaclass(mc);
            }
            this.searchCriteria.setFilter(this.textElement.getFilter());
            
            final String expression = this.text.getText();
            this.searchCriteria.setExpression(expression);
            
            List<Element> elements = this.searcher.search(this.session, this.searchCriteria);
            
            if (elements.isEmpty()) {
                // Retry with regular expression
                this.searchCriteria.setExpression(expression + ".*");
                elements = this.searcher.search(this.session, this.searchCriteria);
            
                if (elements.isEmpty()) {
                    this.textElement.validate(false);
                } else if (elements.size() == 1) {
                    this.textElement.setSelectedElement(elements.get(0));
                } else {
                    // We have several found elements
                    final PopupChooser rp = new PopupChooser(this.text, elements, this.textElement.acceptNullValue());
                    final ModelElement selected = (ModelElement) rp.getChoice();
                    this.textElement.setSelectedElement(selected);
                }
            } else if (elements.size() == 1) {
                this.textElement.setSelectedElement(elements.get(0));
            } else {
                // We have several found elements
                final PopupChooser rp = new PopupChooser(this.text, elements, this.textElement.acceptNullValue());
                final ModelElement selected = (ModelElement) rp.getChoice();
                this.textElement.setSelectedElement(selected);
            }
            return;
        }

        /**
         * Driving the auto-completion.<br/>
         * On 'ENTER':<br/>
         * Search for an element which name is the currently entered text value
         * <ul>
         * <li>if a unique element is found, validate the entry with it</li>
         * <li>if several elements are found, open the popup chooser initialized by the search results</li>
         * <li>if no element is found, open the popup initialized by a regexp (current text + .*) and start the search immediately</li>
         * <li>validate the entry when the chooser popup returns</li>
         * </ul>
         * @param e
         */
        @objid ("37fdaa3a-31c8-4715-b6d4-d246e4f9e404")
        void onKeyPressed(KeyEvent e) {
            if (this.textElement == null) return;
            if (e.character == '\r') {
                onEnter();
            } else if ((e.character == ' ') && ((e.stateMask & SWT.CTRL) != 0)) {
                onCtrlSpace();
            } else if (e.character == SWT.ESC) {
                this.textElement.validate(false);
            }
        }

        @objid ("98079e41-fc99-4beb-b553-37d756175074")
        public void terminate() {
            disconnect();
            this.textElement = null;
            this.text = null;
        }

        @objid ("da2933f9-d5ba-405c-9d80-21834e9ab725")
        private void connect(CoreSession coreSession) {
            this.session = coreSession;
            
            // Register a key listener on the wrapped text control
            this.keyListener = new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    try {
                        onKeyPressed(e);
                    } catch (final Exception ex) {
                        ex.printStackTrace();
                        // Do nothing
                    }
                }
            };
            
            this.textElement.getTextControl().addKeyListener(this.keyListener);
        }

        @objid ("556e862f-06ce-48f0-ab8f-8a476d1717b1")
        private void disconnect() {
            if (!this.text.isDisposed()) {
                this.text.removeKeyListener(this.keyListener);
            }
            this.keyListener = null;
            this.session = null;
        }

    }

    @objid ("2ba901bc-9571-409a-96f6-26ab0493324b")
    static class PickingDriver implements IPickingClient {
        @objid ("71c794ed-61fc-4708-8b87-654567ee5875")
        private IModelioPickingService pickingService;

        @objid ("d9d6dc91-3877-44af-ba0f-e694f5e116b8")
        private TextElement textElement;

        @objid ("5569468e-21d4-4d53-93b5-896dc2b65731")
        private FocusListener focusListener;

        @objid ("cc247753-f1b1-4cc4-ad6a-49f7ff75ab39")
        private IPickingSession pickingSession;

        @objid ("91485e7d-16ee-4ddf-8def-591e3d49afda")
        public PickingDriver(TextElement textElement, IModelioPickingService pickingService) {
            this.textElement = textElement;
            this.pickingService = pickingService;
            connect();
        }

        @objid ("7176fe97-535e-4630-8d57-8a34d065a50d")
        void startPicking() {
            if (this.pickingSession == null) {
                this.pickingSession = this.pickingService.startPicking(this);
            }
        }

        @objid ("6e213995-21df-4ecb-a400-9ef6a38d8448")
        void stopPicking() {
            if (this.pickingSession != null) {
                this.pickingService.stopPicking(this.pickingSession);
                this.pickingSession = null;
            }
        }

        @objid ("003cef22-e939-4463-b9b2-559f6cabb9f5")
        private void connect() {
            this.focusListener = new FocusListener() {
                @Override
                public void focusLost(FocusEvent e) {
                    PickingDriver.this.stopPicking();
                }
            
                @Override
                public void focusGained(FocusEvent e) {
                    PickingDriver.this.startPicking();
                }
            };
            this.textElement.getTextControl().addFocusListener(this.focusListener);
        }

        @objid ("4976289f-e257-482e-9df2-1e98abe0b7a6")
        private void disconnect() {
            if (!this.textElement.getTextControl().isDisposed()) {                
                this.textElement.getTextControl().removeFocusListener(this.focusListener);
            }
            this.focusListener = null;
            if (this.pickingSession != null) {
                this.pickingSession.abort();
            }
        }

        /**
         * Get rid of this picking driver: disconnect it from the text field and clean up references to help garbaging.
         */
        @objid ("63c74bf7-7712-4168-a699-0e2f29a38d67")
        void terminate() {
            disconnect();
            this.pickingService = null;
        }

        @objid ("1228e614-8211-401d-92a6-2c4e83ae0d6a")
        @Override
        public boolean hover(MObject target) {
            // does 'target' match textElement criteria
            return (target != null) && (metaclassMatch(target))
                    && ((this.textElement.filter != null) ? this.textElement.filter.accept(target) : true);
        }

        @objid ("25ac46b7-a742-41f2-a67b-2f57b1e2f149")
        private boolean metaclassMatch(MObject obj) {
            final Class<? extends MObject> cls = Metamodel.getJavaInterface(obj.getMClass());
            for (final MClass mc : this.textElement.metaclasses) {
                if (Metamodel.getJavaInterface(mc).isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }

        @objid ("dfb28ba8-5211-423b-a1a3-74c15c2690c7")
        @Override
        public boolean pick(MObject target) {
            // use target as value for TextElement
            this.textElement.setSelectedElement(target);
            return true;
        }

        @objid ("f2733d88-6fc2-41b5-b5dd-667d04f1a83d")
        @Override
        public void abort() {
            // Someone or something aborted our picking session.
            if (this.pickingSession != null) {
                this.pickingService.stopPicking(this.pickingSession);
                this.pickingSession = null;
            }
            this.textElement.validate(false);
        }

    }

}
// end TextElement
