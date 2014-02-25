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
                                    

package org.modelio.gproject.module.catalog;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.descriptor.ProjectDescriptor;
import org.modelio.gproject.gproject.GProject;
import org.modelio.gproject.gproject.GProjectCreator;
import org.modelio.gproject.gproject.GProjectFactory;
import org.modelio.gproject.module.JaxbModelPersistence;
import org.modelio.gproject.module.ModuleId;
import org.modelio.gproject.module.jaxbmodel.JxbClasspath;
import org.modelio.gproject.module.jaxbmodel.JxbDocpath;
import org.modelio.gproject.module.jaxbmodel.JxbExterndocumenttype;
import org.modelio.gproject.module.jaxbmodel.JxbModule.Dependencies.Optional;
import org.modelio.gproject.module.jaxbmodel.JxbModule.Dependencies.Required;
import org.modelio.gproject.module.jaxbmodel.JxbModule.Dependencies;
import org.modelio.gproject.module.jaxbmodel.JxbModule.JxbParameter;
import org.modelio.gproject.module.jaxbmodel.JxbModule.JxbProfile.JxbAnonymousStereotype;
import org.modelio.gproject.module.jaxbmodel.JxbModule.JxbProfile.JxbStereotype;
import org.modelio.gproject.module.jaxbmodel.JxbModule.JxbProfile;
import org.modelio.gproject.module.jaxbmodel.JxbModule;
import org.modelio.gproject.module.jaxbmodel.JxbNotetype;
import org.modelio.gproject.module.jaxbmodel.JxbTaggedvalues;
import org.modelio.gproject.plugin.CoreProject;
import org.modelio.gproject.ramc.core.model.ModelComponent;
import org.modelio.gproject.ramc.core.packaging.RamcPackager;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vbasic.files.FileUtils;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vbasic.progress.SubProgress;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.Log;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.session.api.repository.IRepository;
import org.modelio.vcore.session.api.transactions.ITransaction;
import org.modelio.vcore.session.impl.GenericFactory;
import org.modelio.vcore.session.impl.permission.BasicAccessManager;
import org.modelio.vcore.session.impl.storage.memory.MemoryRepository;

/**
 * Service class to build a {@link FileCatalogModuleHandle} from an extracted
 * module directory.
 */
@objid ("de703be5-0b74-4f31-bc34-8f9069119d08")
class FileCatalogModuleHandleBuilder {
    @objid ("2c95c273-f37d-11e1-a3c7-002564c97630")
    private static void extractDynamicModel(Path moduleDynamicModelPath, JxbModule loadedModule, IModelioProgress monitor) throws IOException {
        List<Object> dynamicModel = new ArrayList<>();
        
        List<Object> allModuleContent = new ArrayList<>(loadedModule.getParameterOrProfileOrGui());
        for (Object child : allModuleContent) {
            if (child instanceof JxbModule.Gui) {
                dynamicModel.add(child);
            }
        }
        
        // Clean up everything except the dynamic content
        loadedModule.getParameterOrProfileOrGui().clear();
        loadedModule.getParameterOrProfileOrGui().addAll(dynamicModel);
        
        JaxbModelPersistence.saveJaxbModel(loadedModule, moduleDynamicModelPath);
        
        // Reset the list
        loadedModule.getParameterOrProfileOrGui().clear();
        loadedModule.getParameterOrProfileOrGui().addAll(allModuleContent);
        
        monitor.done();
    }

    @objid ("15695cc1-0c96-11e2-b501-002564c97630")
    private static void extractModuleInfos(JxbModule loadedModule, Path infosPath) throws IOException {
        List<Object> moduleInfosModel = new ArrayList<>();
        for (Object child : loadedModule.getParameterOrProfileOrGui()) {
            if (child instanceof Dependencies) {
                moduleInfosModel.add(child);
            } else if (child instanceof JxbClasspath) {
                moduleInfosModel.add(child);
            } else if (child instanceof JxbDocpath) {
                moduleInfosModel.add(child);
            }
        }
        
        // Store the original content
        List<Object> allModuleContent = new ArrayList<>(loadedModule.getParameterOrProfileOrGui());
        
        // Clean up everything except the dynamic content
        loadedModule.getParameterOrProfileOrGui().clear();
        loadedModule.getParameterOrProfileOrGui().addAll(moduleInfosModel);
        
        JaxbModelPersistence.saveJaxbModel(loadedModule, infosPath);
        
        // Reset the list
        loadedModule.getParameterOrProfileOrGui().clear();
        loadedModule.getParameterOrProfileOrGui().addAll(allModuleContent);
    }

