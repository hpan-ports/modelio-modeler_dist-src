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
                                    

package org.modelio.xmi.impl;

import java.io.File;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.modelio.api.module.IModule;
import org.modelio.gproject.gproject.GProject;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.session.api.transactions.ITransaction;
import org.modelio.xmi.api.ExportConfiguration;
import org.modelio.xmi.api.FormatExport;
import org.modelio.xmi.api.IXMI;
import org.modelio.xmi.api.ImportConfiguration;
import org.modelio.xmi.generation.ExportServices;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.reverse.ImportServices;
import org.modelio.xmi.util.AbortProcessException;
import org.modelio.xmi.util.GenerationProperties;
import org.modelio.xmi.util.ReverseProperties;
import org.modelio.xmi.util.XMIFileUtils;
import org.modelio.xmi.util.XMILogs;

/**
 * This class implements the services provided by XMI
 * @author ebrosse
 */
@objid ("87959527-d46f-4613-9e0d-46b79bd1b00d")
public class XMIImpl implements IXMI {
    @objid ("13f3db8b-d07a-4193-9b2c-9ac13214d5be")
    private ImportServices importService = null;

    @objid ("5cd1fe0a-41ca-45d5-9b9d-b06ca3dbd63c")
    private ExportServices exportService = null;

    @objid ("3048a6cd-666c-4291-8b66-b97ede4e9892")
    private void cancelProcess(Shell shell) {
        if ((shell != null) && (!System.getProperty("os.name").equals("Linux"))) {
            shell.dispose();
        }
        
        Xmi.LOG.error(Xmi.PLUGIN_ID, Xmi.I18N.getString("info.import.result_failed"));
    }

    @objid ("73b0f6dd-06be-4a07-86c1-dff29e470759")
    private void exportModel(final ExportConfiguration configuration) {
        Shell shell = null;
        try {
         
            String xmiFilePath = configuration.getXmiFile().getAbsolutePath() ;
            GenerationProperties.getInstance().setSelectedPackage(configuration.getEntryPoint());
            Resource resource = this.exportService.createResource(xmiFilePath);
            GenerationProperties.getInstance().setRoundtripEnabled(configuration.exportedAnotation());
            this.exportService.createEcoreModel(resource, null);
        
            if (!configuration.getVersionExport().equals(FormatExport.EMF300))
                XMIFileUtils.changeToUML(xmiFilePath);
        
            Xmi.LOG.error(Xmi.PLUGIN_ID, Xmi.I18N.getString("info.export.result_done"));
        } catch (AbortProcessException e) {
            cancelProcess(shell);
        } catch (Exception e) {
            cancelProcess(shell);
            Xmi.LOG.error(Xmi.PLUGIN_ID, "Erreur.");
            Xmi.LOG.error(Xmi.PLUGIN_ID, e);
        } finally {
            XMILogs logs = XMILogs.getInstance();
            logs.saveLog();
        }
    }

    @objid ("88154c73-7cba-41b0-baea-d4e69b14f515")
    @Override
    public void exportXMIFile(final ExportConfiguration configuration) throws Exception {
        if (configuration.getEntryPoint() == null) {
            Xmi.LOG.error(Xmi.PLUGIN_ID, Xmi.I18N.getString("error.nullGivenParameter"));
        } else {
            if (configuration.getXmiFile() != null) {
                initExportService(configuration.getEntryPoint());
                GenerationProperties.getInstance().setFilePath(configuration.getXmiFile());
                exportModel(configuration);
            } else {
                Xmi.LOG.error(Xmi.PLUGIN_ID, Xmi.I18N.getString("error.invalidFilePath"));
            }
        }
    }

    @objid ("9ed93ed7-4d03-40a7-a9ab-0316d0fbb208")
    private boolean importModel(File xmiFile, Element owner) {
        boolean error = false;
              
        Shell shell = Display.getDefault().getActiveShell();
        
        try(ITransaction t = GProject.getProject(owner).getSession().getTransactionSupport().createTransaction("Import") ) {
            
            Resource resource = this.importService.getResource(xmiFile);
        
            if ((resource != null)) {
                error = this.importService.importEcoreModel(resource, null, shell);
            }
            t.commit();
            
        } catch (AbortProcessException e) {
            // cancelProcess(shell);
        } catch (Exception e) {
            error = true;
            // cancelProcess(shell);
            Xmi.LOG.error(Xmi.PLUGIN_ID, "Erreur.");
            Xmi.LOG.error(Xmi.PLUGIN_ID, e);
        } finally {
            XMILogs logs = XMILogs.getInstance();
            logs.saveLog();
        }
        return error;
    }

