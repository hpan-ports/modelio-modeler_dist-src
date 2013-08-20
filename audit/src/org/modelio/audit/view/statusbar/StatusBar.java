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
                                    

package org.modelio.audit.view.statusbar;

import java.net.URL;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.modelio.audit.engine.core.AuditRunnerStatus;
import org.modelio.audit.engine.core.IAuditDiagnostic;
import org.modelio.audit.engine.core.IAuditMonitor;
import org.modelio.audit.plugin.Audit;

/**
 * StatusBar controller.
 * <p>
 * Merges in one class the status bar SWT component and its controller.
 * <p>
 * TODO : Images are not disposed with the status bar.
 */
@objid ("a68875a0-fb29-41bb-b23f-a5f67438eba9")
public class StatusBar implements IAuditMonitor {
    @objid ("4d79dca0-6847-408a-858b-aa1b124588ac")
    private final Label activityLabel;

    @objid ("b0ae407c-0b2e-440d-a042-d1d890b15ebd")
    private final Label runnerStatusLabel;

    @objid ("f160ead6-f563-4ac0-b384-1f9e21ebd978")
    private Image processingStatusIcon;

    @objid ("0d541b96-eec4-483e-9e38-177982da243b")
    private Image suspendedStatusIcon;

    @objid ("bd428326-221a-4a19-9b04-0126ed75a4bc")
    private Image idleStatusIcon;

    @objid ("9b3c8307-7fba-4849-ab0d-6fea7a3c7c7a")
    private final Composite container;

    @objid ("09107f7c-64a1-478f-a360-931cd0d17016")
    private final Label auditSummaryLabel;

    /**
     * Initialize the status bar.
     * @param parent The parent composite.
     * @param style not used.
     */
    @objid ("860b222d-5fd2-4138-bd16-d12002c5d836")
    public StatusBar(Composite parent, int style) {
        allocateIcons();
        
        this.container = new Composite(parent, SWT.RIGHT_TO_LEFT);
        
        final RowLayout layout = new RowLayout();
        layout.wrap = false;
        layout.pack = true;
        layout.justify = false;
        layout.center = true;
        this.container.setLayout(layout);
        
        // Runner status 'LED-like' display
        this.runnerStatusLabel = new Label(this.container, 0);
        this.runnerStatusLabel.setImage(this.idleStatusIcon);
        RowData rd = new RowData();
        this.runnerStatusLabel.setLayoutData(rd);
        
        this.activityLabel = new Label(this.container, SWT.BORDER);
        this.activityLabel.setText("0");
        rd = new RowData();
        rd.width = 80;
        this.activityLabel.setLayoutData(rd);
        
        this.auditSummaryLabel = new Label(this.container, SWT.BORDER | SWT.LEFT_TO_RIGHT);
        this.auditSummaryLabel.setText("...");
        rd = new RowData();
        rd.width = 250;
        this.auditSummaryLabel.setAlignment(SWT.CENTER);
        this.auditSummaryLabel.setLayoutData(rd);
        
        // TODO : This method shouldn't have to be called here:
        // Adding this status bar as listener should fire its status(...) method.
        // updateFromRunnerStatus(Audit.getInstance().auditEngine.getRunningStatus(), 0);
        updateFromRunnerStatus(AuditRunnerStatus.IDLE, 0);
    }

    @objid ("536aa3e9-bcb7-4fe3-96b1-7134c9385a73")
    public void auditModelChanged(final IAuditDiagnostic auditDiagnostic) {
        if (!getComposite().isDisposed()) {
            updateFromDiagnostic(auditDiagnostic);
        }
    }

