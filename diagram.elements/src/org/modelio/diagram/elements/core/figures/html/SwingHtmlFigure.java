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

import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JEditorPane;
import javax.swing.SwingUtilities;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.AbstractHintLayout;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Region;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.modelio.diagram.elements.plugin.DiagramElements;

/**
 * Figure that display HTML in its bounds.
 * 
 * @deprecated Does not work, don't use !
 */
@objid ("4485d2da-aae6-4329-bdda-a0e28150a2c1")
@Deprecated
public class SwingHtmlFigure extends Figure {
    @objid ("5b47b232-d22f-44a9-bbca-d29448622f94")
    private String htmlContent;

    @objid ("e3c41149-3afe-4775-8ac9-5fb423d620c1")
    private static volatile boolean renderComplete;

    @objid ("4796fc3c-75c9-4919-97f7-3e9e83cf3601")
    private static JEditorPane browser;

    @objid ("92452f0b-ad17-4647-87a8-80a87c00ea24")
    private Image image;

    @objid ("ccc69f05-375b-4af1-a2e4-89d223818d59")
    private Composite composite;

    /**
     * C'tor
     * @param swtComposite
     */
    @objid ("33b192c2-1e42-44a5-b511-bbf5ded41c5e")
    public SwingHtmlFigure(Composite swtComposite) {
        if (browser == null) {
            
            this.composite = new Composite(swtComposite, SWT.EMBEDDED | SWT.NO_BACKGROUND);
            Frame frame = SWT_AWT.new_Frame(this.composite);
            
            //JApplet applet = new JApplet();
            
            //frame.add(applet);
            browser = new JEditorPane();
            browser.setContentType("text/html");
            frame.add(browser);
        }
    }

    @objid ("32b5b50e-049e-4b7c-b71c-60d4c89a9a5c")
    @Override
    protected void paintFigure(Graphics graphics) {
        // Call inherited behavior
        super.paintFigure(graphics);
        
        if (this.image != null)
            graphics.drawImage(this.image, getLocation());
    }

    @objid ("e7a9aa95-985b-4ffb-8a61-adeddb7b0f3f")
    @Override
    public void removeNotify() {
        if (this.image != null) {
            this.image.dispose();
            this.image = null;
        }
        
        super.removeNotify();
    }

    @objid ("119733dc-56b5-46fa-a59a-a69941b8f84b")
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

    @objid ("53d5eae3-daf3-4f79-bf34-7b2ce5110561")
    protected void renderBrowser(int w, int h) {
        try {
            DiagramElements.LOG.debug("HtmlFigure: render begin");
            Point loc = getLocation();
            translateToAbsolute(loc);
            this.composite.setLocation(loc.x, loc.y);
            this.composite.setSize(w, h);
            this.composite.setVisible(true);
            //shell.setBackground(null);
            //shell.setAlpha(10);
            //shell.layout();
            //browser.setFont(getFont());
            //browser.setForeground(getForegroundColor());
            //browser.setBackground(null);
            SwingUtilities.invokeAndWait( new Runnable() {
                @SuppressWarnings({ "synthetic-access" })
                @Override
                public void run() {
                    browser.setBounds(0, 0, w, h);
                    //browser.setText("<html>"+htmlContent+"</html>");
                    browser.setText(SwingHtmlFigure.this.htmlContent);
                }
            });
            
            completed();
            
            
        
            //shell.setVisible(false);
        
            DiagramElements.LOG.debug("HtmlFigure: render ended");
        
        } catch (InvocationTargetException | InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            renderComplete = true;
        }
    }

    @objid ("bd1b7136-c2a3-40c5-ab75-dea2c67645d2")
    public String getHtmlContent() {
        return this.htmlContent;
    }

    @objid ("4e198291-0692-4fd1-89f9-df6ab3234ebb")
    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
        invalidate();
    }

    @objid ("64b50c08-e009-402b-bc40-e1e3dd1eda4e")
    private void completed() {
        this.composite.getShell().update();
        
        /*GC gc = new GC(this.image);
        gc.setClipping((Region)null);
        browser.setVisible(true);
        gc.drawLine(0, 0, 50, 50);
        browser.print(gc);*/
        
        GC gc = new GC(this.composite);
        this.image.setBackground(this.composite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
        gc.setClipping((Region)null);
        gc.copyArea(this.image, 0, 0);
        
        gc.dispose();
    }

    @objid ("0c7bf671-8c1f-4015-a5f6-6b0c31fd4852")
    private class LMan extends AbstractHintLayout {
        @objid ("4127ef74-0720-42f5-a740-8d215e0047c8")
        @Override
        public void layout(IFigure container) {
            // TODO Auto-generated method stub
        }

        @objid ("b393c627-ecb6-44d5-a4d8-6f3090d1d8a6")
        @Override
        protected Dimension calculatePreferredSize(IFigure container, int wHint, int hHint) {
            int w = wHint == -1 ? container.getSize().width() : wHint;
            int h = hHint == -1 ? container.getSize().height() : hHint;
            
            renderBrowser(w, h);
            return null;
        }

    }

}
