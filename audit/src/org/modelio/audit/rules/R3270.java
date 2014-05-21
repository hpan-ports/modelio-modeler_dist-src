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
                                    

package org.modelio.audit.rules;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.audit.engine.core.IAuditEntry;
import org.modelio.audit.engine.core.IAuditPlan;
import org.modelio.audit.engine.core.IControl;
import org.modelio.audit.engine.core.IRule;
import org.modelio.audit.engine.impl.AbstractControl;
import org.modelio.audit.engine.impl.AbstractRule;
import org.modelio.audit.engine.impl.AuditEntry;
import org.modelio.audit.engine.impl.AuditTrigger;
import org.modelio.audit.engine.impl.IDiagnosticCollector;
import org.modelio.audit.service.AuditSeverity;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.bpmn.objects.BpmnDataObject;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.bpmn.objects.BpmnDataStore;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.vcore.session.api.model.change.IElementMovedEvent;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * R3270
 * 
 * Severity : warning
 * 
 * Description : If a BpmnItemAwareElement has a type GeneralClass, then its State must also be part of that GeneralClass.
 */
@objid ("78aae3d9-5f9b-4a3d-828e-3deeeca6e246")
public class R3270 extends AbstractRule {
    @objid ("6f86a46a-f8d6-49ed-a012-6e492f219034")
    private static final String RULEID = "R3270";

    /**
     * The checker unique instance. Remove it if you are not using a unique checker strategy.<br>
     * 
     * @see AbstractRule#getCreationControl(Element)
     * @see AbstractRule#getUpdateControl(Element)
     * @see AbstractRule#getMoveControl(ElementMovedEvent)
     */
    @objid ("7cbc4660-75af-484e-892d-71e86f8aa3bc")
    private CheckR3270 checkerInstance = null;

    @objid ("a3cce8b0-d0d5-44a8-be7e-f0dc6c1c560d")
    @Override
    public void autoRegister(final IAuditPlan plan) {
        plan.registerRule(Metamodel.getMClass(BpmnDataInput.class).getName(), this, AuditTrigger.CREATE | AuditTrigger.UPDATE);
        plan.registerRule(Metamodel.getMClass(BpmnDataObject.class).getName(), this, AuditTrigger.CREATE | AuditTrigger.UPDATE);
        plan.registerRule(Metamodel.getMClass(BpmnDataOutput.class).getName(), this, AuditTrigger.CREATE | AuditTrigger.UPDATE);
        plan.registerRule(Metamodel.getMClass(BpmnDataStore.class).getName(), this, AuditTrigger.CREATE | AuditTrigger.UPDATE);
    }

    @objid ("409e64dd-dbee-41b6-b4fc-a25d66043e7c")
    @Override
    public String getRuleId() {
        return RULEID;
    }

    /**
     * Default implementation is using a unique instance for the checker. An alternative implementation consists in
     * creating a new instance of the checker for each element to check. This allows for fine tuning of the check
     * depending on the element status or on some external conditions. Use the 'new instance' strategy only if fine
     * tuning of the check is required for each element, because this strategy creates many objects (performance
     * issues).
     */
    @objid ("df1d1ca8-a9ed-4362-ad4f-6b45657db4c0")
    @Override
    public IControl getUpdateControl(final MObject element) {
        return this.checkerInstance;
    }

    /**
     * Default implementation is using a unique instance for the checker. An alternative implementation consists in
     * creating a new instance of the checker for each element to check. This allows for fine tuning of the check
     * depending on the element status or on some external conditions. Use the 'new instance' strategy only if fine
     * tuning of the check is required for each element, because this strategy creates many objects (performance
     * issues).
     */
    @objid ("a9fa2941-6c5a-47e9-940c-9aa50612893f")
    @Override
    public IControl getMoveControl(final IElementMovedEvent moveEvent) {
        return null;
    }

    /**
     * Default implementation is using a unique instance for the checker. An alternative implementation consists in
     * creating a new instance of the checker for each element to check. This allows for fine tuning of the check
     * depending on the element status or on some external conditions. Use the 'new instance' strategy only if fine
     * tuning of the check is required for each element, because this strategy creates many objects (performance
     * issues).
     */
    @objid ("c2b0b1f8-a176-4e91-a8eb-47cb0dcb1a55")
    @Override
    public IControl getCreationControl(final MObject element) {
        return this.checkerInstance;
    }

    /**
     * Default constructor for R3250
     */
    @objid ("dd8235be-7883-4288-8547-900131166258")
    public R3270() {
        this.checkerInstance = new CheckR3270(this);
    }

    /**
     * Actual checker for R3270: Checks that the type and inState relationships are coherent.
     */
    @objid ("a3c8aa2d-6630-4094-952d-cd5a027c9976")
    public static class CheckR3270 extends AbstractControl {
        /**
         * C'tor.
         * @param rule the rule to check.
         */
        @objid ("2309f57a-1344-4440-8510-bb92f78529a7")
        public CheckR3270(final IRule rule) {
            super(rule);
        }

        @objid ("5f03e75d-6b1e-4d20-84af-2684528cccfb")
        @Override
        public IDiagnosticCollector doRun(final IDiagnosticCollector diagnostic, final MObject element) {
            if(element instanceof BpmnItemAwareElement)
                diagnostic.addEntry(checkR3270((BpmnItemAwareElement) element));
            return diagnostic;
        }

        @objid ("17157ca5-4140-45e7-8e4b-efe95f942c41")
        private IAuditEntry checkR3270(final BpmnItemAwareElement element) {
            AuditEntry auditEntry = new AuditEntry(this.rule.getRuleId(),
                    AuditSeverity.AuditSuccess,
                    element,
                    null);
            
            final GeneralClass type = element.getType();
            final State state = element.getInState();
            if (type != null && state != null) {
                if (!isOwningClass(state, type)) {
                    auditEntry.setSeverity(this.rule.getSeverity());
                    ArrayList<Object> linkedObjects = new ArrayList<>();
                    linkedObjects.add(element);
                    linkedObjects.add(state);
                    linkedObjects.add(type);
                    auditEntry.setLinkedInfos(linkedObjects);
                }
            }
            return auditEntry;
        }

        @objid ("b1ca9916-d234-4b82-a6de-31813d998b0f")
        private boolean isOwningClass(State state, GeneralClass type) {
            MObject parent = state;
            while (parent != null && !parent.equals(type)) {
                parent = parent.getCompositionOwner();
            }
            return parent != null && parent.equals(type);
        }

    }

}
