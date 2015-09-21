/* 
 * Copyright 2013-2015 Modeliosoft
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */


package org.modelio.api.ui.form;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.modelio.api.modelio.Modelio;
import org.modelio.api.ui.form.fields.IField;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.ui.panel.IPanelProvider;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * An {@link IPanelProvider} implementation displaying a form for the selected model element.
 * <p>
 * Forms are build using an {@link IFieldFactory}, and may be split into several pages. See {@link FormFieldPage}.
 * </p>
 */
@objid ("b678b466-7054-4e19-a92c-6dc92438b268")
public class ElementFormPanel implements IPanelProvider {
    @objid ("b80ae420-c5a6-446a-bf19-9426d935ab7f")
    private List<IField> fields = new ArrayList<>();

    @objid ("3dc1a9ec-108b-4ac2-a6d4-4f462dda024f")
    private Listener formUpdater;

    @objid ("171c2067-7fe0-410b-99e1-ebc851e31ac7")
    private ModelElement input;

    @objid ("a513611b-0dc1-4124-80f1-dbaaaed64463")
    private ScrolledForm scrolledForm;

    @objid ("f9be1718-9673-44c2-83f4-e77fc289dc76")
    private FormToolkit toolkit;

    @objid ("f912a341-4b8e-4b5d-b17f-8e7bb86ae75a")
    private IFieldFactory fieldFactory;

    /**
     * Build a new instance of ElementFormPanel.
     * @param fieldFactory the factory to create form fields with.
     */
    @objid ("3b642879-cebd-4452-aa4b-0078b28dcd61")
    public ElementFormPanel(IFieldFactory fieldFactory) {
        this.fieldFactory = fieldFactory;
    }

    @objid ("314d6838-87aa-4e03-913f-a4b6fb0d188c")
    @Override
    public final Composite createPanel(Composite parent) {
        this.toolkit = new FormToolkit(parent.getDisplay());
        this.toolkit.setBorderStyle(SWT.BORDER);
        this.scrolledForm = this.toolkit.createScrolledForm(parent);
        
        GridLayout layout = new GridLayout(1, false);
        layout.horizontalSpacing = 0;
        layout.verticalSpacing = 1;
        layout.marginTop = 12;
        layout.marginBottom = 4;
        layout.marginLeft = 2;
        layout.marginRight = 2;
        this.scrolledForm.getBody().setLayout(layout);
        return this.scrolledForm;
    }

    @objid ("868b258e-9be8-4028-8648-5494d1cd8d55")
    @Override
    public final void dispose() {
        this.scrolledForm.dispose();
        this.scrolledForm = null;
        
        // Don't forget to dispose() the toolkit when disposing the panel.
        this.toolkit.dispose();
        this.toolkit = null;
    }

    @objid ("5090fb12-80af-4b27-8402-15de6fd1156a")
    @Override
    public final String getHelpTopic() {
        return null;
    }

    @objid ("5f361cbb-25b1-4418-9277-e81d3cca3395")
    @Override
    public final Object getInput() {
        return this.input;
    }

    @objid ("1bc9f6cc-c120-4728-8379-f6ba556cb4eb")
    @Override
    public final Composite getPanel() {
        return this.scrolledForm;
    }

    @objid ("741dd247-4cbf-45fd-9555-53ad05e391ea")
    @Override
    public final void setInput(Object input) {
        // Bad input cases: clear all
        ModelElement newInput = null;
        if (input instanceof MObject && ((MObject) input).isValid() && isRelevantFor(input)) {
            // Input is a single model element
            newInput = (ModelElement) input;
        } else if (input instanceof List && ((List<?>)input).size() == 1 && ((List<?>)input).get(0) instanceof MObject && ((MObject) ((List<?>)input).get(0)).isValid() &&  isRelevantFor(((List<?>)input).get(0))) {
            // Input is a list containing one model element
            newInput = (ModelElement) ((List<?>)input).get(0);
        }
        
        // Delay for update if not visible because it
        // is really expensive and slows GUI.
        // Exception: force update the first time because SWT.Show event is not fired and
        // we are not notified at all when the form become visible.
        if (this.scrolledForm.isVisible() || this.fields.isEmpty()) {
            updateFormFromInput(newInput);
        } else {
            delayUpdateForm(newInput);
        }
    }

