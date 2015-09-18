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
                                    

package org.modelio.mda.infra.service;

import javax.script.ScriptEngine;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.graphics.Image;
import org.modelio.api.model.IModelingSession;
import org.modelio.api.module.ILicenseInfos;
import org.modelio.api.module.IModule;
import org.modelio.api.module.IModuleSession;
import org.modelio.api.module.IModuleUserConfiguration;
import org.modelio.api.module.IParameterEditionModel;
import org.modelio.api.module.IPeerModule;
import org.modelio.gproject.ramc.core.model.IModelComponent;
import org.modelio.gproject.ramc.core.packaging.IModelComponentContributor;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.vbasic.version.Version;

/**
 * {@link IModule} Implementation for broken modules.
 * @author cmarin
 */
@objid ("c5296d3c-bad5-49e6-bfa7-069c449b30df")
class BrokenIModule implements IModule {
    @objid ("8aed89e6-1120-4617-921f-054cfb75bd15")
    private IRTModule rtModule;

    @objid ("1b98cff1-630d-4ae2-a93d-b75d2dcf20d5")
    public BrokenIModule(IRTModule rtModule) {
        this.rtModule = rtModule;
    }

    @objid ("108e2270-e37f-40e8-a04a-37688008b870")
    @Override
    public IModuleUserConfiguration getConfiguration() {
        return this.rtModule.getConfiguration();
    }

    @objid ("d83e8454-ccdb-47b2-9da0-44721c7a240c")
    @Override
    public String getDescription() {
        return this.rtModule.getDescription();
    }

    @objid ("5ea8ccb2-ea2f-4a23-beea-55c9501b0571")
    @Override
    public Image getImage(Stereotype stereotype, ImageType type) {
        return null;
    }

    @objid ("9d2fa909-a1de-4f05-b736-1db2366b2406")
    @Override
    public ScriptEngine getJythonEngine() {
        return null;
    }

    @objid ("d1df930c-c24d-4f4a-8431-6cac4d2b29f2")
    @Override
    public String getLabel(Stereotype stereotype) {
        return stereotype.getName();
    }

    @objid ("03f67a1b-8382-4abc-918d-e5e1137db699")
    @Override
    public String getLabel(TagType tagType) {
        return tagType.getName();
    }

    @objid ("48afab98-6576-4673-965e-996c9103b2a9")
    @Override
    public String getLabel(NoteType noteType) {
        return noteType.getName();
    }

    @objid ("4241fbea-ac10-4d1f-9ec5-217615252e78")
    @Override
    public String getLabel(ExternDocumentType docType) {
        return docType.getName();
    }

    @objid ("adf58748-d93b-4343-b0e3-595d4cda0162")
    @Override
    public String getLabel() {
        return this.rtModule.getName();
    }

    @objid ("bb57cca5-c12c-43e0-9f09-c155ca83e5e8")
    @Override
    public String getLabel(String key) {
        return "!"+key+"!";
    }

    @objid ("a5b2fde0-a9dd-42f5-8ef0-73825a4b9955")
    @Override
    public ILicenseInfos getLicenseInfos() {
        return null;
    }

    @objid ("65ad4ee0-b5cf-4026-b20d-a69e35b9d78f")
    @Override
    public ModuleComponent getModel() {
        return this.rtModule.getModel();
    }

    @objid ("a61a2760-6d58-449a-8848-65d27e0ed52a")
    @Override
    public IModelComponentContributor getModelComponentContributor(IModelComponent mc) {
        return null;
    }

    @objid ("a48653a2-f2fa-4a5f-b2b8-bc0c47a63db5")
    @Override
    public IModelingSession getModelingSession() {
        return null;
    }

    @objid ("682a6bdf-374a-4878-a6e9-e4b4e413ea1e")
    @Override
    public Image getModuleImage() {
        return null;
    }

    @objid ("1626445a-9412-44e6-8623-92dad0dadab7")
    @Override
    public String getName() {
        return this.rtModule.getName();
    }

    @objid ("90983014-eeea-4a13-b909-e9549c2ca588")
    @Override
    public IParameterEditionModel getParametersEditionModel() {
        return null;
    }

    @objid ("2b6857ab-6cfa-455f-b43b-d7c384729932")
    @Override
    public IPeerModule getPeerModule() {
        return this.rtModule.getPeerModule();
    }

    @objid ("078c567f-5aa8-4293-b99f-cfb9a37b6cfa")
    @Override
    public Version getRequiredModelioVersion() {
        return null;
    }

    @objid ("125ef3a3-1e76-4a22-8858-d804d94ab9ff")
    @Override
    public IModuleSession getSession() {
        return this.rtModule.getSession();
    }

    @objid ("fa838757-98e0-429a-ae1d-ca099e538c21")
    @Override
    public Version getVersion() {
        return this.rtModule.getVersion();
    }

    @objid ("d49bb296-601a-4719-840b-927b318a15d1")
    @Override
    public void init() {
        // no op
    }

    @objid ("5bb4000c-0c3c-4f2f-8b22-8d611a309d7c")
    @Override
    public void uninit() {
        // nothing
    }

    @objid ("250f82f9-0716-404c-81b8-6eb339b4a355")
    @Override
    public String getModuleImagePath() {
        return this.rtModule.getModuleImagePath();
    }

}
