package org.modelio.api.impl.app.navigation;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.viewers.StructuredSelection;
import org.modelio.api.app.navigation.INavigationListener;
import org.modelio.api.app.navigation.INavigationService;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("3a20c126-5633-4a8a-9d40-24d865b70f5b")
public class NavigationService implements INavigationService {
    @objid ("57950a5b-8478-470a-a045-386091392cc1")
    private MdaNavigationListener mdaNavigationListener = null;

    @objid ("bdb519b4-e607-4b57-94b7-b9cff613b321")
    private ESelectionService selectionService;

    @objid ("b032da61-2ab5-43a5-ad65-6232b5547fcc")
    public NavigationService(ESelectionService selectionService) {
        this.mdaNavigationListener = new MdaNavigationListener();
        this.selectionService = selectionService;
    }

    @objid ("cd8e60e5-3083-4946-9903-4546414f210a")
    @Override
    public void addNavigationListener(INavigationListener listener) {
        this.mdaNavigationListener.addNavigationListener(listener);
    }

    @objid ("e390f894-3148-4638-8e2c-3c69a5acdaa3")
    @Override
    public void fireNavigate(MObject target) {
        if (this.selectionService != null) {
            this.selectionService.setSelection(new StructuredSelection(target));
        }
    }

    @objid ("e7e1ecf0-3cc8-4e1f-b73d-f3473e4066cd")
    @Override
    public void removeNavigationListener(INavigationListener listener) {
        this.mdaNavigationListener.removeNavigationListener(listener);
    }

    @objid ("49fc37d9-2a14-48e2-8143-af2dcd374d47")
    @Override
    public void fireNavigate(List<MObject> targets) {
        if (this.selectionService != null) {
            this.selectionService.setSelection(new StructuredSelection(targets));
        }
    }

}
