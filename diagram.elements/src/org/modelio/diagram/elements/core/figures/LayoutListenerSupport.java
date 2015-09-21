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


package org.modelio.diagram.elements.core.figures;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutListener;
import org.eclipse.draw2d.LayoutManager;

/**
 * Rewrite of {@link org.eclipse.draw2d.Figure Figure.LayoutNotifier} that does not support removing listeners
 * while firing notifications.
 * <p>
 * <h2>Recommended usage on own IFigure implementation:</h2>
 * <p>
 * Add the following code to your figure implementation:
 * 
 * <pre><code>
 * public void addLayoutListener(LayoutListener listener) {
 * LayoutListenerSupport.addLayoutListener(this, listener);
 * }
 * 
 * public void removeLayoutListener(LayoutListener listener) {
 * LayoutListenerSupport.removeListener(this, listener);
 * }
 * 
 * public void setLayoutManager(LayoutManager manager) {
 * if (!LayoutListenerSupport.setLayoutManager(this, manager)) {
 * super.setLayoutManager(manager);
 * }
 * }
 * </code></pre>
 * 
 * @author cmarin
 * @since 3.4
 */
@objid ("3641e9d3-6271-434d-99a0-87c7427f2645")
public class LayoutListenerSupport extends ChainedLayout {
    @objid ("921828e6-5c2d-4137-87ff-6eb714711cf5")
    private List<LayoutListener> listeners = new CopyOnWriteArrayList<>();

    @objid ("f7203223-488c-49ae-bc67-f97955c77dd4")
    private IFigure container;

    /**
     * Add a layout listener to the figure.
     * @param container the figure to listen for
     * @param listener the layout listener
     */
    @objid ("147bf28f-2f20-4e2b-9263-4eb523e29974")
    public static void addLayoutListener(IFigure container, LayoutListener listener) {
        final LayoutManager layoutManager = container.getLayoutManager();
        if (layoutManager instanceof LayoutListenerSupport) {
            LayoutListenerSupport notifier = (LayoutListenerSupport) layoutManager;
            notifier.listeners.add(listener);
        } else {
            LayoutListenerSupport layoutManager2 = new LayoutListenerSupport(container, layoutManager, listener);
            container.setLayoutManager(layoutManager2);
        }
    }

    /**
     * Remove a layout listener.
     * @param container the figure owning the listener
     * @param listener the listener to remove
     */
    @objid ("ecb9e121-823b-449d-8d20-73382c6d0935")
    public static void removeListener(IFigure container, LayoutListener listener) {
        final LayoutManager layoutManager = container.getLayoutManager();
        if (layoutManager instanceof LayoutListenerSupport) {
            LayoutListenerSupport notifier = (LayoutListenerSupport) layoutManager;
            notifier.listeners.remove(listener);
            if (notifier.listeners.isEmpty()) {
                container.setLayoutManager(notifier.getChained());
            }
        }
    }

    /**
     * Set the layout manager on the given figure without dropping listener support.
     * <p>
     * <b>Warn:</b> don't call this method from {@link IFigure#setLayoutManager(LayoutManager)} redefinition.
     * @see #setLayoutManager(IFigure, LayoutManager)
     * @param container the figure
     * @param layoutManager the new layout manager
     * @throws java.lang.StackOverflowError if called from {@link IFigure#setLayoutManager(LayoutManager)} redefinition.
     */
    @objid ("e9c3de0d-f4d7-4bbc-8d35-f9f5125cbeb6")
    public static void setLayoutManager1(IFigure container, LayoutManager layoutManager) throws StackOverflowError {
        final LayoutManager curLayoutManager = container.getLayoutManager();
        if (curLayoutManager instanceof LayoutListenerSupport) {
            LayoutListenerSupport notifier = (LayoutListenerSupport) curLayoutManager;
            notifier.setChained(layoutManager);
            container.revalidate();
        } else {
            //Warn : infinite recursion if IFigure.setLayoutManager(...) is redefined to call this method.
            container.setLayoutManager(layoutManager);
        }
    }

    /**
     * Set the layout manager on the given figure without dropping listener support if the current
     * layout manager is a {@link LayoutListenerSupport}.
     * <p>
     * Returns <i>true</i> if the current layout manager was a <code>LayoutListenerSupport</code>.
     * Then the real layout manager is modified.
     * Returns <i>false</i> if the current layout manager was not a <code>LayoutListenerSupport</code>.
     * The caller must then do the work itself.
     * <p>
     * To be used in {@link IFigure#setLayoutManager(LayoutManager)} redefinition as following:
     * <pre><code>
     * public void setLayoutManager(LayoutManager l) {
     * if (!LayoutListenerSupport.setLayoutManager(this, l)) {
     * super.setLayoutManager(l);
     * }
     * }
     * </code></pre>
     * @param container the figure
     * @param layoutManager the new layout manager
     * @return <i>true</i> if the current layout manager was a <code>LayoutListenerSupport</code> else <i>false</i>.
     */
    @objid ("3d668c12-bac3-4232-8d12-7480601c55d8")
    public static boolean setLayoutManager(IFigure container, LayoutManager layoutManager) {
        final LayoutManager curLayoutManager = container.getLayoutManager();
        if (curLayoutManager instanceof LayoutListenerSupport) {
            LayoutListenerSupport notifier = (LayoutListenerSupport) curLayoutManager;
            notifier.setChained(layoutManager);
            container.revalidate();
            return true;
        } else {
            return false;
        }
    }

    /**
     * Protected constructor.
     * <p>
     * Call {@link #addLayoutListener(IFigure, LayoutListener)} to add a layout listener.
     * @param container the container figure
     * @param layout the initial layout manager
     * @param listener a listener to add
     */
    @objid ("26e19156-f731-480b-9281-0ad13c7ca9f8")
    protected LayoutListenerSupport(IFigure container, LayoutManager layout, LayoutListener listener) {
        super(layout);
        this.container = container;
        this.listeners.add(listener);
    }

    @objid ("5b92e191-7931-4b0f-b97f-67386d7ff245")
    @Override
    public void invalidate() {
        for (LayoutListener layoutListener : this.listeners) {
            layoutListener.invalidate(this.container);
        }
        
        super.invalidate();
    }

    @objid ("fb004e02-a6e0-46ca-b3ac-b136a9a800c2")
    @Override
    public void layout(IFigure acontainer) {
        boolean consumed = false;
        for (LayoutListener layoutListener : this.listeners) {
            consumed |= layoutListener.layout(acontainer);
        }
        
        if (!consumed) {
            super.layout(acontainer);
        }
        
        for (LayoutListener layoutListener : this.listeners) {
            layoutListener.postLayout(acontainer);
        }
    }

    @objid ("68a8c6ce-7c47-4874-8915-7f8d8e9f42f3")
    @Override
    public void remove(IFigure child) {
        for (LayoutListener layoutListener : this.listeners) {
            layoutListener.remove(child);
        }
        
        super.remove(child);
    }

    @objid ("911bdab3-ea88-4094-8539-2f44a8b46e2e")
    @Override
    public void setConstraint(IFigure child, Object constraint) {
        for (LayoutListener layoutListener : this.listeners) {
            layoutListener.setConstraint(child, constraint);
        }
        
        super.setConstraint(child, constraint);
    }

}