    @objid ("2c95c265-f37d-11e1-a3c7-002564c97630")
    private static void extractStaticModel(Path moduleStaticModelPath, JxbModule loadedModule, IModelioProgress monitor) throws IOException {
        try {
            ModuleRamcCreationHelper.createRamc(loadedModule, moduleStaticModelPath, monitor);
        } catch (IOException e) {
            IOException e2 = new IOException(CoreProject.getMessage("ModuleCacheManager.FailedExtractStaticModel",
                    moduleStaticModelPath.getName(moduleStaticModelPath.getNameCount()), e.getLocalizedMessage())); //$NON-NLS-1$
            e2.initCause(e);
            throw e2;
        }
    }

    @objid ("2c95c277-f37d-11e1-a3c7-002564c97630")
    private static FileCatalogModuleHandle loadModuleInfos(Path moduleCachePath, final JxbModule loadedModule, IModelioProgress monitor) {
        String uid = loadedModule.getUid();
        String name = loadedModule.getName();
        String mainClassName = loadedModule.getClazz();
        boolean licenseRequired = Boolean.valueOf(loadedModule.isLicenseRequired());
        String moduleVersionString = loadedModule.getVersion();
        
        Version moduleVersion;
        if (moduleVersionString != null) {
            moduleVersion = new Version(moduleVersionString);
        } else {
            // Set a default version...
            moduleVersion = new Version("0.00.00");
        }
        
        String binaryVersionString = loadedModule.getBinaryversion();
        Version binaryVersion;
        if (binaryVersionString != null) {
            binaryVersion = new Version(binaryVersionString);
        } else {
            // Set a default version...
            binaryVersion = new Version("0.00.00");
        }
        
        List<ModuleId> dependencies = new ArrayList<>();
        List<ModuleId> weakDependencies = new ArrayList<>();
        List<Path> jarPaths = new ArrayList<>();
        List<Path> docPaths = new ArrayList<>();
        
        for (Object child : loadedModule.getParameterOrProfileOrGui()) {
            if (child instanceof Dependencies) {
                Dependencies deps = (Dependencies) child;
                for (Object depChild : deps.getRequiredOrOptionalOrRamc()) {
                    if (depChild instanceof Required) {
                        Required dep = (Required) depChild;
                        dependencies.add(new ModuleId(dep.getName(), new Version(dep.getVersion())));
                    } else if (depChild instanceof Optional) {
                        Optional dep = (Optional) depChild;
                        weakDependencies.add(new ModuleId(dep.getName(), new Version(dep.getVersion())));
                    }
                }
            } else if (child instanceof JxbClasspath) {
                JxbClasspath classpathEntries = (JxbClasspath) child;
                for (JxbClasspath.Entry classpathEntry : classpathEntries.getEntry()) {
                    jarPaths.add(Paths.get(classpathEntry.getPath()));
                }
            } else if (child instanceof JxbDocpath) {
                JxbDocpath docpathEntries = (JxbDocpath) child;
                for (JxbDocpath.Entry docpathEntry : docpathEntries.getEntry()) {
                    docPaths.add(Paths.get(docpathEntry.getPath()));
                }
            }
        }
        
        monitor.done();
        return new FileCatalogModuleHandle(moduleCachePath, name, moduleVersion, uid, mainClassName, licenseRequired,
                binaryVersion, dependencies, weakDependencies, docPaths, jarPaths);
    }

