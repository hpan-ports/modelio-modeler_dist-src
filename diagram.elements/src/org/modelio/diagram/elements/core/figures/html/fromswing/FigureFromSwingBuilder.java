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
                                    

package org.modelio.diagram.elements.core.figures.html.fromswing;

import javax.swing.JEditorPane;
import javax.swing.text.View;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.text.FlowPage;
import org.eclipse.swt.graphics.Font;

/**
 * {@link FlowPage} Figure builder to display HTML.
 * <p>
 * Instantiates a {@link JEditorPane} without displaying it then
 * walk its inner {@link View} tree hierarchy to transform it to taxt flow
 * figure hierarchy.
 */
@objid ("68440775-e984-4d5b-ac07-9fb7f66652dd")
public class FigureFromSwingBuilder {
    @objid ("7ad36d05-ba1b-46ab-bffd-1b821f4029c4")
    private Font defaultFont;

    /**
     * Get a {@link FlowPage} for the given HTML text
     * @param htmlText a HTML text
     * @return the FlowPage
     */
    @objid ("80df9582-f292-43c7-a13f-2d8513d7908e")
    public FlowPage get(String htmlText) {
        if (htmlText==null || htmlText.isEmpty())
            return new FlowPage();
        
        JEditorPane browser = new JEditorPane();
        browser.setContentType("text/html");
        browser.setText(htmlText);
        
        View rootView = browser.getUI().getRootView(browser);
        
        FlowPage pageFlow = new FlowPage();
        final DefaultFigureFromViewFactory fact = new DefaultFigureFromViewFactory(this.defaultFont);
        parseView(fact, rootView, pageFlow);
        return pageFlow;
    }

    @objid ("221845bc-c67d-4d8e-a503-5a8d0b9db9aa")
    private static void parseView(IFigureFromViewFactory fact, View parentView, Figure parentFigure) {
        for (int i=0, nb = parentView.getViewCount(); i<nb; ++i) {
            View childView = parentView.getView(i);
            Figure childFig = fact.createFigure(childView, parentFigure);
            
            if (childFig!= null) {
                if(childFig != parentFigure) 
                    parentFigure.add(childFig);
                
                IFigureFromViewFactory childFact = fact.getFactory(childView, parentFigure);
                parseView(childFact, childView, childFig);
            }
        }
    }

    /**
     * @param defaultFont the default font
     */
    @objid ("4d887633-b04f-46e9-b79c-22e3a2232a1e")
    public FigureFromSwingBuilder(Font defaultFont) {
        this.defaultFont = defaultFont;
    }

}
