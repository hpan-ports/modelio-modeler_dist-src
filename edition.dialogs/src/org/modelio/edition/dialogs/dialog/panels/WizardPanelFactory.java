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
                                    

package org.modelio.edition.dialogs.dialog.panels;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.edition.dialogs.dialog.panels.note.NoteEditPanel;
import org.modelio.edition.dialogs.dialog.panels.operation.OperationEditPanel;
import org.modelio.edition.dialogs.dialog.panels.usecase.UseCaseEditPanel;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.visitors.DefaultModelVisitor;
import org.modelio.ui.panel.IPanelProvider;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * This factory returns a IPanelProvider2 implementing class for a type of model element.
 * 
 * Returning <i>null</i> will avoid popping any edition dialog for the element.<br/>
 * This is typically done for diagrams, matrix or analyst containers for which dedicated editors existed and are used instead of a
 * dialog.
 * 
 * If no visit method is provided for a given metaclass, the visitor will end on visitElement() by the inheritance tree and will
 * return a generic element edition panel.
 * 
 * 
 * @author phv
 */
@objid ("7b51f03b-6699-4137-a49e-cd23781b323b")
public class WizardPanelFactory {
    @objid ("9333afe7-1cb7-49ef-84a2-4c96040c700f")
    private static EditElementPanelFactoryVisitor visitor = new EditElementPanelFactoryVisitor();

    @objid ("81c5de30-8718-4fbc-88fb-5c0f10885edf")
    public static Class<? extends IPanelProvider> getEditDialog(MObject mObject) {
        if (mObject instanceof Element) {
            return (Class<? extends IPanelProvider>) ((Element) mObject).accept(visitor);
        } else {
            return null;
        }
    }

    /**
     * Must return a (Class<? extends IEditElementDialog>) instance or null
     * 
     * @author phv
     */
    @objid ("6a256a95-4e24-45e9-bd1d-e5ebe5038fda")
    private static class EditElementPanelFactoryVisitor extends DefaultModelVisitor {
        @objid ("cbea557e-5049-468e-b6fc-1be8761e95b6")
        public EditElementPanelFactoryVisitor() {
        }

        @objid ("d114fabc-be56-455d-9feb-a7b8cd277ea5")
        @Override
        public Object visitUseCase(UseCase obj) {
            return UseCaseEditPanel.class;
        }

        @objid ("d4902b2a-4cda-4bfb-898b-efcf5b834b21")
        @Override
        public Object visitOperation(Operation obj) {
            return OperationEditPanel.class;
        }

        @objid ("55886286-cac5-4d35-af4f-897314d8c3d0")
        @Override
        public Object visitNote(Note obj) {
            return NoteEditPanel.class;
        }

    }

}
