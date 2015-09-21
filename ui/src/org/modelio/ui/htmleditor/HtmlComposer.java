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


package org.modelio.ui.htmleditor;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.accessibility.Accessible;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;
import org.eclipse.swt.browser.OpenWindowListener;
import org.eclipse.swt.browser.ProgressAdapter;
import org.eclipse.swt.browser.ProgressEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.HelpListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.graphics.Region;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.swt.widgets.ScrollBar;
import org.eclipse.swt.widgets.Shell;
import org.modelio.ui.htmleditor.commands.Command;
import org.modelio.ui.htmleditor.commands.GetHtmlCommand;
import org.modelio.ui.htmleditor.commands.SetHtmlCommand;
import org.modelio.ui.htmleditor.events.NodeSelectionEvent;
import org.modelio.ui.htmleditor.listener.NodeSelectionChangeListener;
import org.modelio.ui.htmleditor.util.ColorConverter;
import org.modelio.ui.plugin.UI;

/**
 * @author Tom Seidel <tom.seidel@remus-software.org>
 */
@objid ("f1ee600e-4b64-4254-a8b3-6733b8684fbb")
public class HtmlComposer {
    /**
     * Flag if the ckeditor finishes its initialization and is ready for receiving commands.
     */
    @objid ("9054d806-2849-4e2e-b8db-5278fd90baad")
    private volatile boolean initialized;

    /**
     * The wrapped browser widget.
     */
    @objid ("389a9b04-158a-4745-8a72-ef5d02b6e8c3")
    private final Browser browser;

    @objid ("921f99b9-2c3a-4b4b-89d9-048c148375eb")
    private final List<FocusListener> focusListeners = new ArrayList<>();

    @objid ("45b2042a-c759-4c09-a6af-69f56a358007")
    private transient List<ModifyListener> modifyListenerList = new ArrayList<>();

    /**
     * a temporary collection of commands that are executed before the ckeditor was initialized. If the ckeditor finishes its
     * initialization all commands are executed.
     * 
     * @see HtmlComposer#initialize()
     */
    @objid ("1880377f-6b4f-43f6-b22c-fd855578fa46")
    private final List<Command> pendingCommands = Collections.synchronizedList(new ArrayList<Command>());

    /**
     * A map of callback-Ids and their appended Listeners. This is
     */
    @objid ("6e4e7c87-5c6e-4787-8fc1-16a5c98318e5")
    private final Map<String, List<ModifyListener>> pendingListenerCallBackMap = new HashMap<>();

    /**
     * A map of commands that were executed before the widget was initialized and their appending listeners which are still waiting
     * for an event.
     */
    @objid ("abd434b0-7052-4275-9a4f-cf0ae22e6e4b")
    private final Map<Command, List<ModifyListener>> pendingListeners = new HashMap<>();

    /**
     * A list of listeners which fire if the selected node within the html is changed.
     */
    @objid ("d0c46e39-f4ad-4292-8871-e6128bc090d2")
    private transient List<NodeSelectionChangeListener> selectionListenerList = new ArrayList<>();

    /**
     * Tracked {@link Command}s.
     */
    @objid ("5e376d36-1b9a-4377-a98c-6070cdeb4a08")
    private final Map<String, Command> trackedCommands = new HashMap<>();

