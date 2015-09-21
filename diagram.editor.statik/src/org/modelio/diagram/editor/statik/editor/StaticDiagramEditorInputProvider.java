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


package org.modelio.diagram.editor.statik.editor;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.ui.basic.MInputPart;
import org.modelio.diagram.editor.DiagramEditorInput;
import org.modelio.diagram.editor.DiagramEditorInputProvider.IDiagramEditorInputProvider;
import org.modelio.diagram.elements.core.model.ModelManager;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.diagrams.StaticDiagram;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Diagram input provider for ClassDiagram and StaticDiagram metaclasses.
 */
@objid ("cb21235a-5a75-11e2-9e33-00137282c51b")
public class StaticDiagramEditorInputProvider implements IDiagramEditorInputProvider {
    /**
     * Initialize the provider.
     */
    @objid ("6557991c-5bd5-11e2-9e33-00137282c51b")
    public StaticDiagramEditorInputProvider() {
        super();
    }

    @objid ("6557991e-5bd5-11e2-9e33-00137282c51b")
    @Override
    public DiagramEditorInput compute(IEclipseContext context) {
        IMModelServices modelServices = context.get(IMModelServices.class);
        
        String diagramUID = context.get(MInputPart.class).getInputURI();
        AbstractDiagram diagram = (StaticDiagram) modelServices.findByRef(new MRef(StaticDiagram.MNAME, diagramUID));
        if (diagram == null) {
            return null;
        }
        
        Class<? extends MObject> mClass = diagram.getMClass().getJavaInterface();
        if (mClass==ClassDiagram.class) {
            return new StaticDiagramEditorInput(new ModelManager(context), diagram);
        } else if (mClass==StaticDiagram.class) {
            // FIXME this shouldn't be here...
            if (diagram.isStereotyped("ModelerModule", "business_rule_diagram")
                    || diagram.isStereotyped("ModelerModule", "goal_diagram")
                    || diagram.isStereotyped("ModelerModule", "impact")
                    || diagram.isStereotyped("ModelerModule", "dictionary_diagram")
                    || diagram.isStereotyped("ModelerModule", "requirement_diagram")) {
                return null;
            } else {
                return new StaticDiagramEditorInput(new ModelManager(context), diagram);
            }
        }
        return null;
    }

}