    /**
     * Build a module handle
     * @param moduleCachePath the module extracted data directory.
     * @param monitor the progress monitor to use for reporting progress to the
     * user. It is the caller's responsibility to call
     * <code>done()</code> on the given monitor. Accepts
     * <code>null</code>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     * @return the module handle
     * @throws java.io.IOException in case of failure.
     */
    @objid ("2c95c260-f37d-11e1-a3c7-002564c97630")
    public static FileCatalogModuleHandle readModule(final Path moduleCachePath, IModelioProgress monitor) throws IOException {
        SubProgress m = SubProgress.convert(monitor, 80);
        try {
            Path moduleXmlPath = moduleCachePath.resolve("module.xml");
            m.worked(20);
            if (Files.exists(moduleXmlPath)) {
                JxbModule loadedModule = null;
                // Ensure the static model ramc file exists
                Path staticModelPath = moduleCachePath.resolve("staticModel.ramc");
                if (Files.notExists(staticModelPath)) {
                    // Extract static model from module.xml and create a ramc
                    // from it.
                    loadedModule = JaxbModelPersistence.loadJaxbModel(moduleXmlPath);
                    extractStaticModel(staticModelPath, loadedModule, m.newChild(20));
                }
        
                // Ensure the dynamic model xml file exists
                Path dynamicModelPath = moduleCachePath.resolve("dynamicModel.xml");
                if (Files.notExists(dynamicModelPath)) {
                    // Extract dynamic model from module.xml and create an xml
                    // file from it.
                    if (loadedModule == null) {
                        loadedModule = JaxbModelPersistence.loadJaxbModel(moduleXmlPath);
                    }
                    extractDynamicModel(dynamicModelPath, loadedModule, m.newChild(20));
                }
        
                // Ensure the module infos xml file exists
                Path infosPath = moduleCachePath.resolve("moduleInfos.xml");
                if (Files.notExists(infosPath)) {
                    // Create the file
                    if (loadedModule == null) {
                        loadedModule = JaxbModelPersistence.loadJaxbModel(moduleXmlPath);
                    }
        
                    // Create the module info file
                    extractModuleInfos(loadedModule, infosPath);
                    return loadModuleInfos(moduleCachePath, loadedModule, m.newChild(20));
                } else {
                    // Load the module info file
                    JxbModule moduleFromInfos = JaxbModelPersistence.loadJaxbModel(infosPath);
                    return loadModuleInfos(moduleCachePath, moduleFromInfos, m.newChild(20));
                }
            }
        
            throw new IOException(CoreProject.getMessage("ModuleCacheManager.NoModuleFound", moduleCachePath.getFileName())); //$NON-NLS-1$
        } catch (IOException e) {
            IOException e2 = new IOException(CoreProject.getMessage(
                    "ModuleCacheManager.ErrorReadingModule", moduleCachePath.getFileName(), e.getLocalizedMessage())); //$NON-NLS-1$
            e2.initCause(e);
            throw e2;
        }
    }

    /**
     * Helper class building a module model component from a {@link JxbModule}.
     */
    @objid ("156a6e31-0c96-11e2-b501-002564c97630")
    private static class ModuleRamcCreationHelper {
        /**
         * Helper method creating a model component in several steps: - create a
         * temporary {@link GProject}. - create a full {@link ModuleComponent}
         * from a {@link JxbModule}. - package a model component containing this
         * module. - close the temporary project and delete it.
         * @param loadedModule the jaxb module to create the {@link ModuleComponent}
         * from.
         * @param ramcPath the path to package the ramc into.
         * @param monitor the progress monitor to use for reporting progress to the
         * user. It is the caller's responsibility to call
         * <code>done()</code> on the given monitor. Accepts
         * <code>null</code>, indicating that no progress should be
         * reported and that the operation cannot be cancelled.
         * @throws java.io.IOException in case of failure
         */
        @objid ("2c95c269-f37d-11e1-a3c7-002564c97630")
        public static void createRamc(JxbModule loadedModule, Path ramcPath, IModelioProgress monitor) throws IOException {
            SubProgress mon = SubProgress.convert(monitor, 60);
            
            Path tempDirectory = Files.createTempDirectory("ModelioCatalog");
            
            ProjectDescriptor projectDescriptor = GProjectCreator.buildEmptyProject(loadedModule.getName(), tempDirectory);
            GProject gproject = GProjectFactory.openProject(projectDescriptor, null, null, mon.newChild(10));
            
            try {
                Artifact a = initModuleRamc(gproject, loadedModule, mon.newChild(10));
                // Run packaging
                RamcPackager packager = new RamcPackager(gproject, a, ramcPath);
                // For module static-model ramcs do not export the artifact
                // itself because this artifact is only a temporary one used to
                // package the ramc. Furthermore, keeping it in the ramc would cause
                // trouble when removing the module.
                packager.setIncludeArtifact(false);
                packager.run(mon.newChild(30));
            } finally {
                gproject.close();
            }
            
            // TODO this is a quite naive implementation, it should deal with
            // project path for delegating project
            try {
                FileUtils.delete(tempDirectory);
            } catch (IOException e) {
                Log.warning(e);
            }
        }

