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


package org.modelio.creation.wizard.contributor;

import javax.inject.Inject;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.ui.contributor.DefaultWizardPreviewPanel;
import org.modelio.api.ui.diagramcreation.AbstractDiagramWizardContributor;
import org.modelio.api.ui.diagramcreation.IDiagramWizardContributor;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.metamodel.factory.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.ui.panel.IPanelProvider;
import org.modelio.vcore.smkernel.mapi.MMetamodel;

/**
 * This abstract class provides common stuff to diagram contributors for the standard UML diagrams of Modelio.
 * <p>
 * Standard UML diagrams definitions are not provided by a module in a 'module.xml' file. <br>
 * This is why this class mostly defines fakes setter accessors that
 * do nothing in order to implement {@link IDiagramWizardContributor}.
 * <p>
 * The corresponding getters are hard-coded for each different type of diagram.
 */
@objid ("6e6bbe5a-f63f-49ae-9d8d-e126a0253778")
public abstract class AbstractUMLDiagramCreationContributor extends AbstractDiagramWizardContributor {
    @objid ("e48559d6-2aa8-4a04-b2c4-1a28eecac5be")
    @Inject
    protected IMModelServices mmServices;

    /**
     * Set the content of the first note with the given type on the &lt;element&gt; ModelElement.
     * @param element
     * @param type
     * @param content
     */
    @objid ("ba335241-50ea-4632-9fa1-0033ff16f84a")
    protected final void putNoteContent(ModelElement element, String type, String content) {
        try {
            element.putNoteContent("ModelerModule", type, content);
        } catch (ExtensionNotFoundException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    @objid ("ec37c3cb-954d-43dc-996a-f647cffa0e82")
    protected final void setElementDefaultName(ModelElement element) {
        element.setName(this.mmServices.getElementNamer().getUniqueName(element));
    }

    @objid ("84c0e17b-50a8-4756-8f69-0502234c09c4")
    protected final MMetamodel getMetamodel() {
        return this.mmServices.getMetamodel();
    }

    @objid ("87d02300-c33a-485f-b787-a5165b7fdbb8")
    @Override
    public final IPanelProvider getWizardPanel() {
        return new DefaultWizardPreviewPanel();
    }

}