    /**
     * Get the status bar SWT Composite.
     * <p>
     * The returned Composite is a child of the composite given to the constructor.
     * @return the status bar composite.
     */
    @objid ("024af934-42cc-49e8-b83a-422f58a36662")
    public Composite getComposite() {
        return this.container;
    }

// private boolean displayed = true;
    @objid ("8f4576f6-1f82-4c78-96bb-fb50bcbcb3d0")
    @Override
    public void status(final AuditRunnerStatus status, final int queueSize) {
        final Composite composite = getComposite();
        
        if (!composite.isDisposed() && status != null) {
            // displayed = false;
            composite.getDisplay().asyncExec(new Runnable() {
                @Override
                public void run() {
                    if (!composite.isDisposed()) {
                        updateFromRunnerStatus(status, queueSize);
                    }
                    // displayed = true;
                }
            });
        
        }
    }

    /**
     * Update the status bar from last audit diagnostic.
     * @param auditDiagnostic the last audit diagnostic.
     */
    @objid ("8c4a37ba-abe8-4a2f-ac2f-cdd90b385018")
    public void updateFromDiagnostic(final IAuditDiagnostic auditDiagnostic) {
        final String msg = Audit.I18N.getMessage("Audit.Status.report", Integer.toString(auditDiagnostic.getErrorCount()), Integer.toString(auditDiagnostic.getWarningCount()), Integer.toString(auditDiagnostic.getTipCount()));
        
        this.auditSummaryLabel.setText(msg);
        
        if (auditDiagnostic.getErrorCount() > 0) {
            this.auditSummaryLabel.setForeground(getComposite().getDisplay().getSystemColor(SWT.COLOR_RED));
        } else if (auditDiagnostic.getWarningCount() > 0) {
            this.auditSummaryLabel.setForeground(getComposite().getDisplay().getSystemColor(SWT.COLOR_BLUE));
        } else {
            this.auditSummaryLabel.setForeground(getComposite().getDisplay().getSystemColor(SWT.COLOR_BLACK));
        }
    }

    /**
     * Update the status view from the given parameters.
     * @param status The audit status
     * @param queueSize The queue size
     */
    @objid ("f3b2425b-7220-431c-9cb0-ad1715864e5d")
    public void updateFromRunnerStatus(final AuditRunnerStatus status, final int queueSize) {
        this.activityLabel.setText(Integer.toString(queueSize));
        
        switch (status) {
        case IDLE:
            this.runnerStatusLabel.setImage(this.idleStatusIcon);
            this.runnerStatusLabel.setToolTipText(Audit.I18N.getString("Audit.Status.idle"));
            break;
        case PROCESSING:
            this.runnerStatusLabel.setImage(this.processingStatusIcon);
            this.runnerStatusLabel.setToolTipText(Audit.I18N.getString("Audit.Status.processing"));
            break;
        case SUSPENDED:
            this.runnerStatusLabel.setImage(this.suspendedStatusIcon);
            this.runnerStatusLabel.setToolTipText(Audit.I18N.getString("Audit.Status.suspended"));
            break;
        case TERMINATED:
            this.runnerStatusLabel.setImage(null);
            this.runnerStatusLabel.setToolTipText(Audit.I18N.getString("Audit.Status.terminated"));
            break;
        }
    }

    @objid ("1ed3255c-1647-4be2-9b9c-9749a0d96813")
    private void allocateIcons() {
        this.processingStatusIcon = createImageDescriptor("icons/processing.png").createImage();
        this.suspendedStatusIcon = createImageDescriptor("icons/suspended.png").createImage();
        this.idleStatusIcon = createImageDescriptor("icons/idle.png").createImage();
    }

    /**
     * Create an image descriptor from a path relative to the Audit plugin.
     * @param path a relative path.
     * @return the image descriptor.
     */
    @objid ("7d3f3c6e-5867-45d4-aad1-5ea7ba3047b0")
    private ImageDescriptor createImageDescriptor(final String path) {
        URL bitmapUrl = FileLocator.find(Platform.getBundle(Audit.PLUGIN_ID), new Path(path), null);
        return ImageDescriptor.createFromURL(bitmapUrl);
    }

}
