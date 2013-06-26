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
                                    

package org.modelio.audit.service.impl;

import java.io.File;
import javax.inject.Inject;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.Platform;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.modelio.app.core.events.ModelioEventTopics;
import org.modelio.audit.engine.AuditEngine;
import org.modelio.audit.engine.impl.AuditPlan;
import org.modelio.audit.preferences.AuditConfigurator;
import org.modelio.audit.service.IAuditService;
import org.modelio.gproject.gproject.GProject;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("7ddbb117-45fb-11e2-9b4d-bc305ba4815c")
@Creatable
public class AuditService implements IAuditService {
    @objid ("7ddbb119-45fb-11e2-9b4d-bc305ba4815c")
    private File redefinedFile;

    @objid ("7ddbb11a-45fb-11e2-9b4d-bc305ba4815c")
    private AuditEngine auditEngine;

    @objid ("7ddbb11b-45fb-11e2-9b4d-bc305ba4815c")
    private GProject openedProject;

    @objid ("7ddbb11c-45fb-11e2-9b4d-bc305ba4815c")
    @Override
    public void changeConfigurationPlan(File confFile) {
        this.redefinedFile = confFile;
    }

    @objid ("7ddbb120-45fb-11e2-9b4d-bc305ba4815c")
    @Override
    public void restart() {
        // Create an audit configurator
        File config = getConfigurationPlan();
        AuditConfigurator auditConfigurator = new AuditConfigurator(config);
        
        // Generate the plan
        AuditPlan auditPlan = auditConfigurator.createPlan();
        auditPlan.dump(Platform.getLogFileLocation());
        
        // Change the plan
        this.auditEngine.setPlan(auditPlan,this.openedProject.getSession());
    }

    @objid ("7ddbb123-45fb-11e2-9b4d-bc305ba4815c")
    @Override
    public void checkElement(MObject element, String jobId) {
        this.auditEngine.checkElement(element,jobId);
    }

    /**
     * Return File descriptor of the local configuration file for the current project. An opened modeling session is assumed to be
     * available.
     * @return File : Configuration file
     */
    @objid ("7ddbb127-45fb-11e2-9b4d-bc305ba4815c")
    @Override
    public File getConfigurationPlan() {
        if(this.redefinedFile != null){
            return this.redefinedFile;
        }
        return new File(this.openedProject.getProjectDataPath().toFile(), "/.config/auditconfiguration.xml");
    }

    /**
     * This method is called after a project opening. Keep a reference to the modeling session and model services.
     */
    @objid ("7ddbb12d-45fb-11e2-9b4d-bc305ba4815c")
    @Inject
    @Optional
    void onProjectOpened(@EventTopic(ModelioEventTopics.PROJECT_OPENED) final GProject project) {
        //FIXME this should be an @UIEventTopic, but they are not triggered with eclipse 4.3 M5...
        if(project != null){    
            this.openedProject = project;
            
            // Standard audit
            // Read the audit configuration and prepare the list of rule classes
            File configFile = getConfigurationPlan();
        
            // If there is no config file (first time project or erased by user)
            // create a new one from the factory settings values
            if (configFile.exists() == false) {
                // as there is no local configuration file, install factory settings
                installFactorySettings();
            }
        
            // create and configure audit engine
            initAuditEngine(project.getSession());
        }
    }

    @objid ("7dde1278-45fb-11e2-9b4d-bc305ba4815c")
    private void initAuditEngine(ICoreSession session) {
        // Create an audit configurator
        File configFile = getConfigurationPlan();
        AuditConfigurator auditConfigurator = new AuditConfigurator(configFile);
        
        // Generate the plan
        AuditPlan auditPlan = auditConfigurator.createPlan();
        // auditPlan.dump(Platform.getLogFileLocation());
        
        // Init the audit engine, set the plan and start
        this.auditEngine.setPlan(auditPlan,session);
        this.auditEngine.start(this.openedProject.getSession());
    }

    /**
     * Called when a project is closed. On session close un-reference the modeling session and model services.
     */
    @objid ("7dde127a-45fb-11e2-9b4d-bc305ba4815c")
    @Optional
    @Inject
    void onProjectClosing(@EventTopic(ModelioEventTopics.PROJECT_CLOSING) final GProject closedProject) {
        // FIXME this should be an @UIEventTopic, but they are not triggered with eclipse 4.3 M5...
        if(closedProject != null){
            // Standard audit
            this.auditEngine.stop(closedProject.getSession());
            this.openedProject = null;        
        }
    }

    @objid ("7dde1281-45fb-11e2-9b4d-bc305ba4815c")
    private void installFactorySettings() {
        File configFile = getConfigurationPlan();        
        // create a configurator for factory settings and save
        AuditConfigurator configurator = new AuditConfigurator(null);
        configurator.saveAs(configFile);
    }

    @objid ("7dde1283-45fb-11e2-9b4d-bc305ba4815c")
    @Override
    public AuditEngine getAuditEngine() {
        return this.auditEngine;
    }

    @objid ("b4c3aaa7-f8a1-41cc-9c0b-d8cf049f14c5")
    public AuditService() {
        this.auditEngine  = new AuditEngine();
    }

}
