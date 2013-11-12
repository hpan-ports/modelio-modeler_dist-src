package org.modelio.api.impl.app.navigation;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.modelio.api.app.navigation.INavigationListener;
import org.modelio.api.app.navigation.INavigationService;
import org.modelio.app.core.events.ModelioEventTopics;
import org.modelio.app.core.navigate.IModelioNavigationService;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("3a20c126-5633-4a8a-9d40-24d865b70f5b")
@Creatable
public class NavigationService implements INavigationService {
    @objid ("bdb519b4-e607-4b57-94b7-b9cff613b321")
    @Inject
    private IModelioNavigationService selectionService;

    @objid ("70b7c9fd-9bc2-4331-b6fa-81f78acf8b2d")
     List<INavigationListener> listeners = null;

    @objid ("b032da61-2ab5-43a5-ad65-6232b5547fcc")
    public NavigationService() {
        this.listeners = new ArrayList<>();
    }

    @objid ("e390f894-3148-4638-8e2c-3c69a5acdaa3")
    @Override
    public void fireNavigate(MObject target) {
        if (this.selectionService != null) {
            this.selectionService.fireNavigate(target);
        }
    }

    @objid ("49fc37d9-2a14-48e2-8143-af2dcd374d47")
    @Override
    public void fireNavigate(List<MObject> targets) {
        if (this.selectionService != null) {
            this.selectionService.fireNavigate(targets);
        }
    }

    @objid ("e48805ff-c96d-414c-9ddc-d1055e7c4b10")
    @Inject
    @Optional
    public void onNavigateElement(@EventTopic(ModelioEventTopics.NAVIGATE_ELEMENT) final List<MObject> elements) {
        for (INavigationListener listener : this.listeners) {
            listener.navigateTo(elements);
        }
    }

    @objid ("5f71bfa9-aae5-4237-8a30-a57e5c176e51")
    @Inject
    @Optional
    public void onNavigateElement(@EventTopic(ModelioEventTopics.NAVIGATE_ELEMENT) final MObject element) {
        for (INavigationListener listener : this.listeners) {
            listener.navigateTo(element);
        }
    }

    @objid ("cd8e60e5-3083-4946-9903-4546414f210a")
    @Override
    public void addNavigationListener(INavigationListener listener) {
        this.listeners.add(listener);
    }

    @objid ("e7e1ecf0-3cc8-4e1f-b73d-f3473e4066cd")
    @Override
    public void removeNavigationListener(INavigationListener listener) {
        this.listeners.remove(listener);
    }

}