        @objid ("2c95c26d-f37d-11e1-a3c7-002564c97630")
        private static Artifact initModuleRamc(GProject gproject, JxbModule loadedModule, IModelioProgress monitor) throws IOException {
            ICoreSession s = gproject.getSession();
            
            // Create a temporary repository
            IRepository repo = new MemoryRepository();
            s.getRepositorySupport().connectRepository(repo, new BasicAccessManager(), monitor);
            
            ModelFactory modelfactory = new ModelFactory(s, repo);
            
            try (ITransaction t = s.getTransactionSupport().createTransaction("Init "+loadedModule.getName()+" module RAMC")) {
                GenericFactory gf = s.getModel().getGenericFactory();
            
                Project proj = gf.create(Project.class, repo);
                Package p = gf.create(Package.class, repo);
                proj.setModel(p);
            
                // Create the module itself
                ModuleComponent module = modelfactory.createModule(loadedModule);
            
                // Import Profiles, Stereotypes, TagTypes and so on.
                for (Object child : loadedModule.getParameterOrProfileOrGui()) {
                    if (child instanceof JxbProfile) {
                        JxbProfile jaxbprofile = (JxbProfile) child;
                        Profile profile = modelfactory.createProfile(jaxbprofile, module);
                        for (Object profileChild : jaxbprofile.getStereotypeOrAnonymousStereotype()) {
                            if (profileChild instanceof JxbStereotype) {
                                JxbStereotype jaxbstereotype = (JxbStereotype) profileChild;
                                Stereotype stereotype = modelfactory.createStereotype(jaxbstereotype, profile);
                                for (Object stereoChild : jaxbstereotype.getIconsOrTaggedvaluesOrNotetype()) {
                                    if (stereoChild instanceof JxbTaggedvalues) {
                                        modelfactory.createTagType((JxbTaggedvalues) stereoChild, stereotype);
                                    } else if (stereoChild instanceof JxbNotetype) {
                                        modelfactory.createNoteType((JxbNotetype) stereoChild, stereotype);
                                    } else if (stereoChild instanceof JxbExterndocumenttype) {
                                        modelfactory.createExternalDocumentType((JxbExterndocumenttype) stereoChild, stereotype);
                                    }
                                }
                            } else if (profileChild instanceof JxbAnonymousStereotype) {
                                JxbAnonymousStereotype anonymousStereotype = (JxbAnonymousStereotype) profileChild;
                                MetaclassReference ref = modelfactory.createMetaClassReferance(anonymousStereotype, profile);
                                for (Object stereoChild : anonymousStereotype.getTaggedvaluesOrNotetypeOrExterndocumenttype()) {
                                    if (stereoChild instanceof JxbTaggedvalues) {
                                        modelfactory.createTagType((JxbTaggedvalues) stereoChild, ref);
                                    } else if (stereoChild instanceof JxbNotetype) {
                                        modelfactory.createNoteType((JxbNotetype) stereoChild, ref);
                                    } else if (stereoChild instanceof JxbExterndocumenttype) {
                                        modelfactory.createExternalDocumentType((JxbExterndocumenttype) stereoChild, ref);
                                    }
                                }
                            }
                        }
            
                    } else if (child instanceof JxbParameter) {
                        modelfactory.createConfigParam((JxbParameter) child, module);
                    }
                }
            
                for (Object child : loadedModule.getParameterOrProfileOrGui()) {
                    if (child instanceof JxbProfile) {
                        JxbProfile jaxbprofile = (JxbProfile) child;
                        for (Object profileChild : jaxbprofile.getStereotypeOrAnonymousStereotype()) {
                            if (profileChild instanceof JxbStereotype) {
                                JxbStereotype jaxbstereotype = (JxbStereotype) profileChild;
                                if (jaxbstereotype.getOwnerStereotype() != null) {
                                    Stereotype current = s.getModel().findById(Stereotype.class,
                                            UUID.fromString(jaxbstereotype.getUid()));
                                    Collection<Stereotype> owners = s.getModel().findByAtt(Stereotype.class, "Name",
                                            jaxbstereotype.getOwnerStereotype());
            
                                    if (current != null && owners.size() > 0) {
                                        current.setParent(owners.iterator().next());
                                    }
                                }
                            }
                        }
                    }
                }
                
                // Setup RAMC packaging.
                // Generate the RAMC Artifact
                Artifact aa = gf.create(Artifact.class, p);
                aa.setName(loadedModule.getName());
                p.getOwnedElement().add(aa);
                
                ModelComponent ramcFact = new ModelComponent(aa);
                ramcFact.setRamcName(loadedModule.getName());
                ramcFact.setRamcVersion(new Version(loadedModule.getVersion()));
                ramcFact.getExportedElements().add(module);
                ramcFact.updateArtifact();
            
                t.commit();
            
                return aa;
            }
        }

    }

}
