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
                                    

package org.modelio.vcore.session.impl.transactions.events;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.session.impl.transactions.Transaction;
import org.modelio.vcore.session.impl.transactions.smAction.AppendDependencyAction;
import org.modelio.vcore.session.impl.transactions.smAction.CreateElementAction;
import org.modelio.vcore.session.impl.transactions.smAction.DeleteElementAction;
import org.modelio.vcore.session.impl.transactions.smAction.EraseDependencyAction;
import org.modelio.vcore.session.impl.transactions.smAction.IAction;
import org.modelio.vcore.session.impl.transactions.smAction.MoveDependencyAction;
import org.modelio.vcore.session.impl.transactions.smAction.SetAttributeAction;
import org.modelio.vcore.session.impl.transactions.smAction.smActionInteractions.IActionVisitor;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("01f42120-0000-272c-0000-000000000000")
class RollbackModelChangeActionVisitor implements IActionVisitor {
    @objid ("01f42120-0000-277d-0000-000000000000")
    private ModelChangeEvent event;

    @objid ("01f42120-0000-2787-0000-000000000000")
    private StatusChangeEvent statusEvent;

    @objid ("01f42120-0000-2734-0000-000000000000")
    public RollbackModelChangeActionVisitor(ModelChangeEvent event, StatusChangeEvent statusEvent) {
        this.event = event;
        this.statusEvent = statusEvent;
    }

    @objid ("01f42120-0000-273e-0000-000000000000")
    @Override
    public void visitTransaction(final Transaction tr) {
        // simply visit the actions of the transaction
        for (IAction a : tr.getActions()) {
            a.accept(this);
        }
    }

    @objid ("01f42120-0000-2747-0000-000000000000")
    @Override
    public void visitCreateElementAction(final CreateElementAction theCreateElementAction) {
        // do nothing
    }

    @objid ("01f42120-0000-2750-0000-000000000000")
    @Override
    public void visitDeleteElementAction(final DeleteElementAction theDeleteElementAction) {
        // do nothing
    }

    @objid ("01f42120-0000-2759-0000-000000000000")
    @Override
    public void visitSetAttributeAction(final SetAttributeAction theSetAttributeAction) {
        SmObjectImpl refered = theSetAttributeAction.getRefered();
        
        // Forget created then deleted elements
        if (refered.isDeleted())
            return;
        
        // Only AbstractDiagram are managed
        // AbstractDiagram* referedDiagram = dynamic_cast<AbstractDiagram*>
        // (refered);
        // if (referedDiagram == 0)
        // return;
        
        // if (theSetAttributeAction.get_Att() == AbstractDiagramuiData())
        // {
        // // If the element is already in the list of updated elements, it has
        // not to be added
        // if (event->updatedElements.count(refered) == 0)
        // {
        // // If the element already is in the list of created eleemnts, it has
        // not to be added
        // if (event->createdElements.count(refered) == 0)
        // event->updatedElements[refered] = refered;
        // }
        // }
    }

    @objid ("01f42120-0000-2762-0000-000000000000")
    @Override
    public void visitEraseDependencyAction(final EraseDependencyAction action) {
        // do nothing
    }

    @objid ("01f42120-0000-276b-0000-000000000000")
    @Override
    public void visitAppendDependencyAction(final AppendDependencyAction action) {
        // do nothing
    }

    @objid ("01f42120-0000-2774-0000-000000000000")
    @Override
    public void visitMoveDependencyAction(final MoveDependencyAction action) {
        // do nothing
    }

}
