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
                                    

package org.modelio.diagram.elements.core.figures.html;

import java.util.concurrent.TimeoutException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.AbstractHintLayout;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.ProgressEvent;
import org.eclipse.swt.browser.ProgressListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Region;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.modelio.diagram.elements.plugin.DiagramElements;

/**
 * Figure that display a HTML   {@link Browser} in its bounds.
 * 
 * @deprecated Not ready, the bitmap does not work. The SWT browser must be fully visible, the scrollbars go outside of wanted bounds.
 */
@objid ("fd6f59c3-6622-40b8-83b9-988dae07be73")
@Deprecated
public class SwtHtmlFigure extends Figure implements ProgressListener {
    @objid ("e7fc8ab4-4a4b-4d8a-808a-28764089c29c")
    private String htmlContent;

    @objid ("e82eadfa-555e-4833-8deb-c764d5c9ea49")
    private static volatile boolean renderComplete;

    @objid ("a64dd5a6-bbf0-4a9b-8200-606f2414b186")
    private Browser browser;

    @objid ("1dc846b4-f1c5-4f7f-a045-9e813173559e")
    private Image image;

    /**
     * @see org.eclipse.gef.EditPartViewer#getControl()
     * @param swtComposite the SWT Composite that will own the browser. should be the
     * diagram Canvas
     */
    @objid ("d86a3da3-ef47-4985-b450-b366d89a551f")
    public SwtHtmlFigure(Composite swtComposite) {
        if (this.browser == null) {
            this.browser = new Browser(swtComposite, SWT.NO_BACKGROUND | SWT.NO_REDRAW_RESIZE);
        }
    }

    @objid ("79526366-2391-462a-b61d-fda44935e74a")
    @Override
    protected void paintFigure(Graphics graphics) {
        // Call inherited behavior
        super.paintFigure(graphics);
        
        if (this.image != null)
            graphics.drawImage(this.image, getLocation());
    }

    @objid ("d256e883-6a97-4eaa-985d-1923a0c0ebae")
    @Override
    public void removeNotify() {
        if (this.image != null) {
            this.image.dispose();
            this.image = null;
        }
        
        super.removeNotify();
    }

    @objid ("87fa7575-f57d-4584-86b7-3960de7de443")
    @Override
    public void validate() {
        super.validate();
        
        // Realloc image if needed
        Dimension neededSize = getSize();
        translateToAbsolute(neededSize);
        
        if (this.image == null 
                || this.image.getBounds().width < neededSize.width() 
                || this.image.getBounds().height < neededSize.height() ) {
            if (this.image != null)
                this.image.dispose();
            
            this.image = new Image(Display.getCurrent(), neededSize.width(), neededSize.height());
        }
        
        // Ask browser to reload
        renderBrowser(neededSize.width(), neededSize.height());
    }

    @objid ("392af455-0391-45d6-96d0-308a5efcff16")
    protected void renderBrowser(int w, int h) {
        renderComplete = false;
        
        try {
            DiagramElements.LOG.debug("HtmlFigure: render begin");
            Point loc = getLocation();
            translateToAbsolute(loc);
            //browser.setLocation(loc.x, loc.y);
        //            shell.setVisible(true);
        //            shell.setBackground(null);
        //            shell.setAlpha(10);
            this.browser.setFont(getFont());
            this.browser.setForeground(getForegroundColor());
            this.browser.setBackground(null);
            this.browser.setBounds(loc.x, loc.y, w, h);
            this.browser.setVisible(true);
            this.browser.setText(this.htmlContent, false);
            this.browser.addProgressListener(this);
        
            // Wait 500ms max for the render to finish
            int i = 0;
            while ((! renderComplete) && i++ < 100) {
                try {
                    while(this.browser.getDisplay().readAndDispatch()){
                        // noop
                    }
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    DiagramElements.LOG.error(e);
                }
            }
        
        
            if (!renderComplete)
                DiagramElements.LOG.error(new TimeoutException(this.htmlContent));
            else
                DiagramElements.LOG.debug("HtmlFigure: render ended");
        
            //browser.setVisible(false);
        } finally {
            renderComplete = true;
        }
    }

    /**
     * @return the HTML text
     */
    @objid ("7f82d8d1-51fb-4bab-aabd-6209a2286ad1")
    public String getHtmlContent() {
        return this.htmlContent;
    }

    /**
     * @param htmlContent the HTML text
     */
    @objid ("c7e28767-cfe2-4202-830e-fcf1a09d5646")
    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
        invalidate();
    }

    @objid ("fd43781b-302f-444d-98d0-00be8887dd22")
    @Override
    public void changed(ProgressEvent event) {
        // ignore
    }

    @objid ("de4bf9ea-0128-462d-842a-67bad6192be8")
    @Override
    public void completed(ProgressEvent event) {
        this.browser.removeProgressListener(this);
        
        // TODO : none of these work.
        {
        /*GC gc = new GC(this.image);
        gc.setClipping((Region)null);
        browser.setVisible(true);
        gc.drawLine(0, 0, 50, 50);
        browser.print(gc);*/
        }
        
        // Does not work either
        // Managed to make it work once but the SWT Browser must be fully visible.
        {
        GC gc = new GC(this.browser);
        this.image.setBackground(this.browser.getDisplay().getSystemColor(SWT.COLOR_WHITE));
        gc.setClipping((Region)null);
        gc.copyArea(this.image, 0, 0);
        
        gc.dispose();
        }
        renderComplete = true;
    }

    @objid ("e822c8f9-a509-441d-983a-d04164432489")
    private class LMan extends AbstractHintLayout {
        @objid ("bfad85b3-23dd-477c-b3aa-1079fbfcf019")
        @Override
        public void layout(IFigure container) {
            // TODO Auto-generated method stub
        }

        @objid ("e259900a-2a31-46d7-9dcf-961bd9aa7b8c")
        @Override
        protected Dimension calculatePreferredSize(IFigure container, int wHint, int hHint) {
            int w = wHint == -1 ? container.getSize().width() : wHint;
            int h = hHint == -1 ? container.getSize().height() : hHint;
            
            renderBrowser(w, h);
            return null;
        }

    }

}
