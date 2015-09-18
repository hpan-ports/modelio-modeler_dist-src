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
                                    

package org.modelio.xmi.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.app.core.navigate.IModelioNavigationService;
import org.modelio.gproject.fragment.IProjectFragment;
import org.modelio.gproject.gproject.GProject;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.xmi.gui.report.ReportModel;

@objid ("8318c518-3338-41b4-81e7-d600b072150d")
public abstract class XMIProperties {
    @objid ("d8fa05d9-de62-472f-aec8-56b5709a828e")
    public static final String modelerModuleName = "ModelerModule";

    @objid ("5f5661ce-2f94-4f8f-81f1-d420eea55023")
    protected String filePath = "";

    @objid ("7e42e787-4d7a-4d4d-b39b-777e1ee3dc98")
    protected ReportModel report = null;

    @objid ("4c4504e7-b01b-40d6-b525-bca0d27338c2")
    protected IMModelServices mmServices = null;

    @objid ("71b08b80-0fe8-4ef2-9e84-60cd4f2e8886")
    protected IModelioNavigationService navigationServices = null;

    @objid ("27207c13-5db6-4e99-9387-296c44783267")
    protected ModelioTypes modelioTypes = null;

    @objid ("524e3a84-b9bf-47fb-b74b-7106e4c9e56d")
    protected ModelElement rootElement = null;

    @objid ("a87e964c-5d14-4380-8388-7e11a1f969f3")
    protected File tempFolder = null;

    @objid ("0be2c451-21f7-427e-a8be-9bfda122d494")
    public ReportModel getReportModel() {
        return this.report;
    }

    @objid ("bbbb62e4-3f2d-4340-a1f6-09ce51a3c014")
    public void setReportModel(final ReportModel newReport) {
        this.report = newReport;
    }

    @objid ("c1f84218-ce6b-4d82-8215-2941c765af7d")
    public ModelElement getRootElement() {
        return this.rootElement;
    }

    @objid ("74a92716-a159-4732-9f4b-84e69066144c")
    public void setRootElement(final ModelElement newRoot) {
        this.rootElement = newRoot;
    }

    /**
     * This methods specify the path of the imported file
     * @param file : the imported file
     */
    @objid ("9e69c6c6-178e-499a-802e-e41acc667838")
    public void setFilePath(final File file) {
        this.filePath = file.getAbsolutePath();
    }

    /**
     * This method allows to specify the path of the imported file
     * @param filePath : the imported file path
     */
    @objid ("675c94c2-2102-47d6-9d1d-c3404d4b68e1")
    public void setFilePath(final String path) {
        this.filePath = path;
    }

    /**
     * This methods returns the path of the imported file
     * @return the imported file path
     */
    @objid ("11b6416d-b815-4e3a-9bb7-e002a8832e6e")
    public String getFilePath() {
        return this.filePath;
    }

    @objid ("a30bec69-3d2f-45f8-babd-e5258d890148")
    public String getFileDirectory() {
        File temp = new File(this.filePath);
        return temp.getParentFile().getAbsolutePath();
    }

    /**
     * This method returns the model services
     * @return the model services
     */
    @objid ("b4d1d6d1-7dfb-4246-b605-038b26afd7c4")
    public IMModelServices getMModelServices() {
        return this.mmServices;
    }

    @objid ("d5f8af50-2aa5-4fde-b586-6611b463d5de")
    public ModelioTypes getModelioTypes() {
        return this.modelioTypes;
    }

    @objid ("2c13609c-065c-4764-8d6b-7697188a9008")
    public void setNavigationServices(final IModelioNavigationService navigationServices) {
        this.navigationServices = navigationServices;
    }

    @objid ("22434256-88b8-4eb4-91d4-827716bca6b0")
    protected void initializeServices(final IMModelServices mmoServices) {
        this.mmServices = mmoServices;
        this.modelioTypes = new ModelioTypes(mmoServices);
    }

    /**
     * This methods returns the path of the imported file
     * @return the imported file path
     */
    @objid ("32481333-7de8-4a00-a7e9-8f4ecb5e0048")
    public IModelioNavigationService getNavigationServices() {
        return this.navigationServices;
    }

    @objid ("5ec4363c-6c58-47c0-91f2-5f430104dc0e")
    public List<MObject> getModelRoots() {
        List<MObject> ret = new ArrayList<>();
        for (IProjectFragment fragment : GProject.getProject(this.rootElement).getFragments()) {
            switch (fragment.getType()) {
            case EXML:
            case EXML_SVN:
                ret.addAll(fragment.getRoots());              
                break;
            default:
                // do nothing
                break;
            }
        }
        return ret;
    }

    @objid ("33967f42-a3a2-49ae-8448-fa7fd90e15e6")
    public List<MObject> getLibraryRoots() {
        List<MObject> ret = new ArrayList<>();
        for (IProjectFragment fragment : GProject.getProject(this.rootElement).getFragments()) {
            switch (fragment.getType()) {
            case RAMC:
            case EXML_URL:
                ret.addAll(fragment.getRoots());
                break;
            default:
                // do nothing
                break;
            }
        }
        return ret;
    }

    @objid ("1b6f22f5-024c-4249-bc02-41578320a645")
    public File getTempFolder() {
        if (this.tempFolder != null){
            return this.tempFolder;
        }else{
        
            this.tempFolder = new File(GProject.getProject(this.rootElement).getProjectPath().toString() 
                    + java.io.File.separator + "XMI" + java.io.File.separator + "temp");
        
            if (! this.tempFolder.exists()){
                this.tempFolder.mkdirs();
                this.tempFolder.mkdir();
            }
        
            return this.tempFolder;
        }
    }

}
