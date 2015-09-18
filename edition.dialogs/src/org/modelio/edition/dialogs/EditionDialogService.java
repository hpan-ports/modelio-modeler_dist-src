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
                                    

package org.modelio.edition.dialogs;

import javax.inject.Inject;
import javax.inject.Named;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.modelio.app.core.ModelioEnv;
import org.modelio.app.core.activation.IActivationService;
import org.modelio.app.core.events.ModelioEventTopics;
import org.modelio.app.core.picking.IModelioPickingService;
import org.modelio.edition.dialogs.dialog.EditElementDialog;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.metamodel.analyst.AnalystContainer;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixDefinition;
import org.modelio.metamodel.visitors.DefaultModelVisitor;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("1dbb88c6-8481-48bd-91a1-ba15094db8fa")
@Creatable
public class EditionDialogService {
    @objid ("5df212d3-dece-47ac-bc1d-532de623cac4")
    @Inject
    @Optional
    private ModelioEnv env;

    @objid ("1affc396-635a-4cbd-8177-a6ece84ffa0a")
    @Optional
    @Inject
    void onEditElement(@EventTopic(ModelioEventTopics.EDIT_ELEMENT) final MObject mObject, IEclipseContext eclipseContext, IMModelServices modelService, IModelioPickingService pickingService, @Named(IServiceConstants.ACTIVE_SHELL) final Shell shell, @Named(IServiceConstants.ACTIVE_SELECTION) final IStructuredSelection selection, IActivationService activationService) {
        // FIXME this should be an @UIEventTopic, but they are not triggered with eclipse 4.3 M5...
        
        // For some metaclasses, we want no properties edition dialog on 'edit' event because we have a dedicated editor alternative.
        if (EditionDialogSupport.isSupported(mObject)) {
            final EditElementDialog dlg = new EditElementDialog(shell, eclipseContext);
            dlg.setEditedElement((Element) mObject);
        
            Display.getDefault().asyncExec(new Runnable() {
                @Override
                public void run() {
                    dlg.open();
                }
            });
        }
    }

    @objid ("d31c607f-307e-4bec-94a6-43dc02922607")
    @Optional
    @Inject
    void onEditProperties(@EventTopic(ModelioEventTopics.EDIT_PROPERTIES) final MObject mObject, IEclipseContext eclipseContext, IMModelServices modelService, IModelioPickingService pickingService, @Named(IServiceConstants.ACTIVE_SHELL) final Shell shell, @Named(IServiceConstants.ACTIVE_SELECTION) final IStructuredSelection selection, IActivationService activationService) {
        // FIXME this should be an @UIEventTopic, but they are not triggered with eclipse 4.3 M5...
        
        
        final EditElementDialog dlg = new EditElementDialog(shell, eclipseContext);
        dlg.setEditedElement((Element) mObject);
        
        Display.getDefault().asyncExec(new Runnable() {
            @Override
            public void run() {
                dlg.open();
            }
        });
    }

    @objid ("3fe3e0e9-21fe-4bca-ad01-0dcf0f3bc8e3")
    private static class EditionDialogSupport extends DefaultModelVisitor {
        @objid ("1b789e1e-a493-41be-bd5e-89b429320ad2")
        private static IModelVisitor exclusionVisitor = new DefaultModelVisitor() {
            @Override
            public Object visitElement(Element obj) {
                return Boolean.TRUE;
            }
            @Override
            public Object visitAbstractDiagram(AbstractDiagram obj) {
                return Boolean.FALSE;
            }
            @Override
            public Object visitMatrixDefinition(MatrixDefinition obj) {
                return Boolean.FALSE;
            }
            @Override
            public Object visitAnalystContainer(AnalystContainer obj) {
                return Boolean.FALSE;
            };
            @Override
            public Object visitExternDocument(ExternDocument obj) {
                return Boolean.FALSE;
            };
        };

        @objid ("e1a6aaf6-e852-4036-9b2d-2ada3ec4c1b6")
        public static boolean isSupported(MObject obj) {
            if (obj != null) {
                return (Boolean) obj.accept(exclusionVisitor);
            }
            return false;
        }

    }

}
