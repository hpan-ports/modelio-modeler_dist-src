package org.modelio.api.impl.app.navigation;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.app.navigation.INavigationListener;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("f21b5114-7e86-4876-a8f0-8def5f0146d4")
public class MdaNavigationListener implements INavigationListener {
    @objid ("59d4487f-bbc7-4be2-9add-d804e3f9005f")
     List<INavigationListener> listeners = null;

    @objid ("fa5d3e82-f203-4326-af28-5bb65f7b158c")
    public MdaNavigationListener() {
        this.listeners = new ArrayList<>();
    }

    @objid ("bcc11f35-f5cd-4464-a116-170dbcb6d546")
    @Override
    public void navigateTo(MObject target) {
        for (INavigationListener listener : this.listeners) {
            listener.navigateTo(target);
        }
    }

    @objid ("656944fc-8d72-4efa-9ecf-adbedd29f39a")
    public void addNavigationListener(INavigationListener listener) {
        this.listeners.add(listener);
    }

    @objid ("2ba53622-70d9-48f6-a4a7-60575cc08cfd")
    public void removeNavigationListener(INavigationListener listener) {
        this.listeners.remove(listener);
    }

    @objid ("bd3e4625-5c6b-4cda-8695-2f901e047dbe")
    @Override
    public void navigateTo(List<MObject> targets) {
        for (INavigationListener listener : this.listeners) {
            listener.navigateTo(targets);
        }
    }

}
