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
                                    

package org.modelio.model.browser.views.treeview;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.swt.widgets.TreeItem;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Usage;
import org.modelio.metamodel.uml.statik.Binding;
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.metamodel.uml.statik.ElementImport;
import org.modelio.metamodel.uml.statik.Generalization;
import org.modelio.metamodel.uml.statik.InterfaceRealization;
import org.modelio.metamodel.uml.statik.Manifestation;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.metamodel.uml.statik.PackageMerge;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.uml.statik.RaisedException;
import org.modelio.metamodel.uml.statik.RequiredInterface;
import org.modelio.metamodel.uml.statik.TemplateBinding;
import org.modelio.metamodel.uml.statik.TemplateParameterSubstitution;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.session.api.transactions.ITransaction;

/**
 * Element name modifier.
 */
@objid ("068ce175-1de3-11e2-bcbe-002564c97630")
class ElementNameModifier implements ICellModifier {
    @objid ("1fbd7564-1de3-11e2-bcbe-002564c97630")
    private ICoreSession modelingSession;

    @objid ("1fbd7565-1de3-11e2-bcbe-002564c97630")
    public ElementNameModifier(ICoreSession modelingSession) {
        super();
        this.modelingSession = modelingSession;
    }

    @objid ("1fbfd6c6-1de3-11e2-bcbe-002564c97630")
    @Override
    public boolean canModify(Object object, String property) {
        if (isEditable(object)) {
            return true;
        } else {
            return false;
        }
    }

    @objid ("1fbfd6cc-1de3-11e2-bcbe-002564c97630")
    @Override
    public Object getValue(Object object, String property) {
        if (object instanceof ModelElement) {
            final ModelElement modelElement = (ModelElement) object;
            return modelElement.getName();
        }
        return "";
    }

    @objid ("1fbfd6d3-1de3-11e2-bcbe-002564c97630")
    @Override
    public void modify(Object object, String property, Object value) {
        if (object instanceof TreeItem) {
            final TreeItem item = (TreeItem) object;
            final Object data = item.getData();
        
            if (data instanceof ModelElement) {
                final ModelElement modelElement = (ModelElement) data;
        
                if (!modelElement.getName().equals(value)) {
                    if (this.modelingSession != null) {
                        try (ITransaction transaction = this.modelingSession.getTransactionSupport().createTransaction("Rename a " + modelElement.getMClass().getName())) {
                            modelElement.setName((String) value);
                            transaction.commit();
                            //view.selectElement(modelElement);
                        }
                    }
                }
            }
        }
    }

    @objid ("1fbfd6d9-1de3-11e2-bcbe-002564c97630")
    private boolean isEditable(Object object) {
        if (!(object instanceof ModelElement)) {
            return false;
        } else {
            final ModelElement element = (ModelElement) object;
        
            if (!isEditableElement(element)) {
                return false;
            }
        
            return element.getStatus().isModifiable();
        
        }
    }

    @objid ("1fbfd6dd-1de3-11e2-bcbe-002564c97630")
    private boolean isEditableElement(ModelElement element) {
        // if element is a parameter it can only edited if it is an IO parameter and not a return one
        if (element instanceof Parameter) {
            Parameter p = (Parameter) element;
            return (p.getReturned() == null);
        }
        
        if (element instanceof Usage ||
                element instanceof Binding ||
                element instanceof ClassAssociation ||
                element instanceof ElementImport ||
                element instanceof Generalization ||
                element instanceof InterfaceRealization ||
                element instanceof Manifestation ||
                element instanceof PackageImport ||
                element instanceof PackageMerge ||
                element instanceof ProvidedInterface ||
                element instanceof RaisedException ||
                element instanceof RequiredInterface ||
                element instanceof TemplateBinding ||
                element instanceof TemplateParameterSubstitution ||
                element instanceof UseCaseDependency)
        {
            return false;
        }
        return true;
    }

}