    /**
     * Constructs a new instance of a {@link Browser} and includes a ckeditor instance.
     * @see Browser#Browser(Composite, int)
     * @since 0.8
     * @param parent a composite control which will be the parent of the new instance (cannot be null)
     * @param style the style of control to construct
     */
    @objid ("81087760-15f7-41aa-909e-eeabdb073191")
    public HtmlComposer(final Composite parent, final int style) {
        // System.out.println("C'Tor HtmlComposer.HtmlComposer()");
        this.browser = new Browser(parent, style);
        this.browser.setMenu(new Menu(this.browser));
        new InitFunction(this.browser);
        URL baseUrl;
        try {
            baseUrl = FileLocator.resolve(FileLocator.find(UI.getContext().getBundle(), new Path("rte/js/base.html"),
                    Collections.EMPTY_MAP));
            this.browser.setUrl(baseUrl.toString());
            this.browser.addProgressListener(new ProgressAdapter() {
                @Override
                public void completed(ProgressEvent event) {
                    // System.out.println("HtmlComposer loading base.html completed()");
                    HtmlComposer.this.browser.execute("integration.eclipseRunning = true;");
                    HtmlComposer.this.browser.removeProgressListener(this);
                }
            });
        
            // Slight delay seems to help initialization ???
            try {
                Thread.sleep(250);
            } catch (final InterruptedException e) {
        
                e.printStackTrace();
            }
        
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param listener
     * @see org.eclipse.swt.widgets.Control#addControlListener(org.eclipse.swt.events.ControlListener)
     */
    @objid ("2b3a8b01-411e-423c-bd3b-d9e4dc4331ce")
    public void addControlListener(final ControlListener listener) {
        this.browser.addControlListener(listener);
    }

    /**
     * @param listener
     * @see org.eclipse.swt.widgets.Widget#addDisposeListener(org.eclipse.swt.events.DisposeListener)
     */
    @objid ("f357268e-a41c-46e0-a846-4fad6032e089")
    public void addDisposeListener(final DisposeListener listener) {
        this.browser.addDisposeListener(listener);
    }

    /**
     * @param listener
     * @see org.eclipse.swt.widgets.Control#addFocusListener(org.eclipse.swt.events.FocusListener)
     */
    @objid ("de0b6a6a-18e3-4a85-bd3f-4cab565d3567")
    public void addFocusListener(final FocusListener listener) {
        // this.browser.addFocusListener(listener);
        this.focusListeners.add(listener);
    }

    /**
     * @param listener
     * @see org.eclipse.swt.widgets.Control#addHelpListener(org.eclipse.swt.events.HelpListener)
     */
    @objid ("46252512-c7fe-40ea-bd00-911d3925a074")
    public void addHelpListener(final HelpListener listener) {
        this.browser.addHelpListener(listener);
    }

    @objid ("280ed00e-3361-472f-adbd-e314392efea5")
    public void addModifyListener(ModifyListener listener) {
        this.modifyListenerList.add(listener);
    }

    @objid ("bd0e2816-f30e-4c07-9744-b43338ee985d")
    public void addNodeSelectionChangeListener(NodeSelectionChangeListener listener) {
        this.selectionListenerList.add(listener);
    }

    /**
     * @param listener
     * @see org.eclipse.swt.widgets.Control#addPaintListener(org.eclipse.swt.events.PaintListener)
     */
    @objid ("3ab27ead-1c33-48f7-a4e8-088b1f4c88b8")
    public void addPaintListener(final PaintListener listener) {
        this.browser.addPaintListener(listener);
    }

    /**
     * @param listener
     * @see org.eclipse.swt.widgets.Control#addTraverseListener(org.eclipse.swt.events.TraverseListener)
     */
    @objid ("80abdb6d-733d-48fb-9c9a-e13244032720")
    public void addTraverseListener(final TraverseListener listener) {
        this.browser.addTraverseListener(listener);
    }

    /**
     * @param wHint
     * @see org.eclipse.swt.widgets.Control#computeSize(int, int)
     * @param hHint @return
     */
    @objid ("64b101e8-5319-4e13-82d2-1335bee96ba9")
    public Point computeSize(final int wHint, final int hHint) {
        return this.browser.computeSize(wHint, hHint);
    }

    /**
     * @param wHint
     * @param hHint
     * @see org.eclipse.swt.widgets.Composite#computeSize(int, int, boolean)
     * @param changed @return
     */
    @objid ("f9ec6fc9-9c60-4538-a8c5-e55e9ca98c7f")
    public Point computeSize(final int wHint, final int hHint, final boolean changed) {
        return this.browser.computeSize(wHint, hHint, changed);
    }

    /**
     * @param x
     * @param y
     * @param width
     * @see org.eclipse.swt.widgets.Scrollable#computeTrim(int, int, int, int)
     * @param height @return
     */
    @objid ("fd8c617a-a5ca-4a16-93d3-c62f989d3f69")
    public Rectangle computeTrim(final int x, final int y, final int width, final int height) {
        return this.browser.computeTrim(x, y, width, height);
    }

    /**
     * @see org.eclipse.swt.widgets.Widget#dispose()
     */
    @objid ("4e73bf7c-f95e-4ec4-be71-b6dc6ee365db")
    public void dispose() {
        final Collection<Command> values = this.trackedCommands.values();
        this.browser.dispose();
    }

    /**
     * @throws SWTException
     * @see org.eclipse.swt.browser.Browser#evaluate(java.lang.String)
     * @param script @return
     */
    @objid ("5912e6ae-2746-4730-bbf4-0c7ccf24cffc")
    public Object evaluate(String script) throws SWTException {
        return this.browser.evaluate(script);
    }

    /**
     * @see org.eclipse.swt.browser.Browser#execute(java.lang.String)
     * @param script @return
     */
    @objid ("21c17b88-11e6-4be8-928b-802ddf664e73")
    public boolean execute(String script) {
        final boolean b = this.browser.execute(script);
        return b;
    }

    /**
     * Executes a given command
     * @param command the command to execute
     */
    @objid ("6480584c-dfe5-46a0-94d0-7784f4c265f9")
    public void execute(Command command) {
        // System.out.println("HtmlComposer.execute() " + command.toString());
        if (this.initialized) {
            /*
             * if the command was executed while the ckeditor was not initialized yet. this is required to keep track of the
             * listeners that needs to be notified if a command is executed before the widget was initialized but also to filter the
             * listeners that were added to the widget after the originating command was scheduled.
             */
            if (this.pendingListeners.get(command) != null) {
                final String nanoTime = String.valueOf(System.nanoTime());
                this.pendingListenerCallBackMap.put(nanoTime, this.pendingListeners.get(command));
                execute("integration.pendingCommandIdentifier = \'" + nanoTime + "\';");
                execute(command.getScript());
                this.pendingListeners.remove(command);
            } else {
                execute("integration.pendingCommandIdentifier = \'\';");
                execute(command.getScript());
            }
        } else {
            // System.out.println("HtmlComposer.execute(command) " + command.toString() + " HtlComposer not initialized !");
            this.pendingListeners.put(command, new ArrayList<>(this.modifyListenerList));
            this.pendingCommands.add(command);
        }
    }

    /**
     * Execute a command wit a result.
     * @param command the command to execute
     * @return the result of the execution.
     */
    @objid ("d66e4388-3a81-4bc5-8117-bb3aa68875ef")
    public Object executeWithReturn(Command command) {
        if (this.initialized) {
            return evaluate(command.getScript());
        }
        return null;
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Control#forceFocus()
     */
    @objid ("ffb118a7-32e4-4e32-948f-a7ea6c0c9334")
    public boolean forceFocus() {
        return this.browser.forceFocus();
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Control#getAccessible()
     */
    @objid ("36b40f68-cfbb-4962-8cd9-2b97cf140f5e")
    public Accessible getAccessible() {
        return this.browser.getAccessible();
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Control#getBackground()
     */
    @objid ("94c10311-3e76-47b7-b7d8-0a5ba785921f")
    public Color getBackground() {
        return this.browser.getBackground();
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Control#getBackgroundImage()
     */
    @objid ("a0086d39-b898-43f4-8f5f-3c77657292e0")
    public Image getBackgroundImage() {
        return this.browser.getBackgroundImage();
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Composite#getBackgroundMode()
     */
    @objid ("74e69c4e-b05e-4e00-b33e-4159fd8b5afc")
    public int getBackgroundMode() {
        return this.browser.getBackgroundMode();
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Control#getBorderWidth()
     */
    @objid ("ff947aae-7f03-4570-8da3-db79fbcdff07")
    public int getBorderWidth() {
        return this.browser.getBorderWidth();
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Control#getBounds()
     */
    @objid ("5cf90c84-4a4f-4371-aeb9-8729be352df1")
    public Rectangle getBounds() {
        return this.browser.getBounds();
    }

    @objid ("5248654e-139d-4b79-a928-7cf36330fa05")
    public Browser getBrowser() {
        return this.browser;
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Composite#getChildren()
     */
    @objid ("32f72af0-11bb-41a8-8a6a-be5b4c41180f")
    public Control[] getChildren() {
        return this.browser.getChildren();
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Scrollable#getClientArea()
     */
    @objid ("4fe8d849-0a70-4daf-bbf5-8570c8def77a")
    public Rectangle getClientArea() {
        return this.browser.getClientArea();
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Control#getCursor()
     */
    @objid ("5e29d444-e848-4999-9589-7b1413fc4318")
    public Cursor getCursor() {
        return this.browser.getCursor();
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Widget#getData()
     */
    @objid ("5391ab5c-a60f-4675-ba10-30eebd4c4cd7")
    public Object getData() {
        return this.browser.getData();
    }

    /**
     * @see org.eclipse.swt.widgets.Widget#getData(java.lang.String)
     * @param key @return
     */
    @objid ("a6bf5b56-e9b4-4c24-ad5a-e92262010b44")
    public Object getData(final String key) {
        return this.browser.getData(key);
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Widget#getDisplay()
     */
    @objid ("d309251e-4e28-4193-8fa0-1309a6e6e5ab")
    public Display getDisplay() {
        return this.browser.getDisplay();
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Control#getEnabled()
     */
    @objid ("15ce9d6f-6d2a-4e53-b7d1-010ed685209f")
    public boolean getEnabled() {
        return this.browser.getEnabled();
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Control#getFont()
     */
    @objid ("6e965885-d87f-4923-911d-d35d6269325a")
    public Font getFont() {
        return this.browser.getFont();
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Control#getForeground()
     */
    @objid ("c2089e63-6802-4bb5-a2b3-7ff285350127")
    public Color getForeground() {
        return this.browser.getForeground();
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Scrollable#getHorizontalBar()
     */
    @objid ("4052668a-0346-4f2c-8ca1-07f8d2194a12")
    public ScrollBar getHorizontalBar() {
        return this.browser.getHorizontalBar();
    }

    /**
     * Returns the current html content of the widget
     * @return the html
     */
    @objid ("557dd26b-2197-4b36-89b5-5ddd04852ac7")
    public String getHtml() {
        final GetHtmlCommand getHtmlCommand = new GetHtmlCommand();
        final Object executeWithReturn = executeWithReturn(getHtmlCommand);
        if (executeWithReturn != null) {
            // CkEditor adds many newlines between paragraphs, remove them.
            return String.valueOf(executeWithReturn).replace("</p>\n\n<p", "</p><p").replace("</p>\n\n<table", "</p><table")
                    .replace("</table>\n\n<p", "</table><p");
        }
        return null;
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Composite#getLayout()
     */
    @objid ("836900f9-cc29-4189-bb40-831c179071f4")
    public Layout getLayout() {
        return this.browser.getLayout();
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Control#getLayoutData()
     */
    @objid ("e6c8ca32-d251-4a0a-a48b-371880c5cf66")
    public Object getLayoutData() {
        return this.browser.getLayoutData();
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Composite#getLayoutDeferred()
     */
    @objid ("b15998fd-4b2c-4fe8-aec8-50b5e40650a1")
    public boolean getLayoutDeferred() {
        return this.browser.getLayoutDeferred();
    }

    /**
     * @see org.eclipse.swt.widgets.Widget#getListeners(int)
     * @param eventType @return
     */
    @objid ("768a687d-78e0-40ae-a2af-6777ad247f95")
    public Listener[] getListeners(final int eventType) {
        return this.browser.getListeners(eventType);
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Control#getLocation()
     */
    @objid ("cd3ee9e7-c627-4e55-805f-480ba04b8770")
    public Point getLocation() {
        return this.browser.getLocation();
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Control#getMenu()
     */
    @objid ("8a92c8fc-f864-498f-8ef6-5803c54fe504")
    public Menu getMenu() {
        return this.browser.getMenu();
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Control#getMonitor()
     */
    @objid ("a34f0717-cb31-4e7a-87e4-db9cfde3880a")
    public Monitor getMonitor() {
        return this.browser.getMonitor();
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Control#getParent()
     */
    @objid ("83e47525-4314-4c21-9276-be3e2d69b4e0")
    public Composite getParent() {
        return this.browser.getParent();
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Control#getRegion()
     */
    @objid ("b85f2d37-d4b0-4cbf-9332-c4391255cafa")
    public Region getRegion() {
        return this.browser.getRegion();
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Control#getShell()
     */
    @objid ("a3436179-d321-4db3-aa51-305ff0491c71")
    public Shell getShell() {
        return this.browser.getShell();
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Control#getSize()
     */
    @objid ("54ff373c-9994-4f58-8222-d87b33eaf466")
    public Point getSize() {
        return this.browser.getSize();
    }

    /**
     * @return
     * @see org.eclipse.swt.browser.Browser#getStyle()
     */
    @objid ("61a9941e-65a2-4ff0-9972-bb1f83105e1a")
    public int getStyle() {
        return this.browser.getStyle();
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Composite#getTabList()
     */
    @objid ("2faa0c49-609d-4eb0-8a7b-94f61760a76b")
    public Control[] getTabList() {
        return this.browser.getTabList();
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Scrollable#getVerticalBar()
     */
    @objid ("616814b2-1295-456b-89f1-f4e7727bdb4b")
    public ScrollBar getVerticalBar() {
        return this.browser.getVerticalBar();
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Control#getVisible()
     */
    @objid ("5a70c500-5698-4033-b84d-5134364f89fa")
    public boolean getVisible() {
        return this.browser.getVisible();
    }

    /**
     * @return
     * @see org.eclipse.swt.browser.Browser#getWebBrowser()
     */
    @objid ("407de244-7937-4e12-a16d-b837efbd562d")
    public Object getWebBrowser() {
        return this.browser.getWebBrowser();
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Widget#isDisposed()
     */
    @objid ("a9295bc2-9294-424c-b63e-ffa3b9aafe5d")
    public boolean isDisposed() {
        return this.browser.isDisposed();
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Control#isEnabled()
     */
    @objid ("880c2137-516a-416a-9047-f0ea05ff3bbc")
    public boolean isEnabled() {
        return this.browser.isEnabled();
    }

    /**
     * @return
     * @see org.eclipse.swt.browser.Browser#isFocusControl()
     */
    @objid ("b5d05ff9-d143-4a0f-ad0f-16159b928b2c")
    public boolean isFocusControl() {
        return this.browser.isFocusControl();
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Composite#isLayoutDeferred()
     */
    @objid ("9e2b1568-cfcf-4c30-8cc2-b885e0d4037d")
    public boolean isLayoutDeferred() {
        return this.browser.isLayoutDeferred();
    }

    /**
     * @see org.eclipse.swt.widgets.Widget#isListening(int)
     * @param eventType @return
     */
    @objid ("9718c202-0358-4853-bed1-89b4de17fc09")
    public boolean isListening(final int eventType) {
        return this.browser.isListening(eventType);
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Control#isReparentable()
     */
    @objid ("1ea59a2f-b392-426a-8bb3-03e86fef8b47")
    public boolean isReparentable() {
        return this.browser.isReparentable();
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Control#isVisible()
     */
    @objid ("39f6e7c1-ed6f-4a79-b0cb-7b21e474f66c")
    public boolean isVisible() {
        return this.browser.isVisible();
    }

    /**
     * @see org.eclipse.swt.widgets.Composite#layout()
     */
    @objid ("6e87a262-a4b1-44ca-bc1b-7a62aade4789")
    public void layout() {
        this.browser.layout();
    }

    /**
     * @param changed
     * @see org.eclipse.swt.widgets.Composite#layout(boolean)
     */
    @objid ("19d893b4-b992-4bf8-bb1d-6d0fc6fd87d3")
    public void layout(final boolean changed) {
        this.browser.layout(changed);
    }

    /**
     * @param changed
     * @param all
     * @see org.eclipse.swt.widgets.Composite#layout(boolean, boolean)
     */
    @objid ("2e95123a-4a1a-404e-8020-0b659a62944b")
    public void layout(final boolean changed, final boolean all) {
        this.browser.layout(changed, all);
    }

    /**
     * @param changed
     * @see org.eclipse.swt.widgets.Composite#layout(org.eclipse.swt.widgets.Control[])
     */
    @objid ("4a9cfffb-3437-49be-9cf3-afc7f74ed73b")
    public void layout(final Control[] changed) {
        this.browser.layout(changed);
    }

    /**
     * @param control
     * @see org.eclipse.swt.widgets.Control#moveAbove(org.eclipse.swt.widgets.Control)
     */
    @objid ("61813912-771d-44c8-afd9-dc6ecb9adf0b")
    public void moveAbove(final Control control) {
        this.browser.moveAbove(control);
    }

    /**
     * @param control
     * @see org.eclipse.swt.widgets.Control#moveBelow(org.eclipse.swt.widgets.Control)
     */
    @objid ("1abdedc3-7e9d-45af-8c06-400d51b1a8c9")
    public void moveBelow(final Control control) {
        this.browser.moveBelow(control);
    }

    /**
     * @param eventType
     * @param event
     * @see org.eclipse.swt.widgets.Widget#notifyListeners(int, org.eclipse.swt.widgets.Event)
     */
    @objid ("2371e5e1-336e-4fd4-af3b-d6d4315c9a25")
    public void notifyListeners(final int eventType, final Event event) {
        this.browser.notifyListeners(eventType, event);
    }

    /**
     * @see org.eclipse.swt.widgets.Control#pack()
     */
    @objid ("c63d4e8e-53e8-4505-aa98-47b4de1dba5c")
    public void pack() {
        this.browser.pack();
    }

    /**
     * @param changed
     * @see org.eclipse.swt.widgets.Control#pack(boolean)
     */
    @objid ("6fdf96d5-c6ad-4e24-b387-2ca33e14f62f")
    public void pack(final boolean changed) {
        this.browser.pack(changed);
    }

    /**
     * @see org.eclipse.swt.widgets.Control#print(org.eclipse.swt.graphics.GC)
     * @param gc @return
     */
    @objid ("c2f12c49-fa99-4d4d-b259-de7f78eb6268")
    public boolean print(final GC gc) {
        return this.browser.print(gc);
    }

    /**
     * @see org.eclipse.swt.widgets.Control#redraw()
     */
    @objid ("fcb3709f-b1fb-49ea-90de-efdf4b898a9d")
    public void redraw() {
        this.browser.redraw();
    }

    /**
     * @param x
     * @param y
     * @param width
     * @param height
     * @param all
     * @see org.eclipse.swt.widgets.Control#redraw(int, int, int, int, boolean)
     */
    @objid ("af6ccadf-a4d7-4f6c-8a5a-df480d5e9bbb")
    public void redraw(final int x, final int y, final int width, final int height, final boolean all) {
        this.browser.redraw(x, y, width, height, all);
    }

    /**
     * @see org.eclipse.swt.browser.Browser#refresh()
     */
    @objid ("c10a1145-61e5-4c69-b40e-dfd8ebff5d0c")
    public void refresh() {
        this.browser.refresh();
    }

    /**
     * @param listener
     * @see org.eclipse.swt.widgets.Widget#removeDisposeListener(org.eclipse.swt.events.DisposeListener)
     */
    @objid ("1270d050-d052-4949-82d3-da38153233f1")
    public void removeDisposeListener(final DisposeListener listener) {
        this.browser.removeDisposeListener(listener);
    }

    /**
     * @param listener
     * @see org.eclipse.swt.widgets.Control#removeFocusListener(org.eclipse.swt.events.FocusListener)
     */
    @objid ("ed27d86e-7577-4f81-9c27-8423aadfde87")
    public void removeFocusListener(final FocusListener listener) {
        // this.browser.removeFocusListener(listener);
        this.focusListeners.remove(listener);
    }

    /**
     * @param listener
     * @see org.eclipse.swt.widgets.Control#removeHelpListener(org.eclipse.swt.events.HelpListener)
     */
    @objid ("f63d73b2-59a5-445d-86b8-f80f3ef7f9b7")
    public void removeHelpListener(final HelpListener listener) {
        this.browser.removeHelpListener(listener);
    }

    @objid ("2c47400e-b3d8-40c7-a1cb-936c84322d9b")
    public void removeModifyListener(ModifyListener listener) {
        this.modifyListenerList.remove(listener);
    }

    @objid ("4e39954f-a05f-4493-8be0-b8d73139cbc0")
    public void removeNodeSelectionChangeListener(NodeSelectionChangeListener listener) {
        this.selectionListenerList.remove(listener);
    }

    /**
     * @param listener
     * @see org.eclipse.swt.browser.Browser#removeOpenWindowListener(org.eclipse.swt.browser.OpenWindowListener)
     */
    @objid ("a5f6d330-d3d5-4440-b240-3e97b6d6f35e")
    public void removeOpenWindowListener(final OpenWindowListener listener) {
        this.browser.removeOpenWindowListener(listener);
    }

    /**
     * @param listener
     * @see org.eclipse.swt.widgets.Control#removePaintListener(org.eclipse.swt.events.PaintListener)
     */
    @objid ("863d5dbe-2946-4c45-be01-6305a6316275")
    public void removePaintListener(final PaintListener listener) {
        this.browser.removePaintListener(listener);
    }

    /**
     * @param listener
     * @see org.eclipse.swt.widgets.Control#removeTraverseListener(org.eclipse.swt.events.TraverseListener)
     */
    @objid ("cab7030f-c871-4c8b-82e8-fcb9de7a8714")
    public void removeTraverseListener(final TraverseListener listener) {
        this.browser.removeTraverseListener(listener);
    }

    /**
     * @param color
     * @see org.eclipse.swt.widgets.Control#setBackground(org.eclipse.swt.graphics.Color)
     */
    @objid ("b33e4326-f56e-4a11-af7c-5c9edc466292")
    public void setBackground(final Color color) {
        this.browser.setBackground(color);
        execute(new Command("set_background_internal") {
            @Override
            public String getScript() {
                final String hexValue = color != null ? "#" + ColorConverter.convertRgbToHex(color.getRGB()) : "";
                return "document.getElementById(\'cke_editor1_arialbl\').nextSibling.style.backgroundColor = \'" + hexValue + "\';";
            }
        });
    }

    /**
     * @param image
     * @see org.eclipse.swt.widgets.Control#setBackgroundImage(org.eclipse.swt.graphics.Image)
     */
    @objid ("12633317-680f-46fb-91fc-473c4e993b69")
    public void setBackgroundImage(final Image image) {
        this.browser.setBackgroundImage(image);
    }

    /**
     * @param mode
     * @see org.eclipse.swt.widgets.Composite#setBackgroundMode(int)
     */
    @objid ("de241d20-6a90-474b-8981-d73dcbf60b55")
    public void setBackgroundMode(final int mode) {
        this.browser.setBackgroundMode(mode);
    }

    /**
     * @param x
     * @param y
     * @param width
     * @param height
     * @see org.eclipse.swt.widgets.Control#setBounds(int, int, int, int)
     */
    @objid ("f75868dc-7a57-449e-b67f-8e5b5b66acd5")
    public void setBounds(final int x, final int y, final int width, final int height) {
        this.browser.setBounds(x, y, width, height);
    }

    /**
     * @param rect
     * @see org.eclipse.swt.widgets.Control#setBounds(org.eclipse.swt.graphics.Rectangle)
     */
    @objid ("3e28a842-2fcd-4945-a623-91675d67f6f0")
    public void setBounds(final Rectangle rect) {
        this.browser.setBounds(rect);
    }

    /**
     * @param capture
     * @see org.eclipse.swt.widgets.Control#setCapture(boolean)
     */
    @objid ("1199c6f5-4f62-487d-aa7d-9150bddfdd47")
    public void setCapture(final boolean capture) {
        this.browser.setCapture(capture);
    }

    /**
     * @param cursor
     * @see org.eclipse.swt.widgets.Control#setCursor(org.eclipse.swt.graphics.Cursor)
     */
    @objid ("c0c1e0e5-6a7d-40bc-acae-81967848e7dd")
    public void setCursor(final Cursor cursor) {
        this.browser.setCursor(cursor);
    }

    /**
     * @param data
     * @see org.eclipse.swt.widgets.Widget#setData(java.lang.Object)
     */
    @objid ("81fd14fe-151c-49e2-8276-fe522eeecd16")
    public void setData(final Object data) {
        this.browser.setData(data);
    }

    /**
     * @param key
     * @param value
     * @see org.eclipse.swt.widgets.Widget#setData(java.lang.String, java.lang.Object)
     */
    @objid ("b566d469-51be-42f9-8e72-c8e5b548ff3b")
    public void setData(final String key, final Object value) {
        this.browser.setData(key, value);
    }

    @objid ("8ccf90b7-06ed-4c1b-afd7-2fd36d382f85")
    public void setEditable(boolean onOff) {
        if (onOff) {
            this.execute("CKEDITOR.instances.editor1.setReadOnly(false)");
        } else {
            this.execute("CKEDITOR.instances.editor1.setReadOnly(true)");
        }
    }

    /**
     * @param enabled
     * @see org.eclipse.swt.widgets.Control#setEnabled(boolean)
     */
    @objid ("ae7bdc94-3f28-4996-9305-f51ba4cfaa86")
    public void setEnabled(final boolean enabled) {
        this.browser.setEnabled(enabled);
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Composite#setFocus()
     */
    @objid ("2684ed25-d978-458b-9989-fb408ff72c16")
    public boolean setFocus() {
        this.browser.execute("integration.editor.focus();");
        final boolean setFocus = this.browser.setFocus();
        return setFocus;
    }

    /**
     * @param font
     * @see org.eclipse.swt.widgets.Control#setFont(org.eclipse.swt.graphics.Font)
     */
    @objid ("12600e81-8c5f-42f3-9563-0e3fee8d5a4e")
    public void setFont(final Font font) {
        this.browser.setFont(font);
    }

    /**
     * @param color
     * @see org.eclipse.swt.widgets.Control#setForeground(org.eclipse.swt.graphics.Color)
     */
    @objid ("b81e09a2-bbc2-4cd8-81eb-597929141f10")
    public void setForeground(final Color color) {
        this.browser.setForeground(color);
    }

    /**
     * Replaces the current content of the widget with the given html. For inserting html at the current selection use:
     * 
     * <pre>
     * HtmlComposer.execute(&quot;integration.editor.insertHtml('myHtmlToInsert');&quot;);
     * </pre>
     * @param html
     */
    @objid ("d2d42059-a4a6-42df-8ff0-317169ca3133")
    public void setHtml(String html) {
        final SetHtmlCommand setHtmlCommand = new SetHtmlCommand(html);
        execute(setHtmlCommand);
    }

    /**
     * @param layout
     * @see org.eclipse.swt.widgets.Composite#setLayout(org.eclipse.swt.widgets.Layout)
     */
    @objid ("312efc2f-d114-40fd-91a5-904ebda2cdb1")
    public void setLayout(final Layout layout) {
        this.browser.setLayout(layout);
    }

    /**
     * @param layoutData
     * @see org.eclipse.swt.widgets.Control#setLayoutData(java.lang.Object)
     */
    @objid ("d38f1e4c-84da-4d9f-beeb-04cb89a6ed7d")
    public void setLayoutData(final Object layoutData) {
        this.browser.setLayoutData(layoutData);
    }

    /**
     * @param defer
     * @see org.eclipse.swt.widgets.Composite#setLayoutDeferred(boolean)
     */
    @objid ("dd5b62fe-b265-46ae-a0c9-4fb73141878e")
    public void setLayoutDeferred(final boolean defer) {
        this.browser.setLayoutDeferred(defer);
    }

    /**
     * @param x
     * @param y
     * @see org.eclipse.swt.widgets.Control#setLocation(int, int)
     */
    @objid ("d1e3e0c7-ead0-48e8-9f71-21bd9d14b920")
    public void setLocation(final int x, final int y) {
        this.browser.setLocation(x, y);
    }

    /**
     * @param location
     * @see org.eclipse.swt.widgets.Control#setLocation(org.eclipse.swt.graphics.Point)
     */
    @objid ("c09c669b-6d4a-40ba-b524-0d30b60bdea1")
    public void setLocation(final Point location) {
        this.browser.setLocation(location);
    }

    /**
     * @param menu
     * @see org.eclipse.swt.widgets.Control#setMenu(org.eclipse.swt.widgets.Menu)
     */
    @objid ("0486d50b-41f7-4968-81fb-821b5771f1e0")
    public void setMenu(final Menu menu) {
        this.browser.setMenu(menu);
    }

    /**
     * @see org.eclipse.swt.widgets.Control#setParent(org.eclipse.swt.widgets.Composite)
     * @param parent @return
     */
    @objid ("343f5308-868e-4469-9945-59615ba4306f")
    public boolean setParent(final Composite parent) {
        return this.browser.setParent(parent);
    }

    /**
     * @param redraw
     * @see org.eclipse.swt.widgets.Control#setRedraw(boolean)
     */
    @objid ("43893fd3-772e-4b3f-98ab-7eb3cb82f7b0")
    public void setRedraw(final boolean redraw) {
        this.browser.setRedraw(redraw);
    }

    /**
     * @param region
     * @see org.eclipse.swt.widgets.Control#setRegion(org.eclipse.swt.graphics.Region)
     */
    @objid ("869acc8e-ec5d-47d2-9a4a-287549710f24")
    public void setRegion(final Region region) {
        this.browser.setRegion(region);
    }

    /**
     * @param width
     * @param height
     * @see org.eclipse.swt.widgets.Control#setSize(int, int)
     */
    @objid ("5104e192-bae7-476a-a789-425afdb4b8f2")
    public void setSize(final int width, final int height) {
        this.browser.setSize(width, height);
    }

    /**
     * @param size
     * @see org.eclipse.swt.widgets.Control#setSize(org.eclipse.swt.graphics.Point)
     */
    @objid ("872058aa-c63d-474e-a427-f3dd4ccd485c")
    public void setSize(final Point size) {
        this.browser.setSize(size);
    }

    /**
     * @param tabList
     * @see org.eclipse.swt.widgets.Composite#setTabList(org.eclipse.swt.widgets.Control[])
     */
    @objid ("95606699-1585-4c3b-af84-523e9bfa09ec")
    public void setTabList(final Control[] tabList) {
        this.browser.setTabList(tabList);
    }

    /**
     * @param visible
     * @see org.eclipse.swt.widgets.Control#setVisible(boolean)
     */
    @objid ("1f716634-a16c-4390-bcbf-5d8d345eea84")
    public void setVisible(final boolean visible) {
        this.browser.setVisible(visible);
    }

    /**
     * @param x
     * @see org.eclipse.swt.widgets.Control#toControl(int, int)
     * @param y @return
     */
    @objid ("1267c78e-5312-4c2e-9700-5798ca0e966a")
    public Point toControl(final int x, final int y) {
        return this.browser.toControl(x, y);
    }

    /**
     * @see org.eclipse.swt.widgets.Control#toControl(org.eclipse.swt.graphics.Point)
     * @param point @return
     */
    @objid ("0f27310c-8323-4c5d-aa2c-f8c0bc7011be")
    public Point toControl(final Point point) {
        return this.browser.toControl(point);
    }

    /**
     * @param x
     * @see org.eclipse.swt.widgets.Control#toDisplay(int, int)
     * @param y @return
     */
    @objid ("f6c05c07-0cef-4926-871f-c87c78a6fbb0")
    public Point toDisplay(final int x, final int y) {
        return this.browser.toDisplay(x, y);
    }

    /**
     * @see org.eclipse.swt.widgets.Control#toDisplay(org.eclipse.swt.graphics.Point)
     * @param point @return
     */
    @objid ("86c8b4af-de24-419f-956b-a1172c8d3273")
    public Point toDisplay(final Point point) {
        return this.browser.toDisplay(point);
    }

    /**
     * @return
     * @see org.eclipse.swt.widgets.Widget#toString()
     */
    @objid ("b5872d2f-db0c-4d9e-ba45-f3dd2a381d95")
    @Override
    public String toString() {
        return this.browser.toString();
    }

    @objid ("8a72c4fd-f69e-42fc-93a0-876ebda0e537")
    public void trackCommand(Command command) {
        this.trackedCommands.put(command.getName(), command);
    }

    /**
     * @see org.eclipse.swt.widgets.Control#traverse(int)
     * @param traversal @return
     */
    @objid ("4b779e45-93cd-4135-8890-be947c4097ee")
    public boolean traverse(final int traversal) {
        return this.browser.traverse(traversal);
    }

    @objid ("709daffd-9473-48bd-b0b9-41097c4696da")
    public void untrackCommand(Command command) {
        this.trackedCommands.remove(command.getName());
    }

    @objid ("0e9471eb-cdf5-4182-89ce-14a4c891211b")
    void initialize() {
        // System.out.println("HtmlComposer.initialize()" + this);
        
        new SelectionChangedFunction(this.browser);
        new ModifiedFunction(this.browser);
        new FocusLostFunction(this.browser);
        new FocusGainedFunction(this.browser);
        
        this.initialized = true;
        // System.out.println("HtmlComposer.initialize() intialized flag set to true ! " + this);
        for (final Command command : this.pendingCommands) {
            execute(command);
        }
        this.pendingCommands.clear();
    }

    @objid ("53037090-f4e1-423b-952e-27ff52134d7b")
    public boolean isInitialized() {
        return this.initialized;
    }

    @objid ("501fc4b9-18b0-4b03-939e-74a24fc56ce8")
    private class FocusGainedFunction extends BrowserFunction {
        @objid ("58ab466c-5f48-4b43-8845-b482ddec595d")
        public FocusGainedFunction(Browser browser) {
            super(browser, "_delegate_focusGained");
        }

        @objid ("e7c8d453-3fb3-48ac-b672-8a15c9735d12")
        @Override
        public Object function(Object[] args) {
            // System.out.println("_delegate_focusGained()");
            for (final FocusListener l : HtmlComposer.this.focusListeners) {
                l.focusGained(null);
            }
            return null;
        }

    }

    @objid ("635f142d-c0e6-4b2f-8b4d-8066f1980d4d")
    private class FocusLostFunction extends BrowserFunction {
        @objid ("0c519ab8-0115-4aca-a17e-73296ca1fe31")
        public FocusLostFunction(Browser browser) {
            super(browser, "_delegate_focusLost");
        }

        @objid ("aad65867-d2a7-4342-bb19-e46b07d680b7")
        @Override
        public Object function(Object[] args) {
            // System.out.println("_delegate_focusLost()");
            for (final FocusListener l : HtmlComposer.this.focusListeners) {
                l.focusLost(null);
            }
            return null;
        }

    }

    /**
     * BrowserFunction that is called if the wrapped Ckeditor is initialized.
     * 
     * @author Tom Seidel <tom.seidel@remus-software.org>
     */
    @objid ("efe568c6-53f4-4bf1-835e-32e47ea6f138")
    private class InitFunction extends BrowserFunction {
        @objid ("b388be37-7a59-4f9e-acee-986642a7e203")
        public InitFunction(Browser browser) {
            super(browser, "_delegate_init");
        }

        @objid ("a313f984-860c-48f6-a58a-0153d37fc814")
        @Override
        public Object function(Object[] arguments) {
            // System.out.println("HtmlComposer InitFunction => initialize() " + HtmlComposer.this.browser);
            initialize();
            return null;
        }

    }

    /**
     * A function which is called if the content of the editor has changed.
     * <p>
     * Unfortunately the underlying ckeditor cannot guarantee that every modification will be notified to the appended listeners.
     * There is an additional polling mechanismus which tracks modifications.
     * </p>
     * 
     * @author Tom Seidel <tom.seidel@remus-software.org>
     */
    @objid ("10f0ff83-0216-49a5-835e-0aa46b69601a")
    private class ModifiedFunction extends BrowserFunction {
        @objid ("7a6af4a7-db60-4c2c-bf7f-957bbe4f6689")
        public ModifiedFunction(Browser browser) {
            super(browser, "_delegate_modified");
        }

        @objid ("77a518a3-186f-4739-b0a1-d3c897617cad")
        @Override
        public Object function(Object[] arguments) {
            if (arguments.length > 0) {
                final String identifier = (String) arguments[0];
                final Event event = new Event();
                event.widget = getBrowser();
                event.data = this;
                final ModifyEvent modifyEvent = new ModifyEvent(event);
                if (HtmlComposer.this.pendingListenerCallBackMap.get(identifier) != null) {
                    final List<ModifyListener> list = HtmlComposer.this.pendingListenerCallBackMap.get(identifier);
                    for (final ModifyListener modifyListener : list) {
                        modifyListener.modifyText(modifyEvent);
                    }
                } else {
                    if (HtmlComposer.this.modifyListenerList.size() > 0) {
                        for (final ModifyListener listener : HtmlComposer.this.modifyListenerList) {
                            listener.modifyText(modifyEvent);
                        }
                    }
                }
                HtmlComposer.this.pendingListenerCallBackMap.remove(identifier);
            }
            return null;
        }

    }

    /**
     * BrowserFunction that delegates the event from ckeditor that is thrown if the selected dom-node changed.
     */
    @objid ("7bc4dbe5-e9d6-4e80-9ee9-7582d3d413ad")
    private class SelectionChangedFunction extends BrowserFunction {
        @objid ("01dca000-9b44-4a51-a618-f9bdf8243700")
        public SelectionChangedFunction(Browser browser) {
            super(browser, "_delegate_selectionChanged");
        }

        @objid ("b6c9a440-d30a-4a6a-8d0c-1f6250772111")
        @Override
        public Object function(Object[] arguments) {
            // check if listeners are registered. Could be that in the near
            // future the construction of NodeSelectionEvent is not so cheap
            // like at the moment.
            if (HtmlComposer.this.selectionListenerList.size() > 0) {
                final NodeSelectionEvent nodeSelectionEvent = new NodeSelectionEvent(null);
                for (final NodeSelectionChangeListener listener : HtmlComposer.this.selectionListenerList) {
                    listener.selectedNodeChanged(nodeSelectionEvent);
                }
            }
            return null;
        }

    }

}