    /**
     * Create a complete form for an element.
     * <p/>
     * {@link #fields} should be filled after calling this method.
     * @param parent a widget which will be the parent of the new field instance (cannot be null)
     * @param input the element to build the form for.
     */
    @objid ("1a552669-47bf-4bdf-b457-da249a0eee85")
    protected void createFormFields(Composite parent, ModelElement input) {
        List<FormFieldPage> pages = this.fieldFactory.createFieldPages(input);
        if (pages == null || pages.isEmpty()) {
            this.fields.addAll(this.fieldFactory.createFields(this.toolkit, parent, input, null));
        } else {
            TabFolder folder = new TabFolder(parent, SWT.NONE);
            folder.setLayoutData(new GridData(GridData.FILL_BOTH));
            for (FormFieldPage page : pages) {
                Composite tab = new Composite(folder, SWT.NONE);
                tab.setLayout(new GridLayout(1, false));
        
                TabItem item = new TabItem(folder, SWT.NONE);
                item.setControl(tab);
                item.setText(page.getLabel());
                item.setImage(page.getImage());
        
                this.fields.addAll(this.fieldFactory.createFields(this.toolkit, tab, input, page));
            }
        }
    }

    /**
     * Add a listener on the property page updating its content as soon as the {@link SWT#Show} event is triggered.
     * @param input the element to use as input for the form.
     */
    @objid ("6f41848a-92a5-4800-9a9d-d23c44f77d6d")
    private void delayUpdateForm(final ModelElement input) {
        // Remove existing listener
        if (this.formUpdater !=null) {
            this.scrolledForm.removeListener(SWT.Show, this.formUpdater);
        }
        
        this.formUpdater = new Listener() {
        
            @SuppressWarnings("synthetic-access")
            @Override
            public void handleEvent(Event event) {
                ElementFormPanel.this.scrolledForm.removeListener(SWT.Show, this);
                updateFormFromInput(input);
            }
        };
        
        this.scrolledForm.addListener(SWT.Show, this.formUpdater);
    }

    /**
     * Refresh the value displayed by all form fields.
     */
    @objid ("346b5440-5d5e-4d4a-bf91-9890f64d85dd")
    private void updateFormFields() {
        for (IField field : this.fields) {
            field.refresh();
        }
    }

    /**
     * Update the form's contents.
     * @param input the element to use as input for the form.
     */
    @objid ("1650ca22-065a-4869-9cb8-59a1c2ea5c3d")
    private void updateFormFromInput(ModelElement input) {
        this.scrolledForm.setRedraw(false);
        this.scrolledForm.setLayoutDeferred(true);
        
        if (! Objects.equals(input, this.input)) {
            // Clear the form: all must be rebuilt because data model is hard linked to previous input
            for (Control c : this.scrolledForm.getBody().getChildren()) {
                c.dispose();
            }
            this.fields.clear();
        }
        
        // Update current input
        this.input = input;
        if (input != null) {
            // Update form header
            this.scrolledForm.setText(input.getName());
            this.scrolledForm.setImage(Modelio.getInstance().getImageService().getStereotypedImage(input, null, false));
        
            // Create fields only the first time this input is selected
            if (this.fields.isEmpty()) {
                createFormFields(this.scrolledForm.getBody(), input);
        
                this.scrolledForm.reflow(true);
            }
        
            // Refresh fields
            updateFormFields();
        }
        
        // Force form's redraw
        this.scrolledForm.setLayoutDeferred(false);
        this.scrolledForm.setRedraw(true);
    }

    @objid ("18ed1212-56d5-4c64-971b-45405e7092f2")
    @Override
    public boolean isRelevantFor(Object obj) {
        return obj instanceof ModelElement;
    }

}
