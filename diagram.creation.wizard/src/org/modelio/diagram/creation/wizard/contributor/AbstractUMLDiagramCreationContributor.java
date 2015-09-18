package org.modelio.diagram.creation.wizard.contributor;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.graphics.Image;
import org.modelio.api.module.IModule;
import org.modelio.api.module.commands.CommandScope;
import org.modelio.api.ui.diagramcreation.IDiagramWizardContributor;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MStatus;

/**
 * This abstract class provides common stuff to diagram contributors for the standard UML diagrams of Modelio. Standard UML diagrams
 * definitions are not provided by a module in a 'module.xml' file. This is why the class mostly defines fakes setter accessors that
 * do nothing in order to implement IDiagramWizardContributor. The corresponding getters are hard-coded for each different type of
 * diagram.
 */
@objid ("6e6bbe5a-f63f-49ae-9d8d-e126a0253778")
public abstract class AbstractUMLDiagramCreationContributor implements IDiagramWizardContributor {
    @objid ("e48559d6-2aa8-4a04-b2c4-1a28eecac5be")
    protected IMModelServices mmServices;

    @objid ("ebd3374a-da80-463c-bca9-f00ced55e010")
    protected IProjectService projectService;

    @objid ("68f19d1c-719b-45d5-a020-59e98957ff37")
    @Override
    public boolean accept(final MObject owner) {
        if (owner != null) {
            for (MClass metaclass : getAcceptedMetaclasses()) {
                if (metaclass.hasBase(owner.getMClass())) {
                    MStatus elementStatus = owner.getStatus();
                    if (owner.getMClass().isCmsNode() && elementStatus.isCmsManaged()) {
                        return !elementStatus.isRamc();
                    } else {
                        return owner.isModifiable();
                    }
                }
            }
        }
        return false;
    }

    /**
     * Portability convenience temporary accessor. Return scopes that are metaclasses.
     * @return
     */
    @objid ("c7e57c75-58a8-45e8-bd83-d7813973ce91")
    @Deprecated
    public abstract List<MClass> getAcceptedMetaclasses();

    @objid ("3076df7e-6b7d-4684-8d83-41787238186b")
    @Override
    public String getHelpUrl() {
        return null;
    }

    @objid ("34e3b86a-521b-4ddd-8aee-01be5544fd18")
    @Override
    public List<CommandScope> getScopes() {
        return Collections.emptyList();
    }

    /**
     * Set the content of the first note with the given type on the &lt;element&gt; ModelElement.
     * @param element
     * @param moduleName
     * @param type
     * @param content
     */
    @objid ("ba335241-50ea-4632-9fa1-0033ff16f84a")
    public static void putNoteContent(ModelElement element, String type, String content) {
        // FIXME
        // element.putNoteContent("ModelerModule", type, content);
    }

    @objid ("1f720c1a-99e3-4dcf-8abf-214a7920ef4e")
    @Override
    public void setDetails(String details) {
        return;
    }

    @objid ("cb7e86d5-f8b7-4596-9c6c-779a97286f86")
    @Override
    public void setHelpUrl(String helpUrl) {
        return;
    }

    @objid ("7e5deae9-3a26-4596-b72b-004067d84e67")
    @Override
    public void setIcon(Image icon) {
        ; // not supported nothing to do
    }

    @objid ("5cb61cba-07c9-43af-9809-480ba99fb474")
    public void setInformation(String informations) {
        ; // not supported nothing to do
    }

    @objid ("c4d7d733-be76-4fce-bc75-246f19085fcf")
    @Override
    public void setLabel(String label) {
        ; // not supported nothing to do
    }

    @objid ("298e6780-9869-436a-90b3-68820f12eb19")
    public void setModelService(IMModelServices mmServices) {
        this.mmServices = mmServices;
    }

    @objid ("6d186188-f9c7-494e-8bc4-7e19a09abc25")
    public void setParameters(Map<String, String> parameters) {
        ; // not supported nothing to do
    }

    @objid ("140be8e7-c8d8-4df7-ae0a-022ebe6f98a4")
    public void setProjectService(IProjectService projectService) {
        this.projectService = projectService;
    }

    @objid ("0849a70c-10e9-465b-9ffd-6328b4affb32")
    @Override
    public void setScopes(List<CommandScope> scopes) {
        return;
    }

    @objid ("ec37c3cb-954d-43dc-996a-f647cffa0e82")
    protected void setElementDefaultName(ModelElement element) {
        element.setName(this.mmServices.getElementNamer().getUniqueName(element));
    }

    @objid ("5f272d36-a4b4-4622-baff-efe93ebeb0d0")
    @Override
    public IModule getModule() {
        return null; //not supported: retur null
    }

    @objid ("3433cc09-92c6-4bea-b6b4-31fcdeadf3f9")
    public void setModule(IModule module) {
        ; //not supported: do nothing
    }

}