    @objid ("cf44a9a2-83a3-47ac-89cc-d17e88da329f")
    private void initExportService(Package entryPoint) {
        GenerationProperties genProp = GenerationProperties.getInstance();
        genProp.initialize();
        genProp.setTimeDisplayerActivated(false);
        genProp.setSelectedPackage(entryPoint);
        
        if (this.exportService == null)
            this.exportService = new ExportServices(null);
    }

    @objid ("5c2f8bee-741a-40e4-9094-73c04aa78227")
    private void initImportService() {
        ReverseProperties.getInstance().initialize();
        if (this.importService == null)
            this.importService = new ImportServices();
    }

    @objid ("a1956793-5eb9-421f-abda-a502b8a5aad7")
    @Override
    public void importXMIModel(final ImportConfiguration configuration) {
        if (configuration.getXmiFile() != null && configuration.getXmiFile().isFile()) {
            initImportService();
            ReverseProperties.getInstance().setUMLRoot((Package)configuration.getOwner());
            importModel(configuration.getXmiFile(), configuration.getOwner());
        } else {
            Xmi.LOG.error(Xmi.PLUGIN_ID, Xmi.I18N.getString("error.invalidFilePath"));
        }
    }

    @objid ("1a71300d-fe73-43f8-b8a2-2285088c872d")
    @Override
    public void importXMIProfile(final ImportConfiguration configuration) {
        if(configuration.getOwner() != null && configuration.getOwner() instanceof IModule){
            if (configuration.getXmiFile() != null && configuration.getXmiFile().isFile()) {
                initImportService();
                importProfile(configuration.getXmiFile(), configuration.getOwner() );
            } else {
                Xmi.LOG.error(Xmi.PLUGIN_ID, Xmi.I18N.getString("error.invalidFilePath"));
            }
        }else{
            Xmi.LOG.error(Xmi.PLUGIN_ID, Xmi.I18N.getString("error.invalidOwner"));
        
        }
    }

    @objid ("45308345-653d-434f-9435-9834e704a573")
    @Override
    public void exportXMIProfile(final ExportConfiguration configuration) throws Exception {
        if (configuration.getEntryPoint() == null || !(configuration.getEntryPoint() instanceof Profile)) {
            Xmi.LOG.error(Xmi.PLUGIN_ID, Xmi.I18N.getString("error.nullGivenParameter"));
        } else {
            if (configuration.getXmiFile() != null) {
                initExportService((Profile)configuration.getEntryPoint());
                GenerationProperties.getInstance().setFilePath(configuration.getXmiFile());
                exportProfile(configuration);        
            } else {
                Xmi.LOG.error(Xmi.PLUGIN_ID, Xmi.I18N.getString("error.invalidFilePath"));
            }
        }
    }

    @objid ("c4b151a9-7ea2-4611-b958-bd05c92add34")
    private void exportProfile(final ExportConfiguration configuration) {
        Shell shell = null;
        try {      
            String xmiFilePath = configuration.getXmiFile().getAbsolutePath() ;
            GenerationProperties.getInstance().setSelectedPackage((Profile)configuration.getEntryPoint());
            Resource resource = this.exportService.createResource(xmiFilePath);
            GenerationProperties.getInstance().setRoundtripEnabled(configuration.exportedAnotation());
            this.exportService.createEcoreProfile(resource, null);
        
            if (!configuration.getVersionExport().equals(FormatExport.EMF300))
                XMIFileUtils.changeToUML(xmiFilePath);
        
            Xmi.LOG.error(Xmi.PLUGIN_ID, Xmi.I18N.getString("info.export.result_done"));
        } catch (AbortProcessException e) {
            cancelProcess(shell);
        } catch (Exception e) {
            cancelProcess(shell);
            Xmi.LOG.error(Xmi.PLUGIN_ID, "Erreur.");
            Xmi.LOG.error(Xmi.PLUGIN_ID, e);
        } finally {
            XMILogs logs = XMILogs.getInstance();
            logs.saveLog();
        }
    }

    @objid ("9c511377-72c9-4814-94c7-01e0766afd46")
    private boolean importProfile(final File xmiFile, final Element module) {
        boolean error = false;
              
        
        Shell shell = Display.getDefault().getActiveShell();
        try(ITransaction t = GProject.getProject(module).getSession().getTransactionSupport().createTransaction("Import") ) {
            
            Resource resource = this.importService.getResource(xmiFile);
        
            if ((resource != null)) {
                error = this.importService.importEcoreProfile(resource, module, null, shell);
            }
            t.commit();
        } catch (AbortProcessException e) {
            // cancelProcess(shell);
        } catch (Exception e) {
            error = true;
            // cancelProcess(shell);
            Xmi.LOG.error(Xmi.PLUGIN_ID, "Erreur.");
            Xmi.LOG.error(Xmi.PLUGIN_ID, e);
        } finally {
            XMILogs logs = XMILogs.getInstance();
            logs.saveLog();
        }
        return error;
    }

}
