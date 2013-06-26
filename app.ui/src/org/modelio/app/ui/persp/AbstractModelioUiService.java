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
                                    

package org.modelio.app.ui.persp;

import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspectiveStack;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.modelio.app.core.events.ModelioEventTopics;
import org.modelio.app.project.core.services.IProjectService;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

@objid ("5a8ba2bc-6857-4e0b-8fe2-78e2c0d505b4")
public abstract class AbstractModelioUiService implements IModelioUiService, EventHandler {
    @objid ("17e398af-4d30-441a-b229-86523ca1a0c7")
    private static final String WELCOME_PERSPECTIVE_ID = "org.modelio.app.ui.welcome.perspective";

    @objid ("7118bbaa-f498-4bf4-8c04-ff327c99c97a")
    @Inject
     MApplication application;

    @objid ("080652ff-87e4-43e3-8564-3a8c3057a1db")
    @Inject
    protected IEventBroker eventBroker;

    @objid ("f42f7172-1eff-44ca-b7cc-25009d952d46")
    @Inject
     IProjectService projectService;

    @objid ("82d4a2ea-fcb5-49e1-8caf-28a22c44e3bb")
    @PostConstruct
    void init() {
        this.eventBroker.subscribe(ModelioEventTopics.PROJECT_EVENTS, this);
    }

    /**
     * Handling project open/close events allows an automatic switching between
     * workspace/project perspectives
     */
    @objid ("c07b6fc5-0fe4-4fbf-92af-fa58fe050aa6")
    @Override
    public void handleEvent(Event event) {
        switch (event.getTopic()) {
        case ModelioEventTopics.PROJECT_OPENED:
            for (MPerspective p : getProjectPerspectives()) {
                if (p.getTags().contains("default")) {
                    switchToPerspective(p);
                    return;
                }
            }
            break;
        case ModelioEventTopics.PROJECT_CLOSED:
            for (MPerspective p : getWorkspacePerspectives()) {
                if (p.getTags().contains("default")) {
                    switchToPerspective(p);
                    return;
                }
            }
            break;
        default:
            // Nothing to do
        }
    }

    @objid ("8dedeadf-68a8-420d-a605-bdc755f2fffc")
    @Override
    public MPerspectiveStack getPerspectiveStack() {
        EModelService modelService = this.application.getContext().get(EModelService.class);
        List<MPerspectiveStack> perspectivestacks = modelService.findElements(this.application,
                "org.modelio.app.ui.stack.perspectives", MPerspectiveStack.class, null);
        for (MPerspectiveStack p : perspectivestacks) {
            if (p.getElementId().equals("org.modelio.app.ui.stack.perspectives")) {
                return p;
            }
        }
        return null;
    }

    @objid ("3b0b48a7-b3ea-414f-a2c9-76386b635d7c")
    @Override
    public List<MPerspective> getWorkspacePerspectives() {
        EModelService modelService = this.application.getContext().get(EModelService.class);
        return modelService.findElements(this.application, null, MPerspective.class, Arrays.asList("workspace"));
    }

    @objid ("0174474f-003b-4ffb-97e8-68c83a723cc4")
    @Override
    public List<MPerspective> getProjectPerspectives() {
        EModelService modelService = this.application.getContext().get(EModelService.class);
        return modelService.findElements(this.application, null, MPerspective.class, Arrays.asList("project"));
    }

    @objid ("1ec8ab45-99b4-4a0e-9334-e4ba1e0e8349")
    protected MPerspective getDefaultPerspective() {
        if (projectService != null && projectService.getOpenedProject() != null) {
            return getProjectPerspectives().get(0);
        } else {
            return getWorkspacePerspectives().get(0);
        }
    }

    @objid ("3e3731c9-ac74-42a3-8a6b-7ecc5fcc7517")
    @Override
    public void switchToPerspective(MPerspective perspective) {
        showWelcome(false);
        
        final MPerspectiveStack stack = getPerspectiveStack();
        if (stack == null) {
            return;
        }
        
        final MPerspective switchFrom = stack.getSelectedElement();
        final MPerspective switchTo = (perspective != null) ? perspective : getDefaultPerspective();
        
        if (beforePerspectiveSwitch(switchFrom, switchTo)) {
            stack.setSelectedElement(switchTo);
            afterPerspectiveSwitch(switchFrom, switchTo);
        }
    }

    @objid ("8f9e9051-79ce-45ae-a97f-e6d97835e05f")
    protected abstract boolean beforePerspectiveSwitch(MPerspective current, MPerspective next);

    @objid ("7cb30710-4e31-4046-b8d5-fbab7dc79ba1")
    protected abstract void afterPerspectiveSwitch(MPerspective old, MPerspective current);

    @objid ("242445c1-b0ac-4807-ad59-8713310fecda")
    @Override
    public void showWelcome(boolean onOff) {
        MPartStack welcome = getWelcomeStack();
        MPerspectiveStack pstack = getPerspectiveStack();
        
        if (welcome != null) {
            welcome.setVisible(onOff);
        }
        if (pstack != null) {
            pstack.setVisible(!onOff);
        }
    }

    @objid ("a59b6624-52d0-480d-87ae-7506b1736b43")
    @Override
    public MPartStack getWelcomeStack() {
        EModelService modelService = this.application.getContext().get(EModelService.class);
        List<MPartStack> views = modelService.findElements(this.application, "org.modelio.app.ui.welcome.view", MPartStack.class,
                null);
        for (MPartStack p : views) {
            if (p.getElementId().equals("org.modelio.app.ui.welcome.view")) {
                return p;
            }
        }
        return null;
    }

}
